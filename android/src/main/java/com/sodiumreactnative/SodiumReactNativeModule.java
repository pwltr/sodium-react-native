package com.sodiumreactnative;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.module.annotations.ReactModule;

import com.sodiumreactnative.jni.SodiumReactNative;
import com.sodiumreactnative.helpers.*;

@ReactModule(name = SodiumReactNativeModule.NAME)
public class SodiumReactNativeModule extends ReactContextBaseJavaModule {
  public static final String NAME = "SodiumReactNative";

  public SodiumReactNativeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    SodiumReactNative.loadLibrary();
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();

    constants.put("crypto_aead_xchacha20poly1305_ietf_ABYTES", SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_abytes());
    constants.put("crypto_aead_xchacha20poly1305_ietf_KEYBYTES", SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_keybytes());
    constants.put("crypto_aead_xchacha20poly1305_ietf_NPUBBYTES", SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_npubbytes());
    constants.put("crypto_aead_xchacha20poly1305_ietf_NSECBYTES", SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_nsecbytes());
    constants.put("crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX", SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_messagebytes_max());
    constants.put("crypto_aead_chacha20poly1305_ietf_ABYTES", SodiumReactNative.crypto_aead_chacha20poly1305_ietf_abytes());
    constants.put("crypto_aead_chacha20poly1305_ietf_KEYBYTES", SodiumReactNative.crypto_aead_chacha20poly1305_ietf_keybytes());
    constants.put("crypto_aead_chacha20poly1305_ietf_NPUBBYTES", SodiumReactNative.crypto_aead_chacha20poly1305_ietf_npubbytes());
    constants.put("crypto_aead_chacha20poly1305_ietf_NSECBYTES", SodiumReactNative.crypto_aead_chacha20poly1305_ietf_nsecbytes());
    constants.put("crypto_aead_chacha20poly1305_ietf_MESSAGEBYTES_MAX", SodiumReactNative.crypto_aead_chacha20poly1305_ietf_messagebytes_max());
    constants.put("crypto_core_ed25519_BYTES", SodiumReactNative.crypto_core_ed25519_bytes());
    constants.put("crypto_core_ed25519_SCALARBYTES", SodiumReactNative.crypto_core_ed25519_scalarbytes());
    constants.put("crypto_core_ed25519_NONREDUCEDSCALARBYTES", SodiumReactNative.crypto_core_ed25519_nonreducedscalarbytes());
    constants.put("crypto_core_ed25519_UNIFORMBYTES", SodiumReactNative.crypto_core_ed25519_uniformbytes());
    constants.put("crypto_generichash_BYTES", SodiumReactNative.crypto_generichash_bytes());
    constants.put("crypto_generichash_BYTES_MIN", SodiumReactNative.crypto_generichash_bytes_min());
    constants.put("crypto_generichash_BYTES_MAX", SodiumReactNative.crypto_generichash_bytes_max());
    constants.put("crypto_generichash_KEYBYTES", SodiumReactNative.crypto_generichash_keybytes());
    constants.put("crypto_generichash_KEYBYTES_MIN", SodiumReactNative.crypto_generichash_keybytes_min());
    constants.put("crypto_generichash_KEYBYTES_MAX", SodiumReactNative.crypto_generichash_keybytes_max());
    constants.put("crypto_generichash_STATEBYTES", SodiumReactNative.crypto_generichash_statebytes());
    constants.put("crypto_hash_sha512_BYTES", SodiumReactNative.crypto_hash_sha512_bytes());
    constants.put("crypto_kdf_BYTES_MIN", SodiumReactNative.crypto_kdf_bytes_min());
    constants.put("crypto_kdf_BYTES_MAX", SodiumReactNative.crypto_kdf_bytes_max());
    constants.put("crypto_kdf_CONTEXTBYTES", SodiumReactNative.crypto_kdf_contextbytes());
    constants.put("crypto_kdf_KEYBYTES", SodiumReactNative.crypto_kdf_keybytes());
    constants.put("crypto_kx_PUBLICKEYBYTES", SodiumReactNative.crypto_kx_publickeybytes());
    constants.put("crypto_kx_SECRETKEYBYTES", SodiumReactNative.crypto_kx_secretkeybytes());
    constants.put("crypto_kx_SEEDBYTES", SodiumReactNative.crypto_kx_seedbytes());
    constants.put("crypto_kx_SESSIONKEYBYTES", SodiumReactNative.crypto_kx_sessionkeybytes());
    constants.put("crypto_onetimeauth_BYTES", SodiumReactNative.crypto_onetimeauth_bytes());
    constants.put("crypto_onetimeauth_KEYBYTES", SodiumReactNative.crypto_onetimeauth_keybytes());
    // constants.put("crypto_onetimeauth_STATEBYTES", SodiumReactNative.crypto_onetimeauth_statebytes());
    constants.put("crypto_pwhash_ALG_ARGON2I13", SodiumReactNative.crypto_pwhash_alg_argon2i13());
    constants.put("crypto_pwhash_ALG_ARGON2ID13", SodiumReactNative.crypto_pwhash_alg_argon2id13());
    constants.put("crypto_pwhash_ALG_DEFAULT", SodiumReactNative.crypto_pwhash_alg_default());
    constants.put("crypto_pwhash_BYTES_MIN", SodiumReactNative.crypto_pwhash_bytes_min());
    constants.put("crypto_pwhash_BYTES_MAX", SodiumReactNative.crypto_pwhash_bytes_max());
    constants.put("crypto_pwhash_PASSWD_MIN", SodiumReactNative.crypto_pwhash_passwd_min());
    constants.put("crypto_pwhash_PASSWD_MAX", SodiumReactNative.crypto_pwhash_passwd_max());
    constants.put("crypto_pwhash_SALTBYTES", SodiumReactNative.crypto_pwhash_saltbytes());
    constants.put("crypto_pwhash_STRBYTES", SodiumReactNative.crypto_pwhash_strbytes());
    // constants.put("crypto_pwhash_STRPREFIX", SodiumReactNative.crypto_pwhash_strprefix());
    constants.put("crypto_pwhash_MEMLIMIT_INTERACTIVE", SodiumReactNative.crypto_pwhash_memlimit_interactive());
    constants.put("crypto_pwhash_MEMLIMIT_MIN", SodiumReactNative.crypto_pwhash_memlimit_min());
    constants.put("crypto_pwhash_MEMLIMIT_MAX", SodiumReactNative.crypto_pwhash_memlimit_max());
    constants.put("crypto_pwhash_MEMLIMIT_MODERATE", SodiumReactNative.crypto_pwhash_memlimit_moderate());
    constants.put("crypto_pwhash_MEMLIMIT_SENSITIVE", SodiumReactNative.crypto_pwhash_memlimit_sensitive());
    constants.put("crypto_pwhash_OPSLIMIT_INTERACTIVE", SodiumReactNative.crypto_pwhash_opslimit_interactive());
    constants.put("crypto_pwhash_OPSLIMIT_MIN", SodiumReactNative.crypto_pwhash_opslimit_min());
    constants.put("crypto_pwhash_OPSLIMIT_MAX", SodiumReactNative.crypto_pwhash_opslimit_max());
    constants.put("crypto_pwhash_OPSLIMIT_MODERATE", SodiumReactNative.crypto_pwhash_opslimit_moderate());
    constants.put("crypto_pwhash_OPSLIMIT_SENSITIVE", SodiumReactNative.crypto_pwhash_opslimit_sensitive());
    constants.put("crypto_scalarmult_BYTES", SodiumReactNative.crypto_scalarmult_bytes());
    constants.put("crypto_scalarmult_SCALARBYTES", SodiumReactNative.crypto_scalarmult_scalarbytes());
    constants.put("crypto_scalarmult_ed25519_BYTES", SodiumReactNative.crypto_scalarmult_ed25519_bytes());
    constants.put("crypto_scalarmult_ed25519_SCALARBYTES", SodiumReactNative.crypto_scalarmult_ed25519_scalarbytes());
    constants.put("crypto_secretbox_BOXZEROBYTES", SodiumReactNative.crypto_secretbox_boxzerobytes());
    constants.put("crypto_secretbox_KEYBYTES", SodiumReactNative.crypto_secretbox_keybytes());
    constants.put("crypto_secretbox_MACBYTES", SodiumReactNative.crypto_secretbox_macbytes());
    constants.put("crypto_secretbox_NONCEBYTES", SodiumReactNative.crypto_secretbox_noncebytes());
    constants.put("crypto_secretbox_ZEROBYTES", SodiumReactNative.crypto_secretbox_zerobytes());
    constants.put("crypto_secretstream_xchacha20poly1305_ABYTES", SodiumReactNative.crypto_secretstream_xchacha20poly1305_abytes());
    constants.put("crypto_secretstream_xchacha20poly1305_HEADERBYTES", SodiumReactNative.crypto_secretstream_xchacha20poly1305_headerbytes());
    constants.put("crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX", SodiumReactNative.crypto_secretstream_xchacha20poly1305_messagebytes_max());
    constants.put("crypto_secretstream_xchacha20poly1305_KEYBYTES", SodiumReactNative.crypto_secretstream_xchacha20poly1305_keybytes());
    constants.put("crypto_secretstream_xchacha20poly1305_STATEBYTES", SodiumReactNative.crypto_secretstream_xchacha20poly1305_statebytes());
    constants.put("crypto_secretstream_xchacha20poly1305_TAGBYTES", 1);
    constants.put("_crypto_secretstream_xchacha20poly1305_TAG_MESSAGE", SodiumReactNative.crypto_secretstream_xchacha20poly1305_tag_message());
    constants.put("_crypto_secretstream_xchacha20poly1305_TAG_PUSH", SodiumReactNative.crypto_secretstream_xchacha20poly1305_tag_push());
    constants.put("_crypto_secretstream_xchacha20poly1305_TAG_REKEY", SodiumReactNative.crypto_secretstream_xchacha20poly1305_tag_rekey());
    constants.put("_crypto_secretstream_xchacha20poly1305_TAG_FINAL", SodiumReactNative.crypto_secretstream_xchacha20poly1305_tag_final());
    constants.put("crypto_secretstream_xchacha20poly1305_TAG_MESSAGE", SodiumReactNative.crypto_secretstream_xchacha20poly1305_tag_message());
    constants.put("crypto_secretstream_xchacha20poly1305_TAG_PUSH", SodiumReactNative.crypto_secretstream_xchacha20poly1305_tag_push());
    constants.put("crypto_secretstream_xchacha20poly1305_TAG_REKEY", SodiumReactNative.crypto_secretstream_xchacha20poly1305_tag_rekey());
    constants.put("crypto_secretstream_xchacha20poly1305_TAG_FINAL", SodiumReactNative.crypto_secretstream_xchacha20poly1305_tag_final());
    constants.put("crypto_sign_BYTES", SodiumReactNative.crypto_sign_bytes());
    constants.put("crypto_sign_SEEDBYTES", SodiumReactNative.crypto_sign_seedbytes());
    constants.put("crypto_sign_PUBLICKEYBYTES", SodiumReactNative.crypto_sign_publickeybytes());
    constants.put("crypto_sign_SECRETKEYBYTES", SodiumReactNative.crypto_sign_secretkeybytes());
    constants.put("crypto_stream_KEYBYTES", SodiumReactNative.crypto_stream_keybytes());
    constants.put("crypto_stream_NONCEBYTES", SodiumReactNative.crypto_stream_noncebytes());
    constants.put("crypto_box_SEALBYTES", SodiumReactNative.crypto_box_sealbytes());
    constants.put("crypto_box_SEEDBYTES", SodiumReactNative.crypto_box_seedbytes());
    constants.put("crypto_box_PUBLICKEYBYTES", SodiumReactNative.crypto_box_publickeybytes());
    constants.put("crypto_box_SECRETKEYBYTES", SodiumReactNative.crypto_box_secretkeybytes());
    constants.put("crypto_box_NONCEBYTES", SodiumReactNative.crypto_box_noncebytes());
    constants.put("crypto_box_MACBYTES", SodiumReactNative.crypto_box_macbytes());

    // These may be useful for future extensions

    // constants.put("crypto_auth_BYTES", SodiumReactNative.crypto_auth_bytes());
    // constants.put("crypto_auth_KEYBYTES", SodiumReactNative.crypto_auth_keybytes());
    // constants.put("crypto_hash_BYTES", SodiumReactNative.crypto_hash_bytes());
    // constants.put("crypto_hash_sha256_STATEBYTES", SodiumReactNative.crypto_hash_sha256_statebytes());
    // constants.put("crypto_hash_sha512_STATEBYTES", SodiumReactNative.crypto_hash_sha512_statebytes());
    // constants.put("crypto_stream_xor_STATEBYTES", SodiumReactNative.crypto_stream_xor_statebytes());
    // constants.put("crypto_stream_chacha20_xor_STATEBYTES", SodiumReactNative.crypto_stream_chacha20_xor_statebytes());
    // constants.put("crypto_hash_sha256_BYTES", SodiumReactNative.crypto_hash_sha256_bytes());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_BYTES_MIN", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_bytes_min());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_BYTES_MAX", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_bytes_max());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_PASSWD_MIN", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_passwd_min());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_PASSWD_MAX", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_passwd_max());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_SALTBYTES", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_saltbytes());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_STRBYTES", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_strbytes());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_MIN", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_opslimit_min());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_MAX", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_opslimit_max());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_MIN", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_memlimit_min());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_MAX", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_memlimit_max());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_INTERACTIVE", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_opslimit_interactive());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_INTERACTIVE", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_memlimit_interactive());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_SENSITIVE", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_opslimit_sensitive());
    // constants.put("crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_SENSITIVE", SodiumReactNative.crypto_pwhash_scryptsalsa208sha256_memlimit_sensitive());
    // constants.put("crypto_shorthash_BYTES", SodiumReactNative.crypto_shorthash_bytes());
    // constants.put("crypto_shorthash_KEYBYTES", SodiumReactNative.crypto_shorthash_keybytes());
    // constants.put("crypto_stream_chacha20_KEYBYTES", SodiumReactNative.crypto_stream_chacha20_keybytes());
    // constants.put("crypto_stream_chacha20_NONCEBYTES", SodiumReactNative.crypto_stream_chacha20_noncebytes());
    // constants.put("randombytes_SEEDBYTES", SodiumReactNative.randombytes_seedbytes());

    return constants;
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_aead_xchacha20poly1305_ietf_keygen (ReadableArray k) throws Exception {
    byte[] key = ArgumentsEx.toByteArray(k);

    try {
      ArgumentsEx.check(key, SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_keybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_keygen(key);

    return ArrayUtil.toWritableArray(key);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_aead_chacha20poly1305_ietf_encrypt (
      ReadableArray c,
      ReadableArray m,
      ReadableArray ad,
      ReadableArray nsec,
      ReadableArray npub,
      ReadableArray k
  ) throws Exception {
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _ad = ArgumentsEx.toByteArray(ad);
    byte[] _nsec = ArgumentsEx.toByteArray(nsec);
    byte[] _npub = ArgumentsEx.toByteArray(npub);
    byte[] _k = ArgumentsEx.toByteArray(k);
    int[] clen_p = new int[1];

    try {
      ArgumentsEx.check(_npub, SodiumReactNative.crypto_aead_chacha20poly1305_ietf_npubbytes(),"ERR_BAD_NPUB");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_aead_chacha20poly1305_ietf_keybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_c, _m.length + SodiumReactNative.crypto_aead_chacha20poly1305_ietf_abytes(), "ERR_BAD_CIPHERTEXT");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_aead_chacha20poly1305_ietf_encrypt(
      _c, clen_p,
      _m, _m.length,
      _ad, _ad.length,
      _nsec, _npub, _k);

    return ArrayUtil.toWritableArray( Arrays.copyOfRange(_c, 0, clen_p[0] ) );
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_aead_chacha20poly1305_ietf_decrypt (
      ReadableArray m,
      ReadableArray nsec,
      ReadableArray c,
      ReadableArray ad,
      ReadableArray npub,
      ReadableArray k
  ) throws Exception {
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _nsec = ArgumentsEx.toByteArray(nsec);
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _ad = ArgumentsEx.toByteArray(ad);
    byte[] _npub = ArgumentsEx.toByteArray(npub);
    byte[] _k = ArgumentsEx.toByteArray(k);
    int[] mlen_p = new int[1];

    try {
      ArgumentsEx.check(_npub, SodiumReactNative.crypto_aead_chacha20poly1305_ietf_npubbytes(), "ERR_BAD_NPUB");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_aead_chacha20poly1305_ietf_keybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_m, _c.length - SodiumReactNative.crypto_aead_chacha20poly1305_ietf_abytes(), "ERR_BAD_MSG");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_aead_chacha20poly1305_ietf_decrypt(
      _m, mlen_p,
      _nsec,
      _c,  _c.length,
      _ad, _ad.length,
      _npub, _k);

    return ArrayUtil.toWritableArray( Arrays.copyOfRange(_m, 0, mlen_p[0] ) );
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_aead_xchacha20poly1305_ietf_encrypt (
      ReadableArray c,
      ReadableArray m,
      ReadableArray ad,
      ReadableArray nsec,
      ReadableArray npub,
      ReadableArray k
  ) throws Exception {
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _ad = ArgumentsEx.toByteArray(ad);
    byte[] _nsec = ArgumentsEx.toByteArray(nsec);
    byte[] _npub = ArgumentsEx.toByteArray(npub);
    byte[] _k = ArgumentsEx.toByteArray(k);
    int[] clen_p = new int[1];

    try {
      ArgumentsEx.check(_npub, SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_npubbytes(),"ERR_BAD_NPUB");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_keybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_c, _m.length + SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_abytes(), "ERR_BAD_CIPHERTEXT");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_encrypt(
      _c, clen_p,
      _m, _m.length,
      _ad, _ad.length,
      _nsec, _npub, _k);

    return ArrayUtil.toWritableArray( Arrays.copyOfRange(_c, 0, clen_p[0] ) );
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_aead_xchacha20poly1305_ietf_decrypt (
      ReadableArray m,
      ReadableArray nsec,
      ReadableArray c,
      ReadableArray ad,
      ReadableArray npub,
      ReadableArray k
  ) throws Exception {
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _nsec = ArgumentsEx.toByteArray(nsec);
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _ad = ArgumentsEx.toByteArray(ad);
    byte[] _npub = ArgumentsEx.toByteArray(npub);
    byte[] _k = ArgumentsEx.toByteArray(k);
    int[] mlen_p = new int[1];

    try {
      ArgumentsEx.check(_npub, SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_npubbytes(), "ERR_BAD_NPUB");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_keybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_m, _c.length - SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_abytes(), "ERR_BAD_MSG");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_aead_xchacha20poly1305_ietf_decrypt(
      _m, mlen_p,
      _nsec,
      _c,  _c.length,
      _ad, _ad.length,
      _npub, _k);

    return ArrayUtil.toWritableArray( Arrays.copyOfRange(_m, 0, mlen_p[0] ) );
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_core_ed25519_scalar_random (ReadableArray r) throws Exception {
    byte[] _r = ArgumentsEx.toByteArray(r);

    try {
      ArgumentsEx.check(_r, SodiumReactNative.crypto_core_ed25519_scalarbytes(), "ERR_BAD_SCALAR");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_core_ed25519_scalar_random(_r);

    return ArrayUtil.toWritableArray(_r);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_core_ed25519_add (
      ReadableArray r,
      ReadableArray p,
      ReadableArray q
  ) throws Exception {
    byte[] _r = ArgumentsEx.toByteArray(r);
    byte[] _p = ArgumentsEx.toByteArray(p);
    byte[] _q = ArgumentsEx.toByteArray(q);

    try {
      ArgumentsEx.check(_r, SodiumReactNative.crypto_core_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_p, SodiumReactNative.crypto_core_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_q, SodiumReactNative.crypto_core_ed25519_bytes(), "ERR_BAD_EC_POINT");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_core_ed25519_add(_r, _p, _q);

    return ArrayUtil.toWritableArray(_r);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_core_ed25519_sub (
      ReadableArray r,
      ReadableArray p,
      ReadableArray q)
  throws Exception {
    byte[] _r = ArgumentsEx.toByteArray(r);
    byte[] _p = ArgumentsEx.toByteArray(p);
    byte[] _q = ArgumentsEx.toByteArray(q);

    try {
      ArgumentsEx.check(_r, SodiumReactNative.crypto_core_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_p, SodiumReactNative.crypto_core_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_q, SodiumReactNative.crypto_core_ed25519_bytes(), "ERR_BAD_EC_POINT");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_core_ed25519_sub(_r, _p, _q);

    return ArrayUtil.toWritableArray(_r);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_core_ed25519_from_uniform (
      ReadableArray p,
      ReadableArray r
  ) throws Exception {
    byte[] _p = ArgumentsEx.toByteArray(p);
    byte[] _r = ArgumentsEx.toByteArray(r);

    try {
      ArgumentsEx.check(_p, SodiumReactNative.crypto_core_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_r, SodiumReactNative.crypto_core_ed25519_uniformbytes(), "ERR_BAD_SEED");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_core_ed25519_from_uniform(_p, _r);

    return ArrayUtil.toWritableArray(_p);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_generichash (
      ReadableArray out,
      ReadableArray in,
      ReadableArray key
  ) throws Exception {
    byte[] _out = ArgumentsEx.toByteArray(out);
    byte[] _in = ArgumentsEx.toByteArray(in);
    byte[] _key = ArgumentsEx.toByteArray(key);

    try {
      ArgumentsEx.check(_out, SodiumReactNative.crypto_generichash_bytes_min(), SodiumReactNative.crypto_generichash_bytes_max(), "ERR_BAD_OUTPUT");
      if (_key.length > 0) ArgumentsEx.check(_key, SodiumReactNative.crypto_generichash_keybytes_min(),
                                   SodiumReactNative.crypto_generichash_keybytes_max(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_generichash(_out, _out.length, _in, _in.length, _key, _key.length);

    return ArrayUtil.toWritableArray(_out);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_generichash_init (
      ReadableArray state,
      ReadableArray key,
      double outlen
  ) throws Exception {
    byte[] _state = ArgumentsEx.toByteArray(state);
    byte[] _key = ArgumentsEx.toByteArray(key);

    try {
      ArgumentsEx.check(_state, SodiumReactNative.crypto_generichash_statebytes(), "ERR_BAD_STATE");
      if (_key.length > 0) ArgumentsEx.check(_key, SodiumReactNative.crypto_generichash_keybytes_min(),
                                   SodiumReactNative.crypto_generichash_keybytes_max(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_generichash_init(_state, _key, _key.length, (int) outlen);

    return ArrayUtil.toWritableArray(_state);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_generichash_update (
      ReadableArray state,
      ReadableArray in
  ) throws Exception {
    byte[] _state = ArgumentsEx.toByteArray(state);
    byte[] _in = ArgumentsEx.toByteArray(in);

    try {
      ArgumentsEx.check(_state, SodiumReactNative.crypto_generichash_statebytes(), "ERR_BAD_STATE");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_generichash_update(_state, _in, _in.length);

    return ArrayUtil.toWritableArray(_state);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_generichash_final (
      ReadableArray state,
      ReadableArray out
  ) throws Exception {
    byte[] _state = ArgumentsEx.toByteArray(state);
    byte[] _out = ArgumentsEx.toByteArray(out);

    try {
      ArgumentsEx.check(_state, SodiumReactNative.crypto_generichash_statebytes(), "ERR_BAD_STATE");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_generichash_final(_state, _out, _out.length);

    return ArrayUtil.toWritableArray(_out);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_hash_sha512 (
      ReadableArray out,
      ReadableArray in
  ) throws Exception {
    byte[] _out = ArgumentsEx.toByteArray(out);
    byte[] _in = ArgumentsEx.toByteArray(in);

    try {
      ArgumentsEx.check(_out, SodiumReactNative.crypto_hash_sha512_bytes(), "ERR_BAD_OUTPUT");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_hash_sha512(_out, _in, _in.length);

    return ArrayUtil.toWritableArray(_out);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_kdf_keygen (ReadableArray key) throws Exception {
    byte[] _key = ArgumentsEx.toByteArray(key);

    try {
      ArgumentsEx.check(_key, SodiumReactNative.crypto_kdf_keybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_kdf_keygen(_key);

    return ArrayUtil.toWritableArray(_key);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_kdf_derive_from_key (
      ReadableArray subkey,
      int subkey_id,
      ReadableArray ctx,
      ReadableArray key
  ) throws Exception {
    byte[] _subkey = ArgumentsEx.toByteArray(subkey);
    byte[] _ctx = ArgumentsEx.toByteArray(ctx);
    byte[] _key = ArgumentsEx.toByteArray(key);

    try {
      ArgumentsEx.check(_subkey, SodiumReactNative.crypto_kdf_bytes_min(), SodiumReactNative.crypto_kdf_bytes_max(), "ERR_BAD_SUBKEY");
      ArgumentsEx.check(_ctx, SodiumReactNative.crypto_kdf_contextbytes(), "ERR_BAD_CONTEXT");
      ArgumentsEx.check(_key, SodiumReactNative.crypto_kdf_keybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_kdf_derive_from_key(_subkey, _subkey.length, subkey_id, _ctx, _key);

    return ArrayUtil.toWritableArray(_subkey);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_kx_keypair (ReadableArray pk, ReadableArray sk) throws Exception {
    byte[] _pk = ArgumentsEx.toByteArray(pk);
    byte[] _sk = ArgumentsEx.toByteArray(sk);

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_kx_publickeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_sk, SodiumReactNative.crypto_kx_secretkeybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_kx_keypair(_pk, _sk);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

    try {
      outputStream.write( _pk );
      outputStream.write( _sk );
    } catch (IOException e) {
      throw e;
    }

    byte ret[] = outputStream.toByteArray( );

    return ArrayUtil.toWritableArray(ret);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_pwhash (
      ReadableArray out,
      ReadableArray passwd,
      ReadableArray salt,
      int opslimit,
      int memlimit,
      int alg
  ) throws Exception {
    byte[] _out = ArgumentsEx.toByteArray(out);
    byte[] _passwd = ArgumentsEx.toByteArray(passwd);
    byte[] _salt = ArgumentsEx.toByteArray(salt);

    try {
      ArgumentsEx.check(_out, SodiumReactNative.crypto_pwhash_bytes_min(), SodiumReactNative.crypto_pwhash_bytes_max(), "ERR_BAD_OUTPUT");
      ArgumentsEx.check(_passwd, SodiumReactNative.crypto_pwhash_passwd_min(), SodiumReactNative.crypto_pwhash_passwd_max(), "ERR_BAD_PWD");
      ArgumentsEx.check(_salt, SodiumReactNative.crypto_pwhash_saltbytes(), "ERR_BAD_SALT");
      ArgumentsEx.check(opslimit, SodiumReactNative.crypto_pwhash_opslimit_min(), SodiumReactNative.crypto_pwhash_opslimit_max(), "ERR_BAD_OPS");
      ArgumentsEx.check(memlimit, SodiumReactNative.crypto_pwhash_memlimit_min(), SodiumReactNative.crypto_pwhash_memlimit_max(), "ERR_BAD_MEM");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_pwhash(_out, _out.length, _passwd, _passwd.length, _salt, opslimit, memlimit, alg);

    return ArrayUtil.toWritableArray(_out);
  }

  @ReactMethod
  public void crypto_pwhash_async (
      ReadableArray out,
      ReadableArray passwd,
      ReadableArray salt,
      int opslimit,
      int memlimit,
      int alg,
      Promise promise
  ) {
    byte[] _out = ArgumentsEx.toByteArray(out);
    byte[] _passwd = ArgumentsEx.toByteArray(passwd);
    byte[] _salt = ArgumentsEx.toByteArray(salt);

    try {
      ArgumentsEx.check(_out, SodiumReactNative.crypto_pwhash_bytes_min(), SodiumReactNative.crypto_pwhash_bytes_max(), "ERR_BAD_OUTPUT");
      ArgumentsEx.check(_passwd, SodiumReactNative.crypto_pwhash_passwd_min(), SodiumReactNative.crypto_pwhash_passwd_max(), "ERR_BAD_PWD");
      ArgumentsEx.check(_salt, SodiumReactNative.crypto_pwhash_saltbytes(), "ERR_BAD_SALT");
      ArgumentsEx.check(opslimit, SodiumReactNative.crypto_pwhash_opslimit_min(), SodiumReactNative.crypto_pwhash_opslimit_max(), "ERR_BAD_OPS");
      ArgumentsEx.check(memlimit, SodiumReactNative.crypto_pwhash_memlimit_min(), SodiumReactNative.crypto_pwhash_memlimit_max(), "ERR_BAD_MEM");
    } catch (Exception e) {
      promise.reject("crypto_pwhash bad arguments:", e);
    }

    int ret = SodiumReactNative.crypto_pwhash(_out, _out.length, _passwd, _passwd.length, _salt, opslimit, memlimit, alg);

    if (ret != 0) {
      Exception e = new Exception("crypto_pwhash execution failed");
      promise.reject("crypto_pwhash execution failed", e);
    }

    WritableArray buf = ArrayUtil.toWritableArray(_out);
    promise.resolve(buf);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_scalarmult (
      ReadableArray q,
      ReadableArray n,
      ReadableArray p
  ) throws Exception {
    byte[] _q = ArgumentsEx.toByteArray(q);
    byte[] _n = ArgumentsEx.toByteArray(n);
    byte[] _p = ArgumentsEx.toByteArray(p);

    try {
      ArgumentsEx.check(_q, SodiumReactNative.crypto_scalarmult_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_n, SodiumReactNative.crypto_scalarmult_scalarbytes(), "ERR_BAD_SCALAR");
      ArgumentsEx.check(_p, SodiumReactNative.crypto_scalarmult_bytes(), "ERR_BAD_EC_POINT");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_scalarmult(_q, _n, _p);

    return ArrayUtil.toWritableArray(_q);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_scalarmult_base (
      ReadableArray q,
      ReadableArray n
  ) throws Exception {
    byte[] _q = ArgumentsEx.toByteArray(q);
    byte[] _n = ArgumentsEx.toByteArray(n);

    try {
      ArgumentsEx.check(_q, SodiumReactNative.crypto_scalarmult_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_n, SodiumReactNative.crypto_scalarmult_scalarbytes(), "ERR_BAD_SCALAR");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_scalarmult_base(_q, _n);

    return ArrayUtil.toWritableArray(_q);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_scalarmult_ed25519 (
      ReadableArray q,
      ReadableArray n,
      ReadableArray p
  ) throws Exception {
    byte[] _q = ArgumentsEx.toByteArray(q);
    byte[] _n = ArgumentsEx.toByteArray(n);
    byte[] _p = ArgumentsEx.toByteArray(p);

    try {
      ArgumentsEx.check(_q, SodiumReactNative.crypto_scalarmult_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_n, SodiumReactNative.crypto_scalarmult_ed25519_scalarbytes(), "ERR_BAD_SCALAR");
      ArgumentsEx.check(_p, SodiumReactNative.crypto_scalarmult_ed25519_bytes(), "ERR_BAD_EC_POINT");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_scalarmult_ed25519(_q, _n, _p);

    return ArrayUtil.toWritableArray(_q);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_scalarmult_ed25519_noclamp (
      ReadableArray q,
      ReadableArray n,
      ReadableArray p
  ) throws Exception {
    byte[] _q = ArgumentsEx.toByteArray(q);
    byte[] _n = ArgumentsEx.toByteArray(n);
    byte[] _p = ArgumentsEx.toByteArray(p);

    try {
      ArgumentsEx.check(_q, SodiumReactNative.crypto_scalarmult_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_n, SodiumReactNative.crypto_scalarmult_ed25519_scalarbytes(), "ERR_BAD_SCALAR");
      ArgumentsEx.check(_p, SodiumReactNative.crypto_scalarmult_ed25519_bytes(), "ERR_BAD_EC_POINT");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_scalarmult_ed25519_noclamp(_q, _n, _p);

    return ArrayUtil.toWritableArray(_q);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_scalarmult_ed25519_base (
      ReadableArray q,
      ReadableArray n
  ) throws Exception {
    byte[] _q = ArgumentsEx.toByteArray(q);
    byte[] _n = ArgumentsEx.toByteArray(n);

    try {
      ArgumentsEx.check(_q, SodiumReactNative.crypto_scalarmult_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_n, SodiumReactNative.crypto_scalarmult_ed25519_scalarbytes(), "ERR_BAD_SCALAR");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_scalarmult_ed25519_base(_q, _n);

    return ArrayUtil.toWritableArray(_q);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_scalarmult_ed25519_base_noclamp (
      ReadableArray q,
      ReadableArray n
  ) throws Exception {
    byte[] _q = ArgumentsEx.toByteArray(q);
    byte[] _n = ArgumentsEx.toByteArray(n);

    try {
      ArgumentsEx.check(_q, SodiumReactNative.crypto_scalarmult_ed25519_bytes(), "ERR_BAD_EC_POINT");
      ArgumentsEx.check(_n, SodiumReactNative.crypto_scalarmult_ed25519_scalarbytes(), "ERR_BAD_SCALAR");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_scalarmult_ed25519_base_noclamp(_q, _n);

    return ArrayUtil.toWritableArray(_q);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_secretbox_easy (
      ReadableArray c,
      ReadableArray m,
      ReadableArray n,
      ReadableArray k
  ) throws Exception {
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _n = ArgumentsEx.toByteArray(n);
    byte[] _k = ArgumentsEx.toByteArray(k);

    try {
      ArgumentsEx.check(_c, _m.length + SodiumReactNative.crypto_secretbox_macbytes(), "ERR_BAD_CIPHERTEXT");
      ArgumentsEx.check(_n, SodiumReactNative.crypto_secretbox_noncebytes(), "ERR_BAD_NONCE");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_secretbox_keybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_secretbox_easy(_c, _m, _m.length, _n, _k);

    int success = SodiumReactNative.crypto_secretbox_easy(_c, _m, _m.length, _n, _k);
    if (success != 0) {
      Exception e = new Exception("crypto_secretbox_easy execution failed");
      throw e;
    }

    return ArrayUtil.toWritableArray(_c);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_secretbox_open_easy (
      ReadableArray m,
      ReadableArray c,
      ReadableArray n,
      ReadableArray k
  ) throws Exception {
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _n = ArgumentsEx.toByteArray(n);
    byte[] _k = ArgumentsEx.toByteArray(k);

    try {
      ArgumentsEx.check(_m, _c.length - SodiumReactNative.crypto_secretbox_macbytes(), "ERR_BAD_MESSAGE_LENGTH");
      ArgumentsEx.check(_n, SodiumReactNative.crypto_secretbox_noncebytes(), "ERR_BAD_NONCE");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_secretbox_keybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_secretbox_open_easy(_m, _c, _c.length, _n, _k);
    if (success != 0) {
      Exception e = new Exception("crypto_secretbox_open_easy execution failed");
      throw e;
    }

    return ArrayUtil.toWritableArray(_m);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_secretstream_xchacha20poly1305_init_push (
      ReadableArray state,
      ReadableArray header,
      ReadableArray k
  ) throws Exception {
    byte[] _state = ArgumentsEx.toByteArray(state);
    byte[] _header = ArgumentsEx.toByteArray(header);
    byte[] _k = ArgumentsEx.toByteArray(k);

    try {
      ArgumentsEx.check(_state, SodiumReactNative.crypto_secretstream_xchacha20poly1305_statebytes(), "ERR_BAD_STATE");
      ArgumentsEx.check(_header, SodiumReactNative.crypto_secretstream_xchacha20poly1305_headerbytes(), "ERR_BAD_HEADER");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_secretstream_xchacha20poly1305_keybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_secretstream_xchacha20poly1305_init_push(_state, _header, _k);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

    try {
      outputStream.write( _state );
      outputStream.write( _header ); // put dynamic length entry last
    } catch (IOException e) {
      throw e;
    }

    byte ret[] = outputStream.toByteArray( );

    return ArrayUtil.toWritableArray(ret);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_secretstream_xchacha20poly1305_push (
      ReadableArray state,
      ReadableArray c,
      ReadableArray m,
      ReadableArray ad,
      ReadableArray tag
  ) throws Exception {
    byte[] _state = ArgumentsEx.toByteArray(state);
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _ad = ArgumentsEx.toByteArray(ad);
    byte[] _tag = ArgumentsEx.toByteArray(tag);
    int[] clen_p = new int[1];

    try {
      ArgumentsEx.check(_state, SodiumReactNative.crypto_secretstream_xchacha20poly1305_statebytes(), "ERR_BAD_STATE");
      ArgumentsEx.check(_m, _c.length - SodiumReactNative.crypto_secretstream_xchacha20poly1305_abytes(), "ERR_BAD_CIPHERTEXT_LENGTH");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_secretstream_xchacha20poly1305_push(_state, _c, clen_p, _m, _m.length, _ad, _ad.length, _tag);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

    try {
      outputStream.write( _state );
      outputStream.write( Arrays.copyOfRange(_c, 0, clen_p[0] ) ); // put dynamic length entry last
    } catch (IOException e) {
      throw e;
    }

    byte ret[] = outputStream.toByteArray( );

    return ArrayUtil.toWritableArray(ret);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_secretstream_xchacha20poly1305_init_pull (
      ReadableArray state,
      ReadableArray header,
      ReadableArray k
  ) throws Exception {
    byte[] _state = ArgumentsEx.toByteArray(state);
    byte[] _header = ArgumentsEx.toByteArray(header);
    byte[] _k = ArgumentsEx.toByteArray(k);

    try {
      ArgumentsEx.check(_state, SodiumReactNative.crypto_secretstream_xchacha20poly1305_statebytes(), "ERR_BAD_STATE");
      ArgumentsEx.check(_header, SodiumReactNative.crypto_secretstream_xchacha20poly1305_headerbytes(), "ERR_BAD_HEADER");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_secretstream_xchacha20poly1305_keybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_secretstream_xchacha20poly1305_init_pull(_state, _header, _k);

    return ArrayUtil.toWritableArray(_state);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_secretstream_xchacha20poly1305_pull (
      ReadableArray state,
      ReadableArray m,
      ReadableArray tag,
      ReadableArray c,
      ReadableArray ad
  ) throws Exception {
    byte[] _state = ArgumentsEx.toByteArray(state);
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _ad = ArgumentsEx.toByteArray(ad);
    byte[] _tag = ArgumentsEx.toByteArray(tag);
    int[] mlen_p = new int[1];

    try {
      ArgumentsEx.check(_state, SodiumReactNative.crypto_secretstream_xchacha20poly1305_statebytes(), "ERR_BAD_STATE");
      ArgumentsEx.check(_m, _c.length - SodiumReactNative.crypto_secretstream_xchacha20poly1305_abytes(), "ERR_BAD_MESSAGE_LENGTH");
    } catch (Exception e) {
      throw e;
    }

    SodiumReactNative.crypto_secretstream_xchacha20poly1305_pull(_state, _m, mlen_p, _tag, _c, _c.length, _ad, _ad.length);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

    try {
      outputStream.write( _state );
      outputStream.write( _tag );
      outputStream.write( Arrays.copyOfRange(_m, 0, mlen_p[0] ) ); // put dynamic length entry last
    } catch (IOException e) {
      throw e;
    }

    byte ret[] = outputStream.toByteArray( );

    return ArrayUtil.toWritableArray(ret);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_sign (
    ReadableArray sm,
    ReadableArray m,
    ReadableArray sk
  ) throws Exception {
    byte[] _sm = ArgumentsEx.toByteArray(sm);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _sk = ArgumentsEx.toByteArray(sk);
    int[] smlen_p = new int[1];

    try {
      ArgumentsEx.check(_sk, SodiumReactNative.crypto_sign_secretkeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_sm, _m.length + SodiumReactNative.crypto_sign_bytes(), "ERR_BAD_CIPHERTEXT_LENGTH");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_sign(_sm, smlen_p, _m, _m.length, _sk);
    if (success != 0) {
      Exception e = new Exception("crypto_sign execution failed");
      throw e;
    }

    return ArrayUtil.toWritableArray( Arrays.copyOfRange(_sm, 0, smlen_p[0] ) );
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_sign_open (
    ReadableArray m,
    ReadableArray sm,
    ReadableArray pk
  ) throws Exception {
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _sm = ArgumentsEx.toByteArray(sm);
    byte[] _pk = ArgumentsEx.toByteArray(pk);
    int[] mlen_p = new int[1];

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_sign_publickeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_m, _sm.length - SodiumReactNative.crypto_sign_bytes(), "ERR_BAD_PLAINTEXT_LENGTH");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_sign_open(_m, mlen_p, _sm, _sm.length, _pk);
    if (success != 0) {
      Exception e = new Exception("Signature could not be verified");
      throw e;
    }

    return ArrayUtil.toWritableArray( Arrays.copyOfRange(_m, 0, mlen_p[0] ) );
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_sign_detached (
    ReadableArray sig,
    ReadableArray m,
    ReadableArray sk
  ) throws Exception {
    byte[] _sig = ArgumentsEx.toByteArray(sig);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _sk = ArgumentsEx.toByteArray(sk);

    try {
      ArgumentsEx.check(_sig, SodiumReactNative.crypto_sign_bytes(), "ERR_BAD_SIGNATURE_LENGTH");
      ArgumentsEx.check(_sk, SodiumReactNative.crypto_sign_secretkeybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_sign_detached(_sig, null, _m, _m.length, _sk);
    if (success != 0) {
      Exception e = new Exception("crypto_sign_detached execution failed");
      throw e;
    }

    return ArrayUtil.toWritableArray(_sig);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_sign_keypair (ReadableArray pk, ReadableArray sk) throws Exception {
    byte[] _pk = ArgumentsEx.toByteArray(pk);
    byte[] _sk = ArgumentsEx.toByteArray(sk);

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_sign_publickeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_sk, SodiumReactNative.crypto_sign_secretkeybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_sign_keypair(_pk, _sk);
    if (success != 0) {
      Exception e = new Exception("crypto_sign_keypair execution failed");
      throw e;
    }

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

    try {
      outputStream.write( _pk );
      outputStream.write( _sk );
    } catch (IOException e) {
      throw e;
    }

    byte ret[] = outputStream.toByteArray( );

    return ArrayUtil.toWritableArray(ret);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_sign_seed_keypair (
    ReadableArray pk,
    ReadableArray sk,
    ReadableArray seed
  ) throws Exception {
    byte[] _pk = ArgumentsEx.toByteArray(pk);
    byte[] _sk = ArgumentsEx.toByteArray(sk);
    byte[] _seed = ArgumentsEx.toByteArray(seed);

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_sign_publickeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_sk, SodiumReactNative.crypto_sign_secretkeybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_sign_seed_keypair(_pk, _sk, _seed);
    if (success != 0) {
      Exception e = new Exception("crypto_sign_seed_keypair execution failed");
      throw e;
    }

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

    try {
      outputStream.write( _pk );
      outputStream.write( _sk );
    } catch (IOException e) {
      throw e;
    }

    byte ret[] = outputStream.toByteArray( );

    return ArrayUtil.toWritableArray(ret);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public void crypto_sign_verify_detached (
    ReadableArray sig,
    ReadableArray m,
    ReadableArray pk
  ) throws Exception {
    byte[] _sig = ArgumentsEx.toByteArray(sig);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _pk = ArgumentsEx.toByteArray(pk);

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_sign_publickeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_sig, SodiumReactNative.crypto_sign_bytes(), "ERR_BAD_SIGNATURE_LENGTH");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_sign_verify_detached(_sig, _m, _m.length, _pk);
    if (success != 0) {
      Exception e = new Exception("Signature could not be verified");
      throw e;
    }
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_sign_ed25519_sk_to_pk (
    ReadableArray pk,
    ReadableArray sk
  ) throws Exception {
    byte[] _pk = ArgumentsEx.toByteArray(pk);
    byte[] _sk = ArgumentsEx.toByteArray(sk);

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_sign_publickeybytes(), "ERR_BAD_PUBLICKEY");
      ArgumentsEx.check(_sk, SodiumReactNative.crypto_sign_secretkeybytes(), "ERR_BAD_SECRETKEY");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_sign_ed25519_sk_to_pk(_pk, _sk);
    if (success != 0) {
      Exception e = new Exception("Public key could not be derived");
      throw e;
    }

    return ArrayUtil.toWritableArray(_pk);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_stream_xor (
    ReadableArray c,
    ReadableArray m,
    ReadableArray n,
    ReadableArray k
  ) throws Exception {
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _n = ArgumentsEx.toByteArray(n);
    byte[] _k = ArgumentsEx.toByteArray(k);

    try {
      ArgumentsEx.check(_n, SodiumReactNative.crypto_stream_noncebytes(), "ERR_BAD_NONCE");
      ArgumentsEx.check(_k, SodiumReactNative.crypto_stream_keybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_c, _m.length, "ERR_BAD_PLAINTEXT_LENGTH");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_stream_xor(_c, _m, _m.length, _n, _k);
    if (success != 0) {
      Exception e = new Exception("crypto_stream_xor execution failed");
      throw e;
    }

    return ArrayUtil.toWritableArray(_c);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray randombytes_buf(ReadableArray in) throws Exception {
    byte[] buf = ArgumentsEx.toByteArray(in);

    SodiumReactNative.randombytes_buf(buf, buf.length);

    return ArrayUtil.toWritableArray(buf);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray sodium_pad (ReadableArray buf, int unpadded_buflen, int blocksize) throws Exception {
    byte[] _buf = ArgumentsEx.toByteArray(buf);
    int[] padded_buflen = new int[1];

    if (unpadded_buflen > _buf.length) throw new Exception("unpadded length cannot exceed buffer length");
    if (blocksize > _buf.length) throw new Exception("block size cannot exceed buffer length");
    if (blocksize < 1) throw new Exception("block sizemust be at least 1 byte");
    if (_buf.length < unpadded_buflen + (blocksize - (unpadded_buflen % blocksize))) throw new Exception("buf not long enough");

    SodiumReactNative.sodium_pad(padded_buflen, _buf, unpadded_buflen, blocksize, _buf.length);

    return ArrayUtil.toWritableArray( Arrays.copyOfRange(_buf, 0, padded_buflen[0] ) );
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray sodium_unpad (ReadableArray buf, int padded_buflen, int blocksize) throws Exception {
    byte[] _buf = ArgumentsEx.toByteArray(buf);
    int[] unpadded_buflen = new int[1];

    if (padded_buflen > _buf.length) throw new Exception("padded length cannot exceed buffer length");
    if (blocksize > _buf.length) throw new Exception("block size cannot exceed buffer length");
    if (blocksize < 1) throw new Exception("block sizemust be at least 1 byte");

    SodiumReactNative.sodium_unpad(unpadded_buflen, _buf, padded_buflen, blocksize);

    return ArrayUtil.toWritableArray( Arrays.copyOfRange(_buf, 0, unpadded_buflen[0] ) );
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_box_keypair (
    ReadableArray pk,
    ReadableArray sk
  ) throws Exception {
    byte[] _pk = ArgumentsEx.toByteArray(pk);
    byte[] _sk = ArgumentsEx.toByteArray(sk);

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_box_publickeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_sk, SodiumReactNative.crypto_box_secretkeybytes(), "ERR_BAD_KEY");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_box_keypair(_pk, _sk);
    if (success != 0) {
      Exception e = new Exception("crypto_box_keypair execution failed");
      throw e;
    }

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

    try {
      outputStream.write( _pk );
      outputStream.write( _sk );
    } catch (IOException e) {
      throw e;
    }

    byte ret[] = outputStream.toByteArray( );

    return ArrayUtil.toWritableArray(ret);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_box_seal (
    ReadableArray c,
    ReadableArray m,
    ReadableArray pk
  ) throws Exception {
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _pk = ArgumentsEx.toByteArray(pk);

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_box_publickeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_c, _m.length + SodiumReactNative.crypto_box_sealbytes(), "ERR_BAD_CIPHERTEXT_LENGTH");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_box_seal(_c, _m, _m.length, _pk);
    if (success != 0) {
      Exception e = new Exception("crypto_box_seal execution failed");
      throw e;
    }

    return ArrayUtil.toWritableArray(_c);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public WritableArray crypto_box_seal_open (
    ReadableArray m,
    ReadableArray c,
    ReadableArray pk,
    ReadableArray sk
  ) throws Exception {
    byte[] _m = ArgumentsEx.toByteArray(m);
    byte[] _c = ArgumentsEx.toByteArray(c);
    byte[] _pk = ArgumentsEx.toByteArray(pk);
    byte[] _sk = ArgumentsEx.toByteArray(sk);

    try {
      ArgumentsEx.check(_pk, SodiumReactNative.crypto_box_publickeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_sk, SodiumReactNative.crypto_box_secretkeybytes(), "ERR_BAD_KEY");
      ArgumentsEx.check(_m, _c.length - SodiumReactNative.crypto_box_sealbytes(), "ERR_BAD_PLAINTEXT_LENGTH");
    } catch (Exception e) {
      throw e;
    }

    int success = SodiumReactNative.crypto_box_seal_open(_m, _c, _c.length, _pk, _sk);
    if (success != 0) {
      Exception e = new Exception("crypto_box_seal_open execution failed");
      throw e;
    }

    return ArrayUtil.toWritableArray(_m);
  }
}

import { it } from 'mocha';
import { t } from '../t';

module.exports = function (sodium) {
  it('crypto_generichash', function () {
    var buf = Buffer.from('Hello, World!')

    var out = Buffer.alloc(sodium.crypto_generichash_BYTES)
    sodium.crypto_generichash(out, buf)

    t.same(out.toString('hex'), '511bc81dde11180838c562c82bb35f3223f46061ebde4a955c27b3f489cf1e03', 'hashed buffer')

    var min = Buffer.alloc(sodium.crypto_generichash_BYTES_MIN)
    sodium.crypto_generichash(min, buf)

    t.same(min.toString('hex'), '3895c59e4aeb0903396b5be3fbec69fe', 'hashed buffer min')

    var max = Buffer.alloc(sodium.crypto_generichash_BYTES_MAX)
    sodium.crypto_generichash(max, buf)

    var res = '7dfdb888af71eae0e6a6b751e8e3413d767ef4fa52a7993daa9ef097f7aa3d949199c113caa37c94f80cf3b22f7d9d6e4f5def4ff927830cffe4857c34be3d89'
    t.same(max.toString('hex'), res, 'hashed buffer max')

    t.end()
  })

  it('crypto_generichash with key', function () {
    var buf = Buffer.from('Hello, World!')
    var key = Buffer.alloc(sodium.crypto_generichash_KEYBYTES)

    key.fill('lo')

    var out = Buffer.alloc(sodium.crypto_generichash_BYTES)
    sodium.crypto_generichash(out, buf, key)

    t.same(out.toString('hex'), 'f4113fe33d43c24c54627d40efa1a78838d4a6d689fd6e83c213848904fffa8c', 'hashed buffer')

    var min = Buffer.alloc(sodium.crypto_generichash_BYTES_MIN)
    sodium.crypto_generichash(min, buf, key)

    t.same(min.toString('hex'), 'c8226257b0d1c3dcf4bbc3ef79574689', 'hashed buffer min')

    var max = Buffer.alloc(sodium.crypto_generichash_BYTES_MAX)
    sodium.crypto_generichash(max, buf, key)

    var res = '763eda46f4c6c61abb4310eb8a488950e9e0667b2fca03c463dc7489e94f065b7af6063fe86b0441c3eb9052800121d55730412abb2cbe0761b1d66f9b047c1c'
    t.same(max.toString('hex'), res, 'hashed buffer max')

    t.end()
  })

  it('crypto_generichash_instance', function () {
    var isntance = sodium.crypto_generichash_instance()
    var buf = Buffer.from('Hej, Verden')

    for (var i = 0; i < 10; i++) isntance.update(buf)

    var out = Buffer.alloc(sodium.crypto_generichash_BYTES)
    isntance.final(out)

    t.same(out.toString('hex'), 'cbc20f347f5dfe37dc13231cbf7eaa4ec48e585ec055a96839b213f62bd8ce00', 'streaming hash')
    t.end()
  })

  it('crypto_generichash_instance with key', function () {
    var key = Buffer.alloc(sodium.crypto_generichash_KEYBYTES)
    key.fill('lo')

    var isntance = sodium.crypto_generichash_instance(key)
    var buf = Buffer.from('Hej, Verden')

    for (var i = 0; i < 10; i++) isntance.update(buf)

    var out = Buffer.alloc(sodium.crypto_generichash_BYTES)
    isntance.final(out)

    t.same(out.toString('hex'), '405f14acbeeb30396b8030f78e6a84bab0acf08cb1376aa200a500f669f675dc', 'streaming keyed hash')
    t.end()
  })

  it('crypto_generichash_instance with hash length', function () {
    var isntance = sodium.crypto_generichash_instance(null, sodium.crypto_generichash_BYTES_MIN)
    var buf = Buffer.from('Hej, Verden')

    for (var i = 0; i < 10; i++) isntance.update(buf)

    var out = Buffer.alloc(sodium.crypto_generichash_BYTES_MIN)
    isntance.final(out)

    t.same(out.toString('hex'), 'decacdcc3c61948c79d9f8dee5b6aa99', 'streaming short hash')
    t.end()
  })

  it('crypto_generichash_instance with key and hash length', function () {
    var key = Buffer.alloc(sodium.crypto_generichash_KEYBYTES)
    key.fill('lo')

    var isntance = sodium.crypto_generichash_instance(key, sodium.crypto_generichash_BYTES_MIN)
    var buf = Buffer.from('Hej, Verden')

    for (var i = 0; i < 10; i++) isntance.update(buf)

    var out = Buffer.alloc(sodium.crypto_generichash_BYTES_MIN)
    isntance.final(out)

    t.same(out.toString('hex'), 'fb43f0ab6872cbfd39ec4f8a1bc6fb37', 'streaming short keyed hash')
    t.end()
  })

  it('crypto_generichash_batch', function () {
    var buf = Buffer.from('Hej, Verden')
    var batch = []
    for (var i = 0; i < 10; i++) batch.push(buf)

    var out = Buffer.alloc(sodium.crypto_generichash_BYTES)
    sodium.crypto_generichash_batch(out, batch)

    t.same(out.toString('hex'), 'cbc20f347f5dfe37dc13231cbf7eaa4ec48e585ec055a96839b213f62bd8ce00', 'batch hash')
    t.end()
  })

  it('crypto_generichash_batch with key', function () {
    var key = Buffer.alloc(sodium.crypto_generichash_KEYBYTES)
    key.fill('lo')

    var buf = Buffer.from('Hej, Verden')
    var batch = []
    for (var i = 0; i < 10; i++) batch.push(buf)

    var out = Buffer.alloc(sodium.crypto_generichash_BYTES)
    sodium.crypto_generichash_batch(out, batch, key)

    t.same(out.toString('hex'), '405f14acbeeb30396b8030f78e6a84bab0acf08cb1376aa200a500f669f675dc', 'batch keyed hash')
    t.end()
  })
}

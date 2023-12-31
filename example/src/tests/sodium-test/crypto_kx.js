import { it } from 'mocha';
import { t } from '../t';

var exp = [
  Buffer.from('0e0216223f147143d32615a91189c288c1728cba3cc5f9f621b1026e03d83129', 'hex'),
  Buffer.from('cb2f5160fc1f7e05a55ef49d340b48da2e5a78099d53393351cd579dd42503d6', 'hex')
]

module.exports = function (sodium) {
  it('crypto_kx', () => {
    const seed = Buffer.alloc(sodium.crypto_kx_SEEDBYTES)
    const client_pk = Buffer.alloc(sodium.crypto_kx_PUBLICKEYBYTES)
    const client_sk = Buffer.alloc(sodium.crypto_kx_SECRETKEYBYTES)
    const hex = Buffer.alloc(65)
    let i

    for (i = 0; i < sodium.crypto_kx_SEEDBYTES; i++) seed[i] = i

    sodium.crypto_kx_seed_keypair(client_pk, client_sk, seed)

    t.same(client_pk, exp[0])
    t.same(client_sk, exp[1])

    t.equal(sodium.crypto_kx_SEEDBYTES, 32)
    t.equal(sodium.crypto_kx_PUBLICKEYBYTES, 32)
    t.equal(sodium.crypto_kx_SECRETKEYBYTES, 32)

    t.end()
  })
}

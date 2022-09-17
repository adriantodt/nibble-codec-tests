package net.adriantodt.codectest.codecs;

import java.io.IOException;

/**
 * <p>Interface for compression/decompression algorithms used by CoffeeComputers.</p>
 */
public interface Codec {
    /*
     * Implementations...
     * - Can safely assume that "src.length" is divisible by two.
     * - Can safely assume that "src" and "bin" are always not null.
     * - Can safely assume that the bytes of "src" are between 0 and 15.
     * - Should never return null and must throw instead.
     *
     * Classes which use codecs...
     * - Should make sure that "src.length" is divisible by two.
     * - Should never input null as an argument.
     * - Should make sure that the bytes of "src" are between 0 and 15.
     * - Can safely assume that a method never returns null.
     */


    byte[] codec(byte[] src) throws IOException;
    byte[] uncodec(byte[] bin) throws IOException;
}

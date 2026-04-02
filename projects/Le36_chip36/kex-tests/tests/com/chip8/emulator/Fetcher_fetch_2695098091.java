package com.chip8.emulator;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.chip8.emulator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;

public class Fetcher_fetch_2695098091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5683247;

    public Fetcher_fetch_2695098091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5693308 = new ArrayDeque();
        term5683247 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5683249 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5683250 = (byte[]) newByteArray(16);
        byte[] term5683267 = (byte[]) newByteArray(16);
        byte[] term5683284 = (byte[]) newByteArray(16);
        byte[] term5683304 = (byte[]) newByteArray(65535);
        setShortField(term5683247, term5683247.getClass(), "opcode", (short) 7092);
        setField(term5683249, term5683249.getClass(), "v", term5683250);
        setField(term5683249, term5683249.getClass(), "rpl", term5683267);
        setByteElement(term5683284, 3, (byte) 32);
        setByteElement(term5683284, 4, (byte) 64);
        setByteElement(term5683284, 5, (byte) 32);
        setByteElement(term5683284, 7, (byte) 32);
        setByteElement(term5683284, 8, (byte) 64);
        setByteElement(term5683284, 9, (byte) 32);
        setByteElement(term5683284, 11, (byte) 32);
        setByteElement(term5683284, 12, (byte) 64);
        setByteElement(term5683284, 13, (byte) 32);
        setField(term5683249, term5683249.getClass(), "audio", term5683284);
        setShortField(term5683249, term5683249.getClass(), "pitch", (short) 64);
        setShortField(term5683249, term5683249.getClass(), "i", (short) -32353);
        setShortField(term5683249, term5683249.getClass(), "pc", (short) 512);
        setField(term5683249, term5683249.getClass(), "ram", term5683304);
        setByteField(term5683249, term5683249.getClass(), "delayTimer", (byte) -121);
        setByteField(term5683249, term5683249.getClass(), "soundTimer", (byte) 127);
        setField(term5683249, term5683249.getClass(), "stack", term5693308);
        setField(term5683247, term5683247.getClass(), "m", term5683249);
        setLongField(term5683247, term5683247.getClass(), "currentTime", -3936701866695933852L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fetch", argTypes, term5683247, args);
    }

};



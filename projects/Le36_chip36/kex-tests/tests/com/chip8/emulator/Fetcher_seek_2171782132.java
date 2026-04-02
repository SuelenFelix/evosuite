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
import java.lang.Short;

public class Fetcher_seek_2171782132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5703362;
     Object term5713428;

    public Fetcher_seek_2171782132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5713423 = new ArrayDeque();
        term5703362 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5703364 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5703365 = (byte[]) newByteArray(16);
        byte[] term5703382 = (byte[]) newByteArray(16);
        byte[] term5703399 = (byte[]) newByteArray(16);
        byte[] term5703419 = (byte[]) newByteArray(65535);
        setShortField(term5703362, term5703362.getClass(), "opcode", (short) -28315);
        setField(term5703364, term5703364.getClass(), "v", term5703365);
        setField(term5703364, term5703364.getClass(), "rpl", term5703382);
        setByteElement(term5703399, 3, (byte) 32);
        setByteElement(term5703399, 4, (byte) 64);
        setByteElement(term5703399, 5, (byte) 32);
        setByteElement(term5703399, 7, (byte) 32);
        setByteElement(term5703399, 8, (byte) 64);
        setByteElement(term5703399, 9, (byte) 32);
        setByteElement(term5703399, 11, (byte) 32);
        setByteElement(term5703399, 12, (byte) 64);
        setByteElement(term5703399, 13, (byte) 32);
        setField(term5703364, term5703364.getClass(), "audio", term5703399);
        setShortField(term5703364, term5703364.getClass(), "pitch", (short) 64);
        setShortField(term5703364, term5703364.getClass(), "i", (short) -657);
        setShortField(term5703364, term5703364.getClass(), "pc", (short) 512);
        setField(term5703364, term5703364.getClass(), "ram", term5703419);
        setByteField(term5703364, term5703364.getClass(), "delayTimer", (byte) 97);
        setByteField(term5703364, term5703364.getClass(), "soundTimer", (byte) -21);
        setField(term5703364, term5703364.getClass(), "stack", term5713423);
        setField(term5703362, term5703362.getClass(), "m", term5703364);
        setLongField(term5703362, term5703362.getClass(), "currentTime", 1215116475929634177L);
        term5713428 = new Short((short) -29734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term5713428;
        callMethod(klass, "seek", argTypes, term5703362, args);
    }

};



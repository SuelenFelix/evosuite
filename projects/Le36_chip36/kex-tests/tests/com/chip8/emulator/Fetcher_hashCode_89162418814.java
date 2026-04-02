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

public class Fetcher_hashCode_89162418814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5964862;

    public Fetcher_hashCode_89162418814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5974923 = new ArrayDeque();
        term5964862 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5964864 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5964865 = (byte[]) newByteArray(16);
        byte[] term5964882 = (byte[]) newByteArray(16);
        byte[] term5964899 = (byte[]) newByteArray(16);
        byte[] term5964919 = (byte[]) newByteArray(65535);
        setShortField(term5964862, term5964862.getClass(), "opcode", (short) -27956);
        setField(term5964864, term5964864.getClass(), "v", term5964865);
        setField(term5964864, term5964864.getClass(), "rpl", term5964882);
        setByteElement(term5964899, 3, (byte) 32);
        setByteElement(term5964899, 4, (byte) 64);
        setByteElement(term5964899, 5, (byte) 32);
        setByteElement(term5964899, 7, (byte) 32);
        setByteElement(term5964899, 8, (byte) 64);
        setByteElement(term5964899, 9, (byte) 32);
        setByteElement(term5964899, 11, (byte) 32);
        setByteElement(term5964899, 12, (byte) 64);
        setByteElement(term5964899, 13, (byte) 32);
        setField(term5964864, term5964864.getClass(), "audio", term5964899);
        setShortField(term5964864, term5964864.getClass(), "pitch", (short) 64);
        setShortField(term5964864, term5964864.getClass(), "i", (short) 16592);
        setShortField(term5964864, term5964864.getClass(), "pc", (short) 512);
        setField(term5964864, term5964864.getClass(), "ram", term5964919);
        setByteField(term5964864, term5964864.getClass(), "delayTimer", (byte) 65);
        setByteField(term5964864, term5964864.getClass(), "soundTimer", (byte) -64);
        setField(term5964864, term5964864.getClass(), "stack", term5974923);
        setField(term5964862, term5964862.getClass(), "m", term5964864);
        setLongField(term5964862, term5964862.getClass(), "currentTime", -900457279156388404L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5964862, args);
    }

};



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
import java.util.ArrayDeque;

public class Memory_getRpl_19585734294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4782842;

    public Memory_getRpl_19585734294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4792901 = new ArrayDeque();
        term4782842 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4782843 = (byte[]) newByteArray(16);
        byte[] term4782860 = (byte[]) newByteArray(16);
        byte[] term4782877 = (byte[]) newByteArray(16);
        byte[] term4782897 = (byte[]) newByteArray(65535);
        setField(term4782842, term4782842.getClass(), "v", term4782843);
        setField(term4782842, term4782842.getClass(), "rpl", term4782860);
        setByteElement(term4782877, 3, (byte) 32);
        setByteElement(term4782877, 4, (byte) 64);
        setByteElement(term4782877, 5, (byte) 32);
        setByteElement(term4782877, 7, (byte) 32);
        setByteElement(term4782877, 8, (byte) 64);
        setByteElement(term4782877, 9, (byte) 32);
        setByteElement(term4782877, 11, (byte) 32);
        setByteElement(term4782877, 12, (byte) 64);
        setByteElement(term4782877, 13, (byte) 32);
        setField(term4782842, term4782842.getClass(), "audio", term4782877);
        setShortField(term4782842, term4782842.getClass(), "pitch", (short) 64);
        setShortField(term4782842, term4782842.getClass(), "i", (short) 27580);
        setShortField(term4782842, term4782842.getClass(), "pc", (short) 512);
        setField(term4782842, term4782842.getClass(), "ram", term4782897);
        setByteField(term4782842, term4782842.getClass(), "delayTimer", (byte) -87);
        setByteField(term4782842, term4782842.getClass(), "soundTimer", (byte) 108);
        setField(term4782842, term4782842.getClass(), "stack", term4792901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRpl", argTypes, term4782842, args);
    }

};



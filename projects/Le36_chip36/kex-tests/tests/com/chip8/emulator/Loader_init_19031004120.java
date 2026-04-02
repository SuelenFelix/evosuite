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

public class Loader_init_19031004120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5245684;

    public Loader_init_19031004120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5255743 = new ArrayDeque();
        term5245684 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5245685 = (byte[]) newByteArray(16);
        byte[] term5245702 = (byte[]) newByteArray(16);
        byte[] term5245719 = (byte[]) newByteArray(16);
        byte[] term5245739 = (byte[]) newByteArray(65535);
        setField(term5245684, term5245684.getClass(), "v", term5245685);
        setField(term5245684, term5245684.getClass(), "rpl", term5245702);
        setByteElement(term5245719, 3, (byte) 32);
        setByteElement(term5245719, 4, (byte) 64);
        setByteElement(term5245719, 5, (byte) 32);
        setByteElement(term5245719, 7, (byte) 32);
        setByteElement(term5245719, 8, (byte) 64);
        setByteElement(term5245719, 9, (byte) 32);
        setByteElement(term5245719, 11, (byte) 32);
        setByteElement(term5245719, 12, (byte) 64);
        setByteElement(term5245719, 13, (byte) 32);
        setField(term5245684, term5245684.getClass(), "audio", term5245719);
        setShortField(term5245684, term5245684.getClass(), "pitch", (short) 64);
        setShortField(term5245684, term5245684.getClass(), "i", (short) 8969);
        setShortField(term5245684, term5245684.getClass(), "pc", (short) 512);
        setField(term5245684, term5245684.getClass(), "ram", term5245739);
        setByteField(term5245684, term5245684.getClass(), "delayTimer", (byte) 97);
        setByteField(term5245684, term5245684.getClass(), "soundTimer", (byte) -9);
        setField(term5245684, term5245684.getClass(), "stack", term5255743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.chip8.emulator.Memory");
        Object[] args = new Object[2];
        args[0] = "nhpssUKjpK";
        args[1] = term5245684;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



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

public class Fetcher_toString_38086449815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5984977;

    public Fetcher_toString_38086449815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5995038 = new ArrayDeque();
        term5984977 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5984979 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5984980 = (byte[]) newByteArray(16);
        byte[] term5984997 = (byte[]) newByteArray(16);
        byte[] term5985014 = (byte[]) newByteArray(16);
        byte[] term5985034 = (byte[]) newByteArray(65535);
        setShortField(term5984977, term5984977.getClass(), "opcode", (short) 20465);
        setField(term5984979, term5984979.getClass(), "v", term5984980);
        setField(term5984979, term5984979.getClass(), "rpl", term5984997);
        setByteElement(term5985014, 3, (byte) 32);
        setByteElement(term5985014, 4, (byte) 64);
        setByteElement(term5985014, 5, (byte) 32);
        setByteElement(term5985014, 7, (byte) 32);
        setByteElement(term5985014, 8, (byte) 64);
        setByteElement(term5985014, 9, (byte) 32);
        setByteElement(term5985014, 11, (byte) 32);
        setByteElement(term5985014, 12, (byte) 64);
        setByteElement(term5985014, 13, (byte) 32);
        setField(term5984979, term5984979.getClass(), "audio", term5985014);
        setShortField(term5984979, term5984979.getClass(), "pitch", (short) 64);
        setShortField(term5984979, term5984979.getClass(), "i", (short) 4747);
        setShortField(term5984979, term5984979.getClass(), "pc", (short) 512);
        setField(term5984979, term5984979.getClass(), "ram", term5985034);
        setByteField(term5984979, term5984979.getClass(), "delayTimer", (byte) 24);
        setByteField(term5984979, term5984979.getClass(), "soundTimer", (byte) 61);
        setField(term5984979, term5984979.getClass(), "stack", term5995038);
        setField(term5984977, term5984977.getClass(), "m", term5984979);
        setLongField(term5984977, term5984977.getClass(), "currentTime", 1084801489398441516L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5984977, args);
    }

};



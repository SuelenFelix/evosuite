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

public class Fetcher_setM_21910919210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5864286;
     Object term5874352;

    public Fetcher_setM_21910919210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5874347 = new ArrayDeque();
        term5864286 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5864288 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5864289 = (byte[]) newByteArray(16);
        byte[] term5864306 = (byte[]) newByteArray(16);
        byte[] term5864323 = (byte[]) newByteArray(16);
        byte[] term5864343 = (byte[]) newByteArray(65535);
        setShortField(term5864286, term5864286.getClass(), "opcode", (short) -19116);
        setField(term5864288, term5864288.getClass(), "v", term5864289);
        setField(term5864288, term5864288.getClass(), "rpl", term5864306);
        setByteElement(term5864323, 3, (byte) 32);
        setByteElement(term5864323, 4, (byte) 64);
        setByteElement(term5864323, 5, (byte) 32);
        setByteElement(term5864323, 7, (byte) 32);
        setByteElement(term5864323, 8, (byte) 64);
        setByteElement(term5864323, 9, (byte) 32);
        setByteElement(term5864323, 11, (byte) 32);
        setByteElement(term5864323, 12, (byte) 64);
        setByteElement(term5864323, 13, (byte) 32);
        setField(term5864288, term5864288.getClass(), "audio", term5864323);
        setShortField(term5864288, term5864288.getClass(), "pitch", (short) 64);
        setShortField(term5864288, term5864288.getClass(), "i", (short) -9434);
        setShortField(term5864288, term5864288.getClass(), "pc", (short) 512);
        setField(term5864288, term5864288.getClass(), "ram", term5864343);
        setByteField(term5864288, term5864288.getClass(), "delayTimer", (byte) 31);
        setByteField(term5864288, term5864288.getClass(), "soundTimer", (byte) -18);
        setField(term5864288, term5864288.getClass(), "stack", term5874347);
        setField(term5864286, term5864286.getClass(), "m", term5864288);
        setLongField(term5864286, term5864286.getClass(), "currentTime", -4822736661741380518L);
        ArrayDeque term5884411 = new ArrayDeque();
        term5874352 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5874353 = (byte[]) newByteArray(16);
        byte[] term5874370 = (byte[]) newByteArray(16);
        byte[] term5874387 = (byte[]) newByteArray(16);
        byte[] term5874407 = (byte[]) newByteArray(65535);
        setField(term5874352, term5874352.getClass(), "v", term5874353);
        setField(term5874352, term5874352.getClass(), "rpl", term5874370);
        setByteElement(term5874387, 3, (byte) 32);
        setByteElement(term5874387, 4, (byte) 64);
        setByteElement(term5874387, 5, (byte) 32);
        setByteElement(term5874387, 7, (byte) 32);
        setByteElement(term5874387, 8, (byte) 64);
        setByteElement(term5874387, 9, (byte) 32);
        setByteElement(term5874387, 11, (byte) 32);
        setByteElement(term5874387, 12, (byte) 64);
        setByteElement(term5874387, 13, (byte) 32);
        setField(term5874352, term5874352.getClass(), "audio", term5874387);
        setShortField(term5874352, term5874352.getClass(), "pitch", (short) 64);
        setShortField(term5874352, term5874352.getClass(), "i", (short) -28546);
        setShortField(term5874352, term5874352.getClass(), "pc", (short) 512);
        setField(term5874352, term5874352.getClass(), "ram", term5874407);
        setByteField(term5874352, term5874352.getClass(), "delayTimer", (byte) 30);
        setByteField(term5874352, term5874352.getClass(), "soundTimer", (byte) 105);
        setField(term5874352, term5874352.getClass(), "stack", term5884411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.chip8.emulator.Memory");
        Object[] args = new Object[1];
        args[0] = term5874352;
        callMethod(klass, "setM", argTypes, term5864286, args);
    }

};



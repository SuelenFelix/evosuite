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

public class Fetcher_timerDecrement_2964281315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5763709;

    public Fetcher_timerDecrement_2964281315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5773770 = new ArrayDeque();
        term5763709 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5763711 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5763712 = (byte[]) newByteArray(16);
        byte[] term5763729 = (byte[]) newByteArray(16);
        byte[] term5763746 = (byte[]) newByteArray(16);
        byte[] term5763766 = (byte[]) newByteArray(65535);
        setShortField(term5763709, term5763709.getClass(), "opcode", (short) 24091);
        setField(term5763711, term5763711.getClass(), "v", term5763712);
        setField(term5763711, term5763711.getClass(), "rpl", term5763729);
        setByteElement(term5763746, 3, (byte) 32);
        setByteElement(term5763746, 4, (byte) 64);
        setByteElement(term5763746, 5, (byte) 32);
        setByteElement(term5763746, 7, (byte) 32);
        setByteElement(term5763746, 8, (byte) 64);
        setByteElement(term5763746, 9, (byte) 32);
        setByteElement(term5763746, 11, (byte) 32);
        setByteElement(term5763746, 12, (byte) 64);
        setByteElement(term5763746, 13, (byte) 32);
        setField(term5763711, term5763711.getClass(), "audio", term5763746);
        setShortField(term5763711, term5763711.getClass(), "pitch", (short) 64);
        setShortField(term5763711, term5763711.getClass(), "i", (short) -16798);
        setShortField(term5763711, term5763711.getClass(), "pc", (short) 512);
        setField(term5763711, term5763711.getClass(), "ram", term5763766);
        setByteField(term5763711, term5763711.getClass(), "delayTimer", (byte) 51);
        setByteField(term5763711, term5763711.getClass(), "soundTimer", (byte) -76);
        setField(term5763711, term5763711.getClass(), "stack", term5773770);
        setField(term5763709, term5763709.getClass(), "m", term5763711);
        setLongField(term5763709, term5763709.getClass(), "currentTime", -6950146046121430355L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "timerDecrement", argTypes, term5763709, args);
    }

};



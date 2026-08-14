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

public class Fetcher_decrementPC_3632003474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5743594;

    public Fetcher_decrementPC_3632003474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5753655 = new ArrayDeque();
        term5743594 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5743596 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5743597 = (byte[]) newByteArray(16);
        byte[] term5743614 = (byte[]) newByteArray(16);
        byte[] term5743631 = (byte[]) newByteArray(16);
        byte[] term5743651 = (byte[]) newByteArray(65535);
        setShortField(term5743594, term5743594.getClass(), "opcode", (short) 25474);
        setField(term5743596, term5743596.getClass(), "v", term5743597);
        setField(term5743596, term5743596.getClass(), "rpl", term5743614);
        setByteElement(term5743631, 3, (byte) 32);
        setByteElement(term5743631, 4, (byte) 64);
        setByteElement(term5743631, 5, (byte) 32);
        setByteElement(term5743631, 7, (byte) 32);
        setByteElement(term5743631, 8, (byte) 64);
        setByteElement(term5743631, 9, (byte) 32);
        setByteElement(term5743631, 11, (byte) 32);
        setByteElement(term5743631, 12, (byte) 64);
        setByteElement(term5743631, 13, (byte) 32);
        setField(term5743596, term5743596.getClass(), "audio", term5743631);
        setShortField(term5743596, term5743596.getClass(), "pitch", (short) 64);
        setShortField(term5743596, term5743596.getClass(), "i", (short) -22587);
        setShortField(term5743596, term5743596.getClass(), "pc", (short) 512);
        setField(term5743596, term5743596.getClass(), "ram", term5743651);
        setByteField(term5743596, term5743596.getClass(), "delayTimer", (byte) 31);
        setByteField(term5743596, term5743596.getClass(), "soundTimer", (byte) 67);
        setField(term5743596, term5743596.getClass(), "stack", term5753655);
        setField(term5743594, term5743594.getClass(), "m", term5743596);
        setLongField(term5743594, term5743594.getClass(), "currentTime", -685023850445639859L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decrementPC", argTypes, term5743594, args);
    }

};



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
import java.lang.Integer;

public class Memory_varReg_12729939942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4742614;
     Object term4752677;
     Object term4752679;

    public Memory_varReg_12729939942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4752673 = new ArrayDeque();
        term4742614 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4742615 = (byte[]) newByteArray(16);
        byte[] term4742632 = (byte[]) newByteArray(16);
        byte[] term4742649 = (byte[]) newByteArray(16);
        byte[] term4742669 = (byte[]) newByteArray(65535);
        setField(term4742614, term4742614.getClass(), "v", term4742615);
        setField(term4742614, term4742614.getClass(), "rpl", term4742632);
        setByteElement(term4742649, 3, (byte) 32);
        setByteElement(term4742649, 4, (byte) 64);
        setByteElement(term4742649, 5, (byte) 32);
        setByteElement(term4742649, 7, (byte) 32);
        setByteElement(term4742649, 8, (byte) 64);
        setByteElement(term4742649, 9, (byte) 32);
        setByteElement(term4742649, 11, (byte) 32);
        setByteElement(term4742649, 12, (byte) 64);
        setByteElement(term4742649, 13, (byte) 32);
        setField(term4742614, term4742614.getClass(), "audio", term4742649);
        setShortField(term4742614, term4742614.getClass(), "pitch", (short) 64);
        setShortField(term4742614, term4742614.getClass(), "i", (short) -16549);
        setShortField(term4742614, term4742614.getClass(), "pc", (short) 512);
        setField(term4742614, term4742614.getClass(), "ram", term4742669);
        setByteField(term4742614, term4742614.getClass(), "delayTimer", (byte) -102);
        setByteField(term4742614, term4742614.getClass(), "soundTimer", (byte) 55);
        setField(term4742614, term4742614.getClass(), "stack", term4752673);
        term4752677 = new Integer(-544382127);
        term4752679 = new Integer(-1830198043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4752677;
        args[1] = term4752679;
        callMethod(klass, "varReg", argTypes, term4742614, args);
    }

};



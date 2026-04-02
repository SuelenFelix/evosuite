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

public class Memory_getV_12553245473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4762730;

    public Memory_getV_12553245473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4772789 = new ArrayDeque();
        term4762730 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4762731 = (byte[]) newByteArray(16);
        byte[] term4762748 = (byte[]) newByteArray(16);
        byte[] term4762765 = (byte[]) newByteArray(16);
        byte[] term4762785 = (byte[]) newByteArray(65535);
        setField(term4762730, term4762730.getClass(), "v", term4762731);
        setField(term4762730, term4762730.getClass(), "rpl", term4762748);
        setByteElement(term4762765, 3, (byte) 32);
        setByteElement(term4762765, 4, (byte) 64);
        setByteElement(term4762765, 5, (byte) 32);
        setByteElement(term4762765, 7, (byte) 32);
        setByteElement(term4762765, 8, (byte) 64);
        setByteElement(term4762765, 9, (byte) 32);
        setByteElement(term4762765, 11, (byte) 32);
        setByteElement(term4762765, 12, (byte) 64);
        setByteElement(term4762765, 13, (byte) 32);
        setField(term4762730, term4762730.getClass(), "audio", term4762765);
        setShortField(term4762730, term4762730.getClass(), "pitch", (short) 64);
        setShortField(term4762730, term4762730.getClass(), "i", (short) 10984);
        setShortField(term4762730, term4762730.getClass(), "pc", (short) 512);
        setField(term4762730, term4762730.getClass(), "ram", term4762785);
        setByteField(term4762730, term4762730.getClass(), "delayTimer", (byte) -63);
        setByteField(term4762730, term4762730.getClass(), "soundTimer", (byte) -76);
        setField(term4762730, term4762730.getClass(), "stack", term4772789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getV", argTypes, term4762730, args);
    }

};



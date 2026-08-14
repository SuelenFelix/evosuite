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
import java.lang.Short;

public class Memory_setStack_112052388222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5144916;
     Object term5154979;

    public Memory_setStack_112052388222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5154975 = new ArrayDeque();
        term5144916 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5144917 = (byte[]) newByteArray(16);
        byte[] term5144934 = (byte[]) newByteArray(16);
        byte[] term5144951 = (byte[]) newByteArray(16);
        byte[] term5144971 = (byte[]) newByteArray(65535);
        setField(term5144916, term5144916.getClass(), "v", term5144917);
        setField(term5144916, term5144916.getClass(), "rpl", term5144934);
        setByteElement(term5144951, 3, (byte) 32);
        setByteElement(term5144951, 4, (byte) 64);
        setByteElement(term5144951, 5, (byte) 32);
        setByteElement(term5144951, 7, (byte) 32);
        setByteElement(term5144951, 8, (byte) 64);
        setByteElement(term5144951, 9, (byte) 32);
        setByteElement(term5144951, 11, (byte) 32);
        setByteElement(term5144951, 12, (byte) 64);
        setByteElement(term5144951, 13, (byte) 32);
        setField(term5144916, term5144916.getClass(), "audio", term5144951);
        setShortField(term5144916, term5144916.getClass(), "pitch", (short) 64);
        setShortField(term5144916, term5144916.getClass(), "i", (short) -22363);
        setShortField(term5144916, term5144916.getClass(), "pc", (short) 512);
        setField(term5144916, term5144916.getClass(), "ram", term5144971);
        setByteField(term5144916, term5144916.getClass(), "delayTimer", (byte) 91);
        setByteField(term5144916, term5144916.getClass(), "soundTimer", (byte) -24);
        setField(term5144916, term5144916.getClass(), "stack", term5154975);
        Short term5154981 = new Short((short) 9519);
        Short term5154983 = new Short((short) -10960);
        Short term5154985 = new Short((short) -1703);
        Short term5154987 = new Short((short) 23627);
        Short term5154989 = new Short((short) -19694);
        Short term5154991 = new Short((short) 31942);
        Short term5154993 = new Short((short) 30947);
        Short term5154995 = new Short((short) 27594);
        term5154979 = new ArrayDeque();
        ((ArrayDeque) term5154979).add(term5154981);
        ((ArrayDeque) term5154979).add(term5154983);
        ((ArrayDeque) term5154979).add(term5154985);
        ((ArrayDeque) term5154979).add(term5154987);
        ((ArrayDeque) term5154979).add(term5154989);
        ((ArrayDeque) term5154979).add(term5154991);
        ((ArrayDeque) term5154979).add(term5154993);
        ((ArrayDeque) term5154979).add(term5154995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayDeque");
        Object[] args = new Object[1];
        args[0] = term5154979;
        callMethod(klass, "setStack", argTypes, term5144916, args);
    }

};



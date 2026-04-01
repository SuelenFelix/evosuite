package org.openRealmOfStars.ai.mission;

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
import static org.openRealmOfStars.ai.mission.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MissionList_init_15689516842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572664;

    public MissionList_init_15689516842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572664 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term572665 = (byte[]) newByteArray(6);
        char[] term572672 = (char[]) newCharArray(4);
        byte[] term572677 = (byte[]) newByteArray(7);
        char[] term572685 = (char[]) newCharArray(0);
        setByteElement(term572665, 0, (byte) 124);
        setByteElement(term572665, 1, (byte) 109);
        setByteElement(term572665, 2, (byte) -18);
        setByteElement(term572665, 3, (byte) 47);
        setByteElement(term572665, 4, (byte) -70);
        setByteElement(term572665, 5, (byte) -62);
        setField(term572664, term572664.getClass(), "bytearr", term572665);
        setCharElement(term572672, 0, 'P');
        setCharElement(term572672, 1, 'A');
        setCharElement(term572672, 2, 'E');
        setCharElement(term572672, 3, 'B');
        setField(term572664, term572664.getClass(), "chararr", term572672);
        setByteElement(term572677, 0, (byte) 70);
        setByteElement(term572677, 1, (byte) 13);
        setByteElement(term572677, 2, (byte) 105);
        setByteElement(term572677, 3, (byte) 7);
        setByteElement(term572677, 4, (byte) 92);
        setByteElement(term572677, 5, (byte) -96);
        setByteElement(term572677, 6, (byte) 81);
        setField(term572664, term572664.getClass(), "readBuffer", term572677);
        setField(term572664, term572664.getClass(), "lineBuffer", term572685);
        setField(term572664, term572664.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term572664;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



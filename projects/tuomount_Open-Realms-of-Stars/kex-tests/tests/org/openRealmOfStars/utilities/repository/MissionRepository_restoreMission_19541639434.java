package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MissionRepository_restoreMission_19541639434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3121;
     Object term3122;

    public MissionRepository_restoreMission_19541639434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3121 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.MissionRepository"));
        term3122 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term3123 = (byte[]) newByteArray(0);
        char[] term3124 = (char[]) newCharArray(4);
        byte[] term3129 = (byte[]) newByteArray(0);
        char[] term3130 = (char[]) newCharArray(7);
        setField(term3122, term3122.getClass(), "bytearr", term3123);
        setCharElement(term3124, 0, 'S');
        setCharElement(term3124, 1, 'b');
        setCharElement(term3124, 2, 'S');
        setCharElement(term3124, 3, 'z');
        setField(term3122, term3122.getClass(), "chararr", term3124);
        setField(term3122, term3122.getClass(), "readBuffer", term3129);
        setCharElement(term3130, 0, 'j');
        setCharElement(term3130, 1, 'V');
        setCharElement(term3130, 2, 'p');
        setCharElement(term3130, 3, 'O');
        setCharElement(term3130, 4, 'Q');
        setCharElement(term3130, 5, 'T');
        setCharElement(term3130, 6, 'y');
        setField(term3122, term3122.getClass(), "lineBuffer", term3130);
        setField(term3122, term3122.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.MissionRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term3122;
        callMethod(klass, "restoreMission", argTypes, term3121, args);
    }

};



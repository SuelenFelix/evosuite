package org.openRealmOfStars.starMap.event.karmaEvents;

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
import static org.openRealmOfStars.starMap.event.karmaEvents.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class KarmaEvents_save_6728250572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288263;
     Object term288287;

    public KarmaEvents_save_6728250572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term288304 = Class.forName((String) "org.openRealmOfStars.starMap.event.karmaEvents.KarmaType");
        Field term288303 = ((Class) term288304).getDeclaredField((String) "RANDOM_GOOD_ONES");
        ((Field) term288303).setAccessible(true);
        Object enum843 = ((Field) term288303).get((Object) null);
        term288263 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents"));
        setField(term288263, term288263.getClass(), "karmaSelection", enum843);
        setIntField(term288263, term288263.getClass(), "karmaSpeed", 1644746758);
        setIntField(term288263, term288263.getClass(), "goodKarmaCount", -2021487528);
        setIntField(term288263, term288263.getClass(), "badKarmaCount", -431095319);
        term288287 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term288289 = (byte[]) newByteArray(9);
        byte[] term288299 = (byte[]) newByteArray(1);
        Object term288302 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term288287, term288287.getClass(), "written", -532520843);
        setByteElement(term288289, 0, (byte) 18);
        setByteElement(term288289, 1, (byte) 60);
        setByteElement(term288289, 2, (byte) -31);
        setByteElement(term288289, 3, (byte) 53);
        setByteElement(term288289, 4, (byte) -93);
        setByteElement(term288289, 5, (byte) 63);
        setByteElement(term288289, 6, (byte) 85);
        setByteElement(term288289, 7, (byte) -16);
        setByteElement(term288289, 8, (byte) 66);
        setField(term288287, term288287.getClass(), "bytearr", term288289);
        setByteElement(term288299, 0, (byte) -97);
        setField(term288287, term288287.getClass(), "writeBuffer", term288299);
        setField(term288287, term288287.getClass(), "out", null);
        setBooleanField(term288287, term288287.getClass(), "closed", false);
        setField(term288287, term288287.getClass(), "closeLock", term288302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term288287;
        callMethod(klass, "save", argTypes, term288263, args);
    }

};



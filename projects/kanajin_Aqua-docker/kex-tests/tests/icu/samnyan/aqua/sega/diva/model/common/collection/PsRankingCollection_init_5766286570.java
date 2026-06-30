package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class PsRankingCollection_init_5766286570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1964377;
     Object enum3287;
     Object term1964392;

    public PsRankingCollection_init_5766286570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1964377 = new Integer(639853633);
        Class<? extends Object> term1964396 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1964395 = ((Class) term1964396).getDeclaredField((String) "ORIGINAL");
        ((Field) term1964395).setAccessible(true);
        enum3287 = ((Field) term1964395).get((Object) null);
        term1964392 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.PsRankingCollection");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term1964377;
        args[1] = enum3287;
        args[2] = term1964392;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



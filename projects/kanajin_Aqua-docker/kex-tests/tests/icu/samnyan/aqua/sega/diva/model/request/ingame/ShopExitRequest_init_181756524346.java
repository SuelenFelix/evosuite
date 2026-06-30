package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ShopExitRequest_init_181756524346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270357;
     Object term270359;
     Object term270361;
     Object term270363;
     Object term270365;

    public ShopExitRequest_init_181756524346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270357 = new Integer(0);
        term270359 = new Integer(0);
        term270361 = new Integer(0);
        term270363 = new Integer(0);
        term270365 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.ShopExitRequest");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Array.newInstance(int.class, 0).getClass();
        argTypes[6] = Array.newInstance(int.class, 0).getClass();
        argTypes[7] = Array.newInstance(int.class, 0).getClass();
        argTypes[8] = Array.newInstance(int.class, 0).getClass();
        argTypes[9] = Array.newInstance(int.class, 0).getClass();
        argTypes[10] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[11];
        args[0] = term270357;
        args[1] = term270359;
        args[2] = term270361;
        args[3] = term270363;
        args[4] = term270365;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



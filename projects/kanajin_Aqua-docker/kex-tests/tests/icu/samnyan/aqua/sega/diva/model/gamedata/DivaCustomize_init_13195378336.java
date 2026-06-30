package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DivaCustomize_init_13195378336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29710;
     Object term29712;
     Object term29714;

    public DivaCustomize_init_13195378336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29710 = new Integer(0);
        term29712 = new Integer(0);
        term29714 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term29710;
        args[1] = null;
        args[2] = term29712;
        args[3] = null;
        args[4] = null;
        args[5] = term29714;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



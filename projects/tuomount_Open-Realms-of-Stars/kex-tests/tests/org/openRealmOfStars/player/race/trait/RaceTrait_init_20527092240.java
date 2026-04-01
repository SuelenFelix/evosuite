package org.openRealmOfStars.player.race.trait;

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
import static org.openRealmOfStars.player.race.trait.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Byte;
import java.lang.Object;

public class RaceTrait_init_20527092240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term84;

    public RaceTrait_init_20527092240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = new Byte((byte) 47);
        term84 = (Object[]) newArray("java.lang.String", 5);
        setElement(term84, 0, "EGtDIRbSSb");
        setElement(term84, 1, "SzjVpOQTyS");
        setElement(term84, 2, "MjGYSRKTNF");
        setElement(term84, 3, "hRNSzYYIrc");
        setElement(term84, 4, "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = byte.class;
        argTypes[4] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[5];
        args[0] = "MuLcgQHgqz";
        args[1] = "xxtlPwDYFs";
        args[2] = "jJCZpVmanW";
        args[3] = term82;
        args[4] = term84;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



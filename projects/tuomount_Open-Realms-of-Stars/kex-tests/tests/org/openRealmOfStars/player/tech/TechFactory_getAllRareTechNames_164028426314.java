package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class TechFactory_getAllRareTechNames_164028426314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum577;
     Object term192092;

    public TechFactory_getAllRareTechNames_164028426314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192095 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term192094 = ((Class) term192095).getDeclaredField((String) "Hulls");
        ((Field) term192094).setAccessible(true);
        enum577 = ((Field) term192094).get((Object) null);
        term192092 = new Integer(2074130991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum577;
        args[1] = term192092;
        callMethod(klass, "getAllRareTechNames", argTypes, null, args);
    }

};



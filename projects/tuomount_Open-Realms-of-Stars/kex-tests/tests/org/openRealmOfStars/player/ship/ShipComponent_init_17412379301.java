package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class ShipComponent_init_17412379301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463109;
     Object term463111;
     Object enum1473;

    public ShipComponent_init_17412379301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463109 = new Integer(-1586841704);
        term463111 = new Integer(1177959159);
        Class<? extends Object> term463141 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term463140 = ((Class) term463141).getDeclaredField((String) "ORBITAL_BOMBS");
        ((Field) term463140).setAccessible(true);
        enum1473 = ((Field) term463140).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.player.ship.ShipComponentType");
        Object[] args = new Object[4];
        args[0] = "VFVtUIgTiw";
        args[1] = term463109;
        args[2] = term463111;
        args[3] = enum1473;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



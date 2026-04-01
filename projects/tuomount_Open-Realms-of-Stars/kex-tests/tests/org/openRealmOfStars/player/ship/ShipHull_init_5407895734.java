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

public class ShipHull_init_5407895734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494161;
     Object term494163;
     Object enum1562;
     Object enum1563;
     Object term494183;
     Object term494185;

    public ShipHull_init_5407895734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494161 = new Integer(1761410215);
        term494163 = new Integer(152890697);
        Class<? extends Object> term494198 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term494197 = ((Class) term494198).getDeclaredField((String) "PROBE");
        ((Field) term494197).setAccessible(true);
        enum1562 = ((Field) term494197).get((Object) null);
        Class<? extends Object> term494445 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term494444 = ((Class) term494445).getDeclaredField((String) "MINOR");
        ((Field) term494444).setAccessible(true);
        enum1563 = ((Field) term494444).get((Object) null);
        term494183 = new Integer(567880137);
        term494185 = new Integer(1044699382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.player.ship.ShipHullType");
        argTypes[4] = Class.forName("org.openRealmOfStars.player.ship.ShipSize");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = "EHSvFqFadd";
        args[1] = term494161;
        args[2] = term494163;
        args[3] = enum1562;
        args[4] = enum1563;
        args[5] = term494183;
        args[6] = term494185;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



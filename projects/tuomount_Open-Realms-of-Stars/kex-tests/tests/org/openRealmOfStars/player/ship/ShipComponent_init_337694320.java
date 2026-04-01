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

public class ShipComponent_init_337694320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462772;
     Object term462786;
     Object term462788;
     Object enum1472;

    public ShipComponent_init_337694320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462772 = new Integer(-1155278855);
        term462786 = new Integer(851040269);
        term462788 = new Integer(148663158);
        Class<? extends Object> term462814 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term462813 = ((Class) term462814).getDeclaredField((String) "ARM_SPIKE");
        ((Field) term462813).setAccessible(true);
        enum1472 = ((Field) term462813).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("org.openRealmOfStars.player.ship.ShipComponentType");
        Object[] args = new Object[5];
        args[0] = term462772;
        args[1] = "zBuinfJXWL";
        args[2] = term462786;
        args[3] = term462788;
        args[4] = enum1472;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



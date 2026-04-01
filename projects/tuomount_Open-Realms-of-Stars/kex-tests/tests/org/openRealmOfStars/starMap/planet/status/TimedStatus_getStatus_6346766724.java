package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TimedStatus_getStatus_6346766724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2631;

    public TimedStatus_getStatus_6346766724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2789 = Class.forName((String) "org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        Field term2788 = ((Class) term2789).getDeclaredField((String) "GAME_START");
        ((Field) term2788).setAccessible(true);
        Object enum3 = ((Field) term2788).get((Object) null);
        term2631 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus"));
        Object term2632 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term2669 = (Object[]) newArray("java.lang.String", 2);
        setField(term2632, term2632.getClass(), "statusId", "ieCtQFdkii");
        setField(term2632, term2632.getClass(), "name", "dEnhdmILtU");
        setField(term2632, term2632.getClass(), "description", "hoicvmsovO");
        setElement(term2669, 0, "eqJfYWRaEL");
        setElement(term2669, 1, "fhkbdRViHi");
        setField(term2632, term2632.getClass(), "conflictingIds", term2669);
        setIntField(term2632, term2632.getClass(), "foodBonus", -1968847291);
        setIntField(term2632, term2632.getClass(), "happinessBonus", 579005622);
        setIntField(term2632, term2632.getClass(), "mineBonus", -14890619);
        setIntField(term2632, term2632.getClass(), "prodBonus", 1632125673);
        setIntField(term2632, term2632.getClass(), "credBonus", 454281060);
        setIntField(term2632, term2632.getClass(), "reseBonus", -1786399638);
        setBooleanField(term2632, term2632.getClass(), "hidden", false);
        setField(term2632, term2632.getClass(), "discoveryText", "uWHnvSvaPl");
        setField(term2631, term2631.getClass(), "status", term2632);
        setField(term2631, term2631.getClass(), "timedType", enum3);
        setIntField(term2631, term2631.getClass(), "count", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term2631, args);
    }

};



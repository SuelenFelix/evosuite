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

public class TimedStatus_decrease_1525837902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1467;

    public TimedStatus_decrease_1525837902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1699 = Class.forName((String) "org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        Field term1698 = ((Class) term1699).getDeclaredField((String) "AFTER_COLONIZATION");
        ((Field) term1698).setAccessible(true);
        Object enum1 = ((Field) term1698).get((Object) null);
        term1467 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus"));
        Object term1468 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term1505 = (Object[]) newArray("java.lang.String", 5);
        setField(term1468, term1468.getClass(), "statusId", "gGSMzuGICf");
        setField(term1468, term1468.getClass(), "name", "hxCBltsObl");
        setField(term1468, term1468.getClass(), "description", "BndsHwAFMv");
        setElement(term1505, 0, "GzFkzHGYFt");
        setElement(term1505, 1, "tShwQLRGNe");
        setElement(term1505, 2, "LvtrsXUliU");
        setElement(term1505, 3, "xLbjWUgOIL");
        setElement(term1505, 4, "jDtqGUpnZN");
        setField(term1468, term1468.getClass(), "conflictingIds", term1505);
        setIntField(term1468, term1468.getClass(), "foodBonus", -226514366);
        setIntField(term1468, term1468.getClass(), "happinessBonus", 1193880199);
        setIntField(term1468, term1468.getClass(), "mineBonus", -1087774327);
        setIntField(term1468, term1468.getClass(), "prodBonus", -1530420153);
        setIntField(term1468, term1468.getClass(), "credBonus", -469968304);
        setIntField(term1468, term1468.getClass(), "reseBonus", -1145578966);
        setBooleanField(term1468, term1468.getClass(), "hidden", true);
        setField(term1468, term1468.getClass(), "discoveryText", "nGKItKLYNC");
        setField(term1467, term1467.getClass(), "status", term1468);
        setField(term1467, term1467.getClass(), "timedType", enum1);
        setIntField(term1467, term1467.getClass(), "count", 679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decrease", argTypes, term1467, args);
    }

};



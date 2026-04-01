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

public class TimedStatus_isActive_2099168483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2049;

    public TimedStatus_isActive_2099168483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2281 = Class.forName((String) "org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        Field term2280 = ((Class) term2281).getDeclaredField((String) "AFTER_COLONIZATION");
        ((Field) term2280).setAccessible(true);
        Object enum2 = ((Field) term2280).get((Object) null);
        term2049 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus"));
        Object term2050 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term2087 = (Object[]) newArray("java.lang.String", 5);
        setField(term2050, term2050.getClass(), "statusId", "UiUYnPrcCi");
        setField(term2050, term2050.getClass(), "name", "UoYtihxVaS");
        setField(term2050, term2050.getClass(), "description", "JDswTTCZHV");
        setElement(term2087, 0, "onpbIeEKoi");
        setElement(term2087, 1, "YRHGsAkhxb");
        setElement(term2087, 2, "ffYhPOzlUs");
        setElement(term2087, 3, "MLqYREekMl");
        setElement(term2087, 4, "ytSBIKXogI");
        setField(term2050, term2050.getClass(), "conflictingIds", term2087);
        setIntField(term2050, term2050.getClass(), "foodBonus", 1962444399);
        setIntField(term2050, term2050.getClass(), "happinessBonus", 767834723);
        setIntField(term2050, term2050.getClass(), "mineBonus", -602026508);
        setIntField(term2050, term2050.getClass(), "prodBonus", -157887805);
        setIntField(term2050, term2050.getClass(), "credBonus", 1876565163);
        setIntField(term2050, term2050.getClass(), "reseBonus", -817164822);
        setBooleanField(term2050, term2050.getClass(), "hidden", true);
        setField(term2050, term2050.getClass(), "discoveryText", "nHXjMycHlU");
        setField(term2049, term2049.getClass(), "status", term2050);
        setField(term2049, term2049.getClass(), "timedType", enum2);
        setIntField(term2049, term2049.getClass(), "count", -1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isActive", argTypes, term2049, args);
    }

};



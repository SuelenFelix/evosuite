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

public class TimedStatus_toString_19439889116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3705;

    public TimedStatus_toString_19439889116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3844 = Class.forName((String) "org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        Field term3843 = ((Class) term3844).getDeclaredField((String) "SPECIAL_EVENT");
        ((Field) term3843).setAccessible(true);
        Object enum5 = ((Field) term3843).get((Object) null);
        term3705 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus"));
        Object term3706 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term3743 = (Object[]) newArray("java.lang.String", 1);
        setField(term3706, term3706.getClass(), "statusId", "KoyGrUJeJW");
        setField(term3706, term3706.getClass(), "name", "HqBOwkVqjD");
        setField(term3706, term3706.getClass(), "description", "MAcUBcBckh");
        setElement(term3743, 0, "oVgzLbrsFr");
        setField(term3706, term3706.getClass(), "conflictingIds", term3743);
        setIntField(term3706, term3706.getClass(), "foodBonus", 97029295);
        setIntField(term3706, term3706.getClass(), "happinessBonus", -1371869594);
        setIntField(term3706, term3706.getClass(), "mineBonus", -2095575670);
        setIntField(term3706, term3706.getClass(), "prodBonus", 1225272962);
        setIntField(term3706, term3706.getClass(), "credBonus", 1324040357);
        setIntField(term3706, term3706.getClass(), "reseBonus", -1588772968);
        setBooleanField(term3706, term3706.getClass(), "hidden", false);
        setField(term3706, term3706.getClass(), "discoveryText", "vQVyKLdtaz");
        setField(term3705, term3705.getClass(), "status", term3706);
        setField(term3705, term3705.getClass(), "timedType", enum5);
        setIntField(term3705, term3705.getClass(), "count", -93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3705, args);
    }

};



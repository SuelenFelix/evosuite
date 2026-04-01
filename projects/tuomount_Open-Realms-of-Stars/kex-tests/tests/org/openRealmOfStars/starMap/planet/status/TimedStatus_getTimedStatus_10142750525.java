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

public class TimedStatus_getTimedStatus_10142750525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3115;

    public TimedStatus_getTimedStatus_10142750525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3316 = Class.forName((String) "org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        Field term3315 = ((Class) term3316).getDeclaredField((String) "AFTER_COLONIZATION_OR_AWAY_TEAM");
        ((Field) term3315).setAccessible(true);
        Object enum4 = ((Field) term3315).get((Object) null);
        term3115 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus"));
        Object term3116 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term3153 = (Object[]) newArray("java.lang.String", 3);
        setField(term3116, term3116.getClass(), "statusId", "kBdSllIBVz");
        setField(term3116, term3116.getClass(), "name", "TJmVBGfTML");
        setField(term3116, term3116.getClass(), "description", "tPlsykYBqO");
        setElement(term3153, 0, "bLPjGVBhlX");
        setElement(term3153, 1, "whBvTVIIlC");
        setElement(term3153, 2, "IgRJUzaCwW");
        setField(term3116, term3116.getClass(), "conflictingIds", term3153);
        setIntField(term3116, term3116.getClass(), "foodBonus", -1048298087);
        setIntField(term3116, term3116.getClass(), "happinessBonus", 292681826);
        setIntField(term3116, term3116.getClass(), "mineBonus", 458147407);
        setIntField(term3116, term3116.getClass(), "prodBonus", -184153539);
        setIntField(term3116, term3116.getClass(), "credBonus", 493620644);
        setIntField(term3116, term3116.getClass(), "reseBonus", 1328271830);
        setBooleanField(term3116, term3116.getClass(), "hidden", true);
        setField(term3116, term3116.getClass(), "discoveryText", "JUmudUmaaV");
        setField(term3115, term3115.getClass(), "status", term3116);
        setField(term3115, term3115.getClass(), "timedType", enum4);
        setIntField(term3115, term3115.getClass(), "count", 1596070772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimedStatus", argTypes, term3115, args);
    }

};



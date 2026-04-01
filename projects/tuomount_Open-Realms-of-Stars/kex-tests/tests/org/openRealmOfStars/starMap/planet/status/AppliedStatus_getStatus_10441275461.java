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

public class AppliedStatus_getStatus_10441275461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;

    public AppliedStatus_getStatus_10441275461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus"));
        Object term209 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term246 = (Object[]) newArray("java.lang.String", 4);
        setField(term209, term209.getClass(), "statusId", "RMFIsYGgne");
        setField(term209, term209.getClass(), "name", "NRdvgJlhkX");
        setField(term209, term209.getClass(), "description", "uuaPigETmJ");
        setElement(term246, 0, "MxlszYVzRf");
        setElement(term246, 1, "LQFpaHEwXR");
        setElement(term246, 2, "oVcInYnLWB");
        setElement(term246, 3, "aJlieCFVtF");
        setField(term209, term209.getClass(), "conflictingIds", term246);
        setIntField(term209, term209.getClass(), "foodBonus", -1955890973);
        setIntField(term209, term209.getClass(), "happinessBonus", -2038273078);
        setIntField(term209, term209.getClass(), "mineBonus", 1227103734);
        setIntField(term209, term209.getClass(), "prodBonus", -1339778481);
        setIntField(term209, term209.getClass(), "credBonus", 1725571209);
        setIntField(term209, term209.getClass(), "reseBonus", -522618178);
        setBooleanField(term209, term209.getClass(), "hidden", false);
        setField(term209, term209.getClass(), "discoveryText", "ZiaGIbnzTs");
        setField(term208, term208.getClass(), "status", term209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term208, args);
    }

};



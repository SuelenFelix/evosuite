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

public class TimedStatus_save_7659540367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4179;
     Object term4273;

    public TimedStatus_save_7659540367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4330 = Class.forName((String) "org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        Field term4329 = ((Class) term4330).getDeclaredField((String) "AFTER_COLONIZATION_OR_AWAY_TEAM");
        ((Field) term4329).setAccessible(true);
        Object enum6 = ((Field) term4329).get((Object) null);
        term4179 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus"));
        Object term4180 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term4217 = (Object[]) newArray("java.lang.String", 0);
        setField(term4180, term4180.getClass(), "statusId", "OWKQODBLzb");
        setField(term4180, term4180.getClass(), "name", "wGmYcqUkgE");
        setField(term4180, term4180.getClass(), "description", "idgaQsnJpQ");
        setField(term4180, term4180.getClass(), "conflictingIds", term4217);
        setIntField(term4180, term4180.getClass(), "foodBonus", -112921587);
        setIntField(term4180, term4180.getClass(), "happinessBonus", 933028652);
        setIntField(term4180, term4180.getClass(), "mineBonus", 287287233);
        setIntField(term4180, term4180.getClass(), "prodBonus", 962840079);
        setIntField(term4180, term4180.getClass(), "credBonus", 1540719661);
        setIntField(term4180, term4180.getClass(), "reseBonus", 1265463001);
        setBooleanField(term4180, term4180.getClass(), "hidden", true);
        setField(term4180, term4180.getClass(), "discoveryText", "VgZnGoIFwQ");
        setField(term4179, term4179.getClass(), "status", term4180);
        setField(term4179, term4179.getClass(), "timedType", enum6);
        setIntField(term4179, term4179.getClass(), "count", 335112684);
        term4273 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term4275 = (byte[]) newByteArray(2);
        byte[] term4278 = (byte[]) newByteArray(8);
        Object term4288 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term4273, term4273.getClass(), "written", 1551099402);
        setByteElement(term4275, 0, (byte) -54);
        setByteElement(term4275, 1, (byte) 67);
        setField(term4273, term4273.getClass(), "bytearr", term4275);
        setByteElement(term4278, 0, (byte) 78);
        setByteElement(term4278, 1, (byte) 87);
        setByteElement(term4278, 2, (byte) 121);
        setByteElement(term4278, 3, (byte) -99);
        setByteElement(term4278, 4, (byte) -2);
        setByteElement(term4278, 5, (byte) -16);
        setByteElement(term4278, 6, (byte) -112);
        setByteElement(term4278, 7, (byte) -111);
        setField(term4273, term4273.getClass(), "writeBuffer", term4278);
        setField(term4273, term4273.getClass(), "out", null);
        setBooleanField(term4273, term4273.getClass(), "closed", false);
        setField(term4273, term4273.getClass(), "closeLock", term4288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term4273;
        callMethod(klass, "save", argTypes, term4179, args);
    }

};



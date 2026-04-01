package org.openRealmOfStars.starMap.planet;

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
import static org.openRealmOfStars.starMap.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HappinessEffect_getValue_12426963633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327820;

    public HappinessEffect_getValue_12426963633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1327842 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.HappinessBonus");
        Field term1327841 = ((Class) term1327842).getDeclaredField((String) "KILL_POPULATION");
        ((Field) term1327841).setAccessible(true);
        Object enum3819 = ((Field) term1327841).get((Object) null);
        term1327820 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.HappinessEffect"));
        setField(term1327820, term1327820.getClass(), "bonus", enum3819);
        setIntField(term1327820, term1327820.getClass(), "value", -1298451757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.HappinessEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term1327820, args);
    }

};



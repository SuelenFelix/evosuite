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

public class HappinessEffect_toString_14756246194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1328173;

    public HappinessEffect_toString_14756246194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1328195 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.HappinessBonus");
        Field term1328194 = ((Class) term1328195).getDeclaredField((String) "KILL_POPULATION");
        ((Field) term1328194).setAccessible(true);
        Object enum3820 = ((Field) term1328194).get((Object) null);
        term1328173 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.HappinessEffect"));
        setField(term1328173, term1328173.getClass(), "bonus", enum3820);
        setIntField(term1328173, term1328173.getClass(), "value", 2034801572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.HappinessEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1328173, args);
    }

};



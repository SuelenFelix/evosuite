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
import java.lang.Integer;

public class HappinessEffect_init_11393990640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3817;
     Object term1327151;

    public HappinessEffect_init_11393990640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1327154 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.HappinessBonus");
        Field term1327153 = ((Class) term1327154).getDeclaredField((String) "CULTURE");
        ((Field) term1327153).setAccessible(true);
        enum3817 = ((Field) term1327153).get((Object) null);
        term1327151 = new Integer(-1613504150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.HappinessEffect");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.HappinessBonus");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum3817;
        args[1] = term1327151;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TechFactory_createRandomTech_52830244228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195022;
     Object term195023;

    public TechFactory_createRandomTech_52830244228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195022 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechFactory"));
        term195023 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechFactory");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"), 0).getClass();
        argTypes[3] = Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"), 0).getClass();
        argTypes[4] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term195023;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "createRandomTech", argTypes, term195022, args);
    }

};



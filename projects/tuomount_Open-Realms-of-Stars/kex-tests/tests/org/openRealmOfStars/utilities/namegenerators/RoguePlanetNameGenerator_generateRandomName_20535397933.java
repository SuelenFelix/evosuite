package org.openRealmOfStars.utilities.namegenerators;

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
import static org.openRealmOfStars.utilities.namegenerators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RoguePlanetNameGenerator_generateRandomName_20535397933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;

    public RoguePlanetNameGenerator_generateRandomName_20535397933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188 = newInstance(Class.forName("org.openRealmOfStars.utilities.namegenerators.RoguePlanetNameGenerator"));
        setField(term188, term188.getClass(), "usedNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.namegenerators.RoguePlanetNameGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateRandomName", argTypes, term188, args);
    }

};



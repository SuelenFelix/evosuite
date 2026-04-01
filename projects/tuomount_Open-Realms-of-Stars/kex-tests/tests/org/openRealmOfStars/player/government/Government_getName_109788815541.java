package org.openRealmOfStars.player.government;

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
import static org.openRealmOfStars.player.government.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Government_getName_109788815541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23667;

    public Government_getName_109788815541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23667 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term23667, term23667.getClass(), "id", null);
        setField(term23667, term23667.getClass(), "name", null);
        setField(term23667, term23667.getClass(), "rulerSelection", null);
        setField(term23667, term23667.getClass(), "rulerTitleMale", null);
        setField(term23667, term23667.getClass(), "rulerTitleFemale", null);
        setField(term23667, term23667.getClass(), "traits", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term23667, args);
    }

};



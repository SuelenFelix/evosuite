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
import java.lang.Boolean;

public class Government_getDescription_200472078078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23704;
     Object term23705;

    public Government_getDescription_200472078078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23704 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term23704, term23704.getClass(), "id", null);
        setField(term23704, term23704.getClass(), "name", null);
        setField(term23704, term23704.getClass(), "rulerSelection", null);
        setField(term23704, term23704.getClass(), "rulerTitleMale", null);
        setField(term23704, term23704.getClass(), "rulerTitleFemale", null);
        setField(term23704, term23704.getClass(), "traits", null);
        term23705 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23705;
        callMethod(klass, "getDescription", argTypes, term23704, args);
    }

};



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
import java.util.ArrayList;

public class NameGenerator_setUsedNames_8728078091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public NameGenerator_setUsedNames_8728078091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new ArrayList();
        ((ArrayList) term1).add("PAEBtnZtTD");
        ((ArrayList) term1).add("sjlJAEtRrb");
        ((ArrayList) term1).add("MuLcgQHgqz");
        ((ArrayList) term1).add("xxtlPwDYFs");
        ((ArrayList) term1).add("jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.namegenerators.NameGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "setUsedNames", argTypes, null, args);
    }

};



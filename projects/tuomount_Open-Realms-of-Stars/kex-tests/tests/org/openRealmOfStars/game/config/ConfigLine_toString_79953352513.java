package org.openRealmOfStars.game.config;

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
import static org.openRealmOfStars.game.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ConfigLine_toString_79953352513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2137;

    public ConfigLine_toString_79953352513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2137 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigLine"));
        setField(term2137, term2137.getClass(), "type", null);
        setField(term2137, term2137.getClass(), "comment", null);
        setField(term2137, term2137.getClass(), "key", null);
        setField(term2137, term2137.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.config.ConfigLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2137, args);
    }

};



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
import java.lang.String;
import java.lang.Object;

public class ConfigLine_getComment_2158721685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1442;

    public ConfigLine_getComment_2158721685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1491 = Class.forName((String) "org.openRealmOfStars.game.config.ConfigLineType");
        Field term1490 = ((Class) term1491).getDeclaredField((String) "COMMENT");
        ((Field) term1490).setAccessible(true);
        Object enum4 = ((Field) term1490).get((Object) null);
        term1442 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigLine"));
        setField(term1442, term1442.getClass(), "type", enum4);
        setField(term1442, term1442.getClass(), "comment", "oVcInYnLWB");
        setField(term1442, term1442.getClass(), "key", "aJlieCFVtF");
        setField(term1442, term1442.getClass(), "value", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.config.ConfigLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term1442, args);
    }

};



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

public class ConfigLine_getKey_6167040882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;

    public ConfigLine_getKey_6167040882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term452 = Class.forName((String) "org.openRealmOfStars.game.config.ConfigLineType");
        Field term451 = ((Class) term452).getDeclaredField((String) "EMPTY");
        ((Field) term451).setAccessible(true);
        Object enum1 = ((Field) term451).get((Object) null);
        term405 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigLine"));
        setField(term405, term405.getClass(), "type", enum1);
        setField(term405, term405.getClass(), "comment", "jJCZpVmanW");
        setField(term405, term405.getClass(), "key", "EGtDIRbSSb");
        setField(term405, term405.getClass(), "value", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.config.ConfigLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey", argTypes, term405, args);
    }

};



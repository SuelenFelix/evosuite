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

public class ConfigLine_getType_2143095590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ConfigLine_getType_2143095590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85 = Class.forName((String) "org.openRealmOfStars.game.config.ConfigLineType");
        Field term84 = ((Class) term85).getDeclaredField((String) "KEY_VALUE");
        ((Field) term84).setAccessible(true);
        Object enum0 = ((Field) term84).get((Object) null);
        term1 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigLine"));
        setField(term1, term1.getClass(), "type", enum0);
        setField(term1, term1.getClass(), "comment", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "key", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "value", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.config.ConfigLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1, args);
    }

};



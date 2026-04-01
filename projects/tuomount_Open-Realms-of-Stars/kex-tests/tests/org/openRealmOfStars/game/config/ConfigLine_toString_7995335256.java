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

public class ConfigLine_toString_7995335256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1783;

    public ConfigLine_toString_7995335256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1834 = Class.forName((String) "org.openRealmOfStars.game.config.ConfigLineType");
        Field term1833 = ((Class) term1834).getDeclaredField((String) "KEY_VALUE");
        ((Field) term1833).setAccessible(true);
        Object enum5 = ((Field) term1833).get((Object) null);
        term1783 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigLine"));
        setField(term1783, term1783.getClass(), "type", enum5);
        setField(term1783, term1783.getClass(), "comment", "tbcdzjIfER");
        setField(term1783, term1783.getClass(), "key", "HyxfbSQYBe");
        setField(term1783, term1783.getClass(), "value", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.config.ConfigLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1783, args);
    }

};



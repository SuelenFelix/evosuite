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

public class ConfigLine_getValue_13060086463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738;

    public ConfigLine_getValue_13060086463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term789 = Class.forName((String) "org.openRealmOfStars.game.config.ConfigLineType");
        Field term788 = ((Class) term789).getDeclaredField((String) "KEY_VALUE");
        ((Field) term788).setAccessible(true);
        Object enum2 = ((Field) term788).get((Object) null);
        term738 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigLine"));
        setField(term738, term738.getClass(), "type", enum2);
        setField(term738, term738.getClass(), "comment", "MjGYSRKTNF");
        setField(term738, term738.getClass(), "key", "hRNSzYYIrc");
        setField(term738, term738.getClass(), "value", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.config.ConfigLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term738, args);
    }

};



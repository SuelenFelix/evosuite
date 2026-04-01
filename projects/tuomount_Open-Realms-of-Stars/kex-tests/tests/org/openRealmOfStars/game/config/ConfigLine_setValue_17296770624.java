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

public class ConfigLine_setValue_17296770624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1087;

    public ConfigLine_setValue_17296770624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1146 = Class.forName((String) "org.openRealmOfStars.game.config.ConfigLineType");
        Field term1145 = ((Class) term1146).getDeclaredField((String) "EMPTY");
        ((Field) term1145).setAccessible(true);
        Object enum3 = ((Field) term1145).get((Object) null);
        term1087 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigLine"));
        setField(term1087, term1087.getClass(), "type", enum3);
        setField(term1087, term1087.getClass(), "comment", "NRdvgJlhkX");
        setField(term1087, term1087.getClass(), "key", "uuaPigETmJ");
        setField(term1087, term1087.getClass(), "value", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.config.ConfigLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setValue", argTypes, term1087, args);
    }

};



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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class ConfigFile_add_8919602202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2143;
     Object term2148;

    public ConfigFile_add_8919602202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2144 = new ArrayList();
        term2143 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigFile"));
        setField(term2143, term2143.getClass(), "lines", term2144);
        Class<? extends Object> term2195 = Class.forName((String) "org.openRealmOfStars.game.config.ConfigLineType");
        Field term2194 = ((Class) term2195).getDeclaredField((String) "EMPTY");
        ((Field) term2194).setAccessible(true);
        Object enum6 = ((Field) term2194).get((Object) null);
        term2148 = newInstance(Class.forName("org.openRealmOfStars.game.config.ConfigLine"));
        setField(term2148, term2148.getClass(), "type", enum6);
        setField(term2148, term2148.getClass(), "comment", "hNxWaHcfhY");
        setField(term2148, term2148.getClass(), "key", "RkybSrpybU");
        setField(term2148, term2148.getClass(), "value", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.config.ConfigFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.config.ConfigLine");
        Object[] args = new Object[1];
        args[0] = term2148;
        callMethod(klass, "add", argTypes, term2143, args);
    }

};



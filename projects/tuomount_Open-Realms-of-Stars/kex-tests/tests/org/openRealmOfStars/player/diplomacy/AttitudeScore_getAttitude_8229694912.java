package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AttitudeScore_getAttitude_8229694912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434902;

    public AttitudeScore_getAttitude_8229694912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434916 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term434915 = ((Class) term434916).getDeclaredField((String) "LOGICAL");
        ((Field) term434915).setAccessible(true);
        Object enum1248 = ((Field) term434915).get((Object) null);
        term434902 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore"));
        setField(term434902, term434902.getClass(), "attitude", enum1248);
        setIntField(term434902, term434902.getClass(), "value", 1339586196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttitude", argTypes, term434902, args);
    }

};



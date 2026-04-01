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

public class AttitudeScore_compareTo_18142953251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434344;
     Object term434360;

    public AttitudeScore_compareTo_18142953251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434375 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term434374 = ((Class) term434375).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term434374).setAccessible(true);
        Object enum1246 = ((Field) term434374).get((Object) null);
        term434344 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore"));
        setField(term434344, term434344.getClass(), "attitude", enum1246);
        setIntField(term434344, term434344.getClass(), "value", 1215433415);
        Class<? extends Object> term434642 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term434641 = ((Class) term434642).getDeclaredField((String) "PEACEFUL");
        ((Field) term434641).setAccessible(true);
        Object enum1247 = ((Field) term434641).get((Object) null);
        term434360 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore"));
        setField(term434360, term434360.getClass(), "attitude", enum1247);
        setIntField(term434360, term434360.getClass(), "value", -604279512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore");
        Object[] args = new Object[1];
        args[0] = term434360;
        callMethod(klass, "compareTo", argTypes, term434344, args);
    }

};



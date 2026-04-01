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

public class AttitudeScore_getValue_2343003443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435173;

    public AttitudeScore_getValue_2343003443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term435192 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term435191 = ((Class) term435192).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term435191).setAccessible(true);
        Object enum1249 = ((Field) term435191).get((Object) null);
        term435173 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore"));
        setField(term435173, term435173.getClass(), "attitude", enum1249);
        setIntField(term435173, term435173.getClass(), "value", 718138171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term435173, args);
    }

};



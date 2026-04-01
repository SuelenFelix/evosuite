package org.openRealmOfStars.player.combat;

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
import static org.openRealmOfStars.player.combat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CombatAnimation_getEy_140601148337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636942;

    public CombatAnimation_getEy_140601148337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636942 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term636942, term636942.getClass(), "sx", 0.0);
        setDoubleField(term636942, term636942.getClass(), "sy", 0.0);
        setDoubleField(term636942, term636942.getClass(), "ex", 0.0);
        setDoubleField(term636942, term636942.getClass(), "ey", 0.0);
        setDoubleField(term636942, term636942.getClass(), "mx", 0.0);
        setDoubleField(term636942, term636942.getClass(), "my", 0.0);
        setField(term636942, term636942.getClass(), "type", null);
        setBooleanField(term636942, term636942.getClass(), "hit", false);
        setIntField(term636942, term636942.getClass(), "count", 0);
        setIntField(term636942, term636942.getClass(), "animFrame", 0);
        setBooleanField(term636942, term636942.getClass(), "showAnim", false);
        setField(term636942, term636942.getClass(), "particles", null);
        setIntField(term636942, term636942.getClass(), "distance", 0);
        setField(term636942, term636942.getClass(), "target", null);
        setField(term636942, term636942.getClass(), "shooter", null);
        setField(term636942, term636942.getClass(), "explosionAnim", null);
        setField(term636942, term636942.getClass(), "shieldAnim", null);
        setBooleanField(term636942, term636942.getClass(), "firstDraw", false);
        setField(term636942, term636942.getClass(), "explosionSfx", null);
        setIntField(term636942, term636942.getClass(), "loops", 0);
        setIntField(term636942, term636942.getClass(), "loopCount", 0);
        setIntField(term636942, term636942.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEy", argTypes, term636942, args);
    }

};



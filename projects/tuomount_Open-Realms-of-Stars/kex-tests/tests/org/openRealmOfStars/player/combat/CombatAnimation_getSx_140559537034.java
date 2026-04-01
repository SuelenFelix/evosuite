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

public class CombatAnimation_getSx_140559537034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636894;

    public CombatAnimation_getSx_140559537034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636894 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term636894, term636894.getClass(), "sx", 0.0);
        setDoubleField(term636894, term636894.getClass(), "sy", 0.0);
        setDoubleField(term636894, term636894.getClass(), "ex", 0.0);
        setDoubleField(term636894, term636894.getClass(), "ey", 0.0);
        setDoubleField(term636894, term636894.getClass(), "mx", 0.0);
        setDoubleField(term636894, term636894.getClass(), "my", 0.0);
        setField(term636894, term636894.getClass(), "type", null);
        setBooleanField(term636894, term636894.getClass(), "hit", false);
        setIntField(term636894, term636894.getClass(), "count", 0);
        setIntField(term636894, term636894.getClass(), "animFrame", 0);
        setBooleanField(term636894, term636894.getClass(), "showAnim", false);
        setField(term636894, term636894.getClass(), "particles", null);
        setIntField(term636894, term636894.getClass(), "distance", 0);
        setField(term636894, term636894.getClass(), "target", null);
        setField(term636894, term636894.getClass(), "shooter", null);
        setField(term636894, term636894.getClass(), "explosionAnim", null);
        setField(term636894, term636894.getClass(), "shieldAnim", null);
        setBooleanField(term636894, term636894.getClass(), "firstDraw", false);
        setField(term636894, term636894.getClass(), "explosionSfx", null);
        setIntField(term636894, term636894.getClass(), "loops", 0);
        setIntField(term636894, term636894.getClass(), "loopCount", 0);
        setIntField(term636894, term636894.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSx", argTypes, term636894, args);
    }

};



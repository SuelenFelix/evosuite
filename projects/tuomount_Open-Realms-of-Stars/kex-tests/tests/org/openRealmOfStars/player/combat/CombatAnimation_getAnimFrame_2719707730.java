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

public class CombatAnimation_getAnimFrame_2719707730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636830;

    public CombatAnimation_getAnimFrame_2719707730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636830 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term636830, term636830.getClass(), "sx", 0.0);
        setDoubleField(term636830, term636830.getClass(), "sy", 0.0);
        setDoubleField(term636830, term636830.getClass(), "ex", 0.0);
        setDoubleField(term636830, term636830.getClass(), "ey", 0.0);
        setDoubleField(term636830, term636830.getClass(), "mx", 0.0);
        setDoubleField(term636830, term636830.getClass(), "my", 0.0);
        setField(term636830, term636830.getClass(), "type", null);
        setBooleanField(term636830, term636830.getClass(), "hit", false);
        setIntField(term636830, term636830.getClass(), "count", 0);
        setIntField(term636830, term636830.getClass(), "animFrame", 0);
        setBooleanField(term636830, term636830.getClass(), "showAnim", false);
        setField(term636830, term636830.getClass(), "particles", null);
        setIntField(term636830, term636830.getClass(), "distance", 0);
        setField(term636830, term636830.getClass(), "target", null);
        setField(term636830, term636830.getClass(), "shooter", null);
        setField(term636830, term636830.getClass(), "explosionAnim", null);
        setField(term636830, term636830.getClass(), "shieldAnim", null);
        setBooleanField(term636830, term636830.getClass(), "firstDraw", false);
        setField(term636830, term636830.getClass(), "explosionSfx", null);
        setIntField(term636830, term636830.getClass(), "loops", 0);
        setIntField(term636830, term636830.getClass(), "loopCount", 0);
        setIntField(term636830, term636830.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnimFrame", argTypes, term636830, args);
    }

};



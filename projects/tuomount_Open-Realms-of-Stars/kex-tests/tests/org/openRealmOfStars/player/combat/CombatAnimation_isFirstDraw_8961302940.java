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

public class CombatAnimation_isFirstDraw_8961302940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636990;

    public CombatAnimation_isFirstDraw_8961302940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636990 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term636990, term636990.getClass(), "sx", 0.0);
        setDoubleField(term636990, term636990.getClass(), "sy", 0.0);
        setDoubleField(term636990, term636990.getClass(), "ex", 0.0);
        setDoubleField(term636990, term636990.getClass(), "ey", 0.0);
        setDoubleField(term636990, term636990.getClass(), "mx", 0.0);
        setDoubleField(term636990, term636990.getClass(), "my", 0.0);
        setField(term636990, term636990.getClass(), "type", null);
        setBooleanField(term636990, term636990.getClass(), "hit", false);
        setIntField(term636990, term636990.getClass(), "count", 0);
        setIntField(term636990, term636990.getClass(), "animFrame", 0);
        setBooleanField(term636990, term636990.getClass(), "showAnim", false);
        setField(term636990, term636990.getClass(), "particles", null);
        setIntField(term636990, term636990.getClass(), "distance", 0);
        setField(term636990, term636990.getClass(), "target", null);
        setField(term636990, term636990.getClass(), "shooter", null);
        setField(term636990, term636990.getClass(), "explosionAnim", null);
        setField(term636990, term636990.getClass(), "shieldAnim", null);
        setBooleanField(term636990, term636990.getClass(), "firstDraw", false);
        setField(term636990, term636990.getClass(), "explosionSfx", null);
        setIntField(term636990, term636990.getClass(), "loops", 0);
        setIntField(term636990, term636990.getClass(), "loopCount", 0);
        setIntField(term636990, term636990.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFirstDraw", argTypes, term636990, args);
    }

};



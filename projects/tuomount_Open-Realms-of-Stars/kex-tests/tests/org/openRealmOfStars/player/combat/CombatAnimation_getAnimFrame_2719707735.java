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

public class CombatAnimation_getAnimFrame_2719707735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2522419;

    public CombatAnimation_getAnimFrame_2719707735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2522419 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term2522419, term2522419.getClass(), "sx", 0.0);
        setDoubleField(term2522419, term2522419.getClass(), "sy", 0.0);
        setDoubleField(term2522419, term2522419.getClass(), "ex", 0.0);
        setDoubleField(term2522419, term2522419.getClass(), "ey", 0.0);
        setDoubleField(term2522419, term2522419.getClass(), "mx", 0.0);
        setDoubleField(term2522419, term2522419.getClass(), "my", 0.0);
        setField(term2522419, term2522419.getClass(), "type", null);
        setBooleanField(term2522419, term2522419.getClass(), "hit", false);
        setIntField(term2522419, term2522419.getClass(), "count", 0);
        setIntField(term2522419, term2522419.getClass(), "animFrame", 0);
        setBooleanField(term2522419, term2522419.getClass(), "showAnim", false);
        setField(term2522419, term2522419.getClass(), "particles", null);
        setIntField(term2522419, term2522419.getClass(), "distance", 0);
        setField(term2522419, term2522419.getClass(), "target", null);
        setField(term2522419, term2522419.getClass(), "shooter", null);
        setField(term2522419, term2522419.getClass(), "explosionAnim", null);
        setField(term2522419, term2522419.getClass(), "shieldAnim", null);
        setBooleanField(term2522419, term2522419.getClass(), "firstDraw", false);
        setField(term2522419, term2522419.getClass(), "explosionSfx", null);
        setIntField(term2522419, term2522419.getClass(), "loops", 0);
        setIntField(term2522419, term2522419.getClass(), "loopCount", 0);
        setIntField(term2522419, term2522419.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnimFrame", argTypes, term2522419, args);
    }

};



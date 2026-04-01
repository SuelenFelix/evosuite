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

public class CombatAnimation_getType_210909858321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2516397;

    public CombatAnimation_getType_210909858321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2516397 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term2516397, term2516397.getClass(), "sx", 0.0);
        setDoubleField(term2516397, term2516397.getClass(), "sy", 0.0);
        setDoubleField(term2516397, term2516397.getClass(), "ex", 0.0);
        setDoubleField(term2516397, term2516397.getClass(), "ey", 0.0);
        setDoubleField(term2516397, term2516397.getClass(), "mx", 0.0);
        setDoubleField(term2516397, term2516397.getClass(), "my", 0.0);
        setField(term2516397, term2516397.getClass(), "type", null);
        setBooleanField(term2516397, term2516397.getClass(), "hit", false);
        setIntField(term2516397, term2516397.getClass(), "count", 0);
        setIntField(term2516397, term2516397.getClass(), "animFrame", 0);
        setBooleanField(term2516397, term2516397.getClass(), "showAnim", false);
        setField(term2516397, term2516397.getClass(), "particles", null);
        setIntField(term2516397, term2516397.getClass(), "distance", 0);
        setField(term2516397, term2516397.getClass(), "target", null);
        setField(term2516397, term2516397.getClass(), "shooter", null);
        setField(term2516397, term2516397.getClass(), "explosionAnim", null);
        setField(term2516397, term2516397.getClass(), "shieldAnim", null);
        setBooleanField(term2516397, term2516397.getClass(), "firstDraw", false);
        setField(term2516397, term2516397.getClass(), "explosionSfx", null);
        setIntField(term2516397, term2516397.getClass(), "loops", 0);
        setIntField(term2516397, term2516397.getClass(), "loopCount", 0);
        setIntField(term2516397, term2516397.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term2516397, args);
    }

};



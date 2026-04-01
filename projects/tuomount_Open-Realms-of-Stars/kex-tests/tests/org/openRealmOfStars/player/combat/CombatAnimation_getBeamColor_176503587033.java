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

public class CombatAnimation_getBeamColor_176503587033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636878;

    public CombatAnimation_getBeamColor_176503587033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636878 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term636878, term636878.getClass(), "sx", 0.0);
        setDoubleField(term636878, term636878.getClass(), "sy", 0.0);
        setDoubleField(term636878, term636878.getClass(), "ex", 0.0);
        setDoubleField(term636878, term636878.getClass(), "ey", 0.0);
        setDoubleField(term636878, term636878.getClass(), "mx", 0.0);
        setDoubleField(term636878, term636878.getClass(), "my", 0.0);
        setField(term636878, term636878.getClass(), "type", null);
        setBooleanField(term636878, term636878.getClass(), "hit", false);
        setIntField(term636878, term636878.getClass(), "count", 0);
        setIntField(term636878, term636878.getClass(), "animFrame", 0);
        setBooleanField(term636878, term636878.getClass(), "showAnim", false);
        setField(term636878, term636878.getClass(), "particles", null);
        setIntField(term636878, term636878.getClass(), "distance", 0);
        setField(term636878, term636878.getClass(), "target", null);
        setField(term636878, term636878.getClass(), "shooter", null);
        setField(term636878, term636878.getClass(), "explosionAnim", null);
        setField(term636878, term636878.getClass(), "shieldAnim", null);
        setBooleanField(term636878, term636878.getClass(), "firstDraw", false);
        setField(term636878, term636878.getClass(), "explosionSfx", null);
        setIntField(term636878, term636878.getClass(), "loops", 0);
        setIntField(term636878, term636878.getClass(), "loopCount", 0);
        setIntField(term636878, term636878.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBeamColor", argTypes, term636878, args);
    }

};



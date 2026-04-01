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
import java.lang.Boolean;

public class CombatAnimation_setFirstDraw_90873295741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637006;
     Object term637022;

    public CombatAnimation_setFirstDraw_90873295741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term637006 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term637006, term637006.getClass(), "sx", 0.0);
        setDoubleField(term637006, term637006.getClass(), "sy", 0.0);
        setDoubleField(term637006, term637006.getClass(), "ex", 0.0);
        setDoubleField(term637006, term637006.getClass(), "ey", 0.0);
        setDoubleField(term637006, term637006.getClass(), "mx", 0.0);
        setDoubleField(term637006, term637006.getClass(), "my", 0.0);
        setField(term637006, term637006.getClass(), "type", null);
        setBooleanField(term637006, term637006.getClass(), "hit", false);
        setIntField(term637006, term637006.getClass(), "count", 0);
        setIntField(term637006, term637006.getClass(), "animFrame", 0);
        setBooleanField(term637006, term637006.getClass(), "showAnim", false);
        setField(term637006, term637006.getClass(), "particles", null);
        setIntField(term637006, term637006.getClass(), "distance", 0);
        setField(term637006, term637006.getClass(), "target", null);
        setField(term637006, term637006.getClass(), "shooter", null);
        setField(term637006, term637006.getClass(), "explosionAnim", null);
        setField(term637006, term637006.getClass(), "shieldAnim", null);
        setBooleanField(term637006, term637006.getClass(), "firstDraw", false);
        setField(term637006, term637006.getClass(), "explosionSfx", null);
        setIntField(term637006, term637006.getClass(), "loops", 0);
        setIntField(term637006, term637006.getClass(), "loopCount", 0);
        setIntField(term637006, term637006.getClass(), "slowerAnimation", 0);
        term637022 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term637022;
        callMethod(klass, "setFirstDraw", argTypes, term637006, args);
    }

};



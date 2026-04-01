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
import java.lang.Integer;

public class CombatAnimation_doAnimationIon_81926521629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636812;
     Object term636828;

    public CombatAnimation_doAnimationIon_81926521629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636812 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term636812, term636812.getClass(), "sx", 0.0);
        setDoubleField(term636812, term636812.getClass(), "sy", 0.0);
        setDoubleField(term636812, term636812.getClass(), "ex", 0.0);
        setDoubleField(term636812, term636812.getClass(), "ey", 0.0);
        setDoubleField(term636812, term636812.getClass(), "mx", 0.0);
        setDoubleField(term636812, term636812.getClass(), "my", 0.0);
        setField(term636812, term636812.getClass(), "type", null);
        setBooleanField(term636812, term636812.getClass(), "hit", false);
        setIntField(term636812, term636812.getClass(), "count", 0);
        setIntField(term636812, term636812.getClass(), "animFrame", 0);
        setBooleanField(term636812, term636812.getClass(), "showAnim", false);
        setField(term636812, term636812.getClass(), "particles", null);
        setIntField(term636812, term636812.getClass(), "distance", 0);
        setField(term636812, term636812.getClass(), "target", null);
        setField(term636812, term636812.getClass(), "shooter", null);
        setField(term636812, term636812.getClass(), "explosionAnim", null);
        setField(term636812, term636812.getClass(), "shieldAnim", null);
        setBooleanField(term636812, term636812.getClass(), "firstDraw", false);
        setField(term636812, term636812.getClass(), "explosionSfx", null);
        setIntField(term636812, term636812.getClass(), "loops", 0);
        setIntField(term636812, term636812.getClass(), "loopCount", 0);
        setIntField(term636812, term636812.getClass(), "slowerAnimation", 0);
        term636828 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term636828;
        callMethod(klass, "doAnimationIon", argTypes, term636812, args);
    }

};



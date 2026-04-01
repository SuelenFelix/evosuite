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

public class CombatAnimation_doAnimationHit_81816871528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636794;
     Object term636810;

    public CombatAnimation_doAnimationHit_81816871528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636794 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term636794, term636794.getClass(), "sx", 0.0);
        setDoubleField(term636794, term636794.getClass(), "sy", 0.0);
        setDoubleField(term636794, term636794.getClass(), "ex", 0.0);
        setDoubleField(term636794, term636794.getClass(), "ey", 0.0);
        setDoubleField(term636794, term636794.getClass(), "mx", 0.0);
        setDoubleField(term636794, term636794.getClass(), "my", 0.0);
        setField(term636794, term636794.getClass(), "type", null);
        setBooleanField(term636794, term636794.getClass(), "hit", false);
        setIntField(term636794, term636794.getClass(), "count", 0);
        setIntField(term636794, term636794.getClass(), "animFrame", 0);
        setBooleanField(term636794, term636794.getClass(), "showAnim", false);
        setField(term636794, term636794.getClass(), "particles", null);
        setIntField(term636794, term636794.getClass(), "distance", 0);
        setField(term636794, term636794.getClass(), "target", null);
        setField(term636794, term636794.getClass(), "shooter", null);
        setField(term636794, term636794.getClass(), "explosionAnim", null);
        setField(term636794, term636794.getClass(), "shieldAnim", null);
        setBooleanField(term636794, term636794.getClass(), "firstDraw", false);
        setField(term636794, term636794.getClass(), "explosionSfx", null);
        setIntField(term636794, term636794.getClass(), "loops", 0);
        setIntField(term636794, term636794.getClass(), "loopCount", 0);
        setIntField(term636794, term636794.getClass(), "slowerAnimation", 0);
        term636810 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term636810;
        callMethod(klass, "doAnimationHit", argTypes, term636794, args);
    }

};



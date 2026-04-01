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

public class CombatAnimation_doAnimationHit_81816871533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2522383;
     Object term2522399;

    public CombatAnimation_doAnimationHit_81816871533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2522383 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term2522383, term2522383.getClass(), "sx", 0.0);
        setDoubleField(term2522383, term2522383.getClass(), "sy", 0.0);
        setDoubleField(term2522383, term2522383.getClass(), "ex", 0.0);
        setDoubleField(term2522383, term2522383.getClass(), "ey", 0.0);
        setDoubleField(term2522383, term2522383.getClass(), "mx", 0.0);
        setDoubleField(term2522383, term2522383.getClass(), "my", 0.0);
        setField(term2522383, term2522383.getClass(), "type", null);
        setBooleanField(term2522383, term2522383.getClass(), "hit", false);
        setIntField(term2522383, term2522383.getClass(), "count", 0);
        setIntField(term2522383, term2522383.getClass(), "animFrame", 0);
        setBooleanField(term2522383, term2522383.getClass(), "showAnim", false);
        setField(term2522383, term2522383.getClass(), "particles", null);
        setIntField(term2522383, term2522383.getClass(), "distance", 0);
        setField(term2522383, term2522383.getClass(), "target", null);
        setField(term2522383, term2522383.getClass(), "shooter", null);
        setField(term2522383, term2522383.getClass(), "explosionAnim", null);
        setField(term2522383, term2522383.getClass(), "shieldAnim", null);
        setBooleanField(term2522383, term2522383.getClass(), "firstDraw", false);
        setField(term2522383, term2522383.getClass(), "explosionSfx", null);
        setIntField(term2522383, term2522383.getClass(), "loops", 0);
        setIntField(term2522383, term2522383.getClass(), "loopCount", 0);
        setIntField(term2522383, term2522383.getClass(), "slowerAnimation", 0);
        term2522399 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2522399;
        callMethod(klass, "doAnimationHit", argTypes, term2522383, args);
    }

};



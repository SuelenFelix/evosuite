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

public class CombatAnimation_getShooter_148670647725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636746;

    public CombatAnimation_getShooter_148670647725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636746 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term636746, term636746.getClass(), "sx", 0.0);
        setDoubleField(term636746, term636746.getClass(), "sy", 0.0);
        setDoubleField(term636746, term636746.getClass(), "ex", 0.0);
        setDoubleField(term636746, term636746.getClass(), "ey", 0.0);
        setDoubleField(term636746, term636746.getClass(), "mx", 0.0);
        setDoubleField(term636746, term636746.getClass(), "my", 0.0);
        setField(term636746, term636746.getClass(), "type", null);
        setBooleanField(term636746, term636746.getClass(), "hit", false);
        setIntField(term636746, term636746.getClass(), "count", 0);
        setIntField(term636746, term636746.getClass(), "animFrame", 0);
        setBooleanField(term636746, term636746.getClass(), "showAnim", false);
        setField(term636746, term636746.getClass(), "particles", null);
        setIntField(term636746, term636746.getClass(), "distance", 0);
        setField(term636746, term636746.getClass(), "target", null);
        setField(term636746, term636746.getClass(), "shooter", null);
        setField(term636746, term636746.getClass(), "explosionAnim", null);
        setField(term636746, term636746.getClass(), "shieldAnim", null);
        setBooleanField(term636746, term636746.getClass(), "firstDraw", false);
        setField(term636746, term636746.getClass(), "explosionSfx", null);
        setIntField(term636746, term636746.getClass(), "loops", 0);
        setIntField(term636746, term636746.getClass(), "loopCount", 0);
        setIntField(term636746, term636746.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShooter", argTypes, term636746, args);
    }

};



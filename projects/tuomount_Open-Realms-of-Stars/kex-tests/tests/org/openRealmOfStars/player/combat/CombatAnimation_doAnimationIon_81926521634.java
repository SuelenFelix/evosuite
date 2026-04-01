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

public class CombatAnimation_doAnimationIon_81926521634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2522401;
     Object term2522417;

    public CombatAnimation_doAnimationIon_81926521634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2522401 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term2522401, term2522401.getClass(), "sx", 0.0);
        setDoubleField(term2522401, term2522401.getClass(), "sy", 0.0);
        setDoubleField(term2522401, term2522401.getClass(), "ex", 0.0);
        setDoubleField(term2522401, term2522401.getClass(), "ey", 0.0);
        setDoubleField(term2522401, term2522401.getClass(), "mx", 0.0);
        setDoubleField(term2522401, term2522401.getClass(), "my", 0.0);
        setField(term2522401, term2522401.getClass(), "type", null);
        setBooleanField(term2522401, term2522401.getClass(), "hit", false);
        setIntField(term2522401, term2522401.getClass(), "count", 0);
        setIntField(term2522401, term2522401.getClass(), "animFrame", 0);
        setBooleanField(term2522401, term2522401.getClass(), "showAnim", false);
        setField(term2522401, term2522401.getClass(), "particles", null);
        setIntField(term2522401, term2522401.getClass(), "distance", 0);
        setField(term2522401, term2522401.getClass(), "target", null);
        setField(term2522401, term2522401.getClass(), "shooter", null);
        setField(term2522401, term2522401.getClass(), "explosionAnim", null);
        setField(term2522401, term2522401.getClass(), "shieldAnim", null);
        setBooleanField(term2522401, term2522401.getClass(), "firstDraw", false);
        setField(term2522401, term2522401.getClass(), "explosionSfx", null);
        setIntField(term2522401, term2522401.getClass(), "loops", 0);
        setIntField(term2522401, term2522401.getClass(), "loopCount", 0);
        setIntField(term2522401, term2522401.getClass(), "slowerAnimation", 0);
        term2522417 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2522417;
        callMethod(klass, "doAnimationIon", argTypes, term2522401, args);
    }

};



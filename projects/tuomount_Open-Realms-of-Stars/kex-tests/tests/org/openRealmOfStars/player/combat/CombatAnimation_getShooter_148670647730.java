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

public class CombatAnimation_getShooter_148670647730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2522335;

    public CombatAnimation_getShooter_148670647730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2522335 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term2522335, term2522335.getClass(), "sx", 0.0);
        setDoubleField(term2522335, term2522335.getClass(), "sy", 0.0);
        setDoubleField(term2522335, term2522335.getClass(), "ex", 0.0);
        setDoubleField(term2522335, term2522335.getClass(), "ey", 0.0);
        setDoubleField(term2522335, term2522335.getClass(), "mx", 0.0);
        setDoubleField(term2522335, term2522335.getClass(), "my", 0.0);
        setField(term2522335, term2522335.getClass(), "type", null);
        setBooleanField(term2522335, term2522335.getClass(), "hit", false);
        setIntField(term2522335, term2522335.getClass(), "count", 0);
        setIntField(term2522335, term2522335.getClass(), "animFrame", 0);
        setBooleanField(term2522335, term2522335.getClass(), "showAnim", false);
        setField(term2522335, term2522335.getClass(), "particles", null);
        setIntField(term2522335, term2522335.getClass(), "distance", 0);
        setField(term2522335, term2522335.getClass(), "target", null);
        setField(term2522335, term2522335.getClass(), "shooter", null);
        setField(term2522335, term2522335.getClass(), "explosionAnim", null);
        setField(term2522335, term2522335.getClass(), "shieldAnim", null);
        setBooleanField(term2522335, term2522335.getClass(), "firstDraw", false);
        setField(term2522335, term2522335.getClass(), "explosionSfx", null);
        setIntField(term2522335, term2522335.getClass(), "loops", 0);
        setIntField(term2522335, term2522335.getClass(), "loopCount", 0);
        setIntField(term2522335, term2522335.getClass(), "slowerAnimation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShooter", argTypes, term2522335, args);
    }

};



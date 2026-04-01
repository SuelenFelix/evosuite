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

public class CombatAnimation_initCombatAnimation_99014433927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2522299;
     Object term2522315;

    public CombatAnimation_initCombatAnimation_99014433927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2522299 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatAnimation"));
        setDoubleField(term2522299, term2522299.getClass(), "sx", 0.0);
        setDoubleField(term2522299, term2522299.getClass(), "sy", 0.0);
        setDoubleField(term2522299, term2522299.getClass(), "ex", 0.0);
        setDoubleField(term2522299, term2522299.getClass(), "ey", 0.0);
        setDoubleField(term2522299, term2522299.getClass(), "mx", 0.0);
        setDoubleField(term2522299, term2522299.getClass(), "my", 0.0);
        setField(term2522299, term2522299.getClass(), "type", null);
        setBooleanField(term2522299, term2522299.getClass(), "hit", false);
        setIntField(term2522299, term2522299.getClass(), "count", 0);
        setIntField(term2522299, term2522299.getClass(), "animFrame", 0);
        setBooleanField(term2522299, term2522299.getClass(), "showAnim", false);
        setField(term2522299, term2522299.getClass(), "particles", null);
        setIntField(term2522299, term2522299.getClass(), "distance", 0);
        setField(term2522299, term2522299.getClass(), "target", null);
        setField(term2522299, term2522299.getClass(), "shooter", null);
        setField(term2522299, term2522299.getClass(), "explosionAnim", null);
        setField(term2522299, term2522299.getClass(), "shieldAnim", null);
        setBooleanField(term2522299, term2522299.getClass(), "firstDraw", false);
        setField(term2522299, term2522299.getClass(), "explosionSfx", null);
        setIntField(term2522299, term2522299.getClass(), "loops", 0);
        setIntField(term2522299, term2522299.getClass(), "loopCount", 0);
        setIntField(term2522299, term2522299.getClass(), "slowerAnimation", 0);
        term2522315 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.combat.CombatAnimationType");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term2522315;
        callMethod(klass, "initCombatAnimation", argTypes, term2522299, args);
    }

};



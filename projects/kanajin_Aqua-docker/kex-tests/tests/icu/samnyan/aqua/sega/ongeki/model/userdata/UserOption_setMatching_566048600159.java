package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserOption_setMatching_566048600159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350710;
     Object term350749;

    public UserOption_setMatching_566048600159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350710 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term350710, term350710.getClass(), "id", 0L);
        setField(term350710, term350710.getClass(), "user", null);
        setIntField(term350710, term350710.getClass(), "optionSet", 0);
        setIntField(term350710, term350710.getClass(), "speed", 0);
        setIntField(term350710, term350710.getClass(), "mirror", 0);
        setIntField(term350710, term350710.getClass(), "judgeTiming", 0);
        setIntField(term350710, term350710.getClass(), "judgeAdjustment", 0);
        setIntField(term350710, term350710.getClass(), "abort", 0);
        setIntField(term350710, term350710.getClass(), "stealthField", 0);
        setIntField(term350710, term350710.getClass(), "tapSound", 0);
        setIntField(term350710, term350710.getClass(), "volGuide", 0);
        setIntField(term350710, term350710.getClass(), "volAll", 0);
        setIntField(term350710, term350710.getClass(), "volTap", 0);
        setIntField(term350710, term350710.getClass(), "volCrTap", 0);
        setIntField(term350710, term350710.getClass(), "volHold", 0);
        setIntField(term350710, term350710.getClass(), "volSide", 0);
        setIntField(term350710, term350710.getClass(), "volFlick", 0);
        setIntField(term350710, term350710.getClass(), "volBell", 0);
        setIntField(term350710, term350710.getClass(), "volEnemy", 0);
        setIntField(term350710, term350710.getClass(), "volSkill", 0);
        setIntField(term350710, term350710.getClass(), "volDamage", 0);
        setIntField(term350710, term350710.getClass(), "colorField", 0);
        setIntField(term350710, term350710.getClass(), "colorLaneBright", 0);
        setIntField(term350710, term350710.getClass(), "colorWallBright", 0);
        setIntField(term350710, term350710.getClass(), "colorLane", 0);
        setIntField(term350710, term350710.getClass(), "colorSide", 0);
        setIntField(term350710, term350710.getClass(), "effectDamage", 0);
        setIntField(term350710, term350710.getClass(), "effectPos", 0);
        setIntField(term350710, term350710.getClass(), "judgeDisp", 0);
        setIntField(term350710, term350710.getClass(), "judgePos", 0);
        setIntField(term350710, term350710.getClass(), "judgeBreak", 0);
        setIntField(term350710, term350710.getClass(), "judgeHit", 0);
        setIntField(term350710, term350710.getClass(), "platinumBreakDisp", 0);
        setIntField(term350710, term350710.getClass(), "judgeCriticalBreak", 0);
        setIntField(term350710, term350710.getClass(), "matching", 0);
        setIntField(term350710, term350710.getClass(), "dispPlayerLv", 0);
        setIntField(term350710, term350710.getClass(), "dispRating", 0);
        setIntField(term350710, term350710.getClass(), "dispBP", 0);
        setIntField(term350710, term350710.getClass(), "headphone", 0);
        term350749 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term350749;
        callMethod(klass, "setMatching", argTypes, term350710, args);
    }

};



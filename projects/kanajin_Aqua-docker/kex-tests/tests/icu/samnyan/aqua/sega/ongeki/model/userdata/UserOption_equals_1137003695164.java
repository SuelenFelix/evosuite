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

public class UserOption_equals_1137003695164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350915;

    public UserOption_equals_1137003695164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350915 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term350915, term350915.getClass(), "id", 0L);
        setField(term350915, term350915.getClass(), "user", null);
        setIntField(term350915, term350915.getClass(), "optionSet", 0);
        setIntField(term350915, term350915.getClass(), "speed", 0);
        setIntField(term350915, term350915.getClass(), "mirror", 0);
        setIntField(term350915, term350915.getClass(), "judgeTiming", 0);
        setIntField(term350915, term350915.getClass(), "judgeAdjustment", 0);
        setIntField(term350915, term350915.getClass(), "abort", 0);
        setIntField(term350915, term350915.getClass(), "stealthField", 0);
        setIntField(term350915, term350915.getClass(), "tapSound", 0);
        setIntField(term350915, term350915.getClass(), "volGuide", 0);
        setIntField(term350915, term350915.getClass(), "volAll", 0);
        setIntField(term350915, term350915.getClass(), "volTap", 0);
        setIntField(term350915, term350915.getClass(), "volCrTap", 0);
        setIntField(term350915, term350915.getClass(), "volHold", 0);
        setIntField(term350915, term350915.getClass(), "volSide", 0);
        setIntField(term350915, term350915.getClass(), "volFlick", 0);
        setIntField(term350915, term350915.getClass(), "volBell", 0);
        setIntField(term350915, term350915.getClass(), "volEnemy", 0);
        setIntField(term350915, term350915.getClass(), "volSkill", 0);
        setIntField(term350915, term350915.getClass(), "volDamage", 0);
        setIntField(term350915, term350915.getClass(), "colorField", 0);
        setIntField(term350915, term350915.getClass(), "colorLaneBright", 0);
        setIntField(term350915, term350915.getClass(), "colorWallBright", 0);
        setIntField(term350915, term350915.getClass(), "colorLane", 0);
        setIntField(term350915, term350915.getClass(), "colorSide", 0);
        setIntField(term350915, term350915.getClass(), "effectDamage", 0);
        setIntField(term350915, term350915.getClass(), "effectPos", 0);
        setIntField(term350915, term350915.getClass(), "judgeDisp", 0);
        setIntField(term350915, term350915.getClass(), "judgePos", 0);
        setIntField(term350915, term350915.getClass(), "judgeBreak", 0);
        setIntField(term350915, term350915.getClass(), "judgeHit", 0);
        setIntField(term350915, term350915.getClass(), "platinumBreakDisp", 0);
        setIntField(term350915, term350915.getClass(), "judgeCriticalBreak", 0);
        setIntField(term350915, term350915.getClass(), "matching", 0);
        setIntField(term350915, term350915.getClass(), "dispPlayerLv", 0);
        setIntField(term350915, term350915.getClass(), "dispRating", 0);
        setIntField(term350915, term350915.getClass(), "dispBP", 0);
        setIntField(term350915, term350915.getClass(), "headphone", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term350915, args);
    }

};



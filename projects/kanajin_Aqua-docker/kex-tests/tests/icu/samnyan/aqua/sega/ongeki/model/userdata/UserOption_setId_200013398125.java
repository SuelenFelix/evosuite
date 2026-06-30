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
import java.lang.Long;

public class UserOption_setId_200013398125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349318;
     Object term349357;

    public UserOption_setId_200013398125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349318 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term349318, term349318.getClass(), "id", 0L);
        setField(term349318, term349318.getClass(), "user", null);
        setIntField(term349318, term349318.getClass(), "optionSet", 0);
        setIntField(term349318, term349318.getClass(), "speed", 0);
        setIntField(term349318, term349318.getClass(), "mirror", 0);
        setIntField(term349318, term349318.getClass(), "judgeTiming", 0);
        setIntField(term349318, term349318.getClass(), "judgeAdjustment", 0);
        setIntField(term349318, term349318.getClass(), "abort", 0);
        setIntField(term349318, term349318.getClass(), "stealthField", 0);
        setIntField(term349318, term349318.getClass(), "tapSound", 0);
        setIntField(term349318, term349318.getClass(), "volGuide", 0);
        setIntField(term349318, term349318.getClass(), "volAll", 0);
        setIntField(term349318, term349318.getClass(), "volTap", 0);
        setIntField(term349318, term349318.getClass(), "volCrTap", 0);
        setIntField(term349318, term349318.getClass(), "volHold", 0);
        setIntField(term349318, term349318.getClass(), "volSide", 0);
        setIntField(term349318, term349318.getClass(), "volFlick", 0);
        setIntField(term349318, term349318.getClass(), "volBell", 0);
        setIntField(term349318, term349318.getClass(), "volEnemy", 0);
        setIntField(term349318, term349318.getClass(), "volSkill", 0);
        setIntField(term349318, term349318.getClass(), "volDamage", 0);
        setIntField(term349318, term349318.getClass(), "colorField", 0);
        setIntField(term349318, term349318.getClass(), "colorLaneBright", 0);
        setIntField(term349318, term349318.getClass(), "colorWallBright", 0);
        setIntField(term349318, term349318.getClass(), "colorLane", 0);
        setIntField(term349318, term349318.getClass(), "colorSide", 0);
        setIntField(term349318, term349318.getClass(), "effectDamage", 0);
        setIntField(term349318, term349318.getClass(), "effectPos", 0);
        setIntField(term349318, term349318.getClass(), "judgeDisp", 0);
        setIntField(term349318, term349318.getClass(), "judgePos", 0);
        setIntField(term349318, term349318.getClass(), "judgeBreak", 0);
        setIntField(term349318, term349318.getClass(), "judgeHit", 0);
        setIntField(term349318, term349318.getClass(), "platinumBreakDisp", 0);
        setIntField(term349318, term349318.getClass(), "judgeCriticalBreak", 0);
        setIntField(term349318, term349318.getClass(), "matching", 0);
        setIntField(term349318, term349318.getClass(), "dispPlayerLv", 0);
        setIntField(term349318, term349318.getClass(), "dispRating", 0);
        setIntField(term349318, term349318.getClass(), "dispBP", 0);
        setIntField(term349318, term349318.getClass(), "headphone", 0);
        term349357 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term349357;
        callMethod(klass, "setId", argTypes, term349318, args);
    }

};



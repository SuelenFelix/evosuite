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

public class UserOption_setVolFlick_1648322669141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349972;
     Object term350011;

    public UserOption_setVolFlick_1648322669141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349972 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term349972, term349972.getClass(), "id", 0L);
        setField(term349972, term349972.getClass(), "user", null);
        setIntField(term349972, term349972.getClass(), "optionSet", 0);
        setIntField(term349972, term349972.getClass(), "speed", 0);
        setIntField(term349972, term349972.getClass(), "mirror", 0);
        setIntField(term349972, term349972.getClass(), "judgeTiming", 0);
        setIntField(term349972, term349972.getClass(), "judgeAdjustment", 0);
        setIntField(term349972, term349972.getClass(), "abort", 0);
        setIntField(term349972, term349972.getClass(), "stealthField", 0);
        setIntField(term349972, term349972.getClass(), "tapSound", 0);
        setIntField(term349972, term349972.getClass(), "volGuide", 0);
        setIntField(term349972, term349972.getClass(), "volAll", 0);
        setIntField(term349972, term349972.getClass(), "volTap", 0);
        setIntField(term349972, term349972.getClass(), "volCrTap", 0);
        setIntField(term349972, term349972.getClass(), "volHold", 0);
        setIntField(term349972, term349972.getClass(), "volSide", 0);
        setIntField(term349972, term349972.getClass(), "volFlick", 0);
        setIntField(term349972, term349972.getClass(), "volBell", 0);
        setIntField(term349972, term349972.getClass(), "volEnemy", 0);
        setIntField(term349972, term349972.getClass(), "volSkill", 0);
        setIntField(term349972, term349972.getClass(), "volDamage", 0);
        setIntField(term349972, term349972.getClass(), "colorField", 0);
        setIntField(term349972, term349972.getClass(), "colorLaneBright", 0);
        setIntField(term349972, term349972.getClass(), "colorWallBright", 0);
        setIntField(term349972, term349972.getClass(), "colorLane", 0);
        setIntField(term349972, term349972.getClass(), "colorSide", 0);
        setIntField(term349972, term349972.getClass(), "effectDamage", 0);
        setIntField(term349972, term349972.getClass(), "effectPos", 0);
        setIntField(term349972, term349972.getClass(), "judgeDisp", 0);
        setIntField(term349972, term349972.getClass(), "judgePos", 0);
        setIntField(term349972, term349972.getClass(), "judgeBreak", 0);
        setIntField(term349972, term349972.getClass(), "judgeHit", 0);
        setIntField(term349972, term349972.getClass(), "platinumBreakDisp", 0);
        setIntField(term349972, term349972.getClass(), "judgeCriticalBreak", 0);
        setIntField(term349972, term349972.getClass(), "matching", 0);
        setIntField(term349972, term349972.getClass(), "dispPlayerLv", 0);
        setIntField(term349972, term349972.getClass(), "dispRating", 0);
        setIntField(term349972, term349972.getClass(), "dispBP", 0);
        setIntField(term349972, term349972.getClass(), "headphone", 0);
        term350011 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term350011;
        callMethod(klass, "setVolFlick", argTypes, term349972, args);
    }

};



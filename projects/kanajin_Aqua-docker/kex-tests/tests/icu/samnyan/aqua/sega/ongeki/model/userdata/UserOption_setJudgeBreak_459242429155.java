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

public class UserOption_setJudgeBreak_459242429155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350546;
     Object term350585;

    public UserOption_setJudgeBreak_459242429155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350546 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term350546, term350546.getClass(), "id", 0L);
        setField(term350546, term350546.getClass(), "user", null);
        setIntField(term350546, term350546.getClass(), "optionSet", 0);
        setIntField(term350546, term350546.getClass(), "speed", 0);
        setIntField(term350546, term350546.getClass(), "mirror", 0);
        setIntField(term350546, term350546.getClass(), "judgeTiming", 0);
        setIntField(term350546, term350546.getClass(), "judgeAdjustment", 0);
        setIntField(term350546, term350546.getClass(), "abort", 0);
        setIntField(term350546, term350546.getClass(), "stealthField", 0);
        setIntField(term350546, term350546.getClass(), "tapSound", 0);
        setIntField(term350546, term350546.getClass(), "volGuide", 0);
        setIntField(term350546, term350546.getClass(), "volAll", 0);
        setIntField(term350546, term350546.getClass(), "volTap", 0);
        setIntField(term350546, term350546.getClass(), "volCrTap", 0);
        setIntField(term350546, term350546.getClass(), "volHold", 0);
        setIntField(term350546, term350546.getClass(), "volSide", 0);
        setIntField(term350546, term350546.getClass(), "volFlick", 0);
        setIntField(term350546, term350546.getClass(), "volBell", 0);
        setIntField(term350546, term350546.getClass(), "volEnemy", 0);
        setIntField(term350546, term350546.getClass(), "volSkill", 0);
        setIntField(term350546, term350546.getClass(), "volDamage", 0);
        setIntField(term350546, term350546.getClass(), "colorField", 0);
        setIntField(term350546, term350546.getClass(), "colorLaneBright", 0);
        setIntField(term350546, term350546.getClass(), "colorWallBright", 0);
        setIntField(term350546, term350546.getClass(), "colorLane", 0);
        setIntField(term350546, term350546.getClass(), "colorSide", 0);
        setIntField(term350546, term350546.getClass(), "effectDamage", 0);
        setIntField(term350546, term350546.getClass(), "effectPos", 0);
        setIntField(term350546, term350546.getClass(), "judgeDisp", 0);
        setIntField(term350546, term350546.getClass(), "judgePos", 0);
        setIntField(term350546, term350546.getClass(), "judgeBreak", 0);
        setIntField(term350546, term350546.getClass(), "judgeHit", 0);
        setIntField(term350546, term350546.getClass(), "platinumBreakDisp", 0);
        setIntField(term350546, term350546.getClass(), "judgeCriticalBreak", 0);
        setIntField(term350546, term350546.getClass(), "matching", 0);
        setIntField(term350546, term350546.getClass(), "dispPlayerLv", 0);
        setIntField(term350546, term350546.getClass(), "dispRating", 0);
        setIntField(term350546, term350546.getClass(), "dispBP", 0);
        setIntField(term350546, term350546.getClass(), "headphone", 0);
        term350585 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term350585;
        callMethod(klass, "setJudgeBreak", argTypes, term350546, args);
    }

};



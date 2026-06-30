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

public class UserOption_setTapSound_294526265134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349685;
     Object term349724;

    public UserOption_setTapSound_294526265134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349685 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term349685, term349685.getClass(), "id", 0L);
        setField(term349685, term349685.getClass(), "user", null);
        setIntField(term349685, term349685.getClass(), "optionSet", 0);
        setIntField(term349685, term349685.getClass(), "speed", 0);
        setIntField(term349685, term349685.getClass(), "mirror", 0);
        setIntField(term349685, term349685.getClass(), "judgeTiming", 0);
        setIntField(term349685, term349685.getClass(), "judgeAdjustment", 0);
        setIntField(term349685, term349685.getClass(), "abort", 0);
        setIntField(term349685, term349685.getClass(), "stealthField", 0);
        setIntField(term349685, term349685.getClass(), "tapSound", 0);
        setIntField(term349685, term349685.getClass(), "volGuide", 0);
        setIntField(term349685, term349685.getClass(), "volAll", 0);
        setIntField(term349685, term349685.getClass(), "volTap", 0);
        setIntField(term349685, term349685.getClass(), "volCrTap", 0);
        setIntField(term349685, term349685.getClass(), "volHold", 0);
        setIntField(term349685, term349685.getClass(), "volSide", 0);
        setIntField(term349685, term349685.getClass(), "volFlick", 0);
        setIntField(term349685, term349685.getClass(), "volBell", 0);
        setIntField(term349685, term349685.getClass(), "volEnemy", 0);
        setIntField(term349685, term349685.getClass(), "volSkill", 0);
        setIntField(term349685, term349685.getClass(), "volDamage", 0);
        setIntField(term349685, term349685.getClass(), "colorField", 0);
        setIntField(term349685, term349685.getClass(), "colorLaneBright", 0);
        setIntField(term349685, term349685.getClass(), "colorWallBright", 0);
        setIntField(term349685, term349685.getClass(), "colorLane", 0);
        setIntField(term349685, term349685.getClass(), "colorSide", 0);
        setIntField(term349685, term349685.getClass(), "effectDamage", 0);
        setIntField(term349685, term349685.getClass(), "effectPos", 0);
        setIntField(term349685, term349685.getClass(), "judgeDisp", 0);
        setIntField(term349685, term349685.getClass(), "judgePos", 0);
        setIntField(term349685, term349685.getClass(), "judgeBreak", 0);
        setIntField(term349685, term349685.getClass(), "judgeHit", 0);
        setIntField(term349685, term349685.getClass(), "platinumBreakDisp", 0);
        setIntField(term349685, term349685.getClass(), "judgeCriticalBreak", 0);
        setIntField(term349685, term349685.getClass(), "matching", 0);
        setIntField(term349685, term349685.getClass(), "dispPlayerLv", 0);
        setIntField(term349685, term349685.getClass(), "dispRating", 0);
        setIntField(term349685, term349685.getClass(), "dispBP", 0);
        setIntField(term349685, term349685.getClass(), "headphone", 0);
        term349724 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term349724;
        callMethod(klass, "setTapSound", argTypes, term349685, args);
    }

};



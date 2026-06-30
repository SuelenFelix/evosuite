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

public class UserOption_setMirror_1031493862129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349480;
     Object term349519;

    public UserOption_setMirror_1031493862129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349480 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term349480, term349480.getClass(), "id", 0L);
        setField(term349480, term349480.getClass(), "user", null);
        setIntField(term349480, term349480.getClass(), "optionSet", 0);
        setIntField(term349480, term349480.getClass(), "speed", 0);
        setIntField(term349480, term349480.getClass(), "mirror", 0);
        setIntField(term349480, term349480.getClass(), "judgeTiming", 0);
        setIntField(term349480, term349480.getClass(), "judgeAdjustment", 0);
        setIntField(term349480, term349480.getClass(), "abort", 0);
        setIntField(term349480, term349480.getClass(), "stealthField", 0);
        setIntField(term349480, term349480.getClass(), "tapSound", 0);
        setIntField(term349480, term349480.getClass(), "volGuide", 0);
        setIntField(term349480, term349480.getClass(), "volAll", 0);
        setIntField(term349480, term349480.getClass(), "volTap", 0);
        setIntField(term349480, term349480.getClass(), "volCrTap", 0);
        setIntField(term349480, term349480.getClass(), "volHold", 0);
        setIntField(term349480, term349480.getClass(), "volSide", 0);
        setIntField(term349480, term349480.getClass(), "volFlick", 0);
        setIntField(term349480, term349480.getClass(), "volBell", 0);
        setIntField(term349480, term349480.getClass(), "volEnemy", 0);
        setIntField(term349480, term349480.getClass(), "volSkill", 0);
        setIntField(term349480, term349480.getClass(), "volDamage", 0);
        setIntField(term349480, term349480.getClass(), "colorField", 0);
        setIntField(term349480, term349480.getClass(), "colorLaneBright", 0);
        setIntField(term349480, term349480.getClass(), "colorWallBright", 0);
        setIntField(term349480, term349480.getClass(), "colorLane", 0);
        setIntField(term349480, term349480.getClass(), "colorSide", 0);
        setIntField(term349480, term349480.getClass(), "effectDamage", 0);
        setIntField(term349480, term349480.getClass(), "effectPos", 0);
        setIntField(term349480, term349480.getClass(), "judgeDisp", 0);
        setIntField(term349480, term349480.getClass(), "judgePos", 0);
        setIntField(term349480, term349480.getClass(), "judgeBreak", 0);
        setIntField(term349480, term349480.getClass(), "judgeHit", 0);
        setIntField(term349480, term349480.getClass(), "platinumBreakDisp", 0);
        setIntField(term349480, term349480.getClass(), "judgeCriticalBreak", 0);
        setIntField(term349480, term349480.getClass(), "matching", 0);
        setIntField(term349480, term349480.getClass(), "dispPlayerLv", 0);
        setIntField(term349480, term349480.getClass(), "dispRating", 0);
        setIntField(term349480, term349480.getClass(), "dispBP", 0);
        setIntField(term349480, term349480.getClass(), "headphone", 0);
        term349519 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term349519;
        callMethod(klass, "setMirror", argTypes, term349480, args);
    }

};



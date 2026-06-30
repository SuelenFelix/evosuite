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

public class UserOption_canEqual_332841066165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350954;

    public UserOption_canEqual_332841066165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350954 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term350954, term350954.getClass(), "id", 0L);
        setField(term350954, term350954.getClass(), "user", null);
        setIntField(term350954, term350954.getClass(), "optionSet", 0);
        setIntField(term350954, term350954.getClass(), "speed", 0);
        setIntField(term350954, term350954.getClass(), "mirror", 0);
        setIntField(term350954, term350954.getClass(), "judgeTiming", 0);
        setIntField(term350954, term350954.getClass(), "judgeAdjustment", 0);
        setIntField(term350954, term350954.getClass(), "abort", 0);
        setIntField(term350954, term350954.getClass(), "stealthField", 0);
        setIntField(term350954, term350954.getClass(), "tapSound", 0);
        setIntField(term350954, term350954.getClass(), "volGuide", 0);
        setIntField(term350954, term350954.getClass(), "volAll", 0);
        setIntField(term350954, term350954.getClass(), "volTap", 0);
        setIntField(term350954, term350954.getClass(), "volCrTap", 0);
        setIntField(term350954, term350954.getClass(), "volHold", 0);
        setIntField(term350954, term350954.getClass(), "volSide", 0);
        setIntField(term350954, term350954.getClass(), "volFlick", 0);
        setIntField(term350954, term350954.getClass(), "volBell", 0);
        setIntField(term350954, term350954.getClass(), "volEnemy", 0);
        setIntField(term350954, term350954.getClass(), "volSkill", 0);
        setIntField(term350954, term350954.getClass(), "volDamage", 0);
        setIntField(term350954, term350954.getClass(), "colorField", 0);
        setIntField(term350954, term350954.getClass(), "colorLaneBright", 0);
        setIntField(term350954, term350954.getClass(), "colorWallBright", 0);
        setIntField(term350954, term350954.getClass(), "colorLane", 0);
        setIntField(term350954, term350954.getClass(), "colorSide", 0);
        setIntField(term350954, term350954.getClass(), "effectDamage", 0);
        setIntField(term350954, term350954.getClass(), "effectPos", 0);
        setIntField(term350954, term350954.getClass(), "judgeDisp", 0);
        setIntField(term350954, term350954.getClass(), "judgePos", 0);
        setIntField(term350954, term350954.getClass(), "judgeBreak", 0);
        setIntField(term350954, term350954.getClass(), "judgeHit", 0);
        setIntField(term350954, term350954.getClass(), "platinumBreakDisp", 0);
        setIntField(term350954, term350954.getClass(), "judgeCriticalBreak", 0);
        setIntField(term350954, term350954.getClass(), "matching", 0);
        setIntField(term350954, term350954.getClass(), "dispPlayerLv", 0);
        setIntField(term350954, term350954.getClass(), "dispRating", 0);
        setIntField(term350954, term350954.getClass(), "dispBP", 0);
        setIntField(term350954, term350954.getClass(), "headphone", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term350954, args);
    }

};



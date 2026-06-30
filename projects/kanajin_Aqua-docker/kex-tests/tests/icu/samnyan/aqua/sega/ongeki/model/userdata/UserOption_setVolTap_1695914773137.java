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

public class UserOption_setVolTap_1695914773137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349808;
     Object term349847;

    public UserOption_setVolTap_1695914773137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349808 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term349808, term349808.getClass(), "id", 0L);
        setField(term349808, term349808.getClass(), "user", null);
        setIntField(term349808, term349808.getClass(), "optionSet", 0);
        setIntField(term349808, term349808.getClass(), "speed", 0);
        setIntField(term349808, term349808.getClass(), "mirror", 0);
        setIntField(term349808, term349808.getClass(), "judgeTiming", 0);
        setIntField(term349808, term349808.getClass(), "judgeAdjustment", 0);
        setIntField(term349808, term349808.getClass(), "abort", 0);
        setIntField(term349808, term349808.getClass(), "stealthField", 0);
        setIntField(term349808, term349808.getClass(), "tapSound", 0);
        setIntField(term349808, term349808.getClass(), "volGuide", 0);
        setIntField(term349808, term349808.getClass(), "volAll", 0);
        setIntField(term349808, term349808.getClass(), "volTap", 0);
        setIntField(term349808, term349808.getClass(), "volCrTap", 0);
        setIntField(term349808, term349808.getClass(), "volHold", 0);
        setIntField(term349808, term349808.getClass(), "volSide", 0);
        setIntField(term349808, term349808.getClass(), "volFlick", 0);
        setIntField(term349808, term349808.getClass(), "volBell", 0);
        setIntField(term349808, term349808.getClass(), "volEnemy", 0);
        setIntField(term349808, term349808.getClass(), "volSkill", 0);
        setIntField(term349808, term349808.getClass(), "volDamage", 0);
        setIntField(term349808, term349808.getClass(), "colorField", 0);
        setIntField(term349808, term349808.getClass(), "colorLaneBright", 0);
        setIntField(term349808, term349808.getClass(), "colorWallBright", 0);
        setIntField(term349808, term349808.getClass(), "colorLane", 0);
        setIntField(term349808, term349808.getClass(), "colorSide", 0);
        setIntField(term349808, term349808.getClass(), "effectDamage", 0);
        setIntField(term349808, term349808.getClass(), "effectPos", 0);
        setIntField(term349808, term349808.getClass(), "judgeDisp", 0);
        setIntField(term349808, term349808.getClass(), "judgePos", 0);
        setIntField(term349808, term349808.getClass(), "judgeBreak", 0);
        setIntField(term349808, term349808.getClass(), "judgeHit", 0);
        setIntField(term349808, term349808.getClass(), "platinumBreakDisp", 0);
        setIntField(term349808, term349808.getClass(), "judgeCriticalBreak", 0);
        setIntField(term349808, term349808.getClass(), "matching", 0);
        setIntField(term349808, term349808.getClass(), "dispPlayerLv", 0);
        setIntField(term349808, term349808.getClass(), "dispRating", 0);
        setIntField(term349808, term349808.getClass(), "dispBP", 0);
        setIntField(term349808, term349808.getClass(), "headphone", 0);
        term349847 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term349847;
        callMethod(klass, "setVolTap", argTypes, term349808, args);
    }

};



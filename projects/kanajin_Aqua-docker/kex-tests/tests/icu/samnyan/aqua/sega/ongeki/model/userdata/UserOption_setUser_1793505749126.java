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

public class UserOption_setUser_1793505749126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349359;

    public UserOption_setUser_1793505749126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349359 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term349359, term349359.getClass(), "id", 0L);
        setField(term349359, term349359.getClass(), "user", null);
        setIntField(term349359, term349359.getClass(), "optionSet", 0);
        setIntField(term349359, term349359.getClass(), "speed", 0);
        setIntField(term349359, term349359.getClass(), "mirror", 0);
        setIntField(term349359, term349359.getClass(), "judgeTiming", 0);
        setIntField(term349359, term349359.getClass(), "judgeAdjustment", 0);
        setIntField(term349359, term349359.getClass(), "abort", 0);
        setIntField(term349359, term349359.getClass(), "stealthField", 0);
        setIntField(term349359, term349359.getClass(), "tapSound", 0);
        setIntField(term349359, term349359.getClass(), "volGuide", 0);
        setIntField(term349359, term349359.getClass(), "volAll", 0);
        setIntField(term349359, term349359.getClass(), "volTap", 0);
        setIntField(term349359, term349359.getClass(), "volCrTap", 0);
        setIntField(term349359, term349359.getClass(), "volHold", 0);
        setIntField(term349359, term349359.getClass(), "volSide", 0);
        setIntField(term349359, term349359.getClass(), "volFlick", 0);
        setIntField(term349359, term349359.getClass(), "volBell", 0);
        setIntField(term349359, term349359.getClass(), "volEnemy", 0);
        setIntField(term349359, term349359.getClass(), "volSkill", 0);
        setIntField(term349359, term349359.getClass(), "volDamage", 0);
        setIntField(term349359, term349359.getClass(), "colorField", 0);
        setIntField(term349359, term349359.getClass(), "colorLaneBright", 0);
        setIntField(term349359, term349359.getClass(), "colorWallBright", 0);
        setIntField(term349359, term349359.getClass(), "colorLane", 0);
        setIntField(term349359, term349359.getClass(), "colorSide", 0);
        setIntField(term349359, term349359.getClass(), "effectDamage", 0);
        setIntField(term349359, term349359.getClass(), "effectPos", 0);
        setIntField(term349359, term349359.getClass(), "judgeDisp", 0);
        setIntField(term349359, term349359.getClass(), "judgePos", 0);
        setIntField(term349359, term349359.getClass(), "judgeBreak", 0);
        setIntField(term349359, term349359.getClass(), "judgeHit", 0);
        setIntField(term349359, term349359.getClass(), "platinumBreakDisp", 0);
        setIntField(term349359, term349359.getClass(), "judgeCriticalBreak", 0);
        setIntField(term349359, term349359.getClass(), "matching", 0);
        setIntField(term349359, term349359.getClass(), "dispPlayerLv", 0);
        setIntField(term349359, term349359.getClass(), "dispRating", 0);
        setIntField(term349359, term349359.getClass(), "dispBP", 0);
        setIntField(term349359, term349359.getClass(), "headphone", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term349359, args);
    }

};



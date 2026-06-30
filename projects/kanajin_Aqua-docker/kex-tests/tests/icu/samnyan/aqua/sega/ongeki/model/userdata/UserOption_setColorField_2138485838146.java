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

public class UserOption_setColorField_2138485838146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350177;
     Object term350216;

    public UserOption_setColorField_2138485838146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350177 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term350177, term350177.getClass(), "id", 0L);
        setField(term350177, term350177.getClass(), "user", null);
        setIntField(term350177, term350177.getClass(), "optionSet", 0);
        setIntField(term350177, term350177.getClass(), "speed", 0);
        setIntField(term350177, term350177.getClass(), "mirror", 0);
        setIntField(term350177, term350177.getClass(), "judgeTiming", 0);
        setIntField(term350177, term350177.getClass(), "judgeAdjustment", 0);
        setIntField(term350177, term350177.getClass(), "abort", 0);
        setIntField(term350177, term350177.getClass(), "stealthField", 0);
        setIntField(term350177, term350177.getClass(), "tapSound", 0);
        setIntField(term350177, term350177.getClass(), "volGuide", 0);
        setIntField(term350177, term350177.getClass(), "volAll", 0);
        setIntField(term350177, term350177.getClass(), "volTap", 0);
        setIntField(term350177, term350177.getClass(), "volCrTap", 0);
        setIntField(term350177, term350177.getClass(), "volHold", 0);
        setIntField(term350177, term350177.getClass(), "volSide", 0);
        setIntField(term350177, term350177.getClass(), "volFlick", 0);
        setIntField(term350177, term350177.getClass(), "volBell", 0);
        setIntField(term350177, term350177.getClass(), "volEnemy", 0);
        setIntField(term350177, term350177.getClass(), "volSkill", 0);
        setIntField(term350177, term350177.getClass(), "volDamage", 0);
        setIntField(term350177, term350177.getClass(), "colorField", 0);
        setIntField(term350177, term350177.getClass(), "colorLaneBright", 0);
        setIntField(term350177, term350177.getClass(), "colorWallBright", 0);
        setIntField(term350177, term350177.getClass(), "colorLane", 0);
        setIntField(term350177, term350177.getClass(), "colorSide", 0);
        setIntField(term350177, term350177.getClass(), "effectDamage", 0);
        setIntField(term350177, term350177.getClass(), "effectPos", 0);
        setIntField(term350177, term350177.getClass(), "judgeDisp", 0);
        setIntField(term350177, term350177.getClass(), "judgePos", 0);
        setIntField(term350177, term350177.getClass(), "judgeBreak", 0);
        setIntField(term350177, term350177.getClass(), "judgeHit", 0);
        setIntField(term350177, term350177.getClass(), "platinumBreakDisp", 0);
        setIntField(term350177, term350177.getClass(), "judgeCriticalBreak", 0);
        setIntField(term350177, term350177.getClass(), "matching", 0);
        setIntField(term350177, term350177.getClass(), "dispPlayerLv", 0);
        setIntField(term350177, term350177.getClass(), "dispRating", 0);
        setIntField(term350177, term350177.getClass(), "dispBP", 0);
        setIntField(term350177, term350177.getClass(), "headphone", 0);
        term350216 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term350216;
        callMethod(klass, "setColorField", argTypes, term350177, args);
    }

};



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

public class UserOption_setColorSide_1069937585150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350341;
     Object term350380;

    public UserOption_setColorSide_1069937585150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350341 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term350341, term350341.getClass(), "id", 0L);
        setField(term350341, term350341.getClass(), "user", null);
        setIntField(term350341, term350341.getClass(), "optionSet", 0);
        setIntField(term350341, term350341.getClass(), "speed", 0);
        setIntField(term350341, term350341.getClass(), "mirror", 0);
        setIntField(term350341, term350341.getClass(), "judgeTiming", 0);
        setIntField(term350341, term350341.getClass(), "judgeAdjustment", 0);
        setIntField(term350341, term350341.getClass(), "abort", 0);
        setIntField(term350341, term350341.getClass(), "stealthField", 0);
        setIntField(term350341, term350341.getClass(), "tapSound", 0);
        setIntField(term350341, term350341.getClass(), "volGuide", 0);
        setIntField(term350341, term350341.getClass(), "volAll", 0);
        setIntField(term350341, term350341.getClass(), "volTap", 0);
        setIntField(term350341, term350341.getClass(), "volCrTap", 0);
        setIntField(term350341, term350341.getClass(), "volHold", 0);
        setIntField(term350341, term350341.getClass(), "volSide", 0);
        setIntField(term350341, term350341.getClass(), "volFlick", 0);
        setIntField(term350341, term350341.getClass(), "volBell", 0);
        setIntField(term350341, term350341.getClass(), "volEnemy", 0);
        setIntField(term350341, term350341.getClass(), "volSkill", 0);
        setIntField(term350341, term350341.getClass(), "volDamage", 0);
        setIntField(term350341, term350341.getClass(), "colorField", 0);
        setIntField(term350341, term350341.getClass(), "colorLaneBright", 0);
        setIntField(term350341, term350341.getClass(), "colorWallBright", 0);
        setIntField(term350341, term350341.getClass(), "colorLane", 0);
        setIntField(term350341, term350341.getClass(), "colorSide", 0);
        setIntField(term350341, term350341.getClass(), "effectDamage", 0);
        setIntField(term350341, term350341.getClass(), "effectPos", 0);
        setIntField(term350341, term350341.getClass(), "judgeDisp", 0);
        setIntField(term350341, term350341.getClass(), "judgePos", 0);
        setIntField(term350341, term350341.getClass(), "judgeBreak", 0);
        setIntField(term350341, term350341.getClass(), "judgeHit", 0);
        setIntField(term350341, term350341.getClass(), "platinumBreakDisp", 0);
        setIntField(term350341, term350341.getClass(), "judgeCriticalBreak", 0);
        setIntField(term350341, term350341.getClass(), "matching", 0);
        setIntField(term350341, term350341.getClass(), "dispPlayerLv", 0);
        setIntField(term350341, term350341.getClass(), "dispRating", 0);
        setIntField(term350341, term350341.getClass(), "dispBP", 0);
        setIntField(term350341, term350341.getClass(), "headphone", 0);
        term350380 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term350380;
        callMethod(klass, "setColorSide", argTypes, term350341, args);
    }

};



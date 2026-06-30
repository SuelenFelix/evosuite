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

public class UserOption_getJudgeHit_93167211117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349006;

    public UserOption_getJudgeHit_93167211117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349006 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term349006, term349006.getClass(), "id", 0L);
        setField(term349006, term349006.getClass(), "user", null);
        setIntField(term349006, term349006.getClass(), "optionSet", 0);
        setIntField(term349006, term349006.getClass(), "speed", 0);
        setIntField(term349006, term349006.getClass(), "mirror", 0);
        setIntField(term349006, term349006.getClass(), "judgeTiming", 0);
        setIntField(term349006, term349006.getClass(), "judgeAdjustment", 0);
        setIntField(term349006, term349006.getClass(), "abort", 0);
        setIntField(term349006, term349006.getClass(), "stealthField", 0);
        setIntField(term349006, term349006.getClass(), "tapSound", 0);
        setIntField(term349006, term349006.getClass(), "volGuide", 0);
        setIntField(term349006, term349006.getClass(), "volAll", 0);
        setIntField(term349006, term349006.getClass(), "volTap", 0);
        setIntField(term349006, term349006.getClass(), "volCrTap", 0);
        setIntField(term349006, term349006.getClass(), "volHold", 0);
        setIntField(term349006, term349006.getClass(), "volSide", 0);
        setIntField(term349006, term349006.getClass(), "volFlick", 0);
        setIntField(term349006, term349006.getClass(), "volBell", 0);
        setIntField(term349006, term349006.getClass(), "volEnemy", 0);
        setIntField(term349006, term349006.getClass(), "volSkill", 0);
        setIntField(term349006, term349006.getClass(), "volDamage", 0);
        setIntField(term349006, term349006.getClass(), "colorField", 0);
        setIntField(term349006, term349006.getClass(), "colorLaneBright", 0);
        setIntField(term349006, term349006.getClass(), "colorWallBright", 0);
        setIntField(term349006, term349006.getClass(), "colorLane", 0);
        setIntField(term349006, term349006.getClass(), "colorSide", 0);
        setIntField(term349006, term349006.getClass(), "effectDamage", 0);
        setIntField(term349006, term349006.getClass(), "effectPos", 0);
        setIntField(term349006, term349006.getClass(), "judgeDisp", 0);
        setIntField(term349006, term349006.getClass(), "judgePos", 0);
        setIntField(term349006, term349006.getClass(), "judgeBreak", 0);
        setIntField(term349006, term349006.getClass(), "judgeHit", 0);
        setIntField(term349006, term349006.getClass(), "platinumBreakDisp", 0);
        setIntField(term349006, term349006.getClass(), "judgeCriticalBreak", 0);
        setIntField(term349006, term349006.getClass(), "matching", 0);
        setIntField(term349006, term349006.getClass(), "dispPlayerLv", 0);
        setIntField(term349006, term349006.getClass(), "dispRating", 0);
        setIntField(term349006, term349006.getClass(), "dispBP", 0);
        setIntField(term349006, term349006.getClass(), "headphone", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeHit", argTypes, term349006, args);
    }

};



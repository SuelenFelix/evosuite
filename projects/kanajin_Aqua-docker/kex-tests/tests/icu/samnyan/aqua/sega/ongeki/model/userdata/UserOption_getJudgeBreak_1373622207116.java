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

public class UserOption_getJudgeBreak_1373622207116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348967;

    public UserOption_getJudgeBreak_1373622207116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348967 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term348967, term348967.getClass(), "id", 0L);
        setField(term348967, term348967.getClass(), "user", null);
        setIntField(term348967, term348967.getClass(), "optionSet", 0);
        setIntField(term348967, term348967.getClass(), "speed", 0);
        setIntField(term348967, term348967.getClass(), "mirror", 0);
        setIntField(term348967, term348967.getClass(), "judgeTiming", 0);
        setIntField(term348967, term348967.getClass(), "judgeAdjustment", 0);
        setIntField(term348967, term348967.getClass(), "abort", 0);
        setIntField(term348967, term348967.getClass(), "stealthField", 0);
        setIntField(term348967, term348967.getClass(), "tapSound", 0);
        setIntField(term348967, term348967.getClass(), "volGuide", 0);
        setIntField(term348967, term348967.getClass(), "volAll", 0);
        setIntField(term348967, term348967.getClass(), "volTap", 0);
        setIntField(term348967, term348967.getClass(), "volCrTap", 0);
        setIntField(term348967, term348967.getClass(), "volHold", 0);
        setIntField(term348967, term348967.getClass(), "volSide", 0);
        setIntField(term348967, term348967.getClass(), "volFlick", 0);
        setIntField(term348967, term348967.getClass(), "volBell", 0);
        setIntField(term348967, term348967.getClass(), "volEnemy", 0);
        setIntField(term348967, term348967.getClass(), "volSkill", 0);
        setIntField(term348967, term348967.getClass(), "volDamage", 0);
        setIntField(term348967, term348967.getClass(), "colorField", 0);
        setIntField(term348967, term348967.getClass(), "colorLaneBright", 0);
        setIntField(term348967, term348967.getClass(), "colorWallBright", 0);
        setIntField(term348967, term348967.getClass(), "colorLane", 0);
        setIntField(term348967, term348967.getClass(), "colorSide", 0);
        setIntField(term348967, term348967.getClass(), "effectDamage", 0);
        setIntField(term348967, term348967.getClass(), "effectPos", 0);
        setIntField(term348967, term348967.getClass(), "judgeDisp", 0);
        setIntField(term348967, term348967.getClass(), "judgePos", 0);
        setIntField(term348967, term348967.getClass(), "judgeBreak", 0);
        setIntField(term348967, term348967.getClass(), "judgeHit", 0);
        setIntField(term348967, term348967.getClass(), "platinumBreakDisp", 0);
        setIntField(term348967, term348967.getClass(), "judgeCriticalBreak", 0);
        setIntField(term348967, term348967.getClass(), "matching", 0);
        setIntField(term348967, term348967.getClass(), "dispPlayerLv", 0);
        setIntField(term348967, term348967.getClass(), "dispRating", 0);
        setIntField(term348967, term348967.getClass(), "dispBP", 0);
        setIntField(term348967, term348967.getClass(), "headphone", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeBreak", argTypes, term348967, args);
    }

};



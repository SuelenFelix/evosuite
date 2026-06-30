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

public class UserOption_getVolEnemy_1035258062104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348499;

    public UserOption_getVolEnemy_1035258062104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348499 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term348499, term348499.getClass(), "id", 0L);
        setField(term348499, term348499.getClass(), "user", null);
        setIntField(term348499, term348499.getClass(), "optionSet", 0);
        setIntField(term348499, term348499.getClass(), "speed", 0);
        setIntField(term348499, term348499.getClass(), "mirror", 0);
        setIntField(term348499, term348499.getClass(), "judgeTiming", 0);
        setIntField(term348499, term348499.getClass(), "judgeAdjustment", 0);
        setIntField(term348499, term348499.getClass(), "abort", 0);
        setIntField(term348499, term348499.getClass(), "stealthField", 0);
        setIntField(term348499, term348499.getClass(), "tapSound", 0);
        setIntField(term348499, term348499.getClass(), "volGuide", 0);
        setIntField(term348499, term348499.getClass(), "volAll", 0);
        setIntField(term348499, term348499.getClass(), "volTap", 0);
        setIntField(term348499, term348499.getClass(), "volCrTap", 0);
        setIntField(term348499, term348499.getClass(), "volHold", 0);
        setIntField(term348499, term348499.getClass(), "volSide", 0);
        setIntField(term348499, term348499.getClass(), "volFlick", 0);
        setIntField(term348499, term348499.getClass(), "volBell", 0);
        setIntField(term348499, term348499.getClass(), "volEnemy", 0);
        setIntField(term348499, term348499.getClass(), "volSkill", 0);
        setIntField(term348499, term348499.getClass(), "volDamage", 0);
        setIntField(term348499, term348499.getClass(), "colorField", 0);
        setIntField(term348499, term348499.getClass(), "colorLaneBright", 0);
        setIntField(term348499, term348499.getClass(), "colorWallBright", 0);
        setIntField(term348499, term348499.getClass(), "colorLane", 0);
        setIntField(term348499, term348499.getClass(), "colorSide", 0);
        setIntField(term348499, term348499.getClass(), "effectDamage", 0);
        setIntField(term348499, term348499.getClass(), "effectPos", 0);
        setIntField(term348499, term348499.getClass(), "judgeDisp", 0);
        setIntField(term348499, term348499.getClass(), "judgePos", 0);
        setIntField(term348499, term348499.getClass(), "judgeBreak", 0);
        setIntField(term348499, term348499.getClass(), "judgeHit", 0);
        setIntField(term348499, term348499.getClass(), "platinumBreakDisp", 0);
        setIntField(term348499, term348499.getClass(), "judgeCriticalBreak", 0);
        setIntField(term348499, term348499.getClass(), "matching", 0);
        setIntField(term348499, term348499.getClass(), "dispPlayerLv", 0);
        setIntField(term348499, term348499.getClass(), "dispRating", 0);
        setIntField(term348499, term348499.getClass(), "dispBP", 0);
        setIntField(term348499, term348499.getClass(), "headphone", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolEnemy", argTypes, term348499, args);
    }

};



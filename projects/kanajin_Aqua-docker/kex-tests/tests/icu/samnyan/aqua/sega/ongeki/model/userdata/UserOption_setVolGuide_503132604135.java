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

public class UserOption_setVolGuide_503132604135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349726;
     Object term349765;

    public UserOption_setVolGuide_503132604135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349726 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        setLongField(term349726, term349726.getClass(), "id", 0L);
        setField(term349726, term349726.getClass(), "user", null);
        setIntField(term349726, term349726.getClass(), "optionSet", 0);
        setIntField(term349726, term349726.getClass(), "speed", 0);
        setIntField(term349726, term349726.getClass(), "mirror", 0);
        setIntField(term349726, term349726.getClass(), "judgeTiming", 0);
        setIntField(term349726, term349726.getClass(), "judgeAdjustment", 0);
        setIntField(term349726, term349726.getClass(), "abort", 0);
        setIntField(term349726, term349726.getClass(), "stealthField", 0);
        setIntField(term349726, term349726.getClass(), "tapSound", 0);
        setIntField(term349726, term349726.getClass(), "volGuide", 0);
        setIntField(term349726, term349726.getClass(), "volAll", 0);
        setIntField(term349726, term349726.getClass(), "volTap", 0);
        setIntField(term349726, term349726.getClass(), "volCrTap", 0);
        setIntField(term349726, term349726.getClass(), "volHold", 0);
        setIntField(term349726, term349726.getClass(), "volSide", 0);
        setIntField(term349726, term349726.getClass(), "volFlick", 0);
        setIntField(term349726, term349726.getClass(), "volBell", 0);
        setIntField(term349726, term349726.getClass(), "volEnemy", 0);
        setIntField(term349726, term349726.getClass(), "volSkill", 0);
        setIntField(term349726, term349726.getClass(), "volDamage", 0);
        setIntField(term349726, term349726.getClass(), "colorField", 0);
        setIntField(term349726, term349726.getClass(), "colorLaneBright", 0);
        setIntField(term349726, term349726.getClass(), "colorWallBright", 0);
        setIntField(term349726, term349726.getClass(), "colorLane", 0);
        setIntField(term349726, term349726.getClass(), "colorSide", 0);
        setIntField(term349726, term349726.getClass(), "effectDamage", 0);
        setIntField(term349726, term349726.getClass(), "effectPos", 0);
        setIntField(term349726, term349726.getClass(), "judgeDisp", 0);
        setIntField(term349726, term349726.getClass(), "judgePos", 0);
        setIntField(term349726, term349726.getClass(), "judgeBreak", 0);
        setIntField(term349726, term349726.getClass(), "judgeHit", 0);
        setIntField(term349726, term349726.getClass(), "platinumBreakDisp", 0);
        setIntField(term349726, term349726.getClass(), "judgeCriticalBreak", 0);
        setIntField(term349726, term349726.getClass(), "matching", 0);
        setIntField(term349726, term349726.getClass(), "dispPlayerLv", 0);
        setIntField(term349726, term349726.getClass(), "dispRating", 0);
        setIntField(term349726, term349726.getClass(), "dispBP", 0);
        setIntField(term349726, term349726.getClass(), "headphone", 0);
        term349765 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term349765;
        callMethod(klass, "setVolGuide", argTypes, term349726, args);
    }

};



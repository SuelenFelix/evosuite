package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Contest_getDescription_17457026886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36063;

    public Contest_getDescription_17457026886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36255 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term36254 = ((Class) term36255).getDeclaredField((String) "ADVANCED");
        ((Field) term36254).setAccessible(true);
        Object enum71 = ((Field) term36254).get((Object) null);
        Class<? extends Object> term36561 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term36560 = ((Class) term36561).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term36560).setAccessible(true);
        Object enum72 = ((Field) term36560).get((Object) null);
        term36063 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term36066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36071 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36081 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term36063, term36063.getClass(), "id", -1630069454);
        setBooleanField(term36063, term36063.getClass(), "enable", false);
        setIntField(term36067, term36067.getClass(), "year", 2020);
        setShortField(term36067, term36067.getClass(), "month", (short) 12);
        setShortField(term36067, term36067.getClass(), "day", (short) 21);
        setField(term36066, term36066.getClass(), "date", term36067);
        setByteField(term36071, term36071.getClass(), "hour", (byte) 20);
        setByteField(term36071, term36071.getClass(), "minute", (byte) 16);
        setByteField(term36071, term36071.getClass(), "second", (byte) 59);
        setIntField(term36071, term36071.getClass(), "nano", 976524801);
        setField(term36066, term36066.getClass(), "time", term36071);
        setField(term36063, term36063.getClass(), "startTime", term36066);
        setIntField(term36077, term36077.getClass(), "year", 2028);
        setShortField(term36077, term36077.getClass(), "month", (short) 5);
        setShortField(term36077, term36077.getClass(), "day", (short) 15);
        setField(term36076, term36076.getClass(), "date", term36077);
        setByteField(term36081, term36081.getClass(), "hour", (byte) 20);
        setByteField(term36081, term36081.getClass(), "minute", (byte) 31);
        setByteField(term36081, term36081.getClass(), "second", (byte) 49);
        setIntField(term36081, term36081.getClass(), "nano", 945744862);
        setField(term36076, term36076.getClass(), "time", term36081);
        setField(term36063, term36063.getClass(), "endTime", term36076);
        setField(term36063, term36063.getClass(), "name", "cFwZnaLmLP");
        setField(term36063, term36063.getClass(), "description", "cBtfnWBMkE");
        setField(term36063, term36063.getClass(), "league", enum71);
        setIntField(term36063, term36063.getClass(), "stars", 1499735894);
        setIntField(term36063, term36063.getClass(), "minComplexity", 716486048);
        setIntField(term36063, term36063.getClass(), "maxComplexity", -466708718);
        setIntField(term36063, term36063.getClass(), "stages", 1038029515);
        setField(term36063, term36063.getClass(), "stageLimit", "sFixkFlMhw");
        setField(term36063, term36063.getClass(), "normaType", enum72);
        setIntField(term36063, term36063.getClass(), "bronzeBorders", 1137154606);
        setIntField(term36063, term36063.getClass(), "sliverBorders", -100681578);
        setIntField(term36063, term36063.getClass(), "goldBorders", 296568835);
        setField(term36063, term36063.getClass(), "pvList", "wNaCYPwDGZ");
        setField(term36063, term36063.getClass(), "pvDiffList", "CFojehEtAR");
        setField(term36063, term36063.getClass(), "bronzeContestReward", "EYeLeoxDrM");
        setField(term36063, term36063.getClass(), "sliverContestReward", "zIPJJJubgX");
        setField(term36063, term36063.getClass(), "goldContestReward", "WRbxmSFTaO");
        setField(term36063, term36063.getClass(), "contestEntryReward", "ZekQCuvPXT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term36063, args);
    }

};



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

public class Contest_getBronzeContestReward_60018648319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47372;

    public Contest_getBronzeContestReward_60018648319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47559 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term47558 = ((Class) term47559).getDeclaredField((String) "BEGINNER");
        ((Field) term47558).setAccessible(true);
        Object enum97 = ((Field) term47558).get((Object) null);
        Class<? extends Object> term47865 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term47864 = ((Class) term47865).getDeclaredField((String) "PERCENTAGE");
        ((Field) term47864).setAccessible(true);
        Object enum98 = ((Field) term47864).get((Object) null);
        term47372 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term47375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47390 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47372, term47372.getClass(), "id", -932147928);
        setBooleanField(term47372, term47372.getClass(), "enable", true);
        setIntField(term47376, term47376.getClass(), "year", 2026);
        setShortField(term47376, term47376.getClass(), "month", (short) 6);
        setShortField(term47376, term47376.getClass(), "day", (short) 13);
        setField(term47375, term47375.getClass(), "date", term47376);
        setByteField(term47380, term47380.getClass(), "hour", (byte) 19);
        setByteField(term47380, term47380.getClass(), "minute", (byte) 23);
        setByteField(term47380, term47380.getClass(), "second", (byte) 46);
        setIntField(term47380, term47380.getClass(), "nano", 67955056);
        setField(term47375, term47375.getClass(), "time", term47380);
        setField(term47372, term47372.getClass(), "startTime", term47375);
        setIntField(term47386, term47386.getClass(), "year", 2013);
        setShortField(term47386, term47386.getClass(), "month", (short) 12);
        setShortField(term47386, term47386.getClass(), "day", (short) 23);
        setField(term47385, term47385.getClass(), "date", term47386);
        setByteField(term47390, term47390.getClass(), "hour", (byte) 1);
        setByteField(term47390, term47390.getClass(), "minute", (byte) 0);
        setByteField(term47390, term47390.getClass(), "second", (byte) 32);
        setIntField(term47390, term47390.getClass(), "nano", 168525686);
        setField(term47385, term47385.getClass(), "time", term47390);
        setField(term47372, term47372.getClass(), "endTime", term47385);
        setField(term47372, term47372.getClass(), "name", "GTMrlIYfIM");
        setField(term47372, term47372.getClass(), "description", "eiDqCOWbLE");
        setField(term47372, term47372.getClass(), "league", enum97);
        setIntField(term47372, term47372.getClass(), "stars", 487369012);
        setIntField(term47372, term47372.getClass(), "minComplexity", -179238712);
        setIntField(term47372, term47372.getClass(), "maxComplexity", -2018735535);
        setIntField(term47372, term47372.getClass(), "stages", -658524954);
        setField(term47372, term47372.getClass(), "stageLimit", "OBbbsrFNxC");
        setField(term47372, term47372.getClass(), "normaType", enum98);
        setIntField(term47372, term47372.getClass(), "bronzeBorders", -2009613557);
        setIntField(term47372, term47372.getClass(), "sliverBorders", 654195547);
        setIntField(term47372, term47372.getClass(), "goldBorders", 1622857008);
        setField(term47372, term47372.getClass(), "pvList", "mvdZyohjrq");
        setField(term47372, term47372.getClass(), "pvDiffList", "hXsByefZqZ");
        setField(term47372, term47372.getClass(), "bronzeContestReward", "PfWKdFFgbz");
        setField(term47372, term47372.getClass(), "sliverContestReward", "rgmFLfFmTW");
        setField(term47372, term47372.getClass(), "goldContestReward", "GHvFvelXFv");
        setField(term47372, term47372.getClass(), "contestEntryReward", "MIDoqNmCoh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBronzeContestReward", argTypes, term47372, args);
    }

};



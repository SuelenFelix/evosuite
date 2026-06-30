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

public class Contest_getStageLimit_149353518712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41265;

    public Contest_getStageLimit_149353518712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41456 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term41455 = ((Class) term41456).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term41455).setAccessible(true);
        Object enum83 = ((Field) term41455).get((Object) null);
        Class<? extends Object> term41774 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term41773 = ((Class) term41774).getDeclaredField((String) "PERCENTAGE");
        ((Field) term41773).setAccessible(true);
        Object enum84 = ((Field) term41773).get((Object) null);
        term41265 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term41268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41273 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41283 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term41265, term41265.getClass(), "id", 529625347);
        setBooleanField(term41265, term41265.getClass(), "enable", false);
        setIntField(term41269, term41269.getClass(), "year", 2021);
        setShortField(term41269, term41269.getClass(), "month", (short) 8);
        setShortField(term41269, term41269.getClass(), "day", (short) 27);
        setField(term41268, term41268.getClass(), "date", term41269);
        setByteField(term41273, term41273.getClass(), "hour", (byte) 20);
        setByteField(term41273, term41273.getClass(), "minute", (byte) 11);
        setByteField(term41273, term41273.getClass(), "second", (byte) 47);
        setIntField(term41273, term41273.getClass(), "nano", 116303493);
        setField(term41268, term41268.getClass(), "time", term41273);
        setField(term41265, term41265.getClass(), "startTime", term41268);
        setIntField(term41279, term41279.getClass(), "year", 2012);
        setShortField(term41279, term41279.getClass(), "month", (short) 5);
        setShortField(term41279, term41279.getClass(), "day", (short) 17);
        setField(term41278, term41278.getClass(), "date", term41279);
        setByteField(term41283, term41283.getClass(), "hour", (byte) 19);
        setByteField(term41283, term41283.getClass(), "minute", (byte) 36);
        setByteField(term41283, term41283.getClass(), "second", (byte) 33);
        setIntField(term41283, term41283.getClass(), "nano", 46625011);
        setField(term41278, term41278.getClass(), "time", term41283);
        setField(term41265, term41265.getClass(), "endTime", term41278);
        setField(term41265, term41265.getClass(), "name", "NNjMZLPIcc");
        setField(term41265, term41265.getClass(), "description", "fAcvTHLHOa");
        setField(term41265, term41265.getClass(), "league", enum83);
        setIntField(term41265, term41265.getClass(), "stars", 1409095253);
        setIntField(term41265, term41265.getClass(), "minComplexity", 315179039);
        setIntField(term41265, term41265.getClass(), "maxComplexity", -1835923897);
        setIntField(term41265, term41265.getClass(), "stages", -341287775);
        setField(term41265, term41265.getClass(), "stageLimit", "QavvcNVesW");
        setField(term41265, term41265.getClass(), "normaType", enum84);
        setIntField(term41265, term41265.getClass(), "bronzeBorders", -1651110911);
        setIntField(term41265, term41265.getClass(), "sliverBorders", -1934033808);
        setIntField(term41265, term41265.getClass(), "goldBorders", 950322609);
        setField(term41265, term41265.getClass(), "pvList", "JmFxhkDeIA");
        setField(term41265, term41265.getClass(), "pvDiffList", "XcJqDBnnMZ");
        setField(term41265, term41265.getClass(), "bronzeContestReward", "SchXFoqYFy");
        setField(term41265, term41265.getClass(), "sliverContestReward", "MnHKbTZBTr");
        setField(term41265, term41265.getClass(), "goldContestReward", "xCNDHQZBKx");
        setField(term41265, term41265.getClass(), "contestEntryReward", "OfXdotjbuM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStageLimit", argTypes, term41265, args);
    }

};



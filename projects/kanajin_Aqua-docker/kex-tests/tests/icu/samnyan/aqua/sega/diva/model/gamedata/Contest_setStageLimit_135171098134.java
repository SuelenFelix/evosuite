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

public class Contest_setStageLimit_135171098134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60547;

    public Contest_setStageLimit_135171098134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60741 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term60740 = ((Class) term60741).getDeclaredField((String) "ADVANCED");
        ((Field) term60740).setAccessible(true);
        Object enum127 = ((Field) term60740).get((Object) null);
        Class<? extends Object> term61047 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term61046 = ((Class) term61047).getDeclaredField((String) "SCORE");
        ((Field) term61046).setAccessible(true);
        Object enum128 = ((Field) term61046).get((Object) null);
        term60547 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term60550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60555 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60565 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term60547, term60547.getClass(), "id", 1544768934);
        setBooleanField(term60547, term60547.getClass(), "enable", true);
        setIntField(term60551, term60551.getClass(), "year", 2026);
        setShortField(term60551, term60551.getClass(), "month", (short) 9);
        setShortField(term60551, term60551.getClass(), "day", (short) 18);
        setField(term60550, term60550.getClass(), "date", term60551);
        setByteField(term60555, term60555.getClass(), "hour", (byte) 14);
        setByteField(term60555, term60555.getClass(), "minute", (byte) 51);
        setByteField(term60555, term60555.getClass(), "second", (byte) 41);
        setIntField(term60555, term60555.getClass(), "nano", 830322169);
        setField(term60550, term60550.getClass(), "time", term60555);
        setField(term60547, term60547.getClass(), "startTime", term60550);
        setIntField(term60561, term60561.getClass(), "year", 2024);
        setShortField(term60561, term60561.getClass(), "month", (short) 3);
        setShortField(term60561, term60561.getClass(), "day", (short) 17);
        setField(term60560, term60560.getClass(), "date", term60561);
        setByteField(term60565, term60565.getClass(), "hour", (byte) 5);
        setByteField(term60565, term60565.getClass(), "minute", (byte) 21);
        setByteField(term60565, term60565.getClass(), "second", (byte) 47);
        setIntField(term60565, term60565.getClass(), "nano", 798433252);
        setField(term60560, term60560.getClass(), "time", term60565);
        setField(term60547, term60547.getClass(), "endTime", term60560);
        setField(term60547, term60547.getClass(), "name", "zpkdYKWkCa");
        setField(term60547, term60547.getClass(), "description", "mvOJAtEcWR");
        setField(term60547, term60547.getClass(), "league", enum127);
        setIntField(term60547, term60547.getClass(), "stars", -383508597);
        setIntField(term60547, term60547.getClass(), "minComplexity", -819372164);
        setIntField(term60547, term60547.getClass(), "maxComplexity", 958132675);
        setIntField(term60547, term60547.getClass(), "stages", -689879283);
        setField(term60547, term60547.getClass(), "stageLimit", "QybezBkmJu");
        setField(term60547, term60547.getClass(), "normaType", enum128);
        setIntField(term60547, term60547.getClass(), "bronzeBorders", 1985432430);
        setIntField(term60547, term60547.getClass(), "sliverBorders", -1769933499);
        setIntField(term60547, term60547.getClass(), "goldBorders", -1510932472);
        setField(term60547, term60547.getClass(), "pvList", "uWIrREgpjs");
        setField(term60547, term60547.getClass(), "pvDiffList", "TmEdDFXkTZ");
        setField(term60547, term60547.getClass(), "bronzeContestReward", "DjjdYbIhNY");
        setField(term60547, term60547.getClass(), "sliverContestReward", "AGaeaoutjJ");
        setField(term60547, term60547.getClass(), "goldContestReward", "oHWSUbpGiK");
        setField(term60547, term60547.getClass(), "contestEntryReward", "RreVzKmtxf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xHBCsghEAi";
        callMethod(klass, "setStageLimit", argTypes, term60547, args);
    }

};



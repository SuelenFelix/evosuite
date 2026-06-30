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

public class Contest_canEqual_195294396046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71520;
     Object term71686;

    public Contest_canEqual_195294396046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71708 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term71707 = ((Class) term71708).getDeclaredField((String) "ADVANCED");
        ((Field) term71707).setAccessible(true);
        Object enum152 = ((Field) term71707).get((Object) null);
        Class<? extends Object> term72014 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term72013 = ((Class) term72014).getDeclaredField((String) "PERCENTAGE");
        ((Field) term72013).setAccessible(true);
        Object enum153 = ((Field) term72013).get((Object) null);
        term71520 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term71523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71528 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71538 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term71520, term71520.getClass(), "id", 1175146356);
        setBooleanField(term71520, term71520.getClass(), "enable", true);
        setIntField(term71524, term71524.getClass(), "year", 2029);
        setShortField(term71524, term71524.getClass(), "month", (short) 7);
        setShortField(term71524, term71524.getClass(), "day", (short) 14);
        setField(term71523, term71523.getClass(), "date", term71524);
        setByteField(term71528, term71528.getClass(), "hour", (byte) 17);
        setByteField(term71528, term71528.getClass(), "minute", (byte) 37);
        setByteField(term71528, term71528.getClass(), "second", (byte) 39);
        setIntField(term71528, term71528.getClass(), "nano", 333402299);
        setField(term71523, term71523.getClass(), "time", term71528);
        setField(term71520, term71520.getClass(), "startTime", term71523);
        setIntField(term71534, term71534.getClass(), "year", 2025);
        setShortField(term71534, term71534.getClass(), "month", (short) 10);
        setShortField(term71534, term71534.getClass(), "day", (short) 30);
        setField(term71533, term71533.getClass(), "date", term71534);
        setByteField(term71538, term71538.getClass(), "hour", (byte) 1);
        setByteField(term71538, term71538.getClass(), "minute", (byte) 4);
        setByteField(term71538, term71538.getClass(), "second", (byte) 18);
        setIntField(term71538, term71538.getClass(), "nano", 717716253);
        setField(term71533, term71533.getClass(), "time", term71538);
        setField(term71520, term71520.getClass(), "endTime", term71533);
        setField(term71520, term71520.getClass(), "name", "hqURWIdULb");
        setField(term71520, term71520.getClass(), "description", "kWDcKMrObe");
        setField(term71520, term71520.getClass(), "league", enum152);
        setIntField(term71520, term71520.getClass(), "stars", -2137419728);
        setIntField(term71520, term71520.getClass(), "minComplexity", 1558810715);
        setIntField(term71520, term71520.getClass(), "maxComplexity", -382652403);
        setIntField(term71520, term71520.getClass(), "stages", -2126539433);
        setField(term71520, term71520.getClass(), "stageLimit", "yQIuIaxdRt");
        setField(term71520, term71520.getClass(), "normaType", enum153);
        setIntField(term71520, term71520.getClass(), "bronzeBorders", 196952878);
        setIntField(term71520, term71520.getClass(), "sliverBorders", 802673242);
        setIntField(term71520, term71520.getClass(), "goldBorders", -1808638031);
        setField(term71520, term71520.getClass(), "pvList", "mppqyavbHE");
        setField(term71520, term71520.getClass(), "pvDiffList", "XRhNVGJlMP");
        setField(term71520, term71520.getClass(), "bronzeContestReward", "OGvydrXtac");
        setField(term71520, term71520.getClass(), "sliverContestReward", "SaPfgULGFp");
        setField(term71520, term71520.getClass(), "goldContestReward", "olLmzJWshP");
        setField(term71520, term71520.getClass(), "contestEntryReward", "VbgHjUqRYR");
        term71686 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71686;
        callMethod(klass, "canEqual", argTypes, term71520, args);
    }

};



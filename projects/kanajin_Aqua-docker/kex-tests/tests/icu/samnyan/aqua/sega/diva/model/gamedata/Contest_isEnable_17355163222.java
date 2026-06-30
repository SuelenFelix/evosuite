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

public class Contest_isEnable_17355163222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32555;

    public Contest_isEnable_17355163222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32746 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term32745 = ((Class) term32746).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term32745).setAccessible(true);
        Object enum63 = ((Field) term32745).get((Object) null);
        Class<? extends Object> term33064 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term33063 = ((Class) term33064).getDeclaredField((String) "PERCENTAGE");
        ((Field) term33063).setAccessible(true);
        Object enum64 = ((Field) term33063).get((Object) null);
        term32555 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term32558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32563 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32573 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32555, term32555.getClass(), "id", 1104108112);
        setBooleanField(term32555, term32555.getClass(), "enable", true);
        setIntField(term32559, term32559.getClass(), "year", 2025);
        setShortField(term32559, term32559.getClass(), "month", (short) 12);
        setShortField(term32559, term32559.getClass(), "day", (short) 16);
        setField(term32558, term32558.getClass(), "date", term32559);
        setByteField(term32563, term32563.getClass(), "hour", (byte) 7);
        setByteField(term32563, term32563.getClass(), "minute", (byte) 53);
        setByteField(term32563, term32563.getClass(), "second", (byte) 23);
        setIntField(term32563, term32563.getClass(), "nano", 532991944);
        setField(term32558, term32558.getClass(), "time", term32563);
        setField(term32555, term32555.getClass(), "startTime", term32558);
        setIntField(term32569, term32569.getClass(), "year", 2024);
        setShortField(term32569, term32569.getClass(), "month", (short) 2);
        setShortField(term32569, term32569.getClass(), "day", (short) 5);
        setField(term32568, term32568.getClass(), "date", term32569);
        setByteField(term32573, term32573.getClass(), "hour", (byte) 12);
        setByteField(term32573, term32573.getClass(), "minute", (byte) 28);
        setByteField(term32573, term32573.getClass(), "second", (byte) 37);
        setIntField(term32573, term32573.getClass(), "nano", 689695229);
        setField(term32568, term32568.getClass(), "time", term32573);
        setField(term32555, term32555.getClass(), "endTime", term32568);
        setField(term32555, term32555.getClass(), "name", "PxwyuZAkGy");
        setField(term32555, term32555.getClass(), "description", "ODhSWAnZWd");
        setField(term32555, term32555.getClass(), "league", enum63);
        setIntField(term32555, term32555.getClass(), "stars", 1648665618);
        setIntField(term32555, term32555.getClass(), "minComplexity", 633765954);
        setIntField(term32555, term32555.getClass(), "maxComplexity", 269110087);
        setIntField(term32555, term32555.getClass(), "stages", 1545119095);
        setField(term32555, term32555.getClass(), "stageLimit", "NQkFXmkuYK");
        setField(term32555, term32555.getClass(), "normaType", enum64);
        setIntField(term32555, term32555.getClass(), "bronzeBorders", 1671229683);
        setIntField(term32555, term32555.getClass(), "sliverBorders", 34167717);
        setIntField(term32555, term32555.getClass(), "goldBorders", -514195141);
        setField(term32555, term32555.getClass(), "pvList", "kHzsJWDHsz");
        setField(term32555, term32555.getClass(), "pvDiffList", "jIfbtgnHqt");
        setField(term32555, term32555.getClass(), "bronzeContestReward", "vNvzjymLXH");
        setField(term32555, term32555.getClass(), "sliverContestReward", "TCadyfXzAm");
        setField(term32555, term32555.getClass(), "goldContestReward", "rSSEpZFUMc");
        setField(term32555, term32555.getClass(), "contestEntryReward", "DJHwHjvNlc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnable", argTypes, term32555, args);
    }

};



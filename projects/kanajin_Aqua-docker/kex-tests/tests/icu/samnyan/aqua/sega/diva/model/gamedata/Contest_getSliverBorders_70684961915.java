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

public class Contest_getSliverBorders_70684961915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43920;

    public Contest_getSliverBorders_70684961915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44107 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term44106 = ((Class) term44107).getDeclaredField((String) "BEGINNER");
        ((Field) term44106).setAccessible(true);
        Object enum89 = ((Field) term44106).get((Object) null);
        Class<? extends Object> term44413 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term44412 = ((Class) term44413).getDeclaredField((String) "PERCENTAGE");
        ((Field) term44412).setAccessible(true);
        Object enum90 = ((Field) term44412).get((Object) null);
        term43920 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term43923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43928 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43938 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term43920, term43920.getClass(), "id", 335780735);
        setBooleanField(term43920, term43920.getClass(), "enable", true);
        setIntField(term43924, term43924.getClass(), "year", 2028);
        setShortField(term43924, term43924.getClass(), "month", (short) 4);
        setShortField(term43924, term43924.getClass(), "day", (short) 11);
        setField(term43923, term43923.getClass(), "date", term43924);
        setByteField(term43928, term43928.getClass(), "hour", (byte) 4);
        setByteField(term43928, term43928.getClass(), "minute", (byte) 45);
        setByteField(term43928, term43928.getClass(), "second", (byte) 2);
        setIntField(term43928, term43928.getClass(), "nano", 374177968);
        setField(term43923, term43923.getClass(), "time", term43928);
        setField(term43920, term43920.getClass(), "startTime", term43923);
        setIntField(term43934, term43934.getClass(), "year", 2021);
        setShortField(term43934, term43934.getClass(), "month", (short) 4);
        setShortField(term43934, term43934.getClass(), "day", (short) 22);
        setField(term43933, term43933.getClass(), "date", term43934);
        setByteField(term43938, term43938.getClass(), "hour", (byte) 17);
        setByteField(term43938, term43938.getClass(), "minute", (byte) 6);
        setByteField(term43938, term43938.getClass(), "second", (byte) 33);
        setIntField(term43938, term43938.getClass(), "nano", 21410850);
        setField(term43933, term43933.getClass(), "time", term43938);
        setField(term43920, term43920.getClass(), "endTime", term43933);
        setField(term43920, term43920.getClass(), "name", "HMJaeNiTNW");
        setField(term43920, term43920.getClass(), "description", "ggcJNlLcZb");
        setField(term43920, term43920.getClass(), "league", enum89);
        setIntField(term43920, term43920.getClass(), "stars", -1541981599);
        setIntField(term43920, term43920.getClass(), "minComplexity", 1605456363);
        setIntField(term43920, term43920.getClass(), "maxComplexity", 2059896693);
        setIntField(term43920, term43920.getClass(), "stages", 2109912812);
        setField(term43920, term43920.getClass(), "stageLimit", "EzhvjUZCQP");
        setField(term43920, term43920.getClass(), "normaType", enum90);
        setIntField(term43920, term43920.getClass(), "bronzeBorders", 1841286431);
        setIntField(term43920, term43920.getClass(), "sliverBorders", -1723168189);
        setIntField(term43920, term43920.getClass(), "goldBorders", -675283917);
        setField(term43920, term43920.getClass(), "pvList", "FTHebphiPR");
        setField(term43920, term43920.getClass(), "pvDiffList", "OQjMPmyJQz");
        setField(term43920, term43920.getClass(), "bronzeContestReward", "FZQimBsMNt");
        setField(term43920, term43920.getClass(), "sliverContestReward", "lowANLpXCV");
        setField(term43920, term43920.getClass(), "goldContestReward", "orjiIcUIcD");
        setField(term43920, term43920.getClass(), "contestEntryReward", "lGzFueHQqZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliverBorders", argTypes, term43920, args);
    }

};



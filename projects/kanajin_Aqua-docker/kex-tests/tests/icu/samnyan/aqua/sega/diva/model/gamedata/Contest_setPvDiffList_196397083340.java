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

public class Contest_setPvDiffList_196397083340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66075;

    public Contest_setPvDiffList_196397083340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66279 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term66278 = ((Class) term66279).getDeclaredField((String) "BEGINNER");
        ((Field) term66278).setAccessible(true);
        Object enum140 = ((Field) term66278).get((Object) null);
        Class<? extends Object> term66585 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term66584 = ((Class) term66585).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term66584).setAccessible(true);
        Object enum141 = ((Field) term66584).get((Object) null);
        term66075 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term66078 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66079 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66083 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66093 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term66075, term66075.getClass(), "id", -1456184732);
        setBooleanField(term66075, term66075.getClass(), "enable", true);
        setIntField(term66079, term66079.getClass(), "year", 2029);
        setShortField(term66079, term66079.getClass(), "month", (short) 11);
        setShortField(term66079, term66079.getClass(), "day", (short) 8);
        setField(term66078, term66078.getClass(), "date", term66079);
        setByteField(term66083, term66083.getClass(), "hour", (byte) 23);
        setByteField(term66083, term66083.getClass(), "minute", (byte) 43);
        setByteField(term66083, term66083.getClass(), "second", (byte) 12);
        setIntField(term66083, term66083.getClass(), "nano", 586227255);
        setField(term66078, term66078.getClass(), "time", term66083);
        setField(term66075, term66075.getClass(), "startTime", term66078);
        setIntField(term66089, term66089.getClass(), "year", 2014);
        setShortField(term66089, term66089.getClass(), "month", (short) 1);
        setShortField(term66089, term66089.getClass(), "day", (short) 23);
        setField(term66088, term66088.getClass(), "date", term66089);
        setByteField(term66093, term66093.getClass(), "hour", (byte) 19);
        setByteField(term66093, term66093.getClass(), "minute", (byte) 52);
        setByteField(term66093, term66093.getClass(), "second", (byte) 9);
        setIntField(term66093, term66093.getClass(), "nano", 235326975);
        setField(term66088, term66088.getClass(), "time", term66093);
        setField(term66075, term66075.getClass(), "endTime", term66088);
        setField(term66075, term66075.getClass(), "name", "amltyOnIBK");
        setField(term66075, term66075.getClass(), "description", "hjGlJibBAS");
        setField(term66075, term66075.getClass(), "league", enum140);
        setIntField(term66075, term66075.getClass(), "stars", 1689228897);
        setIntField(term66075, term66075.getClass(), "minComplexity", 892205855);
        setIntField(term66075, term66075.getClass(), "maxComplexity", 1955560079);
        setIntField(term66075, term66075.getClass(), "stages", -1330529019);
        setField(term66075, term66075.getClass(), "stageLimit", "vinKDMUJMl");
        setField(term66075, term66075.getClass(), "normaType", enum141);
        setIntField(term66075, term66075.getClass(), "bronzeBorders", 237134844);
        setIntField(term66075, term66075.getClass(), "sliverBorders", 2076413861);
        setIntField(term66075, term66075.getClass(), "goldBorders", 66817373);
        setField(term66075, term66075.getClass(), "pvList", "MgjVPQNbcu");
        setField(term66075, term66075.getClass(), "pvDiffList", "QNYLGZGxNy");
        setField(term66075, term66075.getClass(), "bronzeContestReward", "BrECRdedgj");
        setField(term66075, term66075.getClass(), "sliverContestReward", "lktYSRAAkX");
        setField(term66075, term66075.getClass(), "goldContestReward", "KmbCndAIRO");
        setField(term66075, term66075.getClass(), "contestEntryReward", "LfLWkWgTGE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uleoYrEbgk";
        callMethod(klass, "setPvDiffList", argTypes, term66075, args);
    }

};



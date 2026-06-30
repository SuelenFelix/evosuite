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

public class Contest_getGoldContestReward_101510669521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49126;

    public Contest_getGoldContestReward_101510669521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49312 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term49311 = ((Class) term49312).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term49311).setAccessible(true);
        Object enum101 = ((Field) term49311).get((Object) null);
        Class<? extends Object> term49630 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term49629 = ((Class) term49630).getDeclaredField((String) "SCORE");
        ((Field) term49629).setAccessible(true);
        Object enum102 = ((Field) term49629).get((Object) null);
        term49126 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term49129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49144 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49126, term49126.getClass(), "id", -1911972560);
        setBooleanField(term49126, term49126.getClass(), "enable", true);
        setIntField(term49130, term49130.getClass(), "year", 2016);
        setShortField(term49130, term49130.getClass(), "month", (short) 4);
        setShortField(term49130, term49130.getClass(), "day", (short) 18);
        setField(term49129, term49129.getClass(), "date", term49130);
        setByteField(term49134, term49134.getClass(), "hour", (byte) 15);
        setByteField(term49134, term49134.getClass(), "minute", (byte) 56);
        setByteField(term49134, term49134.getClass(), "second", (byte) 45);
        setIntField(term49134, term49134.getClass(), "nano", 248103350);
        setField(term49129, term49129.getClass(), "time", term49134);
        setField(term49126, term49126.getClass(), "startTime", term49129);
        setIntField(term49140, term49140.getClass(), "year", 2028);
        setShortField(term49140, term49140.getClass(), "month", (short) 3);
        setShortField(term49140, term49140.getClass(), "day", (short) 25);
        setField(term49139, term49139.getClass(), "date", term49140);
        setByteField(term49144, term49144.getClass(), "hour", (byte) 6);
        setByteField(term49144, term49144.getClass(), "minute", (byte) 9);
        setByteField(term49144, term49144.getClass(), "second", (byte) 35);
        setIntField(term49144, term49144.getClass(), "nano", 744453524);
        setField(term49139, term49139.getClass(), "time", term49144);
        setField(term49126, term49126.getClass(), "endTime", term49139);
        setField(term49126, term49126.getClass(), "name", "fDVzkGiHev");
        setField(term49126, term49126.getClass(), "description", "CanAbWJNgt");
        setField(term49126, term49126.getClass(), "league", enum101);
        setIntField(term49126, term49126.getClass(), "stars", -642716895);
        setIntField(term49126, term49126.getClass(), "minComplexity", 1743398246);
        setIntField(term49126, term49126.getClass(), "maxComplexity", -934658823);
        setIntField(term49126, term49126.getClass(), "stages", 1632177303);
        setField(term49126, term49126.getClass(), "stageLimit", "tFRLUuSeUt");
        setField(term49126, term49126.getClass(), "normaType", enum102);
        setIntField(term49126, term49126.getClass(), "bronzeBorders", -802592348);
        setIntField(term49126, term49126.getClass(), "sliverBorders", -1576584269);
        setIntField(term49126, term49126.getClass(), "goldBorders", 1474899591);
        setField(term49126, term49126.getClass(), "pvList", "KcKxvbBAHa");
        setField(term49126, term49126.getClass(), "pvDiffList", "NbFVXCPmxn");
        setField(term49126, term49126.getClass(), "bronzeContestReward", "ovYlGvhKKO");
        setField(term49126, term49126.getClass(), "sliverContestReward", "JvoSiMCDAb");
        setField(term49126, term49126.getClass(), "goldContestReward", "JANJXHGMsv");
        setField(term49126, term49126.getClass(), "contestEntryReward", "WVQqsFGJMw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoldContestReward", argTypes, term49126, args);
    }

};



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

public class Contest_getName_5533433975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35178;

    public Contest_getName_5533433975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35369 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term35368 = ((Class) term35369).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term35368).setAccessible(true);
        Object enum69 = ((Field) term35368).get((Object) null);
        Class<? extends Object> term35687 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term35686 = ((Class) term35687).getDeclaredField((String) "PERCENTAGE");
        ((Field) term35686).setAccessible(true);
        Object enum70 = ((Field) term35686).get((Object) null);
        term35178 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term35181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35196 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term35178, term35178.getClass(), "id", -271094506);
        setBooleanField(term35178, term35178.getClass(), "enable", true);
        setIntField(term35182, term35182.getClass(), "year", 2021);
        setShortField(term35182, term35182.getClass(), "month", (short) 4);
        setShortField(term35182, term35182.getClass(), "day", (short) 26);
        setField(term35181, term35181.getClass(), "date", term35182);
        setByteField(term35186, term35186.getClass(), "hour", (byte) 11);
        setByteField(term35186, term35186.getClass(), "minute", (byte) 34);
        setByteField(term35186, term35186.getClass(), "second", (byte) 15);
        setIntField(term35186, term35186.getClass(), "nano", 638206023);
        setField(term35181, term35181.getClass(), "time", term35186);
        setField(term35178, term35178.getClass(), "startTime", term35181);
        setIntField(term35192, term35192.getClass(), "year", 2013);
        setShortField(term35192, term35192.getClass(), "month", (short) 9);
        setShortField(term35192, term35192.getClass(), "day", (short) 13);
        setField(term35191, term35191.getClass(), "date", term35192);
        setByteField(term35196, term35196.getClass(), "hour", (byte) 14);
        setByteField(term35196, term35196.getClass(), "minute", (byte) 36);
        setByteField(term35196, term35196.getClass(), "second", (byte) 59);
        setIntField(term35196, term35196.getClass(), "nano", 363124001);
        setField(term35191, term35191.getClass(), "time", term35196);
        setField(term35178, term35178.getClass(), "endTime", term35191);
        setField(term35178, term35178.getClass(), "name", "zkYsnzzwJu");
        setField(term35178, term35178.getClass(), "description", "hxHKgOYyQD");
        setField(term35178, term35178.getClass(), "league", enum69);
        setIntField(term35178, term35178.getClass(), "stars", 455632030);
        setIntField(term35178, term35178.getClass(), "minComplexity", -1632929393);
        setIntField(term35178, term35178.getClass(), "maxComplexity", -431440129);
        setIntField(term35178, term35178.getClass(), "stages", -763576148);
        setField(term35178, term35178.getClass(), "stageLimit", "opEyNuSzgs");
        setField(term35178, term35178.getClass(), "normaType", enum70);
        setIntField(term35178, term35178.getClass(), "bronzeBorders", 1568948514);
        setIntField(term35178, term35178.getClass(), "sliverBorders", -1511130237);
        setIntField(term35178, term35178.getClass(), "goldBorders", 452088587);
        setField(term35178, term35178.getClass(), "pvList", "YTnlgdIqfA");
        setField(term35178, term35178.getClass(), "pvDiffList", "gcKmFclftu");
        setField(term35178, term35178.getClass(), "bronzeContestReward", "lfREOBPEuD");
        setField(term35178, term35178.getClass(), "sliverContestReward", "JAGjDlTwTa");
        setField(term35178, term35178.getClass(), "goldContestReward", "wIDeyLnekQ");
        setField(term35178, term35178.getClass(), "contestEntryReward", "tOGPTIqSMm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term35178, args);
    }

};



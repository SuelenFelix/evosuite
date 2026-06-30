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
import java.lang.Integer;

public class Contest_setGoldBorders_183876507238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64317;
     Object term64478;

    public Contest_setGoldBorders_183876507238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64501 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term64500 = ((Class) term64501).getDeclaredField((String) "BEGINNER");
        ((Field) term64500).setAccessible(true);
        Object enum136 = ((Field) term64500).get((Object) null);
        Class<? extends Object> term64807 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term64806 = ((Class) term64807).getDeclaredField((String) "SCORE");
        ((Field) term64806).setAccessible(true);
        Object enum137 = ((Field) term64806).get((Object) null);
        term64317 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term64320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64335 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term64317, term64317.getClass(), "id", -897937940);
        setBooleanField(term64317, term64317.getClass(), "enable", false);
        setIntField(term64321, term64321.getClass(), "year", 2027);
        setShortField(term64321, term64321.getClass(), "month", (short) 5);
        setShortField(term64321, term64321.getClass(), "day", (short) 2);
        setField(term64320, term64320.getClass(), "date", term64321);
        setByteField(term64325, term64325.getClass(), "hour", (byte) 6);
        setByteField(term64325, term64325.getClass(), "minute", (byte) 10);
        setByteField(term64325, term64325.getClass(), "second", (byte) 19);
        setIntField(term64325, term64325.getClass(), "nano", 422884120);
        setField(term64320, term64320.getClass(), "time", term64325);
        setField(term64317, term64317.getClass(), "startTime", term64320);
        setIntField(term64331, term64331.getClass(), "year", 2029);
        setShortField(term64331, term64331.getClass(), "month", (short) 10);
        setShortField(term64331, term64331.getClass(), "day", (short) 19);
        setField(term64330, term64330.getClass(), "date", term64331);
        setByteField(term64335, term64335.getClass(), "hour", (byte) 15);
        setByteField(term64335, term64335.getClass(), "minute", (byte) 8);
        setByteField(term64335, term64335.getClass(), "second", (byte) 15);
        setIntField(term64335, term64335.getClass(), "nano", 25396748);
        setField(term64330, term64330.getClass(), "time", term64335);
        setField(term64317, term64317.getClass(), "endTime", term64330);
        setField(term64317, term64317.getClass(), "name", "nNjXJbBqnD");
        setField(term64317, term64317.getClass(), "description", "IPIWZFytSS");
        setField(term64317, term64317.getClass(), "league", enum136);
        setIntField(term64317, term64317.getClass(), "stars", 1523261232);
        setIntField(term64317, term64317.getClass(), "minComplexity", -428988337);
        setIntField(term64317, term64317.getClass(), "maxComplexity", 48047085);
        setIntField(term64317, term64317.getClass(), "stages", 1902784843);
        setField(term64317, term64317.getClass(), "stageLimit", "BOKRfsJbBj");
        setField(term64317, term64317.getClass(), "normaType", enum137);
        setIntField(term64317, term64317.getClass(), "bronzeBorders", 2021136615);
        setIntField(term64317, term64317.getClass(), "sliverBorders", 1778570695);
        setIntField(term64317, term64317.getClass(), "goldBorders", -1142164411);
        setField(term64317, term64317.getClass(), "pvList", "AbIDnsFOzO");
        setField(term64317, term64317.getClass(), "pvDiffList", "ekTUXbqVGx");
        setField(term64317, term64317.getClass(), "bronzeContestReward", "ECPFDcnHIT");
        setField(term64317, term64317.getClass(), "sliverContestReward", "cgHejOgcDW");
        setField(term64317, term64317.getClass(), "goldContestReward", "QYNTEJcWIQ");
        setField(term64317, term64317.getClass(), "contestEntryReward", "SbdSVclvuX");
        term64478 = new Integer(-1619435313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term64478;
        callMethod(klass, "setGoldBorders", argTypes, term64317, args);
    }

};



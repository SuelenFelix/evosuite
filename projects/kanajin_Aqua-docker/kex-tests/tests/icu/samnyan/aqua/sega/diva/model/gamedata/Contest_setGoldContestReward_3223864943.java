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

public class Contest_setGoldContestReward_3223864943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68800;

    public Contest_setGoldContestReward_3223864943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69003 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term69002 = ((Class) term69003).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term69002).setAccessible(true);
        Object enum146 = ((Field) term69002).get((Object) null);
        Class<? extends Object> term69321 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term69320 = ((Class) term69321).getDeclaredField((String) "PERCENTAGE");
        ((Field) term69320).setAccessible(true);
        Object enum147 = ((Field) term69320).get((Object) null);
        term68800 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term68803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68808 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68818 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term68800, term68800.getClass(), "id", 1472218987);
        setBooleanField(term68800, term68800.getClass(), "enable", true);
        setIntField(term68804, term68804.getClass(), "year", 2020);
        setShortField(term68804, term68804.getClass(), "month", (short) 2);
        setShortField(term68804, term68804.getClass(), "day", (short) 1);
        setField(term68803, term68803.getClass(), "date", term68804);
        setByteField(term68808, term68808.getClass(), "hour", (byte) 0);
        setByteField(term68808, term68808.getClass(), "minute", (byte) 46);
        setByteField(term68808, term68808.getClass(), "second", (byte) 1);
        setIntField(term68808, term68808.getClass(), "nano", 544722812);
        setField(term68803, term68803.getClass(), "time", term68808);
        setField(term68800, term68800.getClass(), "startTime", term68803);
        setIntField(term68814, term68814.getClass(), "year", 2027);
        setShortField(term68814, term68814.getClass(), "month", (short) 8);
        setShortField(term68814, term68814.getClass(), "day", (short) 16);
        setField(term68813, term68813.getClass(), "date", term68814);
        setByteField(term68818, term68818.getClass(), "hour", (byte) 15);
        setByteField(term68818, term68818.getClass(), "minute", (byte) 1);
        setByteField(term68818, term68818.getClass(), "second", (byte) 18);
        setIntField(term68818, term68818.getClass(), "nano", 245350825);
        setField(term68813, term68813.getClass(), "time", term68818);
        setField(term68800, term68800.getClass(), "endTime", term68813);
        setField(term68800, term68800.getClass(), "name", "DfdUvykRzo");
        setField(term68800, term68800.getClass(), "description", "TWPJmzPTXg");
        setField(term68800, term68800.getClass(), "league", enum146);
        setIntField(term68800, term68800.getClass(), "stars", 805176809);
        setIntField(term68800, term68800.getClass(), "minComplexity", -82632953);
        setIntField(term68800, term68800.getClass(), "maxComplexity", -1473876284);
        setIntField(term68800, term68800.getClass(), "stages", -1389314671);
        setField(term68800, term68800.getClass(), "stageLimit", "frPgAZBkug");
        setField(term68800, term68800.getClass(), "normaType", enum147);
        setIntField(term68800, term68800.getClass(), "bronzeBorders", -499699841);
        setIntField(term68800, term68800.getClass(), "sliverBorders", 360972386);
        setIntField(term68800, term68800.getClass(), "goldBorders", -2063884849);
        setField(term68800, term68800.getClass(), "pvList", "AAzuYrqTRq");
        setField(term68800, term68800.getClass(), "pvDiffList", "cUQuwEPzJb");
        setField(term68800, term68800.getClass(), "bronzeContestReward", "sqPZeXSusM");
        setField(term68800, term68800.getClass(), "sliverContestReward", "mUCxMstoOT");
        setField(term68800, term68800.getClass(), "goldContestReward", "LroMhmrHbv");
        setField(term68800, term68800.getClass(), "contestEntryReward", "nUWkEhozFC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cZOLUZUhxQ";
        callMethod(klass, "setGoldContestReward", argTypes, term68800, args);
    }

};



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

public class Contest_getStartTime_1643866233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33440;

    public Contest_getStartTime_1643866233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33632 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term33631 = ((Class) term33632).getDeclaredField((String) "BEGINNER");
        ((Field) term33631).setAccessible(true);
        Object enum65 = ((Field) term33631).get((Object) null);
        Class<? extends Object> term33938 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term33937 = ((Class) term33938).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term33937).setAccessible(true);
        Object enum66 = ((Field) term33937).get((Object) null);
        term33440 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term33443 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33444 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33448 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33453 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33454 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33458 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33440, term33440.getClass(), "id", -297946422);
        setBooleanField(term33440, term33440.getClass(), "enable", true);
        setIntField(term33444, term33444.getClass(), "year", 2023);
        setShortField(term33444, term33444.getClass(), "month", (short) 5);
        setShortField(term33444, term33444.getClass(), "day", (short) 23);
        setField(term33443, term33443.getClass(), "date", term33444);
        setByteField(term33448, term33448.getClass(), "hour", (byte) 0);
        setByteField(term33448, term33448.getClass(), "minute", (byte) 50);
        setByteField(term33448, term33448.getClass(), "second", (byte) 5);
        setIntField(term33448, term33448.getClass(), "nano", 296286825);
        setField(term33443, term33443.getClass(), "time", term33448);
        setField(term33440, term33440.getClass(), "startTime", term33443);
        setIntField(term33454, term33454.getClass(), "year", 2015);
        setShortField(term33454, term33454.getClass(), "month", (short) 2);
        setShortField(term33454, term33454.getClass(), "day", (short) 5);
        setField(term33453, term33453.getClass(), "date", term33454);
        setByteField(term33458, term33458.getClass(), "hour", (byte) 3);
        setByteField(term33458, term33458.getClass(), "minute", (byte) 26);
        setByteField(term33458, term33458.getClass(), "second", (byte) 49);
        setIntField(term33458, term33458.getClass(), "nano", 995758570);
        setField(term33453, term33453.getClass(), "time", term33458);
        setField(term33440, term33440.getClass(), "endTime", term33453);
        setField(term33440, term33440.getClass(), "name", "ZSBzHqaLtQ");
        setField(term33440, term33440.getClass(), "description", "DCRuiaVwNa");
        setField(term33440, term33440.getClass(), "league", enum65);
        setIntField(term33440, term33440.getClass(), "stars", 385463636);
        setIntField(term33440, term33440.getClass(), "minComplexity", -1677599962);
        setIntField(term33440, term33440.getClass(), "maxComplexity", -1790275458);
        setIntField(term33440, term33440.getClass(), "stages", -497534255);
        setField(term33440, term33440.getClass(), "stageLimit", "VTjvZBqRUX");
        setField(term33440, term33440.getClass(), "normaType", enum66);
        setIntField(term33440, term33440.getClass(), "bronzeBorders", 1588942911);
        setIntField(term33440, term33440.getClass(), "sliverBorders", -2129828854);
        setIntField(term33440, term33440.getClass(), "goldBorders", -47438786);
        setField(term33440, term33440.getClass(), "pvList", "vhjxsMJjOh");
        setField(term33440, term33440.getClass(), "pvDiffList", "gKgsqLPDCs");
        setField(term33440, term33440.getClass(), "bronzeContestReward", "crZAQIKgDI");
        setField(term33440, term33440.getClass(), "sliverContestReward", "uDAdogNiBQ");
        setField(term33440, term33440.getClass(), "goldContestReward", "GnPrxkKUmR");
        setField(term33440, term33440.getClass(), "contestEntryReward", "gVgLmqgxMh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term33440, args);
    }

};



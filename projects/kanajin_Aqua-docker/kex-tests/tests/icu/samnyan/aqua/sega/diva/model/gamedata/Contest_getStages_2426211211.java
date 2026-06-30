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

public class Contest_getStages_2426211211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40400;

    public Contest_getStages_2426211211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40586 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term40585 = ((Class) term40586).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term40585).setAccessible(true);
        Object enum81 = ((Field) term40585).get((Object) null);
        Class<? extends Object> term40904 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term40903 = ((Class) term40904).getDeclaredField((String) "SCORE");
        ((Field) term40903).setAccessible(true);
        Object enum82 = ((Field) term40903).get((Object) null);
        term40400 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term40403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40418 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term40400, term40400.getClass(), "id", 1851127634);
        setBooleanField(term40400, term40400.getClass(), "enable", true);
        setIntField(term40404, term40404.getClass(), "year", 2013);
        setShortField(term40404, term40404.getClass(), "month", (short) 7);
        setShortField(term40404, term40404.getClass(), "day", (short) 26);
        setField(term40403, term40403.getClass(), "date", term40404);
        setByteField(term40408, term40408.getClass(), "hour", (byte) 14);
        setByteField(term40408, term40408.getClass(), "minute", (byte) 45);
        setByteField(term40408, term40408.getClass(), "second", (byte) 33);
        setIntField(term40408, term40408.getClass(), "nano", 547995853);
        setField(term40403, term40403.getClass(), "time", term40408);
        setField(term40400, term40400.getClass(), "startTime", term40403);
        setIntField(term40414, term40414.getClass(), "year", 2016);
        setShortField(term40414, term40414.getClass(), "month", (short) 12);
        setShortField(term40414, term40414.getClass(), "day", (short) 20);
        setField(term40413, term40413.getClass(), "date", term40414);
        setByteField(term40418, term40418.getClass(), "hour", (byte) 8);
        setByteField(term40418, term40418.getClass(), "minute", (byte) 46);
        setByteField(term40418, term40418.getClass(), "second", (byte) 16);
        setIntField(term40418, term40418.getClass(), "nano", 10071864);
        setField(term40413, term40413.getClass(), "time", term40418);
        setField(term40400, term40400.getClass(), "endTime", term40413);
        setField(term40400, term40400.getClass(), "name", "rbJaIkrSnM");
        setField(term40400, term40400.getClass(), "description", "EAKcPFEKbX");
        setField(term40400, term40400.getClass(), "league", enum81);
        setIntField(term40400, term40400.getClass(), "stars", 783730213);
        setIntField(term40400, term40400.getClass(), "minComplexity", 1815951606);
        setIntField(term40400, term40400.getClass(), "maxComplexity", 1105016932);
        setIntField(term40400, term40400.getClass(), "stages", -365784998);
        setField(term40400, term40400.getClass(), "stageLimit", "uPdAMNFhdG");
        setField(term40400, term40400.getClass(), "normaType", enum82);
        setIntField(term40400, term40400.getClass(), "bronzeBorders", -1893236300);
        setIntField(term40400, term40400.getClass(), "sliverBorders", -1858909368);
        setIntField(term40400, term40400.getClass(), "goldBorders", -280113263);
        setField(term40400, term40400.getClass(), "pvList", "VjXPlvOnMK");
        setField(term40400, term40400.getClass(), "pvDiffList", "VVfwcKWfYk");
        setField(term40400, term40400.getClass(), "bronzeContestReward", "tsYXZxQtLG");
        setField(term40400, term40400.getClass(), "sliverContestReward", "JUAWRJdehl");
        setField(term40400, term40400.getClass(), "goldContestReward", "fFslDwqqzQ");
        setField(term40400, term40400.getClass(), "contestEntryReward", "oyTybTkTFd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStages", argTypes, term40400, args);
    }

};



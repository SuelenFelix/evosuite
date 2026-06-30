package icu.samnyan.aqua.sega.diva.handler.user;

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
import static icu.samnyan.aqua.sega.diva.handler.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class EndHandler_getContestRank_4779806271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11484;
     Object term11650;

    public EndHandler_getContestRank_4779806271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11733 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term11732 = ((Class) term11733).getDeclaredField((String) "BEGINNER");
        ((Field) term11732).setAccessible(true);
        Object enum17 = ((Field) term11732).get((Object) null);
        Class<? extends Object> term12084 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term12083 = ((Class) term12084).getDeclaredField((String) "PERCENTAGE");
        ((Field) term12083).setAccessible(true);
        Object enum18 = ((Field) term12083).get((Object) null);
        term11484 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term11487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11492 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11502 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11484, term11484.getClass(), "id", 798043553);
        setBooleanField(term11484, term11484.getClass(), "enable", false);
        setIntField(term11488, term11488.getClass(), "year", 2012);
        setShortField(term11488, term11488.getClass(), "month", (short) 8);
        setShortField(term11488, term11488.getClass(), "day", (short) 25);
        setField(term11487, term11487.getClass(), "date", term11488);
        setByteField(term11492, term11492.getClass(), "hour", (byte) 5);
        setByteField(term11492, term11492.getClass(), "minute", (byte) 20);
        setByteField(term11492, term11492.getClass(), "second", (byte) 50);
        setIntField(term11492, term11492.getClass(), "nano", 345595912);
        setField(term11487, term11487.getClass(), "time", term11492);
        setField(term11484, term11484.getClass(), "startTime", term11487);
        setIntField(term11498, term11498.getClass(), "year", 2021);
        setShortField(term11498, term11498.getClass(), "month", (short) 1);
        setShortField(term11498, term11498.getClass(), "day", (short) 18);
        setField(term11497, term11497.getClass(), "date", term11498);
        setByteField(term11502, term11502.getClass(), "hour", (byte) 13);
        setByteField(term11502, term11502.getClass(), "minute", (byte) 38);
        setByteField(term11502, term11502.getClass(), "second", (byte) 26);
        setIntField(term11502, term11502.getClass(), "nano", 544608644);
        setField(term11497, term11497.getClass(), "time", term11502);
        setField(term11484, term11484.getClass(), "endTime", term11497);
        setField(term11484, term11484.getClass(), "name", "JUmudUmaaV");
        setField(term11484, term11484.getClass(), "description", "KoyGrUJeJW");
        setField(term11484, term11484.getClass(), "league", enum17);
        setIntField(term11484, term11484.getClass(), "stars", 533197381);
        setIntField(term11484, term11484.getClass(), "minComplexity", 1048271679);
        setIntField(term11484, term11484.getClass(), "maxComplexity", -1529797673);
        setIntField(term11484, term11484.getClass(), "stages", -868676396);
        setField(term11484, term11484.getClass(), "stageLimit", "HqBOwkVqjD");
        setField(term11484, term11484.getClass(), "normaType", enum18);
        setIntField(term11484, term11484.getClass(), "bronzeBorders", 1922684808);
        setIntField(term11484, term11484.getClass(), "sliverBorders", -2005784375);
        setIntField(term11484, term11484.getClass(), "goldBorders", -288604325);
        setField(term11484, term11484.getClass(), "pvList", "MAcUBcBckh");
        setField(term11484, term11484.getClass(), "pvDiffList", "oVgzLbrsFr");
        setField(term11484, term11484.getClass(), "bronzeContestReward", "vQVyKLdtaz");
        setField(term11484, term11484.getClass(), "sliverContestReward", "OWKQODBLzb");
        setField(term11484, term11484.getClass(), "goldContestReward", "wGmYcqUkgE");
        setField(term11484, term11484.getClass(), "contestEntryReward", "idgaQsnJpQ");
        term11650 = new Integer(-1268314569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.EndHandler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term11484;
        args[1] = term11650;
        callMethod(klass, "getContestRank", argTypes, null, args);
    }

};



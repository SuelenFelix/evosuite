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

public class Contest_setEndTime_132958704026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53489;
     Object term53650;

    public Contest_setEndTime_132958704026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53681 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term53680 = ((Class) term53681).getDeclaredField((String) "BEGINNER");
        ((Field) term53680).setAccessible(true);
        Object enum111 = ((Field) term53680).get((Object) null);
        Class<? extends Object> term53987 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term53986 = ((Class) term53987).getDeclaredField((String) "SCORE");
        ((Field) term53986).setAccessible(true);
        Object enum112 = ((Field) term53986).get((Object) null);
        term53489 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term53492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53497 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53507 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53489, term53489.getClass(), "id", 1791984446);
        setBooleanField(term53489, term53489.getClass(), "enable", true);
        setIntField(term53493, term53493.getClass(), "year", 2022);
        setShortField(term53493, term53493.getClass(), "month", (short) 6);
        setShortField(term53493, term53493.getClass(), "day", (short) 12);
        setField(term53492, term53492.getClass(), "date", term53493);
        setByteField(term53497, term53497.getClass(), "hour", (byte) 14);
        setByteField(term53497, term53497.getClass(), "minute", (byte) 3);
        setByteField(term53497, term53497.getClass(), "second", (byte) 7);
        setIntField(term53497, term53497.getClass(), "nano", 637592645);
        setField(term53492, term53492.getClass(), "time", term53497);
        setField(term53489, term53489.getClass(), "startTime", term53492);
        setIntField(term53503, term53503.getClass(), "year", 2023);
        setShortField(term53503, term53503.getClass(), "month", (short) 11);
        setShortField(term53503, term53503.getClass(), "day", (short) 14);
        setField(term53502, term53502.getClass(), "date", term53503);
        setByteField(term53507, term53507.getClass(), "hour", (byte) 15);
        setByteField(term53507, term53507.getClass(), "minute", (byte) 2);
        setByteField(term53507, term53507.getClass(), "second", (byte) 47);
        setIntField(term53507, term53507.getClass(), "nano", 703984770);
        setField(term53502, term53502.getClass(), "time", term53507);
        setField(term53489, term53489.getClass(), "endTime", term53502);
        setField(term53489, term53489.getClass(), "name", "MoGyMoOkMi");
        setField(term53489, term53489.getClass(), "description", "qDEvNqJeGg");
        setField(term53489, term53489.getClass(), "league", enum111);
        setIntField(term53489, term53489.getClass(), "stars", 804070622);
        setIntField(term53489, term53489.getClass(), "minComplexity", 1850364894);
        setIntField(term53489, term53489.getClass(), "maxComplexity", 915367534);
        setIntField(term53489, term53489.getClass(), "stages", 1949983666);
        setField(term53489, term53489.getClass(), "stageLimit", "fUxWNxirZc");
        setField(term53489, term53489.getClass(), "normaType", enum112);
        setIntField(term53489, term53489.getClass(), "bronzeBorders", 154111854);
        setIntField(term53489, term53489.getClass(), "sliverBorders", 710986341);
        setIntField(term53489, term53489.getClass(), "goldBorders", -873958002);
        setField(term53489, term53489.getClass(), "pvList", "vHkrNjGRyv");
        setField(term53489, term53489.getClass(), "pvDiffList", "PxGAOnzJzj");
        setField(term53489, term53489.getClass(), "bronzeContestReward", "fQVSHtJlDS");
        setField(term53489, term53489.getClass(), "sliverContestReward", "CGdXCWNTxp");
        setField(term53489, term53489.getClass(), "goldContestReward", "TUBgEnrcjn");
        setField(term53489, term53489.getClass(), "contestEntryReward", "eUhEGNLBOk");
        term53650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53655 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53651, term53651.getClass(), "year", 2024);
        setShortField(term53651, term53651.getClass(), "month", (short) 4);
        setShortField(term53651, term53651.getClass(), "day", (short) 26);
        setField(term53650, term53650.getClass(), "date", term53651);
        setByteField(term53655, term53655.getClass(), "hour", (byte) 15);
        setByteField(term53655, term53655.getClass(), "minute", (byte) 12);
        setByteField(term53655, term53655.getClass(), "second", (byte) 31);
        setIntField(term53655, term53655.getClass(), "nano", 839979637);
        setField(term53650, term53650.getClass(), "time", term53655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term53650;
        callMethod(klass, "setEndTime", argTypes, term53489, args);
    }

};



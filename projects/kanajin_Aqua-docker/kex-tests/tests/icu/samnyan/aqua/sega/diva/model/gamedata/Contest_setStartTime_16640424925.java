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

public class Contest_setStartTime_16640424925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52614;
     Object term52779;

    public Contest_setStartTime_16640424925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52810 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term52809 = ((Class) term52810).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term52809).setAccessible(true);
        Object enum109 = ((Field) term52809).get((Object) null);
        Class<? extends Object> term53128 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term53127 = ((Class) term53128).getDeclaredField((String) "SCORE");
        ((Field) term53127).setAccessible(true);
        Object enum110 = ((Field) term53127).get((Object) null);
        term52614 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term52617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52632 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52614, term52614.getClass(), "id", 588390599);
        setBooleanField(term52614, term52614.getClass(), "enable", true);
        setIntField(term52618, term52618.getClass(), "year", 2012);
        setShortField(term52618, term52618.getClass(), "month", (short) 5);
        setShortField(term52618, term52618.getClass(), "day", (short) 25);
        setField(term52617, term52617.getClass(), "date", term52618);
        setByteField(term52622, term52622.getClass(), "hour", (byte) 5);
        setByteField(term52622, term52622.getClass(), "minute", (byte) 8);
        setByteField(term52622, term52622.getClass(), "second", (byte) 47);
        setIntField(term52622, term52622.getClass(), "nano", 455554221);
        setField(term52617, term52617.getClass(), "time", term52622);
        setField(term52614, term52614.getClass(), "startTime", term52617);
        setIntField(term52628, term52628.getClass(), "year", 2029);
        setShortField(term52628, term52628.getClass(), "month", (short) 11);
        setShortField(term52628, term52628.getClass(), "day", (short) 18);
        setField(term52627, term52627.getClass(), "date", term52628);
        setByteField(term52632, term52632.getClass(), "hour", (byte) 5);
        setByteField(term52632, term52632.getClass(), "minute", (byte) 36);
        setByteField(term52632, term52632.getClass(), "second", (byte) 57);
        setIntField(term52632, term52632.getClass(), "nano", 394167804);
        setField(term52627, term52627.getClass(), "time", term52632);
        setField(term52614, term52614.getClass(), "endTime", term52627);
        setField(term52614, term52614.getClass(), "name", "BJJuVqxXjT");
        setField(term52614, term52614.getClass(), "description", "IvxbsFCczM");
        setField(term52614, term52614.getClass(), "league", enum109);
        setIntField(term52614, term52614.getClass(), "stars", -95969566);
        setIntField(term52614, term52614.getClass(), "minComplexity", -68615285);
        setIntField(term52614, term52614.getClass(), "maxComplexity", -337504086);
        setIntField(term52614, term52614.getClass(), "stages", 2074130991);
        setField(term52614, term52614.getClass(), "stageLimit", "GkAaLUoaoL");
        setField(term52614, term52614.getClass(), "normaType", enum110);
        setIntField(term52614, term52614.getClass(), "bronzeBorders", 532588266);
        setIntField(term52614, term52614.getClass(), "sliverBorders", -1286686332);
        setIntField(term52614, term52614.getClass(), "goldBorders", -284885486);
        setField(term52614, term52614.getClass(), "pvList", "VSmPzUiFzd");
        setField(term52614, term52614.getClass(), "pvDiffList", "bLpZNCaWDB");
        setField(term52614, term52614.getClass(), "bronzeContestReward", "knmwCEeMTY");
        setField(term52614, term52614.getClass(), "sliverContestReward", "qTiIgMQXbW");
        setField(term52614, term52614.getClass(), "goldContestReward", "rARmHDyRHE");
        setField(term52614, term52614.getClass(), "contestEntryReward", "bvybTJUNMY");
        term52779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52784 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52780, term52780.getClass(), "year", 2020);
        setShortField(term52780, term52780.getClass(), "month", (short) 10);
        setShortField(term52780, term52780.getClass(), "day", (short) 8);
        setField(term52779, term52779.getClass(), "date", term52780);
        setByteField(term52784, term52784.getClass(), "hour", (byte) 15);
        setByteField(term52784, term52784.getClass(), "minute", (byte) 57);
        setByteField(term52784, term52784.getClass(), "second", (byte) 17);
        setIntField(term52784, term52784.getClass(), "nano", 288139529);
        setField(term52779, term52779.getClass(), "time", term52784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term52779;
        callMethod(klass, "setStartTime", argTypes, term52614, args);
    }

};



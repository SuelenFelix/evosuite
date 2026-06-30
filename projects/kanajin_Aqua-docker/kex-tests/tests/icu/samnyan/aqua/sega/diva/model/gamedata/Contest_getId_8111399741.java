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

public class Contest_getId_8111399741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31650;

    public Contest_getId_8111399741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31846 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term31845 = ((Class) term31846).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term31845).setAccessible(true);
        Object enum61 = ((Field) term31845).get((Object) null);
        Class<? extends Object> term32164 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term32163 = ((Class) term32164).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term32163).setAccessible(true);
        Object enum62 = ((Field) term32163).get((Object) null);
        term31650 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term31653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31658 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31668 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31650, term31650.getClass(), "id", -1777140369);
        setBooleanField(term31650, term31650.getClass(), "enable", false);
        setIntField(term31654, term31654.getClass(), "year", 2020);
        setShortField(term31654, term31654.getClass(), "month", (short) 5);
        setShortField(term31654, term31654.getClass(), "day", (short) 12);
        setField(term31653, term31653.getClass(), "date", term31654);
        setByteField(term31658, term31658.getClass(), "hour", (byte) 0);
        setByteField(term31658, term31658.getClass(), "minute", (byte) 15);
        setByteField(term31658, term31658.getClass(), "second", (byte) 24);
        setIntField(term31658, term31658.getClass(), "nano", 250257744);
        setField(term31653, term31653.getClass(), "time", term31658);
        setField(term31650, term31650.getClass(), "startTime", term31653);
        setIntField(term31664, term31664.getClass(), "year", 2013);
        setShortField(term31664, term31664.getClass(), "month", (short) 9);
        setShortField(term31664, term31664.getClass(), "day", (short) 19);
        setField(term31663, term31663.getClass(), "date", term31664);
        setByteField(term31668, term31668.getClass(), "hour", (byte) 12);
        setByteField(term31668, term31668.getClass(), "minute", (byte) 29);
        setByteField(term31668, term31668.getClass(), "second", (byte) 28);
        setIntField(term31668, term31668.getClass(), "nano", 244069764);
        setField(term31663, term31663.getClass(), "time", term31668);
        setField(term31650, term31650.getClass(), "endTime", term31663);
        setField(term31650, term31650.getClass(), "name", "OGEDwuJhjV");
        setField(term31650, term31650.getClass(), "description", "vepOtOxlWM");
        setField(term31650, term31650.getClass(), "league", enum61);
        setIntField(term31650, term31650.getClass(), "stars", 993627098);
        setIntField(term31650, term31650.getClass(), "minComplexity", 872295704);
        setIntField(term31650, term31650.getClass(), "maxComplexity", 86041387);
        setIntField(term31650, term31650.getClass(), "stages", 1010721666);
        setField(term31650, term31650.getClass(), "stageLimit", "XZmoxlxcKh");
        setField(term31650, term31650.getClass(), "normaType", enum62);
        setIntField(term31650, term31650.getClass(), "bronzeBorders", 27043781);
        setIntField(term31650, term31650.getClass(), "sliverBorders", -1367122405);
        setIntField(term31650, term31650.getClass(), "goldBorders", -1703625118);
        setField(term31650, term31650.getClass(), "pvList", "aHNGawFCfD");
        setField(term31650, term31650.getClass(), "pvDiffList", "cHjhnXKTVF");
        setField(term31650, term31650.getClass(), "bronzeContestReward", "NVsXpTZPoM");
        setField(term31650, term31650.getClass(), "sliverContestReward", "OlbhHDRGng");
        setField(term31650, term31650.getClass(), "goldContestReward", "kbxuaUHTXf");
        setField(term31650, term31650.getClass(), "contestEntryReward", "CwmyQhyiUR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term31650, args);
    }

};



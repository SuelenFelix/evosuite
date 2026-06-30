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

public class Contest_setLeague_118479176429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56110;
     Object enum117;

    public Contest_setLeague_118479176429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56306 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term56305 = ((Class) term56306).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term56305).setAccessible(true);
        enum117 = ((Field) term56305).get((Object) null);
        Class<? extends Object> term56624 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term56623 = ((Class) term56624).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term56623).setAccessible(true);
        Object enum118 = ((Field) term56623).get((Object) null);
        term56110 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term56113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56118 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56128 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term56110, term56110.getClass(), "id", -1885268968);
        setBooleanField(term56110, term56110.getClass(), "enable", true);
        setIntField(term56114, term56114.getClass(), "year", 2010);
        setShortField(term56114, term56114.getClass(), "month", (short) 1);
        setShortField(term56114, term56114.getClass(), "day", (short) 10);
        setField(term56113, term56113.getClass(), "date", term56114);
        setByteField(term56118, term56118.getClass(), "hour", (byte) 12);
        setByteField(term56118, term56118.getClass(), "minute", (byte) 46);
        setByteField(term56118, term56118.getClass(), "second", (byte) 5);
        setIntField(term56118, term56118.getClass(), "nano", 540440953);
        setField(term56113, term56113.getClass(), "time", term56118);
        setField(term56110, term56110.getClass(), "startTime", term56113);
        setIntField(term56124, term56124.getClass(), "year", 2028);
        setShortField(term56124, term56124.getClass(), "month", (short) 5);
        setShortField(term56124, term56124.getClass(), "day", (short) 7);
        setField(term56123, term56123.getClass(), "date", term56124);
        setByteField(term56128, term56128.getClass(), "hour", (byte) 7);
        setByteField(term56128, term56128.getClass(), "minute", (byte) 48);
        setByteField(term56128, term56128.getClass(), "second", (byte) 4);
        setIntField(term56128, term56128.getClass(), "nano", 380425174);
        setField(term56123, term56123.getClass(), "time", term56128);
        setField(term56110, term56110.getClass(), "endTime", term56123);
        setField(term56110, term56110.getClass(), "name", "DGCeQsmIOU");
        setField(term56110, term56110.getClass(), "description", "otcpSHwkzG");
        setField(term56110, term56110.getClass(), "league", enum117);
        setIntField(term56110, term56110.getClass(), "stars", 277855691);
        setIntField(term56110, term56110.getClass(), "minComplexity", 675891483);
        setIntField(term56110, term56110.getClass(), "maxComplexity", -317900470);
        setIntField(term56110, term56110.getClass(), "stages", -979568);
        setField(term56110, term56110.getClass(), "stageLimit", "BixZhUjVme");
        setField(term56110, term56110.getClass(), "normaType", enum118);
        setIntField(term56110, term56110.getClass(), "bronzeBorders", -1422131197);
        setIntField(term56110, term56110.getClass(), "sliverBorders", -20399281);
        setIntField(term56110, term56110.getClass(), "goldBorders", -830170410);
        setField(term56110, term56110.getClass(), "pvList", "BmnUezUoWz");
        setField(term56110, term56110.getClass(), "pvDiffList", "QqeCgeRpIS");
        setField(term56110, term56110.getClass(), "bronzeContestReward", "xVwossmLda");
        setField(term56110, term56110.getClass(), "sliverContestReward", "EvSQeALexj");
        setField(term56110, term56110.getClass(), "goldContestReward", "VuprBjhWdI");
        setField(term56110, term56110.getClass(), "contestEntryReward", "CFGOXMbAUn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Object[] args = new Object[1];
        args[0] = enum117;
        callMethod(klass, "setLeague", argTypes, term56110, args);
    }

};



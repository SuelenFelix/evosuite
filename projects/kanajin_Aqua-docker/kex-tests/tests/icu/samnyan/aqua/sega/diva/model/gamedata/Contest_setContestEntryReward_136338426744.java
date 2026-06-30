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

public class Contest_setContestEntryReward_136338426744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69707;

    public Contest_setContestEntryReward_136338426744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69915 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term69914 = ((Class) term69915).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term69914).setAccessible(true);
        Object enum148 = ((Field) term69914).get((Object) null);
        Class<? extends Object> term70233 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term70232 = ((Class) term70233).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term70232).setAccessible(true);
        Object enum149 = ((Field) term70232).get((Object) null);
        term69707 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term69710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69715 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69725 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term69707, term69707.getClass(), "id", 1054887169);
        setBooleanField(term69707, term69707.getClass(), "enable", true);
        setIntField(term69711, term69711.getClass(), "year", 2026);
        setShortField(term69711, term69711.getClass(), "month", (short) 7);
        setShortField(term69711, term69711.getClass(), "day", (short) 4);
        setField(term69710, term69710.getClass(), "date", term69711);
        setByteField(term69715, term69715.getClass(), "hour", (byte) 8);
        setByteField(term69715, term69715.getClass(), "minute", (byte) 51);
        setByteField(term69715, term69715.getClass(), "second", (byte) 9);
        setIntField(term69715, term69715.getClass(), "nano", 936880887);
        setField(term69710, term69710.getClass(), "time", term69715);
        setField(term69707, term69707.getClass(), "startTime", term69710);
        setIntField(term69721, term69721.getClass(), "year", 2022);
        setShortField(term69721, term69721.getClass(), "month", (short) 5);
        setShortField(term69721, term69721.getClass(), "day", (short) 26);
        setField(term69720, term69720.getClass(), "date", term69721);
        setByteField(term69725, term69725.getClass(), "hour", (byte) 6);
        setByteField(term69725, term69725.getClass(), "minute", (byte) 54);
        setByteField(term69725, term69725.getClass(), "second", (byte) 49);
        setIntField(term69725, term69725.getClass(), "nano", 822216068);
        setField(term69720, term69720.getClass(), "time", term69725);
        setField(term69707, term69707.getClass(), "endTime", term69720);
        setField(term69707, term69707.getClass(), "name", "fXCybRqtsq");
        setField(term69707, term69707.getClass(), "description", "gPhmseJiob");
        setField(term69707, term69707.getClass(), "league", enum148);
        setIntField(term69707, term69707.getClass(), "stars", 692873905);
        setIntField(term69707, term69707.getClass(), "minComplexity", 1734759369);
        setIntField(term69707, term69707.getClass(), "maxComplexity", 1841493736);
        setIntField(term69707, term69707.getClass(), "stages", 320739944);
        setField(term69707, term69707.getClass(), "stageLimit", "dgpHJUBySN");
        setField(term69707, term69707.getClass(), "normaType", enum149);
        setIntField(term69707, term69707.getClass(), "bronzeBorders", 760218111);
        setIntField(term69707, term69707.getClass(), "sliverBorders", -1986366126);
        setIntField(term69707, term69707.getClass(), "goldBorders", -1963228619);
        setField(term69707, term69707.getClass(), "pvList", "jCEXysSVZf");
        setField(term69707, term69707.getClass(), "pvDiffList", "jWrmcNnNoB");
        setField(term69707, term69707.getClass(), "bronzeContestReward", "MoncgugUfo");
        setField(term69707, term69707.getClass(), "sliverContestReward", "OdbuOWCJTS");
        setField(term69707, term69707.getClass(), "goldContestReward", "ksvfEdmpqg");
        setField(term69707, term69707.getClass(), "contestEntryReward", "mNzFmmNjDi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UxkbStdccR";
        callMethod(klass, "setContestEntryReward", argTypes, term69707, args);
    }

};



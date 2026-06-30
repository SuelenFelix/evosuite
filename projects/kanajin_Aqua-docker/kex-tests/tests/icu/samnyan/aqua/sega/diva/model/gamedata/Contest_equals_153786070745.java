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

public class Contest_equals_153786070745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70634;
     Object term70804;

    public Contest_equals_153786070745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70826 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term70825 = ((Class) term70826).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term70825).setAccessible(true);
        Object enum150 = ((Field) term70825).get((Object) null);
        Class<? extends Object> term71144 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term71143 = ((Class) term71144).getDeclaredField((String) "PERCENTAGE");
        ((Field) term71143).setAccessible(true);
        Object enum151 = ((Field) term71143).get((Object) null);
        term70634 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term70637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70642 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70652 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term70634, term70634.getClass(), "id", -709868952);
        setBooleanField(term70634, term70634.getClass(), "enable", false);
        setIntField(term70638, term70638.getClass(), "year", 2022);
        setShortField(term70638, term70638.getClass(), "month", (short) 12);
        setShortField(term70638, term70638.getClass(), "day", (short) 19);
        setField(term70637, term70637.getClass(), "date", term70638);
        setByteField(term70642, term70642.getClass(), "hour", (byte) 11);
        setByteField(term70642, term70642.getClass(), "minute", (byte) 25);
        setByteField(term70642, term70642.getClass(), "second", (byte) 6);
        setIntField(term70642, term70642.getClass(), "nano", 620469872);
        setField(term70637, term70637.getClass(), "time", term70642);
        setField(term70634, term70634.getClass(), "startTime", term70637);
        setIntField(term70648, term70648.getClass(), "year", 2013);
        setShortField(term70648, term70648.getClass(), "month", (short) 5);
        setShortField(term70648, term70648.getClass(), "day", (short) 3);
        setField(term70647, term70647.getClass(), "date", term70648);
        setByteField(term70652, term70652.getClass(), "hour", (byte) 18);
        setByteField(term70652, term70652.getClass(), "minute", (byte) 52);
        setByteField(term70652, term70652.getClass(), "second", (byte) 15);
        setIntField(term70652, term70652.getClass(), "nano", 241685081);
        setField(term70647, term70647.getClass(), "time", term70652);
        setField(term70634, term70634.getClass(), "endTime", term70647);
        setField(term70634, term70634.getClass(), "name", "kizVhsjIpC");
        setField(term70634, term70634.getClass(), "description", "uDuPkYdemJ");
        setField(term70634, term70634.getClass(), "league", enum150);
        setIntField(term70634, term70634.getClass(), "stars", 847207929);
        setIntField(term70634, term70634.getClass(), "minComplexity", -1665928103);
        setIntField(term70634, term70634.getClass(), "maxComplexity", 1574458332);
        setIntField(term70634, term70634.getClass(), "stages", -975856245);
        setField(term70634, term70634.getClass(), "stageLimit", "FfynoMXicS");
        setField(term70634, term70634.getClass(), "normaType", enum151);
        setIntField(term70634, term70634.getClass(), "bronzeBorders", -1023366103);
        setIntField(term70634, term70634.getClass(), "sliverBorders", 81427089);
        setIntField(term70634, term70634.getClass(), "goldBorders", 755951489);
        setField(term70634, term70634.getClass(), "pvList", "mbofhtwtHb");
        setField(term70634, term70634.getClass(), "pvDiffList", "goCKhChLTQ");
        setField(term70634, term70634.getClass(), "bronzeContestReward", "VkjCLLOwvZ");
        setField(term70634, term70634.getClass(), "sliverContestReward", "YQaoPDOhWH");
        setField(term70634, term70634.getClass(), "goldContestReward", "SJPzCePrEj");
        setField(term70634, term70634.getClass(), "contestEntryReward", "tYasEQgFbL");
        term70804 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term70804;
        callMethod(klass, "equals", argTypes, term70634, args);
    }

};



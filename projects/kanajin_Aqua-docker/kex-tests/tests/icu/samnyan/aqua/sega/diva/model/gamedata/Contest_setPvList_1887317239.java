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

public class Contest_setPvList_1887317239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65168;

    public Contest_setPvList_1887317239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65371 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term65370 = ((Class) term65371).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term65370).setAccessible(true);
        Object enum138 = ((Field) term65370).get((Object) null);
        Class<? extends Object> term65689 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term65688 = ((Class) term65689).getDeclaredField((String) "PERCENTAGE");
        ((Field) term65688).setAccessible(true);
        Object enum139 = ((Field) term65688).get((Object) null);
        term65168 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term65171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65186 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term65168, term65168.getClass(), "id", 1013801066);
        setBooleanField(term65168, term65168.getClass(), "enable", true);
        setIntField(term65172, term65172.getClass(), "year", 2014);
        setShortField(term65172, term65172.getClass(), "month", (short) 6);
        setShortField(term65172, term65172.getClass(), "day", (short) 28);
        setField(term65171, term65171.getClass(), "date", term65172);
        setByteField(term65176, term65176.getClass(), "hour", (byte) 7);
        setByteField(term65176, term65176.getClass(), "minute", (byte) 14);
        setByteField(term65176, term65176.getClass(), "second", (byte) 59);
        setIntField(term65176, term65176.getClass(), "nano", 314278386);
        setField(term65171, term65171.getClass(), "time", term65176);
        setField(term65168, term65168.getClass(), "startTime", term65171);
        setIntField(term65182, term65182.getClass(), "year", 2015);
        setShortField(term65182, term65182.getClass(), "month", (short) 10);
        setShortField(term65182, term65182.getClass(), "day", (short) 8);
        setField(term65181, term65181.getClass(), "date", term65182);
        setByteField(term65186, term65186.getClass(), "hour", (byte) 22);
        setByteField(term65186, term65186.getClass(), "minute", (byte) 20);
        setByteField(term65186, term65186.getClass(), "second", (byte) 59);
        setIntField(term65186, term65186.getClass(), "nano", 350521903);
        setField(term65181, term65181.getClass(), "time", term65186);
        setField(term65168, term65168.getClass(), "endTime", term65181);
        setField(term65168, term65168.getClass(), "name", "QpoSxHFuJh");
        setField(term65168, term65168.getClass(), "description", "GLAJgnHQMo");
        setField(term65168, term65168.getClass(), "league", enum138);
        setIntField(term65168, term65168.getClass(), "stars", 1512541853);
        setIntField(term65168, term65168.getClass(), "minComplexity", -965421502);
        setIntField(term65168, term65168.getClass(), "maxComplexity", 1319026002);
        setIntField(term65168, term65168.getClass(), "stages", -1368173231);
        setField(term65168, term65168.getClass(), "stageLimit", "nDzlNeexNi");
        setField(term65168, term65168.getClass(), "normaType", enum139);
        setIntField(term65168, term65168.getClass(), "bronzeBorders", 1956006038);
        setIntField(term65168, term65168.getClass(), "sliverBorders", -1062304878);
        setIntField(term65168, term65168.getClass(), "goldBorders", -1377876610);
        setField(term65168, term65168.getClass(), "pvList", "XhILAYdtGS");
        setField(term65168, term65168.getClass(), "pvDiffList", "ZRWORAfStn");
        setField(term65168, term65168.getClass(), "bronzeContestReward", "loCxNBoGfW");
        setField(term65168, term65168.getClass(), "sliverContestReward", "PGVYUjJrZh");
        setField(term65168, term65168.getClass(), "goldContestReward", "OHliEqVque");
        setField(term65168, term65168.getClass(), "contestEntryReward", "kQWmmbQQqu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bLKLlXYEeh";
        callMethod(klass, "setPvList", argTypes, term65168, args);
    }

};



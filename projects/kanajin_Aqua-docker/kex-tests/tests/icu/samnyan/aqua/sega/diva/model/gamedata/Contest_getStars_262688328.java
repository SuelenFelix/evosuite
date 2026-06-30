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

public class Contest_getStars_262688328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37801;

    public Contest_getStars_262688328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37987 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term37986 = ((Class) term37987).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term37986).setAccessible(true);
        Object enum75 = ((Field) term37986).get((Object) null);
        Class<? extends Object> term38305 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term38304 = ((Class) term38305).getDeclaredField((String) "SCORE");
        ((Field) term38304).setAccessible(true);
        Object enum76 = ((Field) term38304).get((Object) null);
        term37801 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term37804 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37809 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37819 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term37801, term37801.getClass(), "id", 1059930704);
        setBooleanField(term37801, term37801.getClass(), "enable", false);
        setIntField(term37805, term37805.getClass(), "year", 2019);
        setShortField(term37805, term37805.getClass(), "month", (short) 8);
        setShortField(term37805, term37805.getClass(), "day", (short) 12);
        setField(term37804, term37804.getClass(), "date", term37805);
        setByteField(term37809, term37809.getClass(), "hour", (byte) 14);
        setByteField(term37809, term37809.getClass(), "minute", (byte) 1);
        setByteField(term37809, term37809.getClass(), "second", (byte) 51);
        setIntField(term37809, term37809.getClass(), "nano", 499021786);
        setField(term37804, term37804.getClass(), "time", term37809);
        setField(term37801, term37801.getClass(), "startTime", term37804);
        setIntField(term37815, term37815.getClass(), "year", 2014);
        setShortField(term37815, term37815.getClass(), "month", (short) 7);
        setShortField(term37815, term37815.getClass(), "day", (short) 22);
        setField(term37814, term37814.getClass(), "date", term37815);
        setByteField(term37819, term37819.getClass(), "hour", (byte) 9);
        setByteField(term37819, term37819.getClass(), "minute", (byte) 40);
        setByteField(term37819, term37819.getClass(), "second", (byte) 34);
        setIntField(term37819, term37819.getClass(), "nano", 463008257);
        setField(term37814, term37814.getClass(), "time", term37819);
        setField(term37801, term37801.getClass(), "endTime", term37814);
        setField(term37801, term37801.getClass(), "name", "bJKvwEFeLG");
        setField(term37801, term37801.getClass(), "description", "MQzXbKeQIa");
        setField(term37801, term37801.getClass(), "league", enum75);
        setIntField(term37801, term37801.getClass(), "stars", -1967153290);
        setIntField(term37801, term37801.getClass(), "minComplexity", -1397251956);
        setIntField(term37801, term37801.getClass(), "maxComplexity", -796934571);
        setIntField(term37801, term37801.getClass(), "stages", 405295896);
        setField(term37801, term37801.getClass(), "stageLimit", "YHDwlXeRTi");
        setField(term37801, term37801.getClass(), "normaType", enum76);
        setIntField(term37801, term37801.getClass(), "bronzeBorders", -814977075);
        setIntField(term37801, term37801.getClass(), "sliverBorders", 808614267);
        setIntField(term37801, term37801.getClass(), "goldBorders", 1611734632);
        setField(term37801, term37801.getClass(), "pvList", "WIJiLZqEqc");
        setField(term37801, term37801.getClass(), "pvDiffList", "OuZMVgPpoE");
        setField(term37801, term37801.getClass(), "bronzeContestReward", "nDUyFfanYp");
        setField(term37801, term37801.getClass(), "sliverContestReward", "hYmQxPxTFd");
        setField(term37801, term37801.getClass(), "goldContestReward", "Clkrygzvpw");
        setField(term37801, term37801.getClass(), "contestEntryReward", "TPzGOBNENK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStars", argTypes, term37801, args);
    }

};



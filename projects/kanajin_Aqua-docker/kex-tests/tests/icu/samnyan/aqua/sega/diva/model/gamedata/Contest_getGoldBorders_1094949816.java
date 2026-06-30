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

public class Contest_getGoldBorders_1094949816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44789;

    public Contest_getGoldBorders_1094949816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44976 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term44975 = ((Class) term44976).getDeclaredField((String) "ADVANCED");
        ((Field) term44975).setAccessible(true);
        Object enum91 = ((Field) term44975).get((Object) null);
        Class<? extends Object> term45282 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term45281 = ((Class) term45282).getDeclaredField((String) "PERCENTAGE");
        ((Field) term45281).setAccessible(true);
        Object enum92 = ((Field) term45281).get((Object) null);
        term44789 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term44792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44807 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term44789, term44789.getClass(), "id", -2093862988);
        setBooleanField(term44789, term44789.getClass(), "enable", false);
        setIntField(term44793, term44793.getClass(), "year", 2026);
        setShortField(term44793, term44793.getClass(), "month", (short) 10);
        setShortField(term44793, term44793.getClass(), "day", (short) 19);
        setField(term44792, term44792.getClass(), "date", term44793);
        setByteField(term44797, term44797.getClass(), "hour", (byte) 7);
        setByteField(term44797, term44797.getClass(), "minute", (byte) 22);
        setByteField(term44797, term44797.getClass(), "second", (byte) 11);
        setIntField(term44797, term44797.getClass(), "nano", 17846677);
        setField(term44792, term44792.getClass(), "time", term44797);
        setField(term44789, term44789.getClass(), "startTime", term44792);
        setIntField(term44803, term44803.getClass(), "year", 2018);
        setShortField(term44803, term44803.getClass(), "month", (short) 10);
        setShortField(term44803, term44803.getClass(), "day", (short) 17);
        setField(term44802, term44802.getClass(), "date", term44803);
        setByteField(term44807, term44807.getClass(), "hour", (byte) 5);
        setByteField(term44807, term44807.getClass(), "minute", (byte) 10);
        setByteField(term44807, term44807.getClass(), "second", (byte) 23);
        setIntField(term44807, term44807.getClass(), "nano", 571520422);
        setField(term44802, term44802.getClass(), "time", term44807);
        setField(term44789, term44789.getClass(), "endTime", term44802);
        setField(term44789, term44789.getClass(), "name", "cjiDFHGGlp");
        setField(term44789, term44789.getClass(), "description", "XLjtkfroHJ");
        setField(term44789, term44789.getClass(), "league", enum91);
        setIntField(term44789, term44789.getClass(), "stars", 1337828646);
        setIntField(term44789, term44789.getClass(), "minComplexity", 532666604);
        setIntField(term44789, term44789.getClass(), "maxComplexity", -13725716);
        setIntField(term44789, term44789.getClass(), "stages", -1695750603);
        setField(term44789, term44789.getClass(), "stageLimit", "hdqypaATat");
        setField(term44789, term44789.getClass(), "normaType", enum92);
        setIntField(term44789, term44789.getClass(), "bronzeBorders", 63677360);
        setIntField(term44789, term44789.getClass(), "sliverBorders", 1478914037);
        setIntField(term44789, term44789.getClass(), "goldBorders", 1630231519);
        setField(term44789, term44789.getClass(), "pvList", "yXrHDHEipD");
        setField(term44789, term44789.getClass(), "pvDiffList", "pbqIeikQzp");
        setField(term44789, term44789.getClass(), "bronzeContestReward", "baLJgqNNUx");
        setField(term44789, term44789.getClass(), "sliverContestReward", "GlPSGqVaBj");
        setField(term44789, term44789.getClass(), "goldContestReward", "jieMNXAAbL");
        setField(term44789, term44789.getClass(), "contestEntryReward", "NbmTxmqOjh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoldBorders", argTypes, term44789, args);
    }

};



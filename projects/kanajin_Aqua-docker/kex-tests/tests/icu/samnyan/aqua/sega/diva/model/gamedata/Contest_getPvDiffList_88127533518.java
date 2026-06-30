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

public class Contest_getPvDiffList_88127533518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46507;

    public Contest_getPvDiffList_88127533518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46693 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term46692 = ((Class) term46693).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term46692).setAccessible(true);
        Object enum95 = ((Field) term46692).get((Object) null);
        Class<? extends Object> term47011 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term47010 = ((Class) term47011).getDeclaredField((String) "SCORE");
        ((Field) term47010).setAccessible(true);
        Object enum96 = ((Field) term47010).get((Object) null);
        term46507 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term46510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46525 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46507, term46507.getClass(), "id", 1120271104);
        setBooleanField(term46507, term46507.getClass(), "enable", true);
        setIntField(term46511, term46511.getClass(), "year", 2024);
        setShortField(term46511, term46511.getClass(), "month", (short) 9);
        setShortField(term46511, term46511.getClass(), "day", (short) 22);
        setField(term46510, term46510.getClass(), "date", term46511);
        setByteField(term46515, term46515.getClass(), "hour", (byte) 0);
        setByteField(term46515, term46515.getClass(), "minute", (byte) 11);
        setByteField(term46515, term46515.getClass(), "second", (byte) 7);
        setIntField(term46515, term46515.getClass(), "nano", 56643259);
        setField(term46510, term46510.getClass(), "time", term46515);
        setField(term46507, term46507.getClass(), "startTime", term46510);
        setIntField(term46521, term46521.getClass(), "year", 2021);
        setShortField(term46521, term46521.getClass(), "month", (short) 12);
        setShortField(term46521, term46521.getClass(), "day", (short) 21);
        setField(term46520, term46520.getClass(), "date", term46521);
        setByteField(term46525, term46525.getClass(), "hour", (byte) 12);
        setByteField(term46525, term46525.getClass(), "minute", (byte) 59);
        setByteField(term46525, term46525.getClass(), "second", (byte) 52);
        setIntField(term46525, term46525.getClass(), "nano", 47081639);
        setField(term46520, term46520.getClass(), "time", term46525);
        setField(term46507, term46507.getClass(), "endTime", term46520);
        setField(term46507, term46507.getClass(), "name", "LRzADDSjVT");
        setField(term46507, term46507.getClass(), "description", "lpFCMaAYxj");
        setField(term46507, term46507.getClass(), "league", enum95);
        setIntField(term46507, term46507.getClass(), "stars", -128435804);
        setIntField(term46507, term46507.getClass(), "minComplexity", 2136158480);
        setIntField(term46507, term46507.getClass(), "maxComplexity", 2118747457);
        setIntField(term46507, term46507.getClass(), "stages", 1868344256);
        setField(term46507, term46507.getClass(), "stageLimit", "fzHVMNSLii");
        setField(term46507, term46507.getClass(), "normaType", enum96);
        setIntField(term46507, term46507.getClass(), "bronzeBorders", 1857693976);
        setIntField(term46507, term46507.getClass(), "sliverBorders", 1631305277);
        setIntField(term46507, term46507.getClass(), "goldBorders", 162113491);
        setField(term46507, term46507.getClass(), "pvList", "TxymnVINZF");
        setField(term46507, term46507.getClass(), "pvDiffList", "fkBfmixBEh");
        setField(term46507, term46507.getClass(), "bronzeContestReward", "SWbairdDKL");
        setField(term46507, term46507.getClass(), "sliverContestReward", "AibUFEALwF");
        setField(term46507, term46507.getClass(), "goldContestReward", "eXOUrXTrdW");
        setField(term46507, term46507.getClass(), "contestEntryReward", "aomDEETHep");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvDiffList", argTypes, term46507, args);
    }

};



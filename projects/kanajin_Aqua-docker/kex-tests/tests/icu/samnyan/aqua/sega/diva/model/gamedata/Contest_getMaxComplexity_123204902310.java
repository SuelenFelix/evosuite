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

public class Contest_getMaxComplexity_123204902310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39515;

    public Contest_getMaxComplexity_123204902310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39706 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term39705 = ((Class) term39706).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term39705).setAccessible(true);
        Object enum79 = ((Field) term39705).get((Object) null);
        Class<? extends Object> term40024 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term40023 = ((Class) term40024).getDeclaredField((String) "PERCENTAGE");
        ((Field) term40023).setAccessible(true);
        Object enum80 = ((Field) term40023).get((Object) null);
        term39515 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term39518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39533 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39515, term39515.getClass(), "id", -64893740);
        setBooleanField(term39515, term39515.getClass(), "enable", false);
        setIntField(term39519, term39519.getClass(), "year", 2013);
        setShortField(term39519, term39519.getClass(), "month", (short) 11);
        setShortField(term39519, term39519.getClass(), "day", (short) 19);
        setField(term39518, term39518.getClass(), "date", term39519);
        setByteField(term39523, term39523.getClass(), "hour", (byte) 6);
        setByteField(term39523, term39523.getClass(), "minute", (byte) 45);
        setByteField(term39523, term39523.getClass(), "second", (byte) 10);
        setIntField(term39523, term39523.getClass(), "nano", 288981190);
        setField(term39518, term39518.getClass(), "time", term39523);
        setField(term39515, term39515.getClass(), "startTime", term39518);
        setIntField(term39529, term39529.getClass(), "year", 2025);
        setShortField(term39529, term39529.getClass(), "month", (short) 9);
        setShortField(term39529, term39529.getClass(), "day", (short) 18);
        setField(term39528, term39528.getClass(), "date", term39529);
        setByteField(term39533, term39533.getClass(), "hour", (byte) 16);
        setByteField(term39533, term39533.getClass(), "minute", (byte) 1);
        setByteField(term39533, term39533.getClass(), "second", (byte) 23);
        setIntField(term39533, term39533.getClass(), "nano", 178285726);
        setField(term39528, term39528.getClass(), "time", term39533);
        setField(term39515, term39515.getClass(), "endTime", term39528);
        setField(term39515, term39515.getClass(), "name", "pEZeQhLjKN");
        setField(term39515, term39515.getClass(), "description", "saKRDpPnGD");
        setField(term39515, term39515.getClass(), "league", enum79);
        setIntField(term39515, term39515.getClass(), "stars", -222012928);
        setIntField(term39515, term39515.getClass(), "minComplexity", -146564963);
        setIntField(term39515, term39515.getClass(), "maxComplexity", -83178716);
        setIntField(term39515, term39515.getClass(), "stages", -1292704466);
        setField(term39515, term39515.getClass(), "stageLimit", "UesGweYSco");
        setField(term39515, term39515.getClass(), "normaType", enum80);
        setIntField(term39515, term39515.getClass(), "bronzeBorders", 1991858584);
        setIntField(term39515, term39515.getClass(), "sliverBorders", -1300947782);
        setIntField(term39515, term39515.getClass(), "goldBorders", 188512644);
        setField(term39515, term39515.getClass(), "pvList", "uVnPUUZHSY");
        setField(term39515, term39515.getClass(), "pvDiffList", "LaWPqdDqyl");
        setField(term39515, term39515.getClass(), "bronzeContestReward", "BGDjrSZTJY");
        setField(term39515, term39515.getClass(), "sliverContestReward", "VUVCEVItic");
        setField(term39515, term39515.getClass(), "goldContestReward", "tloEDDASGy");
        setField(term39515, term39515.getClass(), "contestEntryReward", "CQMdMBIICe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxComplexity", argTypes, term39515, args);
    }

};



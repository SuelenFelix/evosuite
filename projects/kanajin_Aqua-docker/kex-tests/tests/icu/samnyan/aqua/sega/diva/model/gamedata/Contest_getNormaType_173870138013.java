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

public class Contest_getNormaType_173870138013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42150;

    public Contest_getNormaType_173870138013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42336 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term42335 = ((Class) term42336).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term42335).setAccessible(true);
        Object enum85 = ((Field) term42335).get((Object) null);
        Class<? extends Object> term42654 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term42653 = ((Class) term42654).getDeclaredField((String) "SCORE");
        ((Field) term42653).setAccessible(true);
        Object enum86 = ((Field) term42653).get((Object) null);
        term42150 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term42153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42158 = newInstance(Class.forName("java.time.LocalTime"));
        Object term42163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42168 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term42150, term42150.getClass(), "id", -2023791789);
        setBooleanField(term42150, term42150.getClass(), "enable", false);
        setIntField(term42154, term42154.getClass(), "year", 2013);
        setShortField(term42154, term42154.getClass(), "month", (short) 7);
        setShortField(term42154, term42154.getClass(), "day", (short) 3);
        setField(term42153, term42153.getClass(), "date", term42154);
        setByteField(term42158, term42158.getClass(), "hour", (byte) 10);
        setByteField(term42158, term42158.getClass(), "minute", (byte) 59);
        setByteField(term42158, term42158.getClass(), "second", (byte) 22);
        setIntField(term42158, term42158.getClass(), "nano", 937921480);
        setField(term42153, term42153.getClass(), "time", term42158);
        setField(term42150, term42150.getClass(), "startTime", term42153);
        setIntField(term42164, term42164.getClass(), "year", 2012);
        setShortField(term42164, term42164.getClass(), "month", (short) 2);
        setShortField(term42164, term42164.getClass(), "day", (short) 29);
        setField(term42163, term42163.getClass(), "date", term42164);
        setByteField(term42168, term42168.getClass(), "hour", (byte) 14);
        setByteField(term42168, term42168.getClass(), "minute", (byte) 26);
        setByteField(term42168, term42168.getClass(), "second", (byte) 20);
        setIntField(term42168, term42168.getClass(), "nano", 780823452);
        setField(term42163, term42163.getClass(), "time", term42168);
        setField(term42150, term42150.getClass(), "endTime", term42163);
        setField(term42150, term42150.getClass(), "name", "DNkENYBesD");
        setField(term42150, term42150.getClass(), "description", "TSogTVVlxc");
        setField(term42150, term42150.getClass(), "league", enum85);
        setIntField(term42150, term42150.getClass(), "stars", 353974456);
        setIntField(term42150, term42150.getClass(), "minComplexity", -485108462);
        setIntField(term42150, term42150.getClass(), "maxComplexity", 1418551216);
        setIntField(term42150, term42150.getClass(), "stages", -626779272);
        setField(term42150, term42150.getClass(), "stageLimit", "kWEJlReukq");
        setField(term42150, term42150.getClass(), "normaType", enum86);
        setIntField(term42150, term42150.getClass(), "bronzeBorders", -1150062870);
        setIntField(term42150, term42150.getClass(), "sliverBorders", -886200503);
        setIntField(term42150, term42150.getClass(), "goldBorders", 1136393691);
        setField(term42150, term42150.getClass(), "pvList", "jkCUxevJxb");
        setField(term42150, term42150.getClass(), "pvDiffList", "WqobQIRpLc");
        setField(term42150, term42150.getClass(), "bronzeContestReward", "jesZbitPYU");
        setField(term42150, term42150.getClass(), "sliverContestReward", "oIbEvXxpda");
        setField(term42150, term42150.getClass(), "goldContestReward", "QyHVDeaOqb");
        setField(term42150, term42150.getClass(), "contestEntryReward", "ZwnEWySrcE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNormaType", argTypes, term42150, args);
    }

};



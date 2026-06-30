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

public class Contest_getPvList_186478698817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45658;

    public Contest_getPvList_186478698817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45840 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term45839 = ((Class) term45840).getDeclaredField((String) "ADVANCED");
        ((Field) term45839).setAccessible(true);
        Object enum93 = ((Field) term45839).get((Object) null);
        Class<? extends Object> term46146 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term46145 = ((Class) term46146).getDeclaredField((String) "SCORE");
        ((Field) term46145).setAccessible(true);
        Object enum94 = ((Field) term46145).get((Object) null);
        term45658 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term45661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45676 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term45658, term45658.getClass(), "id", 1460702778);
        setBooleanField(term45658, term45658.getClass(), "enable", false);
        setIntField(term45662, term45662.getClass(), "year", 2022);
        setShortField(term45662, term45662.getClass(), "month", (short) 11);
        setShortField(term45662, term45662.getClass(), "day", (short) 5);
        setField(term45661, term45661.getClass(), "date", term45662);
        setByteField(term45666, term45666.getClass(), "hour", (byte) 0);
        setByteField(term45666, term45666.getClass(), "minute", (byte) 51);
        setByteField(term45666, term45666.getClass(), "second", (byte) 23);
        setIntField(term45666, term45666.getClass(), "nano", 1140962);
        setField(term45661, term45661.getClass(), "time", term45666);
        setField(term45658, term45658.getClass(), "startTime", term45661);
        setIntField(term45672, term45672.getClass(), "year", 2020);
        setShortField(term45672, term45672.getClass(), "month", (short) 5);
        setShortField(term45672, term45672.getClass(), "day", (short) 24);
        setField(term45671, term45671.getClass(), "date", term45672);
        setByteField(term45676, term45676.getClass(), "hour", (byte) 2);
        setByteField(term45676, term45676.getClass(), "minute", (byte) 9);
        setByteField(term45676, term45676.getClass(), "second", (byte) 52);
        setIntField(term45676, term45676.getClass(), "nano", 653329393);
        setField(term45671, term45671.getClass(), "time", term45676);
        setField(term45658, term45658.getClass(), "endTime", term45671);
        setField(term45658, term45658.getClass(), "name", "rLDmBbcLaC");
        setField(term45658, term45658.getClass(), "description", "tUKcXglBlG");
        setField(term45658, term45658.getClass(), "league", enum93);
        setIntField(term45658, term45658.getClass(), "stars", -1398142433);
        setIntField(term45658, term45658.getClass(), "minComplexity", -1112119058);
        setIntField(term45658, term45658.getClass(), "maxComplexity", 2073858334);
        setIntField(term45658, term45658.getClass(), "stages", -1693535639);
        setField(term45658, term45658.getClass(), "stageLimit", "ZGptycjjRq");
        setField(term45658, term45658.getClass(), "normaType", enum94);
        setIntField(term45658, term45658.getClass(), "bronzeBorders", 1344744036);
        setIntField(term45658, term45658.getClass(), "sliverBorders", -98060427);
        setIntField(term45658, term45658.getClass(), "goldBorders", -1272268399);
        setField(term45658, term45658.getClass(), "pvList", "kXJaxapFer");
        setField(term45658, term45658.getClass(), "pvDiffList", "OEeAVwVwuj");
        setField(term45658, term45658.getClass(), "bronzeContestReward", "WEgFuDZsxi");
        setField(term45658, term45658.getClass(), "sliverContestReward", "kvcaSGNTHd");
        setField(term45658, term45658.getClass(), "goldContestReward", "opXkGeBDoI");
        setField(term45658, term45658.getClass(), "contestEntryReward", "UHxidCtatV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvList", argTypes, term45658, args);
    }

};



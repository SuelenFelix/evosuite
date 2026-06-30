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

public class Contest_getEndTime_245577044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34329;

    public Contest_getEndTime_245577044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34511 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term34510 = ((Class) term34511).getDeclaredField((String) "ADVANCED");
        ((Field) term34510).setAccessible(true);
        Object enum67 = ((Field) term34510).get((Object) null);
        Class<? extends Object> term34817 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term34816 = ((Class) term34817).getDeclaredField((String) "SCORE");
        ((Field) term34816).setAccessible(true);
        Object enum68 = ((Field) term34816).get((Object) null);
        term34329 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term34332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34337 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34347 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term34329, term34329.getClass(), "id", -1955400589);
        setBooleanField(term34329, term34329.getClass(), "enable", true);
        setIntField(term34333, term34333.getClass(), "year", 2013);
        setShortField(term34333, term34333.getClass(), "month", (short) 5);
        setShortField(term34333, term34333.getClass(), "day", (short) 9);
        setField(term34332, term34332.getClass(), "date", term34333);
        setByteField(term34337, term34337.getClass(), "hour", (byte) 4);
        setByteField(term34337, term34337.getClass(), "minute", (byte) 18);
        setByteField(term34337, term34337.getClass(), "second", (byte) 35);
        setIntField(term34337, term34337.getClass(), "nano", 909079395);
        setField(term34332, term34332.getClass(), "time", term34337);
        setField(term34329, term34329.getClass(), "startTime", term34332);
        setIntField(term34343, term34343.getClass(), "year", 2015);
        setShortField(term34343, term34343.getClass(), "month", (short) 3);
        setShortField(term34343, term34343.getClass(), "day", (short) 15);
        setField(term34342, term34342.getClass(), "date", term34343);
        setByteField(term34347, term34347.getClass(), "hour", (byte) 8);
        setByteField(term34347, term34347.getClass(), "minute", (byte) 45);
        setByteField(term34347, term34347.getClass(), "second", (byte) 29);
        setIntField(term34347, term34347.getClass(), "nano", 781486470);
        setField(term34342, term34342.getClass(), "time", term34347);
        setField(term34329, term34329.getClass(), "endTime", term34342);
        setField(term34329, term34329.getClass(), "name", "QWknVCpJTU");
        setField(term34329, term34329.getClass(), "description", "XhnCbWwpIr");
        setField(term34329, term34329.getClass(), "league", enum67);
        setIntField(term34329, term34329.getClass(), "stars", 626179200);
        setIntField(term34329, term34329.getClass(), "minComplexity", -511077684);
        setIntField(term34329, term34329.getClass(), "maxComplexity", -711507760);
        setIntField(term34329, term34329.getClass(), "stages", 1053773809);
        setField(term34329, term34329.getClass(), "stageLimit", "BVMUadSiyU");
        setField(term34329, term34329.getClass(), "normaType", enum68);
        setIntField(term34329, term34329.getClass(), "bronzeBorders", 924127883);
        setIntField(term34329, term34329.getClass(), "sliverBorders", -751079123);
        setIntField(term34329, term34329.getClass(), "goldBorders", -110837188);
        setField(term34329, term34329.getClass(), "pvList", "OhWrgFwvJi");
        setField(term34329, term34329.getClass(), "pvDiffList", "DfKWXfTINQ");
        setField(term34329, term34329.getClass(), "bronzeContestReward", "KqusFIxuyo");
        setField(term34329, term34329.getClass(), "sliverContestReward", "CDpvEYMuDg");
        setField(term34329, term34329.getClass(), "goldContestReward", "YaZCAiIUPe");
        setField(term34329, term34329.getClass(), "contestEntryReward", "KsCWHUcJDd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndTime", argTypes, term34329, args);
    }

};



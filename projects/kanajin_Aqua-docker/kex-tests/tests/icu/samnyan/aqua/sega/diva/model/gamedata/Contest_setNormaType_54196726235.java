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

public class Contest_setNormaType_54196726235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61418;
     Object enum131;

    public Contest_setNormaType_54196726235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61615 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term61614 = ((Class) term61615).getDeclaredField((String) "ADVANCED");
        ((Field) term61614).setAccessible(true);
        Object enum129 = ((Field) term61614).get((Object) null);
        Class<? extends Object> term61921 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term61920 = ((Class) term61921).getDeclaredField((String) "PERCENTAGE");
        ((Field) term61920).setAccessible(true);
        Object enum130 = ((Field) term61920).get((Object) null);
        term61418 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term61421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61436 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term61418, term61418.getClass(), "id", 1970654816);
        setBooleanField(term61418, term61418.getClass(), "enable", true);
        setIntField(term61422, term61422.getClass(), "year", 2023);
        setShortField(term61422, term61422.getClass(), "month", (short) 7);
        setShortField(term61422, term61422.getClass(), "day", (short) 27);
        setField(term61421, term61421.getClass(), "date", term61422);
        setByteField(term61426, term61426.getClass(), "hour", (byte) 4);
        setByteField(term61426, term61426.getClass(), "minute", (byte) 25);
        setByteField(term61426, term61426.getClass(), "second", (byte) 46);
        setIntField(term61426, term61426.getClass(), "nano", 646465452);
        setField(term61421, term61421.getClass(), "time", term61426);
        setField(term61418, term61418.getClass(), "startTime", term61421);
        setIntField(term61432, term61432.getClass(), "year", 2022);
        setShortField(term61432, term61432.getClass(), "month", (short) 11);
        setShortField(term61432, term61432.getClass(), "day", (short) 2);
        setField(term61431, term61431.getClass(), "date", term61432);
        setByteField(term61436, term61436.getClass(), "hour", (byte) 4);
        setByteField(term61436, term61436.getClass(), "minute", (byte) 14);
        setByteField(term61436, term61436.getClass(), "second", (byte) 5);
        setIntField(term61436, term61436.getClass(), "nano", 604465127);
        setField(term61431, term61431.getClass(), "time", term61436);
        setField(term61418, term61418.getClass(), "endTime", term61431);
        setField(term61418, term61418.getClass(), "name", "BVlqqUSYbB");
        setField(term61418, term61418.getClass(), "description", "hhGHcwcBqB");
        setField(term61418, term61418.getClass(), "league", enum129);
        setIntField(term61418, term61418.getClass(), "stars", 1354781442);
        setIntField(term61418, term61418.getClass(), "minComplexity", -393590701);
        setIntField(term61418, term61418.getClass(), "maxComplexity", 86344574);
        setIntField(term61418, term61418.getClass(), "stages", -829441157);
        setField(term61418, term61418.getClass(), "stageLimit", "WIVENkFxNU");
        setField(term61418, term61418.getClass(), "normaType", enum130);
        setIntField(term61418, term61418.getClass(), "bronzeBorders", -1489991025);
        setIntField(term61418, term61418.getClass(), "sliverBorders", -1542979444);
        setIntField(term61418, term61418.getClass(), "goldBorders", -1130401612);
        setField(term61418, term61418.getClass(), "pvList", "MFSosHURtm");
        setField(term61418, term61418.getClass(), "pvDiffList", "hIBYlJpYye");
        setField(term61418, term61418.getClass(), "bronzeContestReward", "LNendOzJhj");
        setField(term61418, term61418.getClass(), "sliverContestReward", "ZwcevQDgzv");
        setField(term61418, term61418.getClass(), "goldContestReward", "rzkENrHYBI");
        setField(term61418, term61418.getClass(), "contestEntryReward", "ylJjmNVzzt");
        Class<? extends Object> term62298 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term62297 = ((Class) term62298).getDeclaredField((String) "SCORE");
        ((Field) term62297).setAccessible(true);
        enum131 = ((Field) term62297).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Object[] args = new Object[1];
        args[0] = enum131;
        callMethod(klass, "setNormaType", argTypes, term61418, args);
    }

};



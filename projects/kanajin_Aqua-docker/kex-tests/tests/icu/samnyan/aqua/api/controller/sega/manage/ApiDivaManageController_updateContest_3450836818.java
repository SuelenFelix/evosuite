package icu.samnyan.aqua.api.controller.sega.manage;

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
import static icu.samnyan.aqua.api.controller.sega.manage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ApiDivaManageController_updateContest_3450836818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1269;

    public ApiDivaManageController_updateContest_3450836818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1516 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term1515 = ((Class) term1516).getDeclaredField((String) "BEGINNER");
        ((Field) term1515).setAccessible(true);
        Object enum3 = ((Field) term1515).get((Object) null);
        Class<? extends Object> term1867 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term1866 = ((Class) term1867).getDeclaredField((String) "PERCENTAGE");
        ((Field) term1866).setAccessible(true);
        Object enum4 = ((Field) term1866).get((Object) null);
        term1269 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term1272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1287 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1269, term1269.getClass(), "id", -1016503459);
        setBooleanField(term1269, term1269.getClass(), "enable", false);
        setIntField(term1273, term1273.getClass(), "year", 2010);
        setShortField(term1273, term1273.getClass(), "month", (short) 6);
        setShortField(term1273, term1273.getClass(), "day", (short) 14);
        setField(term1272, term1272.getClass(), "date", term1273);
        setByteField(term1277, term1277.getClass(), "hour", (byte) 6);
        setByteField(term1277, term1277.getClass(), "minute", (byte) 22);
        setByteField(term1277, term1277.getClass(), "second", (byte) 20);
        setIntField(term1277, term1277.getClass(), "nano", 25133051);
        setField(term1272, term1272.getClass(), "time", term1277);
        setField(term1269, term1269.getClass(), "startTime", term1272);
        setIntField(term1283, term1283.getClass(), "year", 2010);
        setShortField(term1283, term1283.getClass(), "month", (short) 5);
        setShortField(term1283, term1283.getClass(), "day", (short) 2);
        setField(term1282, term1282.getClass(), "date", term1283);
        setByteField(term1287, term1287.getClass(), "hour", (byte) 2);
        setByteField(term1287, term1287.getClass(), "minute", (byte) 22);
        setByteField(term1287, term1287.getClass(), "second", (byte) 33);
        setIntField(term1287, term1287.getClass(), "nano", 530835039);
        setField(term1282, term1282.getClass(), "time", term1287);
        setField(term1269, term1269.getClass(), "endTime", term1282);
        setField(term1269, term1269.getClass(), "name", "jJCZpVmanW");
        setField(term1269, term1269.getClass(), "description", "EGtDIRbSSb");
        setField(term1269, term1269.getClass(), "league", enum3);
        setIntField(term1269, term1269.getClass(), "stars", -1968847291);
        setIntField(term1269, term1269.getClass(), "minComplexity", 579005622);
        setIntField(term1269, term1269.getClass(), "maxComplexity", -14890619);
        setIntField(term1269, term1269.getClass(), "stages", 1632125673);
        setField(term1269, term1269.getClass(), "stageLimit", "SzjVpOQTyS");
        setField(term1269, term1269.getClass(), "normaType", enum4);
        setIntField(term1269, term1269.getClass(), "bronzeBorders", 454281060);
        setIntField(term1269, term1269.getClass(), "sliverBorders", -1786399638);
        setIntField(term1269, term1269.getClass(), "goldBorders", 2055867847);
        setField(term1269, term1269.getClass(), "pvList", "MjGYSRKTNF");
        setField(term1269, term1269.getClass(), "pvDiffList", "hRNSzYYIrc");
        setField(term1269, term1269.getClass(), "bronzeContestReward", "RMFIsYGgne");
        setField(term1269, term1269.getClass(), "sliverContestReward", "NRdvgJlhkX");
        setField(term1269, term1269.getClass(), "goldContestReward", "uuaPigETmJ");
        setField(term1269, term1269.getClass(), "contestEntryReward", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.manage.ApiDivaManageController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Object[] args = new Object[1];
        args[0] = term1269;
        callMethod(klass, "updateContest", argTypes, null, args);
    }

};



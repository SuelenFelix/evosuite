package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getMatchEndTime_100619296111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5856;

    public GameSetting_getMatchEndTime_100619296111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5856 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term5856, term5856.getClass(), "romVersion", "hwjlcimgJH");
        setField(term5856, term5856.getClass(), "dataVersion", "TLxQzxvizR");
        setBooleanField(term5856, term5856.getClass(), "isMaintenance", false);
        setIntField(term5856, term5856.getClass(), "requestInterval", 456313553);
        setField(term5856, term5856.getClass(), "rebootStartTime", "uUgJfKAzDM");
        setField(term5856, term5856.getClass(), "rebootEndTime", "gZPZNkweEp");
        setBooleanField(term5856, term5856.getClass(), "isBackgroundDistribute", true);
        setIntField(term5856, term5856.getClass(), "maxCountCharacter", 1636460194);
        setIntField(term5856, term5856.getClass(), "maxCountItem", -1926178417);
        setIntField(term5856, term5856.getClass(), "maxCountMusic", -1011180309);
        setField(term5856, term5856.getClass(), "matchStartTime", "vfennwtmqe");
        setField(term5856, term5856.getClass(), "matchEndTime", "zZxoNkohbw");
        setIntField(term5856, term5856.getClass(), "matchTimeLimit", -342719145);
        setIntField(term5856, term5856.getClass(), "matchErrorLimit", 2101766592);
        setField(term5856, term5856.getClass(), "matchingUri", "DQrjPcLysX");
        setField(term5856, term5856.getClass(), "udpHolePunchUri", "VWPFyrpmmb");
        setField(term5856, term5856.getClass(), "reflectorUri", "gYYKrIeThw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchEndTime", argTypes, term5856, args);
    }

};



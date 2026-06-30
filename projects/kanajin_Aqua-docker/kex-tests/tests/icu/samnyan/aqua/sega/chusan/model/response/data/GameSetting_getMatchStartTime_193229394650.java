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

public class GameSetting_getMatchStartTime_193229394650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11965;

    public GameSetting_getMatchStartTime_193229394650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11965 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term11965, term11965.getClass(), "romVersion", null);
        setField(term11965, term11965.getClass(), "dataVersion", null);
        setBooleanField(term11965, term11965.getClass(), "isMaintenance", false);
        setIntField(term11965, term11965.getClass(), "requestInterval", 0);
        setField(term11965, term11965.getClass(), "rebootStartTime", null);
        setField(term11965, term11965.getClass(), "rebootEndTime", null);
        setBooleanField(term11965, term11965.getClass(), "isBackgroundDistribute", false);
        setIntField(term11965, term11965.getClass(), "maxCountCharacter", 0);
        setIntField(term11965, term11965.getClass(), "maxCountItem", 0);
        setIntField(term11965, term11965.getClass(), "maxCountMusic", 0);
        setField(term11965, term11965.getClass(), "matchStartTime", null);
        setField(term11965, term11965.getClass(), "matchEndTime", null);
        setIntField(term11965, term11965.getClass(), "matchTimeLimit", 0);
        setIntField(term11965, term11965.getClass(), "matchErrorLimit", 0);
        setField(term11965, term11965.getClass(), "matchingUri", null);
        setField(term11965, term11965.getClass(), "udpHolePunchUri", null);
        setField(term11965, term11965.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchStartTime", argTypes, term11965, args);
    }

};



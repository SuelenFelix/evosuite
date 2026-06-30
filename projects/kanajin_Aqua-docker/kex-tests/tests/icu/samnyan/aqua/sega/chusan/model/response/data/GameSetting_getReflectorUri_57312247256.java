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

public class GameSetting_getReflectorUri_57312247256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12019;

    public GameSetting_getReflectorUri_57312247256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12019 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12019, term12019.getClass(), "romVersion", null);
        setField(term12019, term12019.getClass(), "dataVersion", null);
        setBooleanField(term12019, term12019.getClass(), "isMaintenance", false);
        setIntField(term12019, term12019.getClass(), "requestInterval", 0);
        setField(term12019, term12019.getClass(), "rebootStartTime", null);
        setField(term12019, term12019.getClass(), "rebootEndTime", null);
        setBooleanField(term12019, term12019.getClass(), "isBackgroundDistribute", false);
        setIntField(term12019, term12019.getClass(), "maxCountCharacter", 0);
        setIntField(term12019, term12019.getClass(), "maxCountItem", 0);
        setIntField(term12019, term12019.getClass(), "maxCountMusic", 0);
        setField(term12019, term12019.getClass(), "matchStartTime", null);
        setField(term12019, term12019.getClass(), "matchEndTime", null);
        setIntField(term12019, term12019.getClass(), "matchTimeLimit", 0);
        setIntField(term12019, term12019.getClass(), "matchErrorLimit", 0);
        setField(term12019, term12019.getClass(), "matchingUri", null);
        setField(term12019, term12019.getClass(), "udpHolePunchUri", null);
        setField(term12019, term12019.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReflectorUri", argTypes, term12019, args);
    }

};



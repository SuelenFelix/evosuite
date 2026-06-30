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

public class GameSetting_getRomVersion_148997551640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11875;

    public GameSetting_getRomVersion_148997551640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11875 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term11875, term11875.getClass(), "romVersion", null);
        setField(term11875, term11875.getClass(), "dataVersion", null);
        setBooleanField(term11875, term11875.getClass(), "isMaintenance", false);
        setIntField(term11875, term11875.getClass(), "requestInterval", 0);
        setField(term11875, term11875.getClass(), "rebootStartTime", null);
        setField(term11875, term11875.getClass(), "rebootEndTime", null);
        setBooleanField(term11875, term11875.getClass(), "isBackgroundDistribute", false);
        setIntField(term11875, term11875.getClass(), "maxCountCharacter", 0);
        setIntField(term11875, term11875.getClass(), "maxCountItem", 0);
        setIntField(term11875, term11875.getClass(), "maxCountMusic", 0);
        setField(term11875, term11875.getClass(), "matchStartTime", null);
        setField(term11875, term11875.getClass(), "matchEndTime", null);
        setIntField(term11875, term11875.getClass(), "matchTimeLimit", 0);
        setIntField(term11875, term11875.getClass(), "matchErrorLimit", 0);
        setField(term11875, term11875.getClass(), "matchingUri", null);
        setField(term11875, term11875.getClass(), "udpHolePunchUri", null);
        setField(term11875, term11875.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRomVersion", argTypes, term11875, args);
    }

};



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

public class GameSetting_getRequestInterval_54612028943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11902;

    public GameSetting_getRequestInterval_54612028943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11902 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term11902, term11902.getClass(), "romVersion", null);
        setField(term11902, term11902.getClass(), "dataVersion", null);
        setBooleanField(term11902, term11902.getClass(), "isMaintenance", false);
        setIntField(term11902, term11902.getClass(), "requestInterval", 0);
        setField(term11902, term11902.getClass(), "rebootStartTime", null);
        setField(term11902, term11902.getClass(), "rebootEndTime", null);
        setBooleanField(term11902, term11902.getClass(), "isBackgroundDistribute", false);
        setIntField(term11902, term11902.getClass(), "maxCountCharacter", 0);
        setIntField(term11902, term11902.getClass(), "maxCountItem", 0);
        setIntField(term11902, term11902.getClass(), "maxCountMusic", 0);
        setField(term11902, term11902.getClass(), "matchStartTime", null);
        setField(term11902, term11902.getClass(), "matchEndTime", null);
        setIntField(term11902, term11902.getClass(), "matchTimeLimit", 0);
        setIntField(term11902, term11902.getClass(), "matchErrorLimit", 0);
        setField(term11902, term11902.getClass(), "matchingUri", null);
        setField(term11902, term11902.getClass(), "udpHolePunchUri", null);
        setField(term11902, term11902.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestInterval", argTypes, term11902, args);
    }

};



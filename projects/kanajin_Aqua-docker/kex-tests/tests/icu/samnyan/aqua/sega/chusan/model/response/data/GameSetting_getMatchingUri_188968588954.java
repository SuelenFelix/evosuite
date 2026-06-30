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

public class GameSetting_getMatchingUri_188968588954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12001;

    public GameSetting_getMatchingUri_188968588954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12001 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12001, term12001.getClass(), "romVersion", null);
        setField(term12001, term12001.getClass(), "dataVersion", null);
        setBooleanField(term12001, term12001.getClass(), "isMaintenance", false);
        setIntField(term12001, term12001.getClass(), "requestInterval", 0);
        setField(term12001, term12001.getClass(), "rebootStartTime", null);
        setField(term12001, term12001.getClass(), "rebootEndTime", null);
        setBooleanField(term12001, term12001.getClass(), "isBackgroundDistribute", false);
        setIntField(term12001, term12001.getClass(), "maxCountCharacter", 0);
        setIntField(term12001, term12001.getClass(), "maxCountItem", 0);
        setIntField(term12001, term12001.getClass(), "maxCountMusic", 0);
        setField(term12001, term12001.getClass(), "matchStartTime", null);
        setField(term12001, term12001.getClass(), "matchEndTime", null);
        setIntField(term12001, term12001.getClass(), "matchTimeLimit", 0);
        setIntField(term12001, term12001.getClass(), "matchErrorLimit", 0);
        setField(term12001, term12001.getClass(), "matchingUri", null);
        setField(term12001, term12001.getClass(), "udpHolePunchUri", null);
        setField(term12001, term12001.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchingUri", argTypes, term12001, args);
    }

};



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

public class GameSetting_toString_193069742277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12224;

    public GameSetting_toString_193069742277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12224 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12224, term12224.getClass(), "romVersion", null);
        setField(term12224, term12224.getClass(), "dataVersion", null);
        setBooleanField(term12224, term12224.getClass(), "isMaintenance", false);
        setIntField(term12224, term12224.getClass(), "requestInterval", 0);
        setField(term12224, term12224.getClass(), "rebootStartTime", null);
        setField(term12224, term12224.getClass(), "rebootEndTime", null);
        setBooleanField(term12224, term12224.getClass(), "isBackgroundDistribute", false);
        setIntField(term12224, term12224.getClass(), "maxCountCharacter", 0);
        setIntField(term12224, term12224.getClass(), "maxCountItem", 0);
        setIntField(term12224, term12224.getClass(), "maxCountMusic", 0);
        setField(term12224, term12224.getClass(), "matchStartTime", null);
        setField(term12224, term12224.getClass(), "matchEndTime", null);
        setIntField(term12224, term12224.getClass(), "matchTimeLimit", 0);
        setIntField(term12224, term12224.getClass(), "matchErrorLimit", 0);
        setField(term12224, term12224.getClass(), "matchingUri", null);
        setField(term12224, term12224.getClass(), "udpHolePunchUri", null);
        setField(term12224, term12224.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12224, args);
    }

};



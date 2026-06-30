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

public class GameSetting_hashCode_141993773276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12215;

    public GameSetting_hashCode_141993773276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12215 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12215, term12215.getClass(), "romVersion", null);
        setField(term12215, term12215.getClass(), "dataVersion", null);
        setBooleanField(term12215, term12215.getClass(), "isMaintenance", false);
        setIntField(term12215, term12215.getClass(), "requestInterval", 0);
        setField(term12215, term12215.getClass(), "rebootStartTime", null);
        setField(term12215, term12215.getClass(), "rebootEndTime", null);
        setBooleanField(term12215, term12215.getClass(), "isBackgroundDistribute", false);
        setIntField(term12215, term12215.getClass(), "maxCountCharacter", 0);
        setIntField(term12215, term12215.getClass(), "maxCountItem", 0);
        setIntField(term12215, term12215.getClass(), "maxCountMusic", 0);
        setField(term12215, term12215.getClass(), "matchStartTime", null);
        setField(term12215, term12215.getClass(), "matchEndTime", null);
        setIntField(term12215, term12215.getClass(), "matchTimeLimit", 0);
        setIntField(term12215, term12215.getClass(), "matchErrorLimit", 0);
        setField(term12215, term12215.getClass(), "matchingUri", null);
        setField(term12215, term12215.getClass(), "udpHolePunchUri", null);
        setField(term12215, term12215.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12215, args);
    }

};



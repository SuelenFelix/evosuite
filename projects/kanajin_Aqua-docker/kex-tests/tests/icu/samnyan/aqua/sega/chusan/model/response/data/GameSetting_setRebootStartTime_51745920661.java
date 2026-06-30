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

public class GameSetting_setRebootStartTime_51745920661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12068;

    public GameSetting_setRebootStartTime_51745920661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12068 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12068, term12068.getClass(), "romVersion", null);
        setField(term12068, term12068.getClass(), "dataVersion", null);
        setBooleanField(term12068, term12068.getClass(), "isMaintenance", false);
        setIntField(term12068, term12068.getClass(), "requestInterval", 0);
        setField(term12068, term12068.getClass(), "rebootStartTime", null);
        setField(term12068, term12068.getClass(), "rebootEndTime", null);
        setBooleanField(term12068, term12068.getClass(), "isBackgroundDistribute", false);
        setIntField(term12068, term12068.getClass(), "maxCountCharacter", 0);
        setIntField(term12068, term12068.getClass(), "maxCountItem", 0);
        setIntField(term12068, term12068.getClass(), "maxCountMusic", 0);
        setField(term12068, term12068.getClass(), "matchStartTime", null);
        setField(term12068, term12068.getClass(), "matchEndTime", null);
        setIntField(term12068, term12068.getClass(), "matchTimeLimit", 0);
        setIntField(term12068, term12068.getClass(), "matchErrorLimit", 0);
        setField(term12068, term12068.getClass(), "matchingUri", null);
        setField(term12068, term12068.getClass(), "udpHolePunchUri", null);
        setField(term12068, term12068.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRebootStartTime", argTypes, term12068, args);
    }

};



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

public class GameSetting_setRomVersion_135527065257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12028;

    public GameSetting_setRomVersion_135527065257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12028 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12028, term12028.getClass(), "romVersion", null);
        setField(term12028, term12028.getClass(), "dataVersion", null);
        setBooleanField(term12028, term12028.getClass(), "isMaintenance", false);
        setIntField(term12028, term12028.getClass(), "requestInterval", 0);
        setField(term12028, term12028.getClass(), "rebootStartTime", null);
        setField(term12028, term12028.getClass(), "rebootEndTime", null);
        setBooleanField(term12028, term12028.getClass(), "isBackgroundDistribute", false);
        setIntField(term12028, term12028.getClass(), "maxCountCharacter", 0);
        setIntField(term12028, term12028.getClass(), "maxCountItem", 0);
        setIntField(term12028, term12028.getClass(), "maxCountMusic", 0);
        setField(term12028, term12028.getClass(), "matchStartTime", null);
        setField(term12028, term12028.getClass(), "matchEndTime", null);
        setIntField(term12028, term12028.getClass(), "matchTimeLimit", 0);
        setIntField(term12028, term12028.getClass(), "matchErrorLimit", 0);
        setField(term12028, term12028.getClass(), "matchingUri", null);
        setField(term12028, term12028.getClass(), "udpHolePunchUri", null);
        setField(term12028, term12028.getClass(), "reflectorUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRomVersion", argTypes, term12028, args);
    }

};



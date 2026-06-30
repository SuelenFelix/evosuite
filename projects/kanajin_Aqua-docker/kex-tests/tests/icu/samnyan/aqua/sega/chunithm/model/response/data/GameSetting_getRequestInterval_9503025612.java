package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getRequestInterval_9503025612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659;

    public GameSetting_getRequestInterval_9503025612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term659, term659.getClass(), "dataVersion", -481533957);
        setBooleanField(term659, term659.getClass(), "isMaintenance", true);
        setIntField(term659, term659.getClass(), "requestInterval", 1240914516);
        setField(term659, term659.getClass(), "rebootStartTime", "jJCZpVmanW");
        setField(term659, term659.getClass(), "rebootEndTime", "EGtDIRbSSb");
        setBooleanField(term659, term659.getClass(), "isBackgroundDistribute", true);
        setIntField(term659, term659.getClass(), "maxCountCharacter", -1465035361);
        setIntField(term659, term659.getClass(), "maxCountItem", 1090617576);
        setIntField(term659, term659.getClass(), "maxCountMusic", -1547384488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestInterval", argTypes, term659, args);
    }

};



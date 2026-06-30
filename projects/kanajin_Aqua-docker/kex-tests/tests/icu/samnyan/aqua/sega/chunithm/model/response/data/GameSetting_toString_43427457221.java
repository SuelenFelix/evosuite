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

public class GameSetting_toString_43427457221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1707;

    public GameSetting_toString_43427457221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1707 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1707, term1707.getClass(), "dataVersion", 1358829571);
        setBooleanField(term1707, term1707.getClass(), "isMaintenance", false);
        setIntField(term1707, term1707.getClass(), "requestInterval", 991356662);
        setField(term1707, term1707.getClass(), "rebootStartTime", "BndsHwAFMv");
        setField(term1707, term1707.getClass(), "rebootEndTime", "GzFkzHGYFt");
        setBooleanField(term1707, term1707.getClass(), "isBackgroundDistribute", true);
        setIntField(term1707, term1707.getClass(), "maxCountCharacter", -506958186);
        setIntField(term1707, term1707.getClass(), "maxCountItem", -507387516);
        setIntField(term1707, term1707.getClass(), "maxCountMusic", -1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1707, args);
    }

};



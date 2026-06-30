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
import java.lang.Integer;

public class GameSetting_setMaxCountMusic_187705169741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1965;
     Object term1973;

    public GameSetting_setMaxCountMusic_187705169741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1965 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1965, term1965.getClass(), "dataVersion", 0);
        setBooleanField(term1965, term1965.getClass(), "isMaintenance", false);
        setIntField(term1965, term1965.getClass(), "requestInterval", 0);
        setField(term1965, term1965.getClass(), "rebootStartTime", null);
        setField(term1965, term1965.getClass(), "rebootEndTime", null);
        setBooleanField(term1965, term1965.getClass(), "isBackgroundDistribute", false);
        setIntField(term1965, term1965.getClass(), "maxCountCharacter", 0);
        setIntField(term1965, term1965.getClass(), "maxCountItem", 0);
        setIntField(term1965, term1965.getClass(), "maxCountMusic", 0);
        term1973 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1973;
        callMethod(klass, "setMaxCountMusic", argTypes, term1965, args);
    }

};



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

public class GameSetting_setMaxCountItem_169784042340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1955;
     Object term1963;

    public GameSetting_setMaxCountItem_169784042340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1955 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1955, term1955.getClass(), "dataVersion", 0);
        setBooleanField(term1955, term1955.getClass(), "isMaintenance", false);
        setIntField(term1955, term1955.getClass(), "requestInterval", 0);
        setField(term1955, term1955.getClass(), "rebootStartTime", null);
        setField(term1955, term1955.getClass(), "rebootEndTime", null);
        setBooleanField(term1955, term1955.getClass(), "isBackgroundDistribute", false);
        setIntField(term1955, term1955.getClass(), "maxCountCharacter", 0);
        setIntField(term1955, term1955.getClass(), "maxCountItem", 0);
        setIntField(term1955, term1955.getClass(), "maxCountMusic", 0);
        term1963 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1963;
        callMethod(klass, "setMaxCountItem", argTypes, term1955, args);
    }

};



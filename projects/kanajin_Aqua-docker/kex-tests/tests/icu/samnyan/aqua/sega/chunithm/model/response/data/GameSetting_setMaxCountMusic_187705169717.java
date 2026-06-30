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

public class GameSetting_setMaxCountMusic_187705169717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1495;
     Object term1527;

    public GameSetting_setMaxCountMusic_187705169717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1495 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1495, term1495.getClass(), "dataVersion", -523949691);
        setBooleanField(term1495, term1495.getClass(), "isMaintenance", true);
        setIntField(term1495, term1495.getClass(), "requestInterval", 1398204340);
        setField(term1495, term1495.getClass(), "rebootStartTime", "xrwlQZdwCp");
        setField(term1495, term1495.getClass(), "rebootEndTime", "IDCWpPLRkE");
        setBooleanField(term1495, term1495.getClass(), "isBackgroundDistribute", true);
        setIntField(term1495, term1495.getClass(), "maxCountCharacter", 229204365);
        setIntField(term1495, term1495.getClass(), "maxCountItem", -461771056);
        setIntField(term1495, term1495.getClass(), "maxCountMusic", -243422082);
        term1527 = new Integer(1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1527;
        callMethod(klass, "setMaxCountMusic", argTypes, term1495, args);
    }

};



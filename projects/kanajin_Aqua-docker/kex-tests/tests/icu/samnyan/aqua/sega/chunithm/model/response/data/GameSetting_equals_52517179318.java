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

public class GameSetting_equals_52517179318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549;
     Object term1581;

    public GameSetting_equals_52517179318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1549 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1549, term1549.getClass(), "dataVersion", -1002370457);
        setBooleanField(term1549, term1549.getClass(), "isMaintenance", true);
        setIntField(term1549, term1549.getClass(), "requestInterval", -2014576105);
        setField(term1549, term1549.getClass(), "rebootStartTime", "nyiiPDVjAc");
        setField(term1549, term1549.getClass(), "rebootEndTime", "aKnKipADSo");
        setBooleanField(term1549, term1549.getClass(), "isBackgroundDistribute", false);
        setIntField(term1549, term1549.getClass(), "maxCountCharacter", 1296895584);
        setIntField(term1549, term1549.getClass(), "maxCountItem", 628918458);
        setIntField(term1549, term1549.getClass(), "maxCountMusic", -1274456137);
        term1581 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1581;
        callMethod(klass, "equals", argTypes, term1549, args);
    }

};



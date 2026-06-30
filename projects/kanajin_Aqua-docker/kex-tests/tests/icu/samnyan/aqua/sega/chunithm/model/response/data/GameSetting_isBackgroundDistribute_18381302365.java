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

public class GameSetting_isBackgroundDistribute_18381302365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815;

    public GameSetting_isBackgroundDistribute_18381302365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term815 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term815, term815.getClass(), "dataVersion", -1263114719);
        setBooleanField(term815, term815.getClass(), "isMaintenance", false);
        setIntField(term815, term815.getClass(), "requestInterval", -894662986);
        setField(term815, term815.getClass(), "rebootStartTime", "NRdvgJlhkX");
        setField(term815, term815.getClass(), "rebootEndTime", "uuaPigETmJ");
        setBooleanField(term815, term815.getClass(), "isBackgroundDistribute", true);
        setIntField(term815, term815.getClass(), "maxCountCharacter", 304775596);
        setIntField(term815, term815.getClass(), "maxCountItem", -1347665717);
        setIntField(term815, term815.getClass(), "maxCountMusic", -1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBackgroundDistribute", argTypes, term815, args);
    }

};



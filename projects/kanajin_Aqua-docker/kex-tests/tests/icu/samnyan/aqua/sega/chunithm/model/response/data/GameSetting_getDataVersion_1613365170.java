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

public class GameSetting_getDataVersion_1613365170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555;

    public GameSetting_getDataVersion_1613365170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term555, term555.getClass(), "dataVersion", 1540719661);
        setBooleanField(term555, term555.getClass(), "isMaintenance", false);
        setIntField(term555, term555.getClass(), "requestInterval", 1265463001);
        setField(term555, term555.getClass(), "rebootStartTime", "PAEBtnZtTD");
        setField(term555, term555.getClass(), "rebootEndTime", "sjlJAEtRrb");
        setBooleanField(term555, term555.getClass(), "isBackgroundDistribute", false);
        setIntField(term555, term555.getClass(), "maxCountCharacter", 335112684);
        setIntField(term555, term555.getClass(), "maxCountItem", 1551099402);
        setIntField(term555, term555.getClass(), "maxCountMusic", -2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataVersion", argTypes, term555, args);
    }

};



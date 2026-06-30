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

public class GameSetting_hashCode_7648511820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1655;

    public GameSetting_hashCode_7648511820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1655 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1655, term1655.getClass(), "dataVersion", -1731761810);
        setBooleanField(term1655, term1655.getClass(), "isMaintenance", true);
        setIntField(term1655, term1655.getClass(), "requestInterval", 197109649);
        setField(term1655, term1655.getClass(), "rebootStartTime", "gGSMzuGICf");
        setField(term1655, term1655.getClass(), "rebootEndTime", "hxCBltsObl");
        setBooleanField(term1655, term1655.getClass(), "isBackgroundDistribute", true);
        setIntField(term1655, term1655.getClass(), "maxCountCharacter", -1239406390);
        setIntField(term1655, term1655.getClass(), "maxCountItem", 1557431527);
        setIntField(term1655, term1655.getClass(), "maxCountMusic", -1504890659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1655, args);
    }

};



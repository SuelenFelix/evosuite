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

public class GameSetting_isBackgroundDistribute_183813023629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1857;

    public GameSetting_isBackgroundDistribute_183813023629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1857 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1857, term1857.getClass(), "dataVersion", 0);
        setBooleanField(term1857, term1857.getClass(), "isMaintenance", false);
        setIntField(term1857, term1857.getClass(), "requestInterval", 0);
        setField(term1857, term1857.getClass(), "rebootStartTime", null);
        setField(term1857, term1857.getClass(), "rebootEndTime", null);
        setBooleanField(term1857, term1857.getClass(), "isBackgroundDistribute", false);
        setIntField(term1857, term1857.getClass(), "maxCountCharacter", 0);
        setIntField(term1857, term1857.getClass(), "maxCountItem", 0);
        setIntField(term1857, term1857.getClass(), "maxCountMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBackgroundDistribute", argTypes, term1857, args);
    }

};



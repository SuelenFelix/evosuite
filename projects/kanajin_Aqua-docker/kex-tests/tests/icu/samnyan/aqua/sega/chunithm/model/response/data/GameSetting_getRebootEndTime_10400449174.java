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

public class GameSetting_getRebootEndTime_10400449174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763;

    public GameSetting_getRebootEndTime_10400449174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term763 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term763, term763.getClass(), "dataVersion", -505439934);
        setBooleanField(term763, term763.getClass(), "isMaintenance", false);
        setIntField(term763, term763.getClass(), "requestInterval", -344842608);
        setField(term763, term763.getClass(), "rebootStartTime", "hRNSzYYIrc");
        setField(term763, term763.getClass(), "rebootEndTime", "RMFIsYGgne");
        setBooleanField(term763, term763.getClass(), "isBackgroundDistribute", true);
        setIntField(term763, term763.getClass(), "maxCountCharacter", 941650513);
        setIntField(term763, term763.getClass(), "maxCountItem", 444029505);
        setIntField(term763, term763.getClass(), "maxCountMusic", -1034506028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootEndTime", argTypes, term763, args);
    }

};



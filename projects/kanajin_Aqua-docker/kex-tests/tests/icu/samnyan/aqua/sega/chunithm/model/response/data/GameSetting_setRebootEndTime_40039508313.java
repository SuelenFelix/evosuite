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

public class GameSetting_setRebootEndTime_40039508313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;

    public GameSetting_setRebootEndTime_40039508313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1259 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1259, term1259.getClass(), "dataVersion", -2063457669);
        setBooleanField(term1259, term1259.getClass(), "isMaintenance", false);
        setIntField(term1259, term1259.getClass(), "requestInterval", -1222006000);
        setField(term1259, term1259.getClass(), "rebootStartTime", "OclPbYPkcH");
        setField(term1259, term1259.getClass(), "rebootEndTime", "IoAlmYsBwc");
        setBooleanField(term1259, term1259.getClass(), "isBackgroundDistribute", true);
        setIntField(term1259, term1259.getClass(), "maxCountCharacter", 2095798786);
        setIntField(term1259, term1259.getClass(), "maxCountItem", -1565502840);
        setIntField(term1259, term1259.getClass(), "maxCountMusic", 344323424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "setRebootEndTime", argTypes, term1259, args);
    }

};



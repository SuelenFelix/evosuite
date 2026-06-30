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

public class GameSetting_canEqual_132933442219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1602;
     Object term1634;

    public GameSetting_canEqual_132933442219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1602 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1602, term1602.getClass(), "dataVersion", 1041916673);
        setBooleanField(term1602, term1602.getClass(), "isMaintenance", false);
        setIntField(term1602, term1602.getClass(), "requestInterval", -601863069);
        setField(term1602, term1602.getClass(), "rebootStartTime", "wSQxaModmm");
        setField(term1602, term1602.getClass(), "rebootEndTime", "UlajhuVLaP");
        setBooleanField(term1602, term1602.getClass(), "isBackgroundDistribute", false);
        setIntField(term1602, term1602.getClass(), "maxCountCharacter", 663292551);
        setIntField(term1602, term1602.getClass(), "maxCountItem", -1885090354);
        setIntField(term1602, term1602.getClass(), "maxCountMusic", -2066804303);
        term1634 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1634;
        callMethod(klass, "canEqual", argTypes, term1602, args);
    }

};



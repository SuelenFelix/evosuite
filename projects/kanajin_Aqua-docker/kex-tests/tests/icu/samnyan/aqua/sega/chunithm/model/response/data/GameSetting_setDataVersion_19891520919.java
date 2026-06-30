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

public class GameSetting_setDataVersion_19891520919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023;
     Object term1055;

    public GameSetting_setDataVersion_19891520919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1023 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1023, term1023.getClass(), "dataVersion", -1963434938);
        setBooleanField(term1023, term1023.getClass(), "isMaintenance", false);
        setIntField(term1023, term1023.getClass(), "requestInterval", 906181092);
        setField(term1023, term1023.getClass(), "rebootStartTime", "HyxfbSQYBe");
        setField(term1023, term1023.getClass(), "rebootEndTime", "pCTimMblYc");
        setBooleanField(term1023, term1023.getClass(), "isBackgroundDistribute", false);
        setIntField(term1023, term1023.getClass(), "maxCountCharacter", 1045657203);
        setIntField(term1023, term1023.getClass(), "maxCountItem", 1386130016);
        setIntField(term1023, term1023.getClass(), "maxCountMusic", 1072005683);
        term1055 = new Integer(1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1055;
        callMethod(klass, "setDataVersion", argTypes, term1023, args);
    }

};



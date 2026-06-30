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

public class GameSetting_setRequestInterval_34300641111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1131;
     Object term1163;

    public GameSetting_setRequestInterval_34300641111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1131 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1131, term1131.getClass(), "dataVersion", 480137250);
        setBooleanField(term1131, term1131.getClass(), "isMaintenance", true);
        setIntField(term1131, term1131.getClass(), "requestInterval", -341152642);
        setField(term1131, term1131.getClass(), "rebootStartTime", "xOEqzGAmDU");
        setField(term1131, term1131.getClass(), "rebootEndTime", "eZFUvlxvGV");
        setBooleanField(term1131, term1131.getClass(), "isBackgroundDistribute", true);
        setIntField(term1131, term1131.getClass(), "maxCountCharacter", -2015854073);
        setIntField(term1131, term1131.getClass(), "maxCountItem", 538259104);
        setIntField(term1131, term1131.getClass(), "maxCountMusic", 96566506);
        term1163 = new Integer(-343325701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1163;
        callMethod(klass, "setRequestInterval", argTypes, term1131, args);
    }

};



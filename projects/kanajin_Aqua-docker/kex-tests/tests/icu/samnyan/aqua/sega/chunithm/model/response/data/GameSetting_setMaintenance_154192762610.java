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
import java.lang.Boolean;

public class GameSetting_setMaintenance_154192762610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;
     Object term1109;

    public GameSetting_setMaintenance_154192762610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1077 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1077, term1077.getClass(), "dataVersion", 1474524152);
        setBooleanField(term1077, term1077.getClass(), "isMaintenance", true);
        setIntField(term1077, term1077.getClass(), "requestInterval", 568954359);
        setField(term1077, term1077.getClass(), "rebootStartTime", "hNxWaHcfhY");
        setField(term1077, term1077.getClass(), "rebootEndTime", "RkybSrpybU");
        setBooleanField(term1077, term1077.getClass(), "isBackgroundDistribute", true);
        setIntField(term1077, term1077.getClass(), "maxCountCharacter", 53410913);
        setIntField(term1077, term1077.getClass(), "maxCountItem", -375014958);
        setIntField(term1077, term1077.getClass(), "maxCountMusic", 1107176718);
        term1109 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1109;
        callMethod(klass, "setMaintenance", argTypes, term1077, args);
    }

};



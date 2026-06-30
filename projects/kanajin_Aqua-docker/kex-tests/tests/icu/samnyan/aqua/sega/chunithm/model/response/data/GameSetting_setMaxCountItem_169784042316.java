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

public class GameSetting_setMaxCountItem_169784042316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1441;
     Object term1473;

    public GameSetting_setMaxCountItem_169784042316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1441 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term1441, term1441.getClass(), "dataVersion", 1598895173);
        setBooleanField(term1441, term1441.getClass(), "isMaintenance", false);
        setIntField(term1441, term1441.getClass(), "requestInterval", 1830648570);
        setField(term1441, term1441.getClass(), "rebootStartTime", "kuTXqwMtDB");
        setField(term1441, term1441.getClass(), "rebootEndTime", "Ghbwtircqb");
        setBooleanField(term1441, term1441.getClass(), "isBackgroundDistribute", true);
        setIntField(term1441, term1441.getClass(), "maxCountCharacter", -227365013);
        setIntField(term1441, term1441.getClass(), "maxCountItem", 11724947);
        setIntField(term1441, term1441.getClass(), "maxCountMusic", 1953277050);
        term1473 = new Integer(1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1473;
        callMethod(klass, "setMaxCountItem", argTypes, term1441, args);
    }

};



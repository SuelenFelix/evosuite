package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_setDataVersion_65713731018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7327;

    public GameSetting_setDataVersion_65713731018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7327 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term7327, term7327.getClass(), "romVersion", "YVLRenzuoR");
        setField(term7327, term7327.getClass(), "dataVersion", "JukEMhPWql");
        setBooleanField(term7327, term7327.getClass(), "isMaintenance", false);
        setIntField(term7327, term7327.getClass(), "requestInterval", 1985711069);
        setField(term7327, term7327.getClass(), "rebootStartTime", "ZdNcodHERG");
        setField(term7327, term7327.getClass(), "rebootEndTime", "CLHomjAqIM");
        setBooleanField(term7327, term7327.getClass(), "isBackgroundDistribute", false);
        setIntField(term7327, term7327.getClass(), "maxCountCharacter", -1497378582);
        setIntField(term7327, term7327.getClass(), "maxCountItem", -449740668);
        setIntField(term7327, term7327.getClass(), "maxCountMusic", 1283268105);
        setField(term7327, term7327.getClass(), "matchStartTime", "mzCFLzFuSj");
        setField(term7327, term7327.getClass(), "matchEndTime", "WQnMpDlSfA");
        setIntField(term7327, term7327.getClass(), "matchTimeLimit", -220552939);
        setIntField(term7327, term7327.getClass(), "matchErrorLimit", -444257155);
        setField(term7327, term7327.getClass(), "matchingUri", "aOIvTQtXiv");
        setField(term7327, term7327.getClass(), "udpHolePunchUri", "IyjDiknqhA");
        setField(term7327, term7327.getClass(), "reflectorUri", "IHsXSAFYKi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KyGbLglqbW";
        callMethod(klass, "setDataVersion", argTypes, term7327, args);
    }

};



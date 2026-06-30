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

public class GameSetting_setMatchEndTime_1185213728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9497;

    public GameSetting_setMatchEndTime_1185213728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9497 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term9497, term9497.getClass(), "romVersion", "rgZSPplPSs");
        setField(term9497, term9497.getClass(), "dataVersion", "NPUSTXlEKx");
        setBooleanField(term9497, term9497.getClass(), "isMaintenance", false);
        setIntField(term9497, term9497.getClass(), "requestInterval", 983651082);
        setField(term9497, term9497.getClass(), "rebootStartTime", "KKFprGoNpl");
        setField(term9497, term9497.getClass(), "rebootEndTime", "tWVISJlxKZ");
        setBooleanField(term9497, term9497.getClass(), "isBackgroundDistribute", false);
        setIntField(term9497, term9497.getClass(), "maxCountCharacter", 794411004);
        setIntField(term9497, term9497.getClass(), "maxCountItem", 1964107266);
        setIntField(term9497, term9497.getClass(), "maxCountMusic", -256542569);
        setField(term9497, term9497.getClass(), "matchStartTime", "rOZkUKEoaf");
        setField(term9497, term9497.getClass(), "matchEndTime", "yLnzGqyHGL");
        setIntField(term9497, term9497.getClass(), "matchTimeLimit", -1936597357);
        setIntField(term9497, term9497.getClass(), "matchErrorLimit", -179816637);
        setField(term9497, term9497.getClass(), "matchingUri", "IjprPXBDuY");
        setField(term9497, term9497.getClass(), "udpHolePunchUri", "wkqPmmFDAa");
        setField(term9497, term9497.getClass(), "reflectorUri", "rLTDtNqLyW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CLsbWobdgS";
        callMethod(klass, "setMatchEndTime", argTypes, term9497, args);
    }

};



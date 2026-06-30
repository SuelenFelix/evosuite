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

public class GameSetting_getMatchingUri_188968588914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6477;

    public GameSetting_getMatchingUri_188968588914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6477 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term6477, term6477.getClass(), "romVersion", "udRdJkgXmH");
        setField(term6477, term6477.getClass(), "dataVersion", "FBCXbjHVXO");
        setBooleanField(term6477, term6477.getClass(), "isMaintenance", false);
        setIntField(term6477, term6477.getClass(), "requestInterval", 304255923);
        setField(term6477, term6477.getClass(), "rebootStartTime", "dIWAnvmLiC");
        setField(term6477, term6477.getClass(), "rebootEndTime", "CuWebzZQjZ");
        setBooleanField(term6477, term6477.getClass(), "isBackgroundDistribute", false);
        setIntField(term6477, term6477.getClass(), "maxCountCharacter", 1532668668);
        setIntField(term6477, term6477.getClass(), "maxCountItem", -100547107);
        setIntField(term6477, term6477.getClass(), "maxCountMusic", 2140567451);
        setField(term6477, term6477.getClass(), "matchStartTime", "wRVaaJxKYI");
        setField(term6477, term6477.getClass(), "matchEndTime", "yOQuJXRvOo");
        setIntField(term6477, term6477.getClass(), "matchTimeLimit", -390400057);
        setIntField(term6477, term6477.getClass(), "matchErrorLimit", -157273113);
        setField(term6477, term6477.getClass(), "matchingUri", "XmLHcnVsch");
        setField(term6477, term6477.getClass(), "udpHolePunchUri", "Yrvtdcltri");
        setField(term6477, term6477.getClass(), "reflectorUri", "RxrsjXRVcT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchingUri", argTypes, term6477, args);
    }

};



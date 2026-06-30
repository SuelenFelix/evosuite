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

public class GameSetting_canEqual_16708842835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11039;
     Object term11156;

    public GameSetting_canEqual_16708842835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11039 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term11039, term11039.getClass(), "romVersion", "EhlWSobaco");
        setField(term11039, term11039.getClass(), "dataVersion", "hEuycunsSe");
        setBooleanField(term11039, term11039.getClass(), "isMaintenance", false);
        setIntField(term11039, term11039.getClass(), "requestInterval", 806187937);
        setField(term11039, term11039.getClass(), "rebootStartTime", "IMFzXhpNCx");
        setField(term11039, term11039.getClass(), "rebootEndTime", "xAtFmANjwD");
        setBooleanField(term11039, term11039.getClass(), "isBackgroundDistribute", false);
        setIntField(term11039, term11039.getClass(), "maxCountCharacter", -1646415676);
        setIntField(term11039, term11039.getClass(), "maxCountItem", 1016563502);
        setIntField(term11039, term11039.getClass(), "maxCountMusic", -1845173237);
        setField(term11039, term11039.getClass(), "matchStartTime", "ICysuFllEZ");
        setField(term11039, term11039.getClass(), "matchEndTime", "cGQJTTxcXr");
        setIntField(term11039, term11039.getClass(), "matchTimeLimit", -326684811);
        setIntField(term11039, term11039.getClass(), "matchErrorLimit", 1260583823);
        setField(term11039, term11039.getClass(), "matchingUri", "aKaqvssiby");
        setField(term11039, term11039.getClass(), "udpHolePunchUri", "tTVbtBVAfo");
        setField(term11039, term11039.getClass(), "reflectorUri", "cjaaJUnNCR");
        term11156 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11156;
        callMethod(klass, "canEqual", argTypes, term11039, args);
    }

};



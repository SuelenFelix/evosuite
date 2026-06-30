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

public class GameSetting_getReflectorUri_57312247216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6891;

    public GameSetting_getReflectorUri_57312247216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6891 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term6891, term6891.getClass(), "romVersion", "VAGkRppBem");
        setField(term6891, term6891.getClass(), "dataVersion", "eKcEJRxNSu");
        setBooleanField(term6891, term6891.getClass(), "isMaintenance", true);
        setIntField(term6891, term6891.getClass(), "requestInterval", -935897776);
        setField(term6891, term6891.getClass(), "rebootStartTime", "NTXQPWFYSA");
        setField(term6891, term6891.getClass(), "rebootEndTime", "fOuOhBpldm");
        setBooleanField(term6891, term6891.getClass(), "isBackgroundDistribute", true);
        setIntField(term6891, term6891.getClass(), "maxCountCharacter", 1370328728);
        setIntField(term6891, term6891.getClass(), "maxCountItem", 1126005767);
        setIntField(term6891, term6891.getClass(), "maxCountMusic", -1155333431);
        setField(term6891, term6891.getClass(), "matchStartTime", "qQQRKGPyIM");
        setField(term6891, term6891.getClass(), "matchEndTime", "lzcwhvjdFg");
        setIntField(term6891, term6891.getClass(), "matchTimeLimit", -2110210183);
        setIntField(term6891, term6891.getClass(), "matchErrorLimit", -687531774);
        setField(term6891, term6891.getClass(), "matchingUri", "dfzWTjcjnI");
        setField(term6891, term6891.getClass(), "udpHolePunchUri", "bsnZXGEvFv");
        setField(term6891, term6891.getClass(), "reflectorUri", "osFrHWYeRy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReflectorUri", argTypes, term6891, args);
    }

};



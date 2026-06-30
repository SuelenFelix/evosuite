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

public class GameSetting_getMaxCountMusic_9533907918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971;

    public GameSetting_getMaxCountMusic_9533907918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term971 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term971, term971.getClass(), "dataVersion", -1801760683);
        setBooleanField(term971, term971.getClass(), "isMaintenance", true);
        setIntField(term971, term971.getClass(), "requestInterval", 1141317871);
        setField(term971, term971.getClass(), "rebootStartTime", "ZiaGIbnzTs");
        setField(term971, term971.getClass(), "rebootEndTime", "tbcdzjIfER");
        setBooleanField(term971, term971.getClass(), "isBackgroundDistribute", true);
        setIntField(term971, term971.getClass(), "maxCountCharacter", 890669485);
        setIntField(term971, term971.getClass(), "maxCountItem", 691577392);
        setIntField(term971, term971.getClass(), "maxCountMusic", -893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountMusic", argTypes, term971, args);
    }

};



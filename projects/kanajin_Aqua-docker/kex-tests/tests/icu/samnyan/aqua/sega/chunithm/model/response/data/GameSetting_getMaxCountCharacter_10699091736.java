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

public class GameSetting_getMaxCountCharacter_10699091736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867;

    public GameSetting_getMaxCountCharacter_10699091736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term867 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term867, term867.getClass(), "dataVersion", 683666002);
        setBooleanField(term867, term867.getClass(), "isMaintenance", false);
        setIntField(term867, term867.getClass(), "requestInterval", 1596213415);
        setField(term867, term867.getClass(), "rebootStartTime", "MxlszYVzRf");
        setField(term867, term867.getClass(), "rebootEndTime", "LQFpaHEwXR");
        setBooleanField(term867, term867.getClass(), "isBackgroundDistribute", true);
        setIntField(term867, term867.getClass(), "maxCountCharacter", -268815336);
        setIntField(term867, term867.getClass(), "maxCountItem", -1210583429);
        setIntField(term867, term867.getClass(), "maxCountMusic", -663691365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountCharacter", argTypes, term867, args);
    }

};



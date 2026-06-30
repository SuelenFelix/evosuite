package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getRebootStartTime_14351472174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4314;

    public GameSetting_getRebootStartTime_14351472174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4314 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4314, term4314.getClass(), "dataVersion", "GSOWFHMlbF");
        setField(term4314, term4314.getClass(), "onlineDataVersion", "vpZIqpFbKM");
        setBooleanField(term4314, term4314.getClass(), "isMaintenance", true);
        setIntField(term4314, term4314.getClass(), "requestInterval", -2014792457);
        setField(term4314, term4314.getClass(), "rebootStartTime", "dAbwpJCDif");
        setField(term4314, term4314.getClass(), "rebootEndTime", "ATSXJPySio");
        setBooleanField(term4314, term4314.getClass(), "isBackgroundDistribute", true);
        setIntField(term4314, term4314.getClass(), "maxCountCharacter", 1957633116);
        setIntField(term4314, term4314.getClass(), "maxCountCard", 1428598210);
        setIntField(term4314, term4314.getClass(), "maxCountItem", 1071776561);
        setIntField(term4314, term4314.getClass(), "maxCountMusic", 1846399918);
        setIntField(term4314, term4314.getClass(), "maxCountMusicItem", 35388821);
        setIntField(term4314, term4314.getClass(), "macCountRivalMusic", -598803400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term4314, args);
    }

};



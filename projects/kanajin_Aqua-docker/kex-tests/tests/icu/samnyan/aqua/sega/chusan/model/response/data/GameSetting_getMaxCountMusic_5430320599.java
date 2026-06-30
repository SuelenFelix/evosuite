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

public class GameSetting_getMaxCountMusic_5430320599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5442;

    public GameSetting_getMaxCountMusic_5430320599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5442 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term5442, term5442.getClass(), "romVersion", "pLvkKHqNYX");
        setField(term5442, term5442.getClass(), "dataVersion", "PwqnuJJwjR");
        setBooleanField(term5442, term5442.getClass(), "isMaintenance", false);
        setIntField(term5442, term5442.getClass(), "requestInterval", -418002301);
        setField(term5442, term5442.getClass(), "rebootStartTime", "NFkbBiPeiw");
        setField(term5442, term5442.getClass(), "rebootEndTime", "tlRvilQyjJ");
        setBooleanField(term5442, term5442.getClass(), "isBackgroundDistribute", true);
        setIntField(term5442, term5442.getClass(), "maxCountCharacter", 2067599442);
        setIntField(term5442, term5442.getClass(), "maxCountItem", -335577660);
        setIntField(term5442, term5442.getClass(), "maxCountMusic", 1488144730);
        setField(term5442, term5442.getClass(), "matchStartTime", "gwTUlYNpjM");
        setField(term5442, term5442.getClass(), "matchEndTime", "uXYojRmxrM");
        setIntField(term5442, term5442.getClass(), "matchTimeLimit", -1075257608);
        setIntField(term5442, term5442.getClass(), "matchErrorLimit", -693529847);
        setField(term5442, term5442.getClass(), "matchingUri", "cxRwRcodud");
        setField(term5442, term5442.getClass(), "udpHolePunchUri", "GDGBPlYeLn");
        setField(term5442, term5442.getClass(), "reflectorUri", "jdQANIXSTq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountMusic", argTypes, term5442, args);
    }

};



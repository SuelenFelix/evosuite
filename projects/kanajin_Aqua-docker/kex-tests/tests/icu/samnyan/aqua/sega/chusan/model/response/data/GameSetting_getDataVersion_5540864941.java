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

public class GameSetting_getDataVersion_5540864941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3786;

    public GameSetting_getDataVersion_5540864941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3786 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term3786, term3786.getClass(), "romVersion", "tkmmGweDwJ");
        setField(term3786, term3786.getClass(), "dataVersion", "pMfTuAFXxg");
        setBooleanField(term3786, term3786.getClass(), "isMaintenance", false);
        setIntField(term3786, term3786.getClass(), "requestInterval", -1659995523);
        setField(term3786, term3786.getClass(), "rebootStartTime", "XCZmhkblRc");
        setField(term3786, term3786.getClass(), "rebootEndTime", "gFUWMydGCU");
        setBooleanField(term3786, term3786.getClass(), "isBackgroundDistribute", true);
        setIntField(term3786, term3786.getClass(), "maxCountCharacter", -1384058110);
        setIntField(term3786, term3786.getClass(), "maxCountItem", -109584269);
        setIntField(term3786, term3786.getClass(), "maxCountMusic", -682334474);
        setField(term3786, term3786.getClass(), "matchStartTime", "LLegSTfqJt");
        setField(term3786, term3786.getClass(), "matchEndTime", "XQfmqLbqHS");
        setIntField(term3786, term3786.getClass(), "matchTimeLimit", -666332937);
        setIntField(term3786, term3786.getClass(), "matchErrorLimit", 1661615099);
        setField(term3786, term3786.getClass(), "matchingUri", "jLVLqQSjqg");
        setField(term3786, term3786.getClass(), "udpHolePunchUri", "JKGueoHesL");
        setField(term3786, term3786.getClass(), "reflectorUri", "CRAUqtVBkU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataVersion", argTypes, term3786, args);
    }

};



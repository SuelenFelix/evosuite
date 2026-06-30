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

public class GameSetting_setMatchStartTime_154152816227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9268;

    public GameSetting_setMatchStartTime_154152816227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9268 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term9268, term9268.getClass(), "romVersion", "MCMCjxXzjw");
        setField(term9268, term9268.getClass(), "dataVersion", "pZbbwCURge");
        setBooleanField(term9268, term9268.getClass(), "isMaintenance", false);
        setIntField(term9268, term9268.getClass(), "requestInterval", -1421272179);
        setField(term9268, term9268.getClass(), "rebootStartTime", "RsOfgdMCMv");
        setField(term9268, term9268.getClass(), "rebootEndTime", "nsofCJqJOR");
        setBooleanField(term9268, term9268.getClass(), "isBackgroundDistribute", false);
        setIntField(term9268, term9268.getClass(), "maxCountCharacter", -2019439660);
        setIntField(term9268, term9268.getClass(), "maxCountItem", 1037621714);
        setIntField(term9268, term9268.getClass(), "maxCountMusic", 1072685856);
        setField(term9268, term9268.getClass(), "matchStartTime", "CitJiZwsjF");
        setField(term9268, term9268.getClass(), "matchEndTime", "ZiyMvLArWJ");
        setIntField(term9268, term9268.getClass(), "matchTimeLimit", 1560132742);
        setIntField(term9268, term9268.getClass(), "matchErrorLimit", -1289646730);
        setField(term9268, term9268.getClass(), "matchingUri", "MaeokjEfWD");
        setField(term9268, term9268.getClass(), "udpHolePunchUri", "ocZcumnXEz");
        setField(term9268, term9268.getClass(), "reflectorUri", "rNNwyactDR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QJrTMTdxyh";
        callMethod(klass, "setMatchStartTime", argTypes, term9268, args);
    }

};



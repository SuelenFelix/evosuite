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
import java.lang.Integer;

public class GameSetting_setMatchErrorLimit_121790673930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9935;
     Object term10052;

    public GameSetting_setMatchErrorLimit_121790673930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9935 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term9935, term9935.getClass(), "romVersion", "ojLrjltndD");
        setField(term9935, term9935.getClass(), "dataVersion", "VJtFSexKat");
        setBooleanField(term9935, term9935.getClass(), "isMaintenance", false);
        setIntField(term9935, term9935.getClass(), "requestInterval", 407640701);
        setField(term9935, term9935.getClass(), "rebootStartTime", "xPVddlPSQR");
        setField(term9935, term9935.getClass(), "rebootEndTime", "MxrhCLTMTH");
        setBooleanField(term9935, term9935.getClass(), "isBackgroundDistribute", false);
        setIntField(term9935, term9935.getClass(), "maxCountCharacter", -55858757);
        setIntField(term9935, term9935.getClass(), "maxCountItem", 1101065297);
        setIntField(term9935, term9935.getClass(), "maxCountMusic", -110542660);
        setField(term9935, term9935.getClass(), "matchStartTime", "kEehLMZcOU");
        setField(term9935, term9935.getClass(), "matchEndTime", "RhLliqMiOF");
        setIntField(term9935, term9935.getClass(), "matchTimeLimit", 1430629000);
        setIntField(term9935, term9935.getClass(), "matchErrorLimit", -1684627375);
        setField(term9935, term9935.getClass(), "matchingUri", "jlhonEGrJH");
        setField(term9935, term9935.getClass(), "udpHolePunchUri", "RKcKwlEYZb");
        setField(term9935, term9935.getClass(), "reflectorUri", "acPRDlpsid");
        term10052 = new Integer(-74479819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10052;
        callMethod(klass, "setMatchErrorLimit", argTypes, term9935, args);
    }

};



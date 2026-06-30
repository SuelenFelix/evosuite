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

public class GameSetting_getRebootStartTime_18410294464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4407;

    public GameSetting_getRebootStartTime_18410294464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4407 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term4407, term4407.getClass(), "romVersion", "nDCcyhiTnS");
        setField(term4407, term4407.getClass(), "dataVersion", "Bcivwcjece");
        setBooleanField(term4407, term4407.getClass(), "isMaintenance", false);
        setIntField(term4407, term4407.getClass(), "requestInterval", 579787883);
        setField(term4407, term4407.getClass(), "rebootStartTime", "QTefjRuiez");
        setField(term4407, term4407.getClass(), "rebootEndTime", "SQZVNkAVBB");
        setBooleanField(term4407, term4407.getClass(), "isBackgroundDistribute", true);
        setIntField(term4407, term4407.getClass(), "maxCountCharacter", -1104816537);
        setIntField(term4407, term4407.getClass(), "maxCountItem", 1997406081);
        setIntField(term4407, term4407.getClass(), "maxCountMusic", -160995016);
        setField(term4407, term4407.getClass(), "matchStartTime", "mrSAYJlddZ");
        setField(term4407, term4407.getClass(), "matchEndTime", "KbwxawvYsw");
        setIntField(term4407, term4407.getClass(), "matchTimeLimit", -849730731);
        setIntField(term4407, term4407.getClass(), "matchErrorLimit", -1965240023);
        setField(term4407, term4407.getClass(), "matchingUri", "gvjdfHNzOa");
        setField(term4407, term4407.getClass(), "udpHolePunchUri", "HqitWglYWX");
        setField(term4407, term4407.getClass(), "reflectorUri", "pOuFRlHmbK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term4407, args);
    }

};



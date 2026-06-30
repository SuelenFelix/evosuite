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

public class GameSetting_setMatchTimeLimit_133846905829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9726;
     Object term9843;

    public GameSetting_setMatchTimeLimit_133846905829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9726 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term9726, term9726.getClass(), "romVersion", "TbYrjEyFPc");
        setField(term9726, term9726.getClass(), "dataVersion", "muefchpJiZ");
        setBooleanField(term9726, term9726.getClass(), "isMaintenance", false);
        setIntField(term9726, term9726.getClass(), "requestInterval", -1304594615);
        setField(term9726, term9726.getClass(), "rebootStartTime", "tuYaAqvYrh");
        setField(term9726, term9726.getClass(), "rebootEndTime", "CIbhheukbR");
        setBooleanField(term9726, term9726.getClass(), "isBackgroundDistribute", false);
        setIntField(term9726, term9726.getClass(), "maxCountCharacter", 1384334359);
        setIntField(term9726, term9726.getClass(), "maxCountItem", -552245510);
        setIntField(term9726, term9726.getClass(), "maxCountMusic", 1590263959);
        setField(term9726, term9726.getClass(), "matchStartTime", "VOHPpErtan");
        setField(term9726, term9726.getClass(), "matchEndTime", "GDMUlolTNs");
        setIntField(term9726, term9726.getClass(), "matchTimeLimit", -203971814);
        setIntField(term9726, term9726.getClass(), "matchErrorLimit", -786856127);
        setField(term9726, term9726.getClass(), "matchingUri", "xpLvWisjzN");
        setField(term9726, term9726.getClass(), "udpHolePunchUri", "IKfozyyKEj");
        setField(term9726, term9726.getClass(), "reflectorUri", "thCjwQjRBL");
        term9843 = new Integer(891987554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9843;
        callMethod(klass, "setMatchTimeLimit", argTypes, term9726, args);
    }

};



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

public class GameSetting_getMatchErrorLimit_61061058913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6270;

    public GameSetting_getMatchErrorLimit_61061058913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6270 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term6270, term6270.getClass(), "romVersion", "XuxkPrpfND");
        setField(term6270, term6270.getClass(), "dataVersion", "OxNXeKMDje");
        setBooleanField(term6270, term6270.getClass(), "isMaintenance", true);
        setIntField(term6270, term6270.getClass(), "requestInterval", -425364766);
        setField(term6270, term6270.getClass(), "rebootStartTime", "hGTqHomrbc");
        setField(term6270, term6270.getClass(), "rebootEndTime", "NNMBrIWEBw");
        setBooleanField(term6270, term6270.getClass(), "isBackgroundDistribute", true);
        setIntField(term6270, term6270.getClass(), "maxCountCharacter", -240455247);
        setIntField(term6270, term6270.getClass(), "maxCountItem", 412243891);
        setIntField(term6270, term6270.getClass(), "maxCountMusic", -1517264869);
        setField(term6270, term6270.getClass(), "matchStartTime", "GrTaccOQzl");
        setField(term6270, term6270.getClass(), "matchEndTime", "uuSYOUCVHU");
        setIntField(term6270, term6270.getClass(), "matchTimeLimit", 1498231709);
        setIntField(term6270, term6270.getClass(), "matchErrorLimit", -775074162);
        setField(term6270, term6270.getClass(), "matchingUri", "DfWwbodtVw");
        setField(term6270, term6270.getClass(), "udpHolePunchUri", "kTbFMpVWqx");
        setField(term6270, term6270.getClass(), "reflectorUri", "HegRNsidFg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchErrorLimit", argTypes, term6270, args);
    }

};



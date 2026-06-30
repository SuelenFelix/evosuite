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

public class GameSetting_isMaintenance_8645652582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3993;

    public GameSetting_isMaintenance_8645652582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3993 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term3993, term3993.getClass(), "romVersion", "DddqUYfomL");
        setField(term3993, term3993.getClass(), "dataVersion", "YQwoogpPyi");
        setBooleanField(term3993, term3993.getClass(), "isMaintenance", true);
        setIntField(term3993, term3993.getClass(), "requestInterval", 1908136627);
        setField(term3993, term3993.getClass(), "rebootStartTime", "rnPhHoorxj");
        setField(term3993, term3993.getClass(), "rebootEndTime", "GuwJLKquuI");
        setBooleanField(term3993, term3993.getClass(), "isBackgroundDistribute", true);
        setIntField(term3993, term3993.getClass(), "maxCountCharacter", 824600792);
        setIntField(term3993, term3993.getClass(), "maxCountItem", -1498923569);
        setIntField(term3993, term3993.getClass(), "maxCountMusic", 1082643319);
        setField(term3993, term3993.getClass(), "matchStartTime", "vYMCjgnztg");
        setField(term3993, term3993.getClass(), "matchEndTime", "YupgKTSEiI");
        setIntField(term3993, term3993.getClass(), "matchTimeLimit", -1138616222);
        setIntField(term3993, term3993.getClass(), "matchErrorLimit", 285368240);
        setField(term3993, term3993.getClass(), "matchingUri", "HuOUlaFmvJ");
        setField(term3993, term3993.getClass(), "udpHolePunchUri", "dWVwcwFGNo");
        setField(term3993, term3993.getClass(), "reflectorUri", "PNdLRrSAIY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaintenance", argTypes, term3993, args);
    }

};



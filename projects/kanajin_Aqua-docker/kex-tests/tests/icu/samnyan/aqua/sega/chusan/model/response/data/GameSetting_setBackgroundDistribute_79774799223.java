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
import java.lang.Boolean;

public class GameSetting_setBackgroundDistribute_79774799223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8432;
     Object term8549;

    public GameSetting_setBackgroundDistribute_79774799223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8432 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term8432, term8432.getClass(), "romVersion", "xPnOHsNlyc");
        setField(term8432, term8432.getClass(), "dataVersion", "OTSPWPJefj");
        setBooleanField(term8432, term8432.getClass(), "isMaintenance", true);
        setIntField(term8432, term8432.getClass(), "requestInterval", -766656824);
        setField(term8432, term8432.getClass(), "rebootStartTime", "EOTYMqXRmE");
        setField(term8432, term8432.getClass(), "rebootEndTime", "iTxNduwSjE");
        setBooleanField(term8432, term8432.getClass(), "isBackgroundDistribute", true);
        setIntField(term8432, term8432.getClass(), "maxCountCharacter", 137514813);
        setIntField(term8432, term8432.getClass(), "maxCountItem", -590298353);
        setIntField(term8432, term8432.getClass(), "maxCountMusic", -917544425);
        setField(term8432, term8432.getClass(), "matchStartTime", "MQUTfIiFnh");
        setField(term8432, term8432.getClass(), "matchEndTime", "JeyKRznnft");
        setIntField(term8432, term8432.getClass(), "matchTimeLimit", -1044762733);
        setIntField(term8432, term8432.getClass(), "matchErrorLimit", 446184231);
        setField(term8432, term8432.getClass(), "matchingUri", "vQJUCtuYpK");
        setField(term8432, term8432.getClass(), "udpHolePunchUri", "GHtOeztAdz");
        setField(term8432, term8432.getClass(), "reflectorUri", "gSAtqakaLY");
        term8549 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8549;
        callMethod(klass, "setBackgroundDistribute", argTypes, term8432, args);
    }

};



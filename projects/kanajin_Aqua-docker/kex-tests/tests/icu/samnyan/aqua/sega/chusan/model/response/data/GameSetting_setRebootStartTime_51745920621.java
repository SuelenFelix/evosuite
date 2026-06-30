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

public class GameSetting_setRebootStartTime_51745920621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7974;

    public GameSetting_setRebootStartTime_51745920621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7974 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term7974, term7974.getClass(), "romVersion", "fFWllaiFvh");
        setField(term7974, term7974.getClass(), "dataVersion", "PFTdEDSbvZ");
        setBooleanField(term7974, term7974.getClass(), "isMaintenance", false);
        setIntField(term7974, term7974.getClass(), "requestInterval", 205469595);
        setField(term7974, term7974.getClass(), "rebootStartTime", "TbiwoiebNe");
        setField(term7974, term7974.getClass(), "rebootEndTime", "laTITSWZuc");
        setBooleanField(term7974, term7974.getClass(), "isBackgroundDistribute", true);
        setIntField(term7974, term7974.getClass(), "maxCountCharacter", -638606539);
        setIntField(term7974, term7974.getClass(), "maxCountItem", -172607907);
        setIntField(term7974, term7974.getClass(), "maxCountMusic", 182656750);
        setField(term7974, term7974.getClass(), "matchStartTime", "fkzRpxlAqS");
        setField(term7974, term7974.getClass(), "matchEndTime", "VYvbTGKslj");
        setIntField(term7974, term7974.getClass(), "matchTimeLimit", -51407538);
        setIntField(term7974, term7974.getClass(), "matchErrorLimit", -465783748);
        setField(term7974, term7974.getClass(), "matchingUri", "owLqDDnwZA");
        setField(term7974, term7974.getClass(), "udpHolePunchUri", "eBcTbweeYp");
        setField(term7974, term7974.getClass(), "reflectorUri", "drcmjfQUDq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GjdWUoUSyA";
        callMethod(klass, "setRebootStartTime", argTypes, term7974, args);
    }

};



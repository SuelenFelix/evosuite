package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getRequestInterval_1402380603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4216;

    public GameSetting_getRequestInterval_1402380603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4216 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4216, term4216.getClass(), "dataVersion", "fRujHWvXjJ");
        setField(term4216, term4216.getClass(), "onlineDataVersion", "EAIAAStlTz");
        setBooleanField(term4216, term4216.getClass(), "isMaintenance", true);
        setIntField(term4216, term4216.getClass(), "requestInterval", -89522625);
        setField(term4216, term4216.getClass(), "rebootStartTime", "yIWXcOQTgy");
        setField(term4216, term4216.getClass(), "rebootEndTime", "xAWekqanqc");
        setBooleanField(term4216, term4216.getClass(), "isBackgroundDistribute", true);
        setIntField(term4216, term4216.getClass(), "maxCountCharacter", 1475906894);
        setIntField(term4216, term4216.getClass(), "maxCountCard", -2004794532);
        setIntField(term4216, term4216.getClass(), "maxCountItem", 1232958763);
        setIntField(term4216, term4216.getClass(), "maxCountMusic", -1702132549);
        setIntField(term4216, term4216.getClass(), "maxCountMusicItem", -1786136772);
        setIntField(term4216, term4216.getClass(), "macCountRivalMusic", -1510967747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestInterval", argTypes, term4216, args);
    }

};



package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Level_isEnable_129452571020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23426;

    public Level_isEnable_129452571020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23426 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        setLongField(term23426, term23426.getClass(), "id", 0L);
        setField(term23426, term23426.getClass(), "music", null);
        setBooleanField(term23426, term23426.getClass(), "enable", false);
        setIntField(term23426, term23426.getClass(), "level", 0);
        setIntField(term23426, term23426.getClass(), "levelDecimal", 0);
        setIntField(term23426, term23426.getClass(), "diff", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnable", argTypes, term23426, args);
    }

};



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
import java.lang.Boolean;

public class Level_setEnable_149169136026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23464;
     Object term23470;

    public Level_setEnable_149169136026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23464 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        setLongField(term23464, term23464.getClass(), "id", 0L);
        setField(term23464, term23464.getClass(), "music", null);
        setBooleanField(term23464, term23464.getClass(), "enable", false);
        setIntField(term23464, term23464.getClass(), "level", 0);
        setIntField(term23464, term23464.getClass(), "levelDecimal", 0);
        setIntField(term23464, term23464.getClass(), "diff", 0);
        term23470 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23470;
        callMethod(klass, "setEnable", argTypes, term23464, args);
    }

};



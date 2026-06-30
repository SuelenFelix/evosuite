package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDuel_setLastPlayDate_134798184647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17608;

    public UserDuel_setLastPlayDate_134798184647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17608 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17608, term17608.getClass(), "id", 0L);
        setField(term17608, term17608.getClass(), "user", null);
        setIntField(term17608, term17608.getClass(), "duelId", 0);
        setIntField(term17608, term17608.getClass(), "progress", 0);
        setIntField(term17608, term17608.getClass(), "point", 0);
        setBooleanField(term17608, term17608.getClass(), "isClear", false);
        setField(term17608, term17608.getClass(), "lastPlayDate", null);
        setIntField(term17608, term17608.getClass(), "param1", 0);
        setIntField(term17608, term17608.getClass(), "param2", 0);
        setIntField(term17608, term17608.getClass(), "param3", 0);
        setIntField(term17608, term17608.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term17608, args);
    }

};



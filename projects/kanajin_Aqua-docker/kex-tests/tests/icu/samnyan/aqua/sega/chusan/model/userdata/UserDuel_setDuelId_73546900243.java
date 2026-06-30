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
import java.lang.Integer;

public class UserDuel_setDuelId_73546900243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17560;
     Object term17570;

    public UserDuel_setDuelId_73546900243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17560 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17560, term17560.getClass(), "id", 0L);
        setField(term17560, term17560.getClass(), "user", null);
        setIntField(term17560, term17560.getClass(), "duelId", 0);
        setIntField(term17560, term17560.getClass(), "progress", 0);
        setIntField(term17560, term17560.getClass(), "point", 0);
        setBooleanField(term17560, term17560.getClass(), "isClear", false);
        setField(term17560, term17560.getClass(), "lastPlayDate", null);
        setIntField(term17560, term17560.getClass(), "param1", 0);
        setIntField(term17560, term17560.getClass(), "param2", 0);
        setIntField(term17560, term17560.getClass(), "param3", 0);
        setIntField(term17560, term17560.getClass(), "param4", 0);
        term17570 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17570;
        callMethod(klass, "setDuelId", argTypes, term17560, args);
    }

};



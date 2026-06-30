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

public class UserDuel_getId_44855238830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17428;

    public UserDuel_getId_44855238830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17428 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17428, term17428.getClass(), "id", 0L);
        setField(term17428, term17428.getClass(), "user", null);
        setIntField(term17428, term17428.getClass(), "duelId", 0);
        setIntField(term17428, term17428.getClass(), "progress", 0);
        setIntField(term17428, term17428.getClass(), "point", 0);
        setBooleanField(term17428, term17428.getClass(), "isClear", false);
        setField(term17428, term17428.getClass(), "lastPlayDate", null);
        setIntField(term17428, term17428.getClass(), "param1", 0);
        setIntField(term17428, term17428.getClass(), "param2", 0);
        setIntField(term17428, term17428.getClass(), "param3", 0);
        setIntField(term17428, term17428.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term17428, args);
    }

};



package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDuel_getUser_165251816231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87799;

    public UserDuel_getUser_165251816231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87799 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        setLongField(term87799, term87799.getClass(), "id", 0L);
        setField(term87799, term87799.getClass(), "user", null);
        setIntField(term87799, term87799.getClass(), "duelId", 0);
        setIntField(term87799, term87799.getClass(), "progress", 0);
        setIntField(term87799, term87799.getClass(), "point", 0);
        setBooleanField(term87799, term87799.getClass(), "isClear", false);
        setField(term87799, term87799.getClass(), "lastPlayDate", null);
        setIntField(term87799, term87799.getClass(), "param1", 0);
        setIntField(term87799, term87799.getClass(), "param2", 0);
        setIntField(term87799, term87799.getClass(), "param3", 0);
        setIntField(term87799, term87799.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term87799, args);
    }

};



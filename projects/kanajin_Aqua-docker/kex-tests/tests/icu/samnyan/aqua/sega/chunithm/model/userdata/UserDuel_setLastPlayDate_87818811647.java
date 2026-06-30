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

public class UserDuel_setLastPlayDate_87818811647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87969;

    public UserDuel_setLastPlayDate_87818811647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87969 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        setLongField(term87969, term87969.getClass(), "id", 0L);
        setField(term87969, term87969.getClass(), "user", null);
        setIntField(term87969, term87969.getClass(), "duelId", 0);
        setIntField(term87969, term87969.getClass(), "progress", 0);
        setIntField(term87969, term87969.getClass(), "point", 0);
        setBooleanField(term87969, term87969.getClass(), "isClear", false);
        setField(term87969, term87969.getClass(), "lastPlayDate", null);
        setIntField(term87969, term87969.getClass(), "param1", 0);
        setIntField(term87969, term87969.getClass(), "param2", 0);
        setIntField(term87969, term87969.getClass(), "param3", 0);
        setIntField(term87969, term87969.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term87969, args);
    }

};



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
import java.lang.Boolean;

public class UserDuel_setClear_36420187446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87957;
     Object term87967;

    public UserDuel_setClear_36420187446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87957 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        setLongField(term87957, term87957.getClass(), "id", 0L);
        setField(term87957, term87957.getClass(), "user", null);
        setIntField(term87957, term87957.getClass(), "duelId", 0);
        setIntField(term87957, term87957.getClass(), "progress", 0);
        setIntField(term87957, term87957.getClass(), "point", 0);
        setBooleanField(term87957, term87957.getClass(), "isClear", false);
        setField(term87957, term87957.getClass(), "lastPlayDate", null);
        setIntField(term87957, term87957.getClass(), "param1", 0);
        setIntField(term87957, term87957.getClass(), "param2", 0);
        setIntField(term87957, term87957.getClass(), "param3", 0);
        setIntField(term87957, term87957.getClass(), "param4", 0);
        term87967 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term87967;
        callMethod(klass, "setClear", argTypes, term87957, args);
    }

};



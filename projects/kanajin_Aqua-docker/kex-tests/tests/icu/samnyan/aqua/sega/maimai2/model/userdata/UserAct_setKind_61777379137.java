package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserAct_setKind_61777379137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14505;
     Object term14514;

    public UserAct_setKind_61777379137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14505 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        setLongField(term14505, term14505.getClass(), "id", 0L);
        setField(term14505, term14505.getClass(), "user", null);
        setIntField(term14505, term14505.getClass(), "kind", 0);
        setIntField(term14505, term14505.getClass(), "activityId", 0);
        setLongField(term14505, term14505.getClass(), "sortNumber", 0L);
        setIntField(term14505, term14505.getClass(), "param1", 0);
        setIntField(term14505, term14505.getClass(), "param2", 0);
        setIntField(term14505, term14505.getClass(), "param3", 0);
        setIntField(term14505, term14505.getClass(), "param4", 0);
        term14514 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14514;
        callMethod(klass, "setKind", argTypes, term14505, args);
    }

};



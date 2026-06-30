package icu.samnyan.aqua.sega.diva.model.response;

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
import static icu.samnyan.aqua.sega.diva.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BaseResponse_setCmd_19391144111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398926;

    public BaseResponse_setCmd_19391144111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398926 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.BaseResponse"));
        setField(term398926, term398926.getClass(), "cmd", null);
        setField(term398926, term398926.getClass(), "req_id", null);
        setField(term398926, term398926.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.BaseResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCmd", argTypes, term398926, args);
    }

};



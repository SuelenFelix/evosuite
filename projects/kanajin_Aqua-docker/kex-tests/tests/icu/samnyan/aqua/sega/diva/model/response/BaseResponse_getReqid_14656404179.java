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

public class BaseResponse_getReqid_14656404179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398924;

    public BaseResponse_getReqid_14656404179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398924 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.BaseResponse"));
        setField(term398924, term398924.getClass(), "cmd", null);
        setField(term398924, term398924.getClass(), "req_id", null);
        setField(term398924, term398924.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.BaseResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReq_id", argTypes, term398924, args);
    }

};



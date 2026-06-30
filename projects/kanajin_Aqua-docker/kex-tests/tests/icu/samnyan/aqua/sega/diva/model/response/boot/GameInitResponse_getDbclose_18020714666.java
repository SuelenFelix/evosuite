package icu.samnyan.aqua.sega.diva.model.response.boot;

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
import static icu.samnyan.aqua.sega.diva.model.response.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameInitResponse_getDbclose_18020714666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1969;

    public GameInitResponse_getDbclose_18020714666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1969 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.GameInitResponse"));
        setField(term1969, term1969.getClass(), "db_close", null);
        setField(term1969, term1969.getClass(), "retry_time", null);
        setField(term1969, term1969.getClass(), "cmd", null);
        setField(term1969, term1969.getClass(), "req_id", null);
        setField(term1969, term1969.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.GameInitResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDb_close", argTypes, term1969, args);
    }

};



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

public class GameInitResponse_getDbclose_18020714661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1481;

    public GameInitResponse_getDbclose_18020714661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1481 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.GameInitResponse"));
        setField(term1481, term1481.getClass(), "db_close", "hoicvmsovO");
        setField(term1481, term1481.getClass(), "retry_time", "eqJfYWRaEL");
        setField(term1481, term1481.getClass(), "cmd", "fhkbdRViHi");
        setField(term1481, term1481.getClass(), "req_id", "uWHnvSvaPl");
        setField(term1481, term1481.getClass(), "stat", "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.GameInitResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDb_close", argTypes, term1481, args);
    }

};



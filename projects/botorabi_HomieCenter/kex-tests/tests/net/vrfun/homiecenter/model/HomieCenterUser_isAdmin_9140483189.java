package net.vrfun.homiecenter.model;

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
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class HomieCenterUser_isAdmin_9140483189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7011;

    public HomieCenterUser_isAdmin_9140483189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7012 = new Long(-4365849114644724155L);
        term7011 = newInstance(Class.forName("net.vrfun.homiecenter.model.HomieCenterUser"));
        setField(term7011, term7011.getClass(), "id", term7012);
        setField(term7011, term7011.getClass(), "realName", "UBRmXJmfrt");
        setField(term7011, term7011.getClass(), "userName", "WZzvmIHhzZ");
        setField(term7011, term7011.getClass(), "password", "doQLHkjpNm");
        setBooleanField(term7011, term7011.getClass(), "admin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HomieCenterUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAdmin", argTypes, term7011, args);
    }

};



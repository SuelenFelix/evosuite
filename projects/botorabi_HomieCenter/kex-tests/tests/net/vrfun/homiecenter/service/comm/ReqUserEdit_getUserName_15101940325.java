package net.vrfun.homiecenter.service.comm;

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
import static net.vrfun.homiecenter.service.comm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReqUserEdit_getUserName_15101940325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301;

    public ReqUserEdit_getUserName_15101940325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit"));
        setLongField(term301, term301.getClass(), "id", 7411271909051562686L);
        setField(term301, term301.getClass(), "realName", "LQFpaHEwXR");
        setField(term301, term301.getClass(), "userName", "oVcInYnLWB");
        setField(term301, term301.getClass(), "password", "aJlieCFVtF");
        setBooleanField(term301, term301.getClass(), "admin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term301, args);
    }

};



package net.vrfun.homiecenter.fritzbox;

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
import static net.vrfun.homiecenter.fritzbox.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuthStatus_getSID_85289918513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1220;

    public AuthStatus_getSID_85289918513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1220 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus"));
        setField(term1220, term1220.getClass(), "SID", null);
        setField(term1220, term1220.getClass(), "challenge", null);
        setIntField(term1220, term1220.getClass(), "blockTime", 0);
        setField(term1220, term1220.getClass(), "rights", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSID", argTypes, term1220, args);
    }

};



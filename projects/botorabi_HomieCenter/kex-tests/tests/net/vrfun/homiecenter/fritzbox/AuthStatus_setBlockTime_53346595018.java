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
import java.lang.Integer;

public class AuthStatus_setBlockTime_53346595018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1230;
     Object term1232;

    public AuthStatus_setBlockTime_53346595018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1230 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus"));
        setField(term1230, term1230.getClass(), "SID", null);
        setField(term1230, term1230.getClass(), "challenge", null);
        setIntField(term1230, term1230.getClass(), "blockTime", 0);
        setField(term1230, term1230.getClass(), "rights", null);
        term1232 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1232;
        callMethod(klass, "setBlockTime", argTypes, term1230, args);
    }

};



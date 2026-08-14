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
import java.util.HashMap;
import java.util.LinkedHashMap;

public class AuthStatus_setRights_13988861838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905;
     Object term941;

    public AuthStatus_setRights_13988861838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term931 = new HashMap();
        term905 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus"));
        setField(term905, term905.getClass(), "SID", "UoYtihxVaS");
        setField(term905, term905.getClass(), "challenge", "JDswTTCZHV");
        setIntField(term905, term905.getClass(), "blockTime", -1339778481);
        setField(term905, term905.getClass(), "rights", term931);
        term941 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term941;
        callMethod(klass, "setRights", argTypes, term905, args);
    }

};



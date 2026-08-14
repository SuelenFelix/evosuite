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

public class AuthStatus_getRights_15771874917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849;

    public AuthStatus_getRights_15771874917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term875 = new HashMap();
        term849 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus"));
        setField(term849, term849.getClass(), "SID", "xLbjWUgOIL");
        setField(term849, term849.getClass(), "challenge", "jDtqGUpnZN");
        setIntField(term849, term849.getClass(), "blockTime", 1227103734);
        setField(term849, term849.getClass(), "rights", term875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRights", argTypes, term849, args);
    }

};



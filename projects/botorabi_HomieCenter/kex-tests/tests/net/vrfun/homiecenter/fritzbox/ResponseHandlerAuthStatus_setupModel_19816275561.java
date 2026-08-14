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

public class ResponseHandlerAuthStatus_setupModel_19816275561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;
     Object term405;

    public ResponseHandlerAuthStatus_setupModel_19816275561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerAuthStatus"));
        setBooleanField(term403, term403.getClass(), "useCaseSensitiveNames", false);
        HashMap term431 = new HashMap();
        term405 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus"));
        setField(term405, term405.getClass(), "SID", "HyxfbSQYBe");
        setField(term405, term405.getClass(), "challenge", "pCTimMblYc");
        setIntField(term405, term405.getClass(), "blockTime", 568599855);
        setField(term405, term405.getClass(), "rights", term431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerAuthStatus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term405;
        callMethod(klass, "setupModel", argTypes, term403, args);
    }

};



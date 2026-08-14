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

public class AuthStatus_hasValidSID_160340678411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10612;

    public AuthStatus_hasValidSID_160340678411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10638 = new HashMap();
        term10612 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus"));
        setField(term10612, term10612.getClass(), "SID", "zjZYTddemL");
        setField(term10612, term10612.getClass(), "challenge", "QtrylgCLiF");
        setIntField(term10612, term10612.getClass(), "blockTime", 497269071);
        setField(term10612, term10612.getClass(), "rights", term10638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.AuthStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasValidSID", argTypes, term10612, args);
    }

};



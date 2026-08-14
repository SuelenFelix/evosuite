package zowe.client.sdk.zosmfauth.methods;

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
import static zowe.client.sdk.zosmfauth.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZosmfPassword_changePassword_7607196605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public ZosmfPassword_changePassword_7607196605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("zowe.client.sdk.zosmfauth.methods.ZosmfPassword"));
        setField(term69, term69.getClass(), "connection", null);
        setField(term69, term69.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfauth.methods.ZosmfPassword");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfauth.input.PasswordInputData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "changePassword", argTypes, term69, args);
    }

};



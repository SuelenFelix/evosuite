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

public class ZosmfPassword_changePassword_7607196602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public ZosmfPassword_changePassword_7607196602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("zowe.client.sdk.zosmfauth.methods.ZosmfPassword"));
        setField(term1, term1.getClass(), "connection", null);
        setField(term1, term1.getClass(), "request", null);
        term2 = newInstance(Class.forName("zowe.client.sdk.zosmfauth.input.PasswordInputData"));
        setField(term2, term2.getClass(), "userId", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "oldPwd", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "newPwd", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfauth.methods.ZosmfPassword");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfauth.input.PasswordInputData");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "changePassword", argTypes, term1, args);
    }

};



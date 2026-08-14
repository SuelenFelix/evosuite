package zowe.client.sdk.zosmfauth.input;

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
import static zowe.client.sdk.zosmfauth.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PasswordInputData_getNewPwd_802205128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337;

    public PasswordInputData_getNewPwd_802205128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337 = newInstance(Class.forName("zowe.client.sdk.zosmfauth.input.PasswordInputData"));
        setField(term337, term337.getClass(), "userId", null);
        setField(term337, term337.getClass(), "oldPwd", null);
        setField(term337, term337.getClass(), "newPwd", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfauth.input.PasswordInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewPwd", argTypes, term337, args);
    }

};



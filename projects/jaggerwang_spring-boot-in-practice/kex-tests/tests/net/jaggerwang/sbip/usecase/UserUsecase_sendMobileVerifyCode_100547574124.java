package net.jaggerwang.sbip.usecase;

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
import static net.jaggerwang.sbip.usecase.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserUsecase_sendMobileVerifyCode_100547574124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term699;

    public UserUsecase_sendMobileVerifyCode_100547574124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term699 = newInstance(Class.forName("net.jaggerwang.sbip.usecase.UserUsecase"));
        setField(term699, term699.getClass(), "userDAO", null);
        setField(term699, term699.getClass(), "roleDAO", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.usecase.UserUsecase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "sendMobileVerifyCode", argTypes, term699, args);
    }

};



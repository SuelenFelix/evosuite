package net.vrfun.homiecenter.service.comm;

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
import static net.vrfun.homiecenter.service.comm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReqUserEdit_isAdmin_201494147620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787;

    public ReqUserEdit_isAdmin_201494147620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit"));
        setLongField(term787, term787.getClass(), "id", 0L);
        setField(term787, term787.getClass(), "realName", null);
        setField(term787, term787.getClass(), "userName", null);
        setField(term787, term787.getClass(), "password", null);
        setBooleanField(term787, term787.getClass(), "admin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAdmin", argTypes, term787, args);
    }

};



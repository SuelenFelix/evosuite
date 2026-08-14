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

public class ReqUserEdit_getId_6360613921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ReqUserEdit_getId_6360613921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setField(term1, term1.getClass(), "realName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "userName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "password", "MuLcgQHgqz");
        setBooleanField(term1, term1.getClass(), "admin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};



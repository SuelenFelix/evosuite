package net.vrfun.homiecenter.model;

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
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class HomieCenterUser_setUserName_975376666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6757;

    public HomieCenterUser_setUserName_975376666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6758 = new Long(8428634514691209827L);
        term6757 = newInstance(Class.forName("net.vrfun.homiecenter.model.HomieCenterUser"));
        setField(term6757, term6757.getClass(), "id", term6758);
        setField(term6757, term6757.getClass(), "realName", "WBAOTqErtm");
        setField(term6757, term6757.getClass(), "userName", "PqtVXXZMqK");
        setField(term6757, term6757.getClass(), "password", "rYbtIDVdnd");
        setBooleanField(term6757, term6757.getClass(), "admin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HomieCenterUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKAReurpHG";
        callMethod(klass, "setUserName", argTypes, term6757, args);
    }

};



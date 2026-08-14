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

public class HomieCenterUser_getRealName_18983495073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6525;

    public HomieCenterUser_getRealName_18983495073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6526 = new Long(5127676408959197577L);
        term6525 = newInstance(Class.forName("net.vrfun.homiecenter.model.HomieCenterUser"));
        setField(term6525, term6525.getClass(), "id", term6526);
        setField(term6525, term6525.getClass(), "realName", "HBGNxdNURv");
        setField(term6525, term6525.getClass(), "userName", "mfCpTPPQQm");
        setField(term6525, term6525.getClass(), "password", "OcJCIDNIXA");
        setBooleanField(term6525, term6525.getClass(), "admin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HomieCenterUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealName", argTypes, term6525, args);
    }

};



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

public class RespUserStatus_setName_19230863655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111;

    public RespUserStatus_setName_19230863655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1111 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.RespUserStatus"));
        setField(term1111, term1111.getClass(), "appVersion", "LvtrsXUliU");
        setField(term1111, term1111.getClass(), "name", "xLbjWUgOIL");
        setBooleanField(term1111, term1111.getClass(), "authenticated", false);
        setField(term1111, term1111.getClass(), "role", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.RespUserStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nGKItKLYNC";
        callMethod(klass, "setName", argTypes, term1111, args);
    }

};



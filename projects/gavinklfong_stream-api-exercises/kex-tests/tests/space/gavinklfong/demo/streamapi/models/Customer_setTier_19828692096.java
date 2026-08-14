package space.gavinklfong.demo.streamapi.models;

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
import static space.gavinklfong.demo.streamapi.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class Customer_setTier_19828692096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3520;
     Object term3537;

    public Customer_setTier_19828692096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3521 = new Long(6079978726138581731L);
        Integer term3535 = new Integer(306847454);
        term3520 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term3520, term3520.getClass(), "id", term3521);
        setField(term3520, term3520.getClass(), "name", "lRbxbybNew");
        setField(term3520, term3520.getClass(), "tier", term3535);
        term3537 = new Integer(1745276158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3537;
        callMethod(klass, "setTier", argTypes, term3520, args);
    }

};



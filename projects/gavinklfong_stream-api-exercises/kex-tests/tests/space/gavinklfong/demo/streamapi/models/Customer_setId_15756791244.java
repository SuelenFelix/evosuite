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

public class Customer_setId_15756791244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3442;
     Object term3459;

    public Customer_setId_15756791244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3443 = new Long(-1719189544794576143L);
        Integer term3457 = new Integer(-1195339592);
        term3442 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term3442, term3442.getClass(), "id", term3443);
        setField(term3442, term3442.getClass(), "name", "oOOwvWgxtf");
        setField(term3442, term3442.getClass(), "tier", term3457);
        term3459 = new Long(60910260492008727L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3459;
        callMethod(klass, "setId", argTypes, term3442, args);
    }

};



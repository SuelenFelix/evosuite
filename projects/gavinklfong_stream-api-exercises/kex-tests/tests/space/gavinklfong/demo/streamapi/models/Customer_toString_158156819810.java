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

public class Customer_toString_158156819810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3632;

    public Customer_toString_158156819810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3633 = new Long(4376251358600000238L);
        Integer term3647 = new Integer(1050765721);
        term3632 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term3632, term3632.getClass(), "id", term3633);
        setField(term3632, term3632.getClass(), "name", "FzyIShiOmb");
        setField(term3632, term3632.getClass(), "tier", term3647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3632, args);
    }

};



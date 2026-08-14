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

public class Customer_CustomerBuilder_tier_15167148733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1903;
     Object term1920;

    public Customer_CustomerBuilder_tier_15167148733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1904 = new Long(-4944032768681866361L);
        Integer term1918 = new Integer(-1731761810);
        term1903 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer$CustomerBuilder"));
        setField(term1903, term1903.getClass(), "id", term1904);
        setField(term1903, term1903.getClass(), "name", "WQnMpDlSfA");
        setField(term1903, term1903.getClass(), "tier", term1918);
        term1920 = new Integer(197109649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Customer$CustomerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1920;
        callMethod(klass, "tier", argTypes, term1903, args);
    }

};



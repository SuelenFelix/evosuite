package kyungseo.poc.simple.web.site.sample.model;

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
import static kyungseo.poc.simple.web.site.sample.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Customer_CustomerBuilder_build_2948343244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1308;

    public Customer_CustomerBuilder_build_2948343244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1309 = new Integer(-883034806);
        term1308 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Customer$CustomerBuilder"));
        setField(term1308, term1308.getClass(), "customerId", term1309);
        setField(term1308, term1308.getClass(), "customerName", "wSQxaModmm");
        setField(term1308, term1308.getClass(), "company", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Customer$CustomerBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1308, args);
    }

};



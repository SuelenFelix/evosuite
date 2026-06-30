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

public class Customer_getCompany_131339537513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425;

    public Customer_getCompany_131339537513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Customer"));
        setField(term425, term425.getClass(), "customerId", null);
        setField(term425, term425.getClass(), "customerName", null);
        setField(term425, term425.getClass(), "company", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompany", argTypes, term425, args);
    }

};



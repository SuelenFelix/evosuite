package programmerzamannow.spring.core.service;

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
import static programmerzamannow.spring.core.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerService_getPremiumCustomerRepository_19715151125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;

    public CustomerService_getPremiumCustomerRepository_19715151125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("programmerzamannow.spring.core.service.CustomerService"));
        setField(term8, term8.getClass(), "normalCustomerRepository", null);
        setField(term8, term8.getClass(), "premiumCustomerRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.service.CustomerService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPremiumCustomerRepository", argTypes, term8, args);
    }

};



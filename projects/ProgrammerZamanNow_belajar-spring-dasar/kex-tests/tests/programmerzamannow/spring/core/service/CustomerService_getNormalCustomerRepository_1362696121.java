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
import java.lang.Object;

public class CustomerService_getNormalCustomerRepository_1362696121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CustomerService_getNormalCustomerRepository_1362696121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("programmerzamannow.spring.core.service.CustomerService"));
        Object term2 = newInstance(Class.forName("programmerzamannow.spring.core.repository.CustomerRepository"));
        Object term3 = newInstance(Class.forName("programmerzamannow.spring.core.repository.CustomerRepository"));
        setField(term1, term1.getClass(), "normalCustomerRepository", term2);
        setField(term1, term1.getClass(), "premiumCustomerRepository", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.service.CustomerService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNormalCustomerRepository", argTypes, term1, args);
    }

};



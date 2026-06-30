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

public class ProductService_getProductRepository_339471902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40;

    public ProductService_getProductRepository_339471902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40 = newInstance(Class.forName("programmerzamannow.spring.core.service.ProductService"));
        Object term41 = newInstance(Class.forName("programmerzamannow.spring.core.repository.ProductRepository"));
        setField(term40, term40.getClass(), "productRepository", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.service.ProductService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductRepository", argTypes, term40, args);
    }

};



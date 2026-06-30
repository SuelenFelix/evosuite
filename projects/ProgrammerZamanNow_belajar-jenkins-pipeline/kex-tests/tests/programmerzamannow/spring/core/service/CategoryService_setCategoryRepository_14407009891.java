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

public class CategoryService_setCategoryRepository_14407009891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term11;

    public CategoryService_setCategoryRepository_14407009891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("programmerzamannow.spring.core.service.CategoryService"));
        Object term10 = newInstance(Class.forName("programmerzamannow.spring.core.repository.CategoryRepository"));
        setField(term9, term9.getClass(), "categoryRepository", term10);
        term11 = newInstance(Class.forName("programmerzamannow.spring.core.repository.CategoryRepository"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.service.CategoryService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.repository.CategoryRepository");
        Object[] args = new Object[1];
        args[0] = term11;
        callMethod(klass, "setCategoryRepository", argTypes, term9, args);
    }

};



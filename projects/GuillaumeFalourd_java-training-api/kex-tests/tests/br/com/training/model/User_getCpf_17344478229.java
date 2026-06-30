package br.com.training.model;

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
import static br.com.training.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_getCpf_17344478229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;

    public User_getCpf_17344478229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term636 = new Long(6967924379644551255L);
        term635 = newInstance(Class.forName("br.com.training.model.User"));
        Object term674 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term635, term635.getClass(), "id", term636);
        setField(term635, term635.getClass(), "name", "flxyYxBRtu");
        setField(term635, term635.getClass(), "email", "OclPbYPkcH");
        setField(term635, term635.getClass(), "cpf", "IoAlmYsBwc");
        setIntField(term674, term674.getClass(), "year", 2017);
        setShortField(term674, term674.getClass(), "month", (short) 7);
        setShortField(term674, term674.getClass(), "day", (short) 22);
        setField(term635, term635.getClass(), "birthDate", term674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpf", argTypes, term635, args);
    }

};



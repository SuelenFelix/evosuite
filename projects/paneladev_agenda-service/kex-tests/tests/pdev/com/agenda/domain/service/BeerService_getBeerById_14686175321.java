package pdev.com.agenda.domain.service;

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
import static pdev.com.agenda.domain.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BeerService_getBeerById_14686175321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;
     Object term276;

    public BeerService_getBeerById_14686175321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275 = newInstance(Class.forName("pdev.com.agenda.domain.service.BeerService"));
        setField(term275, term275.getClass(), "beerClient", null);
        term276 = new Long(-4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.service.BeerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term276;
        callMethod(klass, "getBeerById", argTypes, term275, args);
    }

};



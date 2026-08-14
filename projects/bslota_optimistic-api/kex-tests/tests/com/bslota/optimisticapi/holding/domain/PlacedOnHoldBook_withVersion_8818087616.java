package com.bslota.optimisticapi.holding.domain;

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
import static com.bslota.optimisticapi.holding.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlacedOnHoldBook_withVersion_8818087616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834;
     Object term884;

    public PlacedOnHoldBook_withVersion_8818087616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term834 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook"));
        Object term835 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term836 = newInstance(Class.forName("java.util.UUID"));
        Object term839 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term852 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term865 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term878 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term879 = newInstance(Class.forName("java.util.UUID"));
        Object term882 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term836, term836.getClass(), "mostSigBits", 2486810210675247493L);
        setLongField(term836, term836.getClass(), "leastSigBits", 7009926388951271268L);
        setField(term835, term835.getClass(), "value", term836);
        setField(term834, term834.getClass(), "id", term835);
        setField(term839, term839.getClass(), "name", "SbAoxhfrkn");
        setField(term834, term834.getClass(), "author", term839);
        setField(term852, term852.getClass(), "title", "kuTXqwMtDB");
        setField(term834, term834.getClass(), "title", term852);
        setField(term865, term865.getClass(), "value", "Ghbwtircqb");
        setField(term834, term834.getClass(), "isbn", term865);
        setLongField(term879, term879.getClass(), "mostSigBits", -7672528020740371001L);
        setLongField(term879, term879.getClass(), "leastSigBits", -4502405999831680926L);
        setField(term878, term878.getClass(), "value", term879);
        setField(term834, term834.getClass(), "patronId", term878);
        setLongField(term882, term882.getClass(), "value", 4872422362414183754L);
        setField(term834, term834.getClass(), "version", term882);
        term884 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term884, term884.getClass(), "value", 6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.aggregate.Version");
        Object[] args = new Object[1];
        args[0] = term884;
        callMethod(klass, "withVersion", argTypes, term834, args);
    }

};



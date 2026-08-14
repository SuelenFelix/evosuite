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

public class PlacedOnHoldBook_isbn_13334731134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674;

    public PlacedOnHoldBook_isbn_13334731134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook"));
        Object term675 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term676 = newInstance(Class.forName("java.util.UUID"));
        Object term679 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term692 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term705 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term718 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term719 = newInstance(Class.forName("java.util.UUID"));
        Object term722 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term676, term676.getClass(), "mostSigBits", -316468845751588286L);
        setLongField(term676, term676.getClass(), "leastSigBits", 5127676408959197577L);
        setField(term675, term675.getClass(), "value", term676);
        setField(term674, term674.getClass(), "id", term675);
        setField(term679, term679.getClass(), "name", "OclPbYPkcH");
        setField(term674, term674.getClass(), "author", term679);
        setField(term692, term692.getClass(), "title", "IoAlmYsBwc");
        setField(term674, term674.getClass(), "title", term692);
        setField(term705, term705.getClass(), "value", "TEParAifyi");
        setField(term674, term674.getClass(), "isbn", term705);
        setLongField(term719, term719.getClass(), "mostSigBits", -6573104506744284592L);
        setLongField(term719, term719.getClass(), "leastSigBits", -4920224193275732920L);
        setField(term718, term718.getClass(), "value", term719);
        setField(term674, term674.getClass(), "patronId", term718);
        setLongField(term722, term722.getClass(), "value", 5270370404989704783L);
        setField(term674, term674.getClass(), "version", term722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isbn", argTypes, term674, args);
    }

};



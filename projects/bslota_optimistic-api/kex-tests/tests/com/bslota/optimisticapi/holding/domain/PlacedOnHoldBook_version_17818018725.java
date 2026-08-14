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

public class PlacedOnHoldBook_version_17818018725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754;

    public PlacedOnHoldBook_version_17818018725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook"));
        Object term755 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term756 = newInstance(Class.forName("java.util.UUID"));
        Object term759 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term772 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term785 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term798 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term799 = newInstance(Class.forName("java.util.UUID"));
        Object term802 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term756, term756.getClass(), "mostSigBits", 8428634514691209827L);
        setLongField(term756, term756.getClass(), "leastSigBits", -2585684163342970173L);
        setField(term755, term755.getClass(), "value", term756);
        setField(term754, term754.getClass(), "id", term755);
        setField(term759, term759.getClass(), "name", "OWDIEULEFu");
        setField(term754, term754.getClass(), "author", term759);
        setField(term772, term772.getClass(), "title", "dWRymuLBtr");
        setField(term754, term754.getClass(), "title", term772);
        setField(term785, term785.getClass(), "value", "AijpHYOFuy");
        setField(term754, term754.getClass(), "isbn", term785);
        setLongField(term799, term799.getClass(), "mostSigBits", 8059786003080744426L);
        setLongField(term799, term799.getClass(), "leastSigBits", -4365849114644724155L);
        setField(term798, term798.getClass(), "value", term799);
        setField(term754, term754.getClass(), "patronId", term798);
        setLongField(term802, term802.getClass(), "value", 7411271909051562686L);
        setField(term754, term754.getClass(), "version", term802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "version", argTypes, term754, args);
    }

};



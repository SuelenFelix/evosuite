package com.bslota.optimisticapi.holding.application;

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
import static com.bslota.optimisticapi.holding.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlacingOnHold_handle_14083869503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term26;
     Object term37;

    public PlacingOnHold_handle_14083869503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlacingOnHold"));
        setField(term25, term25.getClass(), "bookRepository", null);
        term26 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term27 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term28 = newInstance(Class.forName("java.util.UUID"));
        Object term31 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term32 = newInstance(Class.forName("java.util.UUID"));
        Object term35 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term28, term28.getClass(), "mostSigBits", -7237588299778557629L);
        setLongField(term28, term28.getClass(), "leastSigBits", 6967924379644551255L);
        setField(term27, term27.getClass(), "value", term28);
        setField(term26, term26.getClass(), "bookId", term27);
        setLongField(term32, term32.getClass(), "mostSigBits", -2813493605142626659L);
        setLongField(term32, term32.getClass(), "leastSigBits", -8885298608300233488L);
        setField(term31, term31.getClass(), "value", term32);
        setField(term26, term26.getClass(), "patronId", term31);
        setLongField(term35, term35.getClass(), "value", 7411271909051562686L);
        setField(term26, term26.getClass(), "version", term35);
        term37 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook"));
        Object term38 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term39 = newInstance(Class.forName("java.util.UUID"));
        Object term42 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term55 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term68 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term81 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term39, term39.getClass(), "mostSigBits", -4325723315152823407L);
        setLongField(term39, term39.getClass(), "leastSigBits", 2535595959091595249L);
        setField(term38, term38.getClass(), "value", term39);
        setField(term37, term37.getClass(), "id", term38);
        setField(term42, term42.getClass(), "name", "PAEBtnZtTD");
        setField(term37, term37.getClass(), "author", term42);
        setField(term55, term55.getClass(), "title", "sjlJAEtRrb");
        setField(term37, term37.getClass(), "title", term55);
        setField(term68, term68.getClass(), "value", "MuLcgQHgqz");
        setField(term37, term37.getClass(), "isbn", term68);
        setLongField(term81, term81.getClass(), "value", 4872422362414183754L);
        setField(term37, term37.getClass(), "version", term81);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlacingOnHold");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        argTypes[1] = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Object[] args = new Object[2];
        args[0] = term26;
        args[1] = term37;
        callMethod(klass, "handle", argTypes, term25, args);
    }

};



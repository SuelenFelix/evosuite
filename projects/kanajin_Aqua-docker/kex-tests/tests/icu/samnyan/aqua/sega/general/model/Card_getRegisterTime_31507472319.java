package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Card_getRegisterTime_31507472319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2265;

    public Card_getRegisterTime_31507472319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2265 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        setLongField(term2265, term2265.getClass(), "id", 0L);
        setField(term2265, term2265.getClass(), "extId", null);
        setField(term2265, term2265.getClass(), "luid", null);
        setField(term2265, term2265.getClass(), "registerTime", null);
        setField(term2265, term2265.getClass(), "accessTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegisterTime", argTypes, term2265, args);
    }

};



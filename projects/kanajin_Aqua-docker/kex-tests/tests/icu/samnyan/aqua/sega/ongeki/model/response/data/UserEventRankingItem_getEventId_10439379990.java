package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserEventRankingItem_getEventId_10439379990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;

    public UserEventRankingItem_getEventId_10439379990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserEventRankingItem"));
        setIntField(term409, term409.getClass(), "eventId", -655067527);
        setIntField(term409, term409.getClass(), "type", -6029667);
        setField(term409, term409.getClass(), "date", "MxlszYVzRf");
        setIntField(term409, term409.getClass(), "rank", -2068769794);
        setLongField(term409, term409.getClass(), "point", 2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserEventRankingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term409, args);
    }

};



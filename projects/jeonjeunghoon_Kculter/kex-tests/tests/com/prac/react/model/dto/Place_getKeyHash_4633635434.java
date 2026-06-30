package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Place_getKeyHash_4633635434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4655;

    public Place_getKeyHash_4633635434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4655 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term4655, term4655.getClass(), "placeNum", 1725571209);
        setField(term4655, term4655.getClass(), "keyHash", "BjugTaMcxJ");
        setIntField(term4655, term4655.getClass(), "placeType", -522618178);
        setField(term4655, term4655.getClass(), "culture", "vGiuZVPJNH");
        setField(term4655, term4655.getClass(), "kpop", "tlzpzIjMib");
        setDoubleField(term4655, term4655.getClass(), "lat", 0.9374115574082594);
        setDoubleField(term4655, term4655.getClass(), "lng", 0.8454723071922143);
        setIntField(term4655, term4655.getClass(), "status", 1134449235);
        setField(term4655, term4655.getClass(), "name", "AZdLeSugwv");
        setField(term4655, term4655.getClass(), "explain", "RMsXuyzKJV");
        setField(term4655, term4655.getClass(), "address", "FwPbDZcHmB");
        setField(term4655, term4655.getClass(), "fileUrl", "hOncybyCAH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyHash", argTypes, term4655, args);
    }

};



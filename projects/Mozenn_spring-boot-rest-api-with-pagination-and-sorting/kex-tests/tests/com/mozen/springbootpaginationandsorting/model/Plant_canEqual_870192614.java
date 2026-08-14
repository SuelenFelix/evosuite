package com.mozen.springbootpaginationandsorting.model;

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
import static com.mozen.springbootpaginationandsorting.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_canEqual_870192614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1037;
     Object term1079;

    public Plant_canEqual_870192614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1038 = new Long(2535595959091595249L);
        term1037 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term1076 = newInstance(Class.forName("java.time.Instant"));
        setField(term1037, term1037.getClass(), "id", term1038);
        setField(term1037, term1037.getClass(), "name", "gGSMzuGICf");
        setField(term1037, term1037.getClass(), "scientificName", "hxCBltsObl");
        setField(term1037, term1037.getClass(), "family", "BndsHwAFMv");
        setLongField(term1076, term1076.getClass(), "seconds", 1786438250L);
        setIntField(term1076, term1076.getClass(), "nanos", 654608000);
        setField(term1037, term1037.getClass(), "createdAt", term1076);
        term1079 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1079;
        callMethod(klass, "canEqual", argTypes, term1037, args);
    }

};



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

public class Place_getLng_121481849114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6325;

    public Place_getLng_121481849114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6325 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term6325, term6325.getClass(), "placeNum", 767834723);
        setField(term6325, term6325.getClass(), "keyHash", "OcfNzHYdki");
        setIntField(term6325, term6325.getClass(), "placeType", -602026508);
        setField(term6325, term6325.getClass(), "culture", "uPuCVuZYOI");
        setField(term6325, term6325.getClass(), "kpop", "TweMFhxNdj");
        setDoubleField(term6325, term6325.getClass(), "lat", 0.36226058076369927);
        setDoubleField(term6325, term6325.getClass(), "lng", 0.03699061125289671);
        setIntField(term6325, term6325.getClass(), "status", -157887805);
        setField(term6325, term6325.getClass(), "name", "NBrvVzvQHe");
        setField(term6325, term6325.getClass(), "explain", "FjOiNAfBOc");
        setField(term6325, term6325.getClass(), "address", "iCCsaLHohG");
        setField(term6325, term6325.getClass(), "fileUrl", "NJhGgctbdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLng", argTypes, term6325, args);
    }

};



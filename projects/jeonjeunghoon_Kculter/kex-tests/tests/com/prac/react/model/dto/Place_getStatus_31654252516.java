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

public class Place_getStatus_31654252516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6647;

    public Place_getStatus_31654252516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6647 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term6647, term6647.getClass(), "placeNum", -1968847291);
        setField(term6647, term6647.getClass(), "keyHash", "urCiQnUFBM");
        setIntField(term6647, term6647.getClass(), "placeType", 579005622);
        setField(term6647, term6647.getClass(), "culture", "EKjQdtKxAM");
        setField(term6647, term6647.getClass(), "kpop", "TXZAIPQJHt");
        setDoubleField(term6647, term6647.getClass(), "lat", 0.426231085465289);
        setDoubleField(term6647, term6647.getClass(), "lng", 0.0027299293098262956);
        setIntField(term6647, term6647.getClass(), "status", -14890619);
        setField(term6647, term6647.getClass(), "name", "DIbeDHICho");
        setField(term6647, term6647.getClass(), "explain", "dJGPlmSRnz");
        setField(term6647, term6647.getClass(), "address", "DPskuFUobI");
        setField(term6647, term6647.getClass(), "fileUrl", "wBGfLpNNiZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term6647, args);
    }

};



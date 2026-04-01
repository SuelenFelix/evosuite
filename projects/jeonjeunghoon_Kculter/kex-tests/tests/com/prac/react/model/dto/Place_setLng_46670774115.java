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
import java.lang.Double;

public class Place_setLng_46670774115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6485;
     Object term6575;

    public Place_setLng_46670774115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6485 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term6485, term6485.getClass(), "placeNum", 1876565163);
        setField(term6485, term6485.getClass(), "keyHash", "MYWYUeLGOp");
        setIntField(term6485, term6485.getClass(), "placeType", -817164822);
        setField(term6485, term6485.getClass(), "culture", "tsTGdgQYUL");
        setField(term6485, term6485.getClass(), "kpop", "TtGbVmKcnX");
        setDoubleField(term6485, term6485.getClass(), "lat", 0.6047137830113202);
        setDoubleField(term6485, term6485.getClass(), "lng", 0.6767213143579776);
        setIntField(term6485, term6485.getClass(), "status", -1016503459);
        setField(term6485, term6485.getClass(), "name", "GJVkUrCVdD");
        setField(term6485, term6485.getClass(), "explain", "zNdorvdUgu");
        setField(term6485, term6485.getClass(), "address", "oPxuZbkYio");
        setField(term6485, term6485.getClass(), "fileUrl", "vKitydDVnM");
        term6575 = new Double(0.48862955528902696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6575;
        callMethod(klass, "setLng", argTypes, term6485, args);
    }

};



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

public class Pin_setImageUrl_15388042813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25293;

    public Pin_setImageUrl_15388042813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25293 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term25293, term25293.getClass(), "pinNum", -1793950607);
        setField(term25293, term25293.getClass(), "pinHash", "HdWLwfVsAM");
        setIntField(term25293, term25293.getClass(), "pinType", 1091954101);
        setIntField(term25293, term25293.getClass(), "pinKeyNum", 1895143076);
        setField(term25293, term25293.getClass(), "pinKeyHash", "SxeKEdHXSl");
        setField(term25293, term25293.getClass(), "imageUrl", "BCAlJpNjIX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PKClfBAwUr";
        callMethod(klass, "setImageUrl", argTypes, term25293, args);
    }

};



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

public class Stay_setSumnail_134024218913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2260;

    public Stay_setSumnail_134024218913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2260 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term2260, term2260.getClass(), "addr1", "sEccwbJKYE");
        setField(term2260, term2260.getClass(), "addr2", "AWRooQKkdW");
        setField(term2260, term2260.getClass(), "areaCode", "vjxIhXHxGR");
        setField(term2260, term2260.getClass(), "sigunguCode", "QXzGXbEXMu");
        setField(term2260, term2260.getClass(), "representImg", "qxSDVejjiY");
        setField(term2260, term2260.getClass(), "sumnail", "xBsXSDjXYK");
        setDoubleField(term2260, term2260.getClass(), "lng", 0.13481025392611334);
        setDoubleField(term2260, term2260.getClass(), "lat", 0.3800088629986428);
        setField(term2260, term2260.getClass(), "tel", "sEnIVFtZuQ");
        setField(term2260, term2260.getClass(), "title", "ZVecLZMLHF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fztQhjqwdP";
        callMethod(klass, "setSumnail", argTypes, term2260, args);
    }

};



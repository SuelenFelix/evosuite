package com.greydev.notionbackup.model;

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
import static com.greydev.notionbackup.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Result_toString_73041804412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1837;

    public Result_toString_73041804412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1863 = new Integer(1632125673);
        term1837 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1850 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1837, term1837.getClass(), "state", "jXzmYyrnnT");
        setField(term1850, term1850.getClass(), "type", "igCAtimmYB");
        setField(term1850, term1850.getClass(), "pagesExported", term1863);
        setField(term1850, term1850.getClass(), "exportUrl", "DyiXbeYIaN");
        setField(term1837, term1837.getClass(), "status", term1850);
        setField(term1837, term1837.getClass(), "error", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1837, args);
    }

};



package com.hack23.sonar.cloudformation.reports.cfnnag;

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
import static com.hack23.sonar.cloudformation.reports.cfnnag.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class CfnNagReport_toString_18858597815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;

    public CfnNagReport_toString_18858597815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term168 = new ArrayList();
        term166 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport"));
        setIntField(term166, term166.getClass(), "failureCount", -616727354);
        setField(term166, term166.getClass(), "violations", term168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term166, args);
    }

};



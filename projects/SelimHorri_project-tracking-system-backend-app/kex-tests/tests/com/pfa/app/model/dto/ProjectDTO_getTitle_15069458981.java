package com.pfa.app.model.dto;

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
import static com.pfa.app.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ProjectDTO_getTitle_15069458981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726;

    public ProjectDTO_getTitle_15069458981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term775 = new ArrayList();
        ((ArrayList) term775).add("kuTXqwMtDB");
        ((ArrayList) term775).add("Ghbwtircqb");
        ((ArrayList) term775).add("xrwlQZdwCp");
        term726 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term726, term726.getClass(), "title", "OWDIEULEFu");
        setField(term726, term726.getClass(), "startDate", "dWRymuLBtr");
        setField(term726, term726.getClass(), "endDate", "AijpHYOFuy");
        setField(term726, term726.getClass(), "status", "SbAoxhfrkn");
        setField(term726, term726.getClass(), "assignedEmployees", term775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term726, args);
    }

};



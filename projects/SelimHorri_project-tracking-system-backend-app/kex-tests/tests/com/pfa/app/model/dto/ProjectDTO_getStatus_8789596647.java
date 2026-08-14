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

public class ProjectDTO_getStatus_8789596647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1636;

    public ProjectDTO_getStatus_8789596647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1685 = new ArrayList();
        ((ArrayList) term1685).add("HqBOwkVqjD");
        ((ArrayList) term1685).add("MAcUBcBckh");
        ((ArrayList) term1685).add("oVgzLbrsFr");
        ((ArrayList) term1685).add("vQVyKLdtaz");
        ((ArrayList) term1685).add("OWKQODBLzb");
        ((ArrayList) term1685).add("wGmYcqUkgE");
        ((ArrayList) term1685).add("idgaQsnJpQ");
        term1636 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term1636, term1636.getClass(), "title", "whBvTVIIlC");
        setField(term1636, term1636.getClass(), "startDate", "IgRJUzaCwW");
        setField(term1636, term1636.getClass(), "endDate", "JUmudUmaaV");
        setField(term1636, term1636.getClass(), "status", "KoyGrUJeJW");
        setField(term1636, term1636.getClass(), "assignedEmployees", term1685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term1636, args);
    }

};



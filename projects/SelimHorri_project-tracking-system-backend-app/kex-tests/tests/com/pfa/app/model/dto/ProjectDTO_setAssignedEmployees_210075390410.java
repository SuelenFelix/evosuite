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
import java.util.LinkedList;
import java.lang.Object;

public class ProjectDTO_setAssignedEmployees_210075390410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2223;
     Object term2336;

    public ProjectDTO_setAssignedEmployees_210075390410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2272 = new ArrayList();
        ((ArrayList) term2272).add("SPpkrGcPRr");
        ((ArrayList) term2272).add("sEccwbJKYE");
        ((ArrayList) term2272).add("AWRooQKkdW");
        ((ArrayList) term2272).add("vjxIhXHxGR");
        ((ArrayList) term2272).add("QXzGXbEXMu");
        term2223 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term2223, term2223.getClass(), "title", "XqgfKFvPSD");
        setField(term2223, term2223.getClass(), "startDate", "JiVRgTZvKc");
        setField(term2223, term2223.getClass(), "endDate", "XPKmummaqg");
        setField(term2223, term2223.getClass(), "status", "BKLfkLiZTH");
        setField(term2223, term2223.getClass(), "assignedEmployees", term2272);
        term2336 = new LinkedList();
        ((LinkedList) term2336).add("qxSDVejjiY");
        ((LinkedList) term2336).add("xBsXSDjXYK");
        ((LinkedList) term2336).add("");
        ((LinkedList) term2336).add((Object)null);
        ((LinkedList) term2336).add((Object)null);
        ((LinkedList) term2336).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2336;
        callMethod(klass, "setAssignedEmployees", argTypes, term2223, args);
    }

};



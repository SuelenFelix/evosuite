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

public class AssignEmployeesDto_getAssignedEmployees_10790319697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12049;

    public AssignEmployeesDto_getAssignedEmployees_10790319697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12074 = new ArrayList();
        ((ArrayList) term12074).add("gYTIkBFOoS");
        ((ArrayList) term12074).add("xmzSoVgiED");
        ((ArrayList) term12074).add("pdSvedKgPq");
        ((ArrayList) term12074).add("epPTwvcoyb");
        ((ArrayList) term12074).add("UBPHmOICBs");
        ((ArrayList) term12074).add("IDJUVPgUJf");
        ((ArrayList) term12074).add("JmnWRJUxGr");
        term12049 = newInstance(Class.forName("com.pfa.app.model.dto.AssignEmployeesDto"));
        setField(term12049, term12049.getClass(), "projectId", "YfkhviKZwl");
        setField(term12049, term12049.getClass(), "title", "DcOhhAfJTI");
        setField(term12049, term12049.getClass(), "assignedEmployees", term12074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAssignedEmployees", argTypes, term12049, args);
    }

};



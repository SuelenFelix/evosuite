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

public class AssignEmployeesDto_getProjectId_13577126693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11523;

    public AssignEmployeesDto_getProjectId_13577126693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11548 = new ArrayList();
        ((ArrayList) term11548).add("vgdwrCZczl");
        ((ArrayList) term11548).add("gKMNrpKBpu");
        ((ArrayList) term11548).add("ZbHJVEqcoa");
        ((ArrayList) term11548).add("awDQVEVIKi");
        ((ArrayList) term11548).add("HJwNgUzZZR");
        ((ArrayList) term11548).add("FvUCZgTXhq");
        ((ArrayList) term11548).add("wWWidPCHzx");
        ((ArrayList) term11548).add("OwPIiBRuKK");
        ((ArrayList) term11548).add("sgfGySMODT");
        term11523 = newInstance(Class.forName("com.pfa.app.model.dto.AssignEmployeesDto"));
        setField(term11523, term11523.getClass(), "projectId", "mnHyQbMyld");
        setField(term11523, term11523.getClass(), "title", "KHtaDOIcJZ");
        setField(term11523, term11523.getClass(), "assignedEmployees", term11548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term11523, args);
    }

};



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

public class AssignEmployeesDto_setAssignedEmployees_6396287498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12252;
     Object term12329;

    public AssignEmployeesDto_setAssignedEmployees_6396287498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12277 = new ArrayList();
        ((ArrayList) term12277).add("rQjxAhisjm");
        ((ArrayList) term12277).add("ZDhASPHjDG");
        ((ArrayList) term12277).add("HNVOAXYNEZ");
        ((ArrayList) term12277).add("gbbYBYyfvr");
        term12252 = newInstance(Class.forName("com.pfa.app.model.dto.AssignEmployeesDto"));
        setField(term12252, term12252.getClass(), "projectId", "wgRGBNrTGP");
        setField(term12252, term12252.getClass(), "title", "FIdNVptZpW");
        setField(term12252, term12252.getClass(), "assignedEmployees", term12277);
        term12329 = new LinkedList();
        ((LinkedList) term12329).add("SrWMUlbtWV");
        ((LinkedList) term12329).add("VePIumgrrU");
        ((LinkedList) term12329).add("");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term12329;
        callMethod(klass, "setAssignedEmployees", argTypes, term12252, args);
    }

};



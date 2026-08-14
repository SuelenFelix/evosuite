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

public class AssignmentDto_setCommitDate_4110181076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10880;

    public AssignmentDto_setCommitDate_4110181076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10880 = newInstance(Class.forName("com.pfa.app.model.dto.AssignmentDto"));
        setField(term10880, term10880.getClass(), "employeeId", "WaEcyVlcIx");
        setField(term10880, term10880.getClass(), "projectId", "ONcbPCQnHd");
        setField(term10880, term10880.getClass(), "commitDate", "AobDaplFLl");
        setField(term10880, term10880.getClass(), "commitMgrDesc", "pDkMNnAGgv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignmentDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PaCpFXGzdX";
        callMethod(klass, "setCommitDate", argTypes, term10880, args);
    }

};



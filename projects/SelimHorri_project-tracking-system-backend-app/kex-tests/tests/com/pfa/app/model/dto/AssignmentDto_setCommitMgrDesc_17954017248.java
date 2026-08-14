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

public class AssignmentDto_setCommitMgrDesc_17954017248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11080;

    public AssignmentDto_setCommitMgrDesc_17954017248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11080 = newInstance(Class.forName("com.pfa.app.model.dto.AssignmentDto"));
        setField(term11080, term11080.getClass(), "employeeId", "XMHwbfiHRl");
        setField(term11080, term11080.getClass(), "projectId", "bucTnYicnp");
        setField(term11080, term11080.getClass(), "commitDate", "EkgprvqZlM");
        setField(term11080, term11080.getClass(), "commitMgrDesc", "fbnKvthhOz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.AssignmentDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PGfCDJTBek";
        callMethod(klass, "setCommitMgrDesc", argTypes, term11080, args);
    }

};



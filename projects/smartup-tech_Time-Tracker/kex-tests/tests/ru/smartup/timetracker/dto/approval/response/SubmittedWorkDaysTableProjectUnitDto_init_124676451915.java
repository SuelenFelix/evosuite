package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.util.LinkedList;

public class SubmittedWorkDaysTableProjectUnitDto_init_124676451915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14497;
     Object term14511;
     Object term14525;

    public SubmittedWorkDaysTableProjectUnitDto_init_124676451915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14497 = new Integer(-157887805);
        term14511 = new Long(-7268507582722666254L);
        term14525 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term14497;
        args[1] = "mvrkADEgpp";
        args[2] = term14511;
        args[3] = "pXOkjyeIRb";
        args[4] = term14525;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



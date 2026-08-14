package com.hack23.sonar.cloudformation.reports.checkov;

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
import static com.hack23.sonar.cloudformation.reports.checkov.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class CheckovPassedCheck_getFileLineRange_23768277115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4856;

    public CheckovPassedCheck_getFileLineRange_23768277115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4896 = newInstance(Class.forName("java.lang.Object"));
        Object term4897 = newInstance(Class.forName("java.lang.Object"));
        Object term4898 = newInstance(Class.forName("java.lang.Object"));
        Object term4899 = newInstance(Class.forName("java.lang.Object"));
        Object term4900 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term4894 = new ArrayList();
        ((ArrayList) term4894).add(term4896);
        ((ArrayList) term4894).add(term4897);
        ((ArrayList) term4894).add(term4898);
        ((ArrayList) term4894).add(term4899);
        ((ArrayList) term4894).add(term4900);
        Integer term4929 = new Integer(339854490);
        Integer term4931 = new Integer(-615654495);
        Integer term4933 = new Integer(-1476117762);
        Integer term4935 = new Integer(-341962980);
        ArrayList term4927 = new ArrayList();
        ((ArrayList) term4927).add(term4929);
        ((ArrayList) term4927).add(term4931);
        ((ArrayList) term4927).add(term4933);
        ((ArrayList) term4927).add(term4935);
        Integer term4990 = new Integer(1532716628);
        Integer term4992 = new Integer(-1801760683);
        Integer term4994 = new Integer(1141317871);
        Integer term4996 = new Integer(890669485);
        ArrayList term4988 = new ArrayList();
        ((ArrayList) term4988).add(term4990);
        ((ArrayList) term4988).add(term4992);
        ((ArrayList) term4988).add(term4994);
        ((ArrayList) term4988).add(term4996);
        term4856 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term4881 = newInstance(Class.forName("java.lang.Object"));
        Object term4963 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term5012 = newInstance(Class.forName("java.lang.Object"));
        setField(term4856, term4856.getClass(), "checkId", "vKQukfbJUd");
        setField(term4856, term4856.getClass(), "checkName", "lFRJFUMVbx");
        setField(term4856, term4856.getClass(), "checkResult", term4881);
        setField(term4856, term4856.getClass(), "bcCheckId", "sZdUNdggUW");
        setField(term4856, term4856.getClass(), "codeBlock", term4894);
        setField(term4856, term4856.getClass(), "filePath", "OqbwYQfvAe");
        setField(term4856, term4856.getClass(), "repoFilePath", "tRxZafjqIx");
        setField(term4856, term4856.getClass(), "fileLineRange", term4927);
        setField(term4856, term4856.getClass(), "resource", "DhjNLmRMCu");
        setField(term4856, term4856.getClass(), "fileAbsPath", "PgPzMSEjjX");
        setField(term4963, term4963.getClass(), "name", "wzsPSPcRdj");
        setField(term4856, term4856.getClass(), "entityTags", term4963);
        setField(term4856, term4856.getClass(), "callerFilePath", "kGMQdqJYyB");
        setField(term4856, term4856.getClass(), "callerFileLineRange", term4988);
        setField(term4856, term4856.getClass(), "fixedDefinition", "XJJNClzHRf");
        setField(term4856, term4856.getClass(), "evaluations", term5012);
        setField(term4856, term4856.getClass(), "checkClass", "HDaezxQfQR");
        setField(term4856, term4856.getClass(), "guideline", "iikZEapDlu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileLineRange", argTypes, term4856, args);
    }

};



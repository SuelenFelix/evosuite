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

public class CheckovPassedCheck_setCheckId_8451657442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853;

    public CheckovPassedCheck_setCheckId_8451657442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term893 = newInstance(Class.forName("java.lang.Object"));
        Object term894 = newInstance(Class.forName("java.lang.Object"));
        Object term895 = newInstance(Class.forName("java.lang.Object"));
        Object term896 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term891 = new ArrayList();
        ((ArrayList) term891).add(term893);
        ((ArrayList) term891).add(term894);
        ((ArrayList) term891).add(term895);
        ((ArrayList) term891).add(term896);
        Integer term925 = new Integer(-2038273078);
        ArrayList term923 = new ArrayList();
        ((ArrayList) term923).add(term925);
        Integer term980 = new Integer(1227103734);
        Integer term982 = new Integer(-1339778481);
        Integer term984 = new Integer(1725571209);
        Integer term986 = new Integer(-522618178);
        Integer term988 = new Integer(1134449235);
        Integer term990 = new Integer(-883034806);
        ArrayList term978 = new ArrayList();
        ((ArrayList) term978).add(term980);
        ((ArrayList) term978).add(term982);
        ((ArrayList) term978).add(term984);
        ((ArrayList) term978).add(term986);
        ((ArrayList) term978).add(term988);
        ((ArrayList) term978).add(term990);
        term853 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term878 = newInstance(Class.forName("java.lang.Object"));
        Object term953 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term1006 = newInstance(Class.forName("java.lang.Object"));
        setField(term853, term853.getClass(), "checkId", "IoAlmYsBwc");
        setField(term853, term853.getClass(), "checkName", "TEParAifyi");
        setField(term853, term853.getClass(), "checkResult", term878);
        setField(term853, term853.getClass(), "bcCheckId", "OWDIEULEFu");
        setField(term853, term853.getClass(), "codeBlock", term891);
        setField(term853, term853.getClass(), "filePath", "dWRymuLBtr");
        setField(term853, term853.getClass(), "repoFilePath", "AijpHYOFuy");
        setField(term853, term853.getClass(), "fileLineRange", term923);
        setField(term853, term853.getClass(), "resource", "SbAoxhfrkn");
        setField(term853, term853.getClass(), "fileAbsPath", "kuTXqwMtDB");
        setField(term953, term953.getClass(), "name", "Ghbwtircqb");
        setField(term853, term853.getClass(), "entityTags", term953);
        setField(term853, term853.getClass(), "callerFilePath", "xrwlQZdwCp");
        setField(term853, term853.getClass(), "callerFileLineRange", term978);
        setField(term853, term853.getClass(), "fixedDefinition", "IDCWpPLRkE");
        setField(term853, term853.getClass(), "evaluations", term1006);
        setField(term853, term853.getClass(), "checkClass", "nyiiPDVjAc");
        setField(term853, term853.getClass(), "guideline", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        callMethod(klass, "setCheckId", argTypes, term853, args);
    }

};



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

public class CheckovPassedCheck_equals_198291070836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11363;
     Object term11556;

    public CheckovPassedCheck_equals_198291070836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11403 = newInstance(Class.forName("java.lang.Object"));
        Object term11404 = newInstance(Class.forName("java.lang.Object"));
        Object term11405 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11401 = new ArrayList();
        ((ArrayList) term11401).add(term11403);
        ((ArrayList) term11401).add(term11404);
        ((ArrayList) term11401).add(term11405);
        Integer term11434 = new Integer(-310528004);
        Integer term11436 = new Integer(-634976996);
        Integer term11438 = new Integer(-1015274146);
        Integer term11440 = new Integer(-49052672);
        Integer term11442 = new Integer(339372704);
        Integer term11444 = new Integer(-851097944);
        ArrayList term11432 = new ArrayList();
        ((ArrayList) term11432).add(term11434);
        ((ArrayList) term11432).add(term11436);
        ((ArrayList) term11432).add(term11438);
        ((ArrayList) term11432).add(term11440);
        ((ArrayList) term11432).add(term11442);
        ((ArrayList) term11432).add(term11444);
        Integer term11499 = new Integer(803925431);
        Integer term11501 = new Integer(76929641);
        Integer term11503 = new Integer(-2003192918);
        Integer term11505 = new Integer(-1362856620);
        Integer term11507 = new Integer(-1835839814);
        Integer term11509 = new Integer(-1404350380);
        Integer term11511 = new Integer(-2013924238);
        Integer term11513 = new Integer(579006268);
        Integer term11515 = new Integer(-1694747156);
        ArrayList term11497 = new ArrayList();
        ((ArrayList) term11497).add(term11499);
        ((ArrayList) term11497).add(term11501);
        ((ArrayList) term11497).add(term11503);
        ((ArrayList) term11497).add(term11505);
        ((ArrayList) term11497).add(term11507);
        ((ArrayList) term11497).add(term11509);
        ((ArrayList) term11497).add(term11511);
        ((ArrayList) term11497).add(term11513);
        ((ArrayList) term11497).add(term11515);
        term11363 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term11388 = newInstance(Class.forName("java.lang.Object"));
        Object term11472 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term11531 = newInstance(Class.forName("java.lang.Object"));
        setField(term11363, term11363.getClass(), "checkId", "mKaHyMybrK");
        setField(term11363, term11363.getClass(), "checkName", "AyrEXuGrEj");
        setField(term11363, term11363.getClass(), "checkResult", term11388);
        setField(term11363, term11363.getClass(), "bcCheckId", "yevIIoVYHq");
        setField(term11363, term11363.getClass(), "codeBlock", term11401);
        setField(term11363, term11363.getClass(), "filePath", "UuYWMTqWTV");
        setField(term11363, term11363.getClass(), "repoFilePath", "DSFGlcaXUb");
        setField(term11363, term11363.getClass(), "fileLineRange", term11432);
        setField(term11363, term11363.getClass(), "resource", "sHMXNUzNeM");
        setField(term11363, term11363.getClass(), "fileAbsPath", "gPzGDOEPPw");
        setField(term11472, term11472.getClass(), "name", "rwKoAngzCu");
        setField(term11363, term11363.getClass(), "entityTags", term11472);
        setField(term11363, term11363.getClass(), "callerFilePath", "VUkRVwROTl");
        setField(term11363, term11363.getClass(), "callerFileLineRange", term11497);
        setField(term11363, term11363.getClass(), "fixedDefinition", "UDlkdccCRn");
        setField(term11363, term11363.getClass(), "evaluations", term11531);
        setField(term11363, term11363.getClass(), "checkClass", "McpzErOcYb");
        setField(term11363, term11363.getClass(), "guideline", "jqrVEUvYEz");
        term11556 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11556;
        callMethod(klass, "equals", argTypes, term11363, args);
    }

};



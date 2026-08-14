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

public class CheckovPassedCheck_getGuideline_133179852523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7327;

    public CheckovPassedCheck_getGuideline_133179852523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7367 = newInstance(Class.forName("java.lang.Object"));
        Object term7368 = newInstance(Class.forName("java.lang.Object"));
        Object term7369 = newInstance(Class.forName("java.lang.Object"));
        Object term7370 = newInstance(Class.forName("java.lang.Object"));
        Object term7371 = newInstance(Class.forName("java.lang.Object"));
        Object term7372 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term7365 = new ArrayList();
        ((ArrayList) term7365).add(term7367);
        ((ArrayList) term7365).add(term7368);
        ((ArrayList) term7365).add(term7369);
        ((ArrayList) term7365).add(term7370);
        ((ArrayList) term7365).add(term7371);
        ((ArrayList) term7365).add(term7372);
        Integer term7401 = new Integer(1557431527);
        Integer term7403 = new Integer(-1504890659);
        Integer term7405 = new Integer(1358829571);
        Integer term7407 = new Integer(991356662);
        Integer term7409 = new Integer(-506958186);
        ArrayList term7399 = new ArrayList();
        ((ArrayList) term7399).add(term7401);
        ((ArrayList) term7399).add(term7403);
        ((ArrayList) term7399).add(term7405);
        ((ArrayList) term7399).add(term7407);
        ((ArrayList) term7399).add(term7409);
        Integer term7464 = new Integer(-507387516);
        ArrayList term7462 = new ArrayList();
        ((ArrayList) term7462).add(term7464);
        term7327 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term7352 = newInstance(Class.forName("java.lang.Object"));
        Object term7437 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term7480 = newInstance(Class.forName("java.lang.Object"));
        setField(term7327, term7327.getClass(), "checkId", "GJVkUrCVdD");
        setField(term7327, term7327.getClass(), "checkName", "zNdorvdUgu");
        setField(term7327, term7327.getClass(), "checkResult", term7352);
        setField(term7327, term7327.getClass(), "bcCheckId", "oPxuZbkYio");
        setField(term7327, term7327.getClass(), "codeBlock", term7365);
        setField(term7327, term7327.getClass(), "filePath", "vKitydDVnM");
        setField(term7327, term7327.getClass(), "repoFilePath", "urCiQnUFBM");
        setField(term7327, term7327.getClass(), "fileLineRange", term7399);
        setField(term7327, term7327.getClass(), "resource", "EKjQdtKxAM");
        setField(term7327, term7327.getClass(), "fileAbsPath", "TXZAIPQJHt");
        setField(term7437, term7437.getClass(), "name", "DIbeDHICho");
        setField(term7327, term7327.getClass(), "entityTags", term7437);
        setField(term7327, term7327.getClass(), "callerFilePath", "dJGPlmSRnz");
        setField(term7327, term7327.getClass(), "callerFileLineRange", term7462);
        setField(term7327, term7327.getClass(), "fixedDefinition", "DPskuFUobI");
        setField(term7327, term7327.getClass(), "evaluations", term7480);
        setField(term7327, term7327.getClass(), "checkClass", "wBGfLpNNiZ");
        setField(term7327, term7327.getClass(), "guideline", "yUGCjlqgJE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGuideline", argTypes, term7327, args);
    }

};



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

public class CheckovPassedCheck_setRepoFilePath_201203004414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4552;

    public CheckovPassedCheck_setRepoFilePath_201203004414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4590 = new ArrayList();
        ArrayList term4618 = new ArrayList();
        Integer term4673 = new Integer(-663691365);
        ArrayList term4671 = new ArrayList();
        ((ArrayList) term4671).add(term4673);
        term4552 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term4577 = newInstance(Class.forName("java.lang.Object"));
        Object term4646 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term4689 = newInstance(Class.forName("java.lang.Object"));
        setField(term4552, term4552.getClass(), "checkId", "lihXWlGDxk");
        setField(term4552, term4552.getClass(), "checkName", "JmcmxoGhIK");
        setField(term4552, term4552.getClass(), "checkResult", term4577);
        setField(term4552, term4552.getClass(), "bcCheckId", "jXzmYyrnnT");
        setField(term4552, term4552.getClass(), "codeBlock", term4590);
        setField(term4552, term4552.getClass(), "filePath", "igCAtimmYB");
        setField(term4552, term4552.getClass(), "repoFilePath", "DyiXbeYIaN");
        setField(term4552, term4552.getClass(), "fileLineRange", term4618);
        setField(term4552, term4552.getClass(), "resource", "VGizxZnyHX");
        setField(term4552, term4552.getClass(), "fileAbsPath", "kVEZMHmRtR");
        setField(term4646, term4646.getClass(), "name", "ekxGuOYIwi");
        setField(term4552, term4552.getClass(), "entityTags", term4646);
        setField(term4552, term4552.getClass(), "callerFilePath", "RbVQXSpxXy");
        setField(term4552, term4552.getClass(), "callerFileLineRange", term4671);
        setField(term4552, term4552.getClass(), "fixedDefinition", "YpJbIgJWWv");
        setField(term4552, term4552.getClass(), "evaluations", term4689);
        setField(term4552, term4552.getClass(), "checkClass", "JppkknKVOw");
        setField(term4552, term4552.getClass(), "guideline", "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kNqaJKIATy";
        callMethod(klass, "setRepoFilePath", argTypes, term4552, args);
    }

};



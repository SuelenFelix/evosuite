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

public class CheckovPassedCheck_setCheckName_2920624006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2101;

    public CheckovPassedCheck_setCheckName_2920624006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2141 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term2139 = new ArrayList();
        ((ArrayList) term2139).add(term2141);
        ArrayList term2168 = new ArrayList();
        Integer term2223 = new Integer(-157887805);
        Integer term2225 = new Integer(1876565163);
        ArrayList term2221 = new ArrayList();
        ((ArrayList) term2221).add(term2223);
        ((ArrayList) term2221).add(term2225);
        term2101 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term2126 = newInstance(Class.forName("java.lang.Object"));
        Object term2196 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term2241 = newInstance(Class.forName("java.lang.Object"));
        setField(term2101, term2101.getClass(), "checkId", "OWKQODBLzb");
        setField(term2101, term2101.getClass(), "checkName", "wGmYcqUkgE");
        setField(term2101, term2101.getClass(), "checkResult", term2126);
        setField(term2101, term2101.getClass(), "bcCheckId", "idgaQsnJpQ");
        setField(term2101, term2101.getClass(), "codeBlock", term2139);
        setField(term2101, term2101.getClass(), "filePath", "VgZnGoIFwQ");
        setField(term2101, term2101.getClass(), "repoFilePath", "jUbSRrkrYZ");
        setField(term2101, term2101.getClass(), "fileLineRange", term2168);
        setField(term2101, term2101.getClass(), "resource", "bWWfajKbEX");
        setField(term2101, term2101.getClass(), "fileAbsPath", "cAPeiZHKGJ");
        setField(term2196, term2196.getClass(), "name", "LvJFtLBaxj");
        setField(term2101, term2101.getClass(), "entityTags", term2196);
        setField(term2101, term2101.getClass(), "callerFilePath", "PHvxnGHptP");
        setField(term2101, term2101.getClass(), "callerFileLineRange", term2221);
        setField(term2101, term2101.getClass(), "fixedDefinition", "TimdotUuNC");
        setField(term2101, term2101.getClass(), "evaluations", term2241);
        setField(term2101, term2101.getClass(), "checkClass", "PkWMRdJcBb");
        setField(term2101, term2101.getClass(), "guideline", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        callMethod(klass, "setCheckName", argTypes, term2101, args);
    }

};



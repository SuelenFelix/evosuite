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

public class CheckovPassedCheck_setResource_64289603118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5759;

    public CheckovPassedCheck_setResource_64289603118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5799 = newInstance(Class.forName("java.lang.Object"));
        Object term5800 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5797 = new ArrayList();
        ((ArrayList) term5797).add(term5799);
        ((ArrayList) term5797).add(term5800);
        Integer term5829 = new Integer(538259104);
        Integer term5831 = new Integer(96566506);
        Integer term5833 = new Integer(-343325701);
        Integer term5835 = new Integer(107945604);
        Integer term5837 = new Integer(-1963464809);
        ArrayList term5827 = new ArrayList();
        ((ArrayList) term5827).add(term5829);
        ((ArrayList) term5827).add(term5831);
        ((ArrayList) term5827).add(term5833);
        ((ArrayList) term5827).add(term5835);
        ((ArrayList) term5827).add(term5837);
        ArrayList term5890 = new ArrayList();
        term5759 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term5784 = newInstance(Class.forName("java.lang.Object"));
        Object term5865 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term5906 = newInstance(Class.forName("java.lang.Object"));
        setField(term5759, term5759.getClass(), "checkId", "qCpEbQDHdF");
        setField(term5759, term5759.getClass(), "checkName", "AHbZyFOmlo");
        setField(term5759, term5759.getClass(), "checkResult", term5784);
        setField(term5759, term5759.getClass(), "bcCheckId", "TwfWVQGiIj");
        setField(term5759, term5759.getClass(), "codeBlock", term5797);
        setField(term5759, term5759.getClass(), "filePath", "gUvcueTURF");
        setField(term5759, term5759.getClass(), "repoFilePath", "EwQBhZjCIT");
        setField(term5759, term5759.getClass(), "fileLineRange", term5827);
        setField(term5759, term5759.getClass(), "resource", "aSkmSwTnEw");
        setField(term5759, term5759.getClass(), "fileAbsPath", "xvkbvaEGYd");
        setField(term5865, term5865.getClass(), "name", "HBGNxdNURv");
        setField(term5759, term5759.getClass(), "entityTags", term5865);
        setField(term5759, term5759.getClass(), "callerFilePath", "mfCpTPPQQm");
        setField(term5759, term5759.getClass(), "callerFileLineRange", term5890);
        setField(term5759, term5759.getClass(), "fixedDefinition", "OcJCIDNIXA");
        setField(term5759, term5759.getClass(), "evaluations", term5906);
        setField(term5759, term5759.getClass(), "checkClass", "XfRABIFVEp");
        setField(term5759, term5759.getClass(), "guideline", "MHGKyEnwKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShIELyuULw";
        callMethod(klass, "setResource", argTypes, term5759, args);
    }

};



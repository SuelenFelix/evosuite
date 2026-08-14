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

public class CheckovPassedCheck_setFileAbsPath_95739887226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8240;

    public CheckovPassedCheck_setFileAbsPath_95739887226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8280 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term8278 = new ArrayList();
        ((ArrayList) term8278).add(term8280);
        Integer term8309 = new Integer(-426764678);
        Integer term8311 = new Integer(-1222614956);
        Integer term8313 = new Integer(-1870495012);
        Integer term8315 = new Integer(-1310015129);
        Integer term8317 = new Integer(-2104981311);
        Integer term8319 = new Integer(-571169753);
        ArrayList term8307 = new ArrayList();
        ((ArrayList) term8307).add(term8309);
        ((ArrayList) term8307).add(term8311);
        ((ArrayList) term8307).add(term8313);
        ((ArrayList) term8307).add(term8315);
        ((ArrayList) term8307).add(term8317);
        ((ArrayList) term8307).add(term8319);
        Integer term8374 = new Integer(318591690);
        Integer term8376 = new Integer(-165587447);
        Integer term8378 = new Integer(-1347358701);
        Integer term8380 = new Integer(806595993);
        Integer term8382 = new Integer(548228925);
        Integer term8384 = new Integer(-749861210);
        Integer term8386 = new Integer(1694224101);
        ArrayList term8372 = new ArrayList();
        ((ArrayList) term8372).add(term8374);
        ((ArrayList) term8372).add(term8376);
        ((ArrayList) term8372).add(term8378);
        ((ArrayList) term8372).add(term8380);
        ((ArrayList) term8372).add(term8382);
        ((ArrayList) term8372).add(term8384);
        ((ArrayList) term8372).add(term8386);
        term8240 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term8265 = newInstance(Class.forName("java.lang.Object"));
        Object term8347 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term8402 = newInstance(Class.forName("java.lang.Object"));
        setField(term8240, term8240.getClass(), "checkId", "pumvwBWvpy");
        setField(term8240, term8240.getClass(), "checkName", "HwLHeGLyhe");
        setField(term8240, term8240.getClass(), "checkResult", term8265);
        setField(term8240, term8240.getClass(), "bcCheckId", "RDnkgWkcbz");
        setField(term8240, term8240.getClass(), "codeBlock", term8278);
        setField(term8240, term8240.getClass(), "filePath", "IBpaxltauX");
        setField(term8240, term8240.getClass(), "repoFilePath", "hePqROaplw");
        setField(term8240, term8240.getClass(), "fileLineRange", term8307);
        setField(term8240, term8240.getClass(), "resource", "PJcSNDruWd");
        setField(term8240, term8240.getClass(), "fileAbsPath", "VVNNlAePXF");
        setField(term8347, term8347.getClass(), "name", "jnwVnmKAFv");
        setField(term8240, term8240.getClass(), "entityTags", term8347);
        setField(term8240, term8240.getClass(), "callerFilePath", "TXyHhqeCjR");
        setField(term8240, term8240.getClass(), "callerFileLineRange", term8372);
        setField(term8240, term8240.getClass(), "fixedDefinition", "lZIgPZPgTu");
        setField(term8240, term8240.getClass(), "evaluations", term8402);
        setField(term8240, term8240.getClass(), "checkClass", "iuCxnHGMoW");
        setField(term8240, term8240.getClass(), "guideline", "GPSEWEDSTo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RCOqfVsRHt";
        callMethod(klass, "setFileAbsPath", argTypes, term8240, args);
    }

};



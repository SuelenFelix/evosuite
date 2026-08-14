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

public class CheckovPassedCheck_getEvaluations_192948820619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6073;

    public CheckovPassedCheck_getEvaluations_192948820619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6113 = newInstance(Class.forName("java.lang.Object"));
        Object term6114 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term6111 = new ArrayList();
        ((ArrayList) term6111).add(term6113);
        ((ArrayList) term6111).add(term6114);
        Integer term6143 = new Integer(71190297);
        Integer term6145 = new Integer(1202361360);
        Integer term6147 = new Integer(-2015048153);
        Integer term6149 = new Integer(-2063457669);
        Integer term6151 = new Integer(-1222006000);
        Integer term6153 = new Integer(2095798786);
        Integer term6155 = new Integer(-1565502840);
        ArrayList term6141 = new ArrayList();
        ((ArrayList) term6141).add(term6143);
        ((ArrayList) term6141).add(term6145);
        ((ArrayList) term6141).add(term6147);
        ((ArrayList) term6141).add(term6149);
        ((ArrayList) term6141).add(term6151);
        ((ArrayList) term6141).add(term6153);
        ((ArrayList) term6141).add(term6155);
        Integer term6210 = new Integer(344323424);
        Integer term6212 = new Integer(9726679);
        ArrayList term6208 = new ArrayList();
        ((ArrayList) term6208).add(term6210);
        ((ArrayList) term6208).add(term6212);
        term6073 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term6098 = newInstance(Class.forName("java.lang.Object"));
        Object term6183 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term6228 = newInstance(Class.forName("java.lang.Object"));
        setField(term6073, term6073.getClass(), "checkId", "IpQuOGMgmj");
        setField(term6073, term6073.getClass(), "checkName", "pJbnHTYrxn");
        setField(term6073, term6073.getClass(), "checkResult", term6098);
        setField(term6073, term6073.getClass(), "bcCheckId", "iIRsCSYqXH");
        setField(term6073, term6073.getClass(), "codeBlock", term6111);
        setField(term6073, term6073.getClass(), "filePath", "nghfqDXyCG");
        setField(term6073, term6073.getClass(), "repoFilePath", "WBAOTqErtm");
        setField(term6073, term6073.getClass(), "fileLineRange", term6141);
        setField(term6073, term6073.getClass(), "resource", "PqtVXXZMqK");
        setField(term6073, term6073.getClass(), "fileAbsPath", "rYbtIDVdnd");
        setField(term6183, term6183.getClass(), "name", "UKAReurpHG");
        setField(term6073, term6073.getClass(), "entityTags", term6183);
        setField(term6073, term6073.getClass(), "callerFilePath", "WVRMUmrljA");
        setField(term6073, term6073.getClass(), "callerFileLineRange", term6208);
        setField(term6073, term6073.getClass(), "fixedDefinition", "NTlKJDDWlk");
        setField(term6073, term6073.getClass(), "evaluations", term6228);
        setField(term6073, term6073.getClass(), "checkClass", "vOuMEpOQAg");
        setField(term6073, term6073.getClass(), "guideline", "SIODFGaQhr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvaluations", argTypes, term6073, args);
    }

};



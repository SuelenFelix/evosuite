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

public class CheckovPassedCheck_getRepoFilePath_128859642813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4255;

    public CheckovPassedCheck_getRepoFilePath_128859642813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4295 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term4293 = new ArrayList();
        ((ArrayList) term4293).add(term4295);
        ArrayList term4322 = new ArrayList();
        Integer term4377 = new Integer(-894662986);
        Integer term4379 = new Integer(304775596);
        Integer term4381 = new Integer(-1347665717);
        Integer term4383 = new Integer(-1888585309);
        Integer term4385 = new Integer(683666002);
        Integer term4387 = new Integer(1596213415);
        Integer term4389 = new Integer(-268815336);
        Integer term4391 = new Integer(-1210583429);
        ArrayList term4375 = new ArrayList();
        ((ArrayList) term4375).add(term4377);
        ((ArrayList) term4375).add(term4379);
        ((ArrayList) term4375).add(term4381);
        ((ArrayList) term4375).add(term4383);
        ((ArrayList) term4375).add(term4385);
        ((ArrayList) term4375).add(term4387);
        ((ArrayList) term4375).add(term4389);
        ((ArrayList) term4375).add(term4391);
        term4255 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term4280 = newInstance(Class.forName("java.lang.Object"));
        Object term4350 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term4407 = newInstance(Class.forName("java.lang.Object"));
        setField(term4255, term4255.getClass(), "checkId", "WzFopsaDuG");
        setField(term4255, term4255.getClass(), "checkName", "PapWxkhEWe");
        setField(term4255, term4255.getClass(), "checkResult", term4280);
        setField(term4255, term4255.getClass(), "bcCheckId", "smnHEqRFRx");
        setField(term4255, term4255.getClass(), "codeBlock", term4293);
        setField(term4255, term4255.getClass(), "filePath", "XYtryyobou");
        setField(term4255, term4255.getClass(), "repoFilePath", "OYbzXylRWW");
        setField(term4255, term4255.getClass(), "fileLineRange", term4322);
        setField(term4255, term4255.getClass(), "resource", "DSNsTGYXDF");
        setField(term4255, term4255.getClass(), "fileAbsPath", "sQvGcVjdEx");
        setField(term4350, term4350.getClass(), "name", "rLHAoqXgPh");
        setField(term4255, term4255.getClass(), "entityTags", term4350);
        setField(term4255, term4255.getClass(), "callerFilePath", "zUlRdimJtU");
        setField(term4255, term4255.getClass(), "callerFileLineRange", term4375);
        setField(term4255, term4255.getClass(), "fixedDefinition", "vwbEQQNQrx");
        setField(term4255, term4255.getClass(), "evaluations", term4407);
        setField(term4255, term4255.getClass(), "checkClass", "xtftXXMbem");
        setField(term4255, term4255.getClass(), "guideline", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRepoFilePath", argTypes, term4255, args);
    }

};



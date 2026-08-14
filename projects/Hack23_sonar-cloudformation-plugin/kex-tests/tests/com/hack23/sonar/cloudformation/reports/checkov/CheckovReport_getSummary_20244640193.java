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

public class CheckovReport_getSummary_20244640193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12209;

    public CheckovReport_getSummary_20244640193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12243 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12243, term12243.getClass(), "checkId", null);
        setField(term12243, term12243.getClass(), "checkName", null);
        setField(term12243, term12243.getClass(), "checkResult", null);
        setField(term12243, term12243.getClass(), "bcCheckId", null);
        setField(term12243, term12243.getClass(), "codeBlock", null);
        setField(term12243, term12243.getClass(), "filePath", null);
        setField(term12243, term12243.getClass(), "repoFilePath", null);
        setField(term12243, term12243.getClass(), "fileLineRange", null);
        setField(term12243, term12243.getClass(), "resource", null);
        setField(term12243, term12243.getClass(), "fileAbsPath", null);
        setField(term12243, term12243.getClass(), "entityTags", null);
        setField(term12243, term12243.getClass(), "callerFilePath", null);
        setField(term12243, term12243.getClass(), "callerFileLineRange", null);
        setField(term12243, term12243.getClass(), "fixedDefinition", null);
        setField(term12243, term12243.getClass(), "evaluations", null);
        setField(term12243, term12243.getClass(), "checkClass", null);
        setField(term12243, term12243.getClass(), "guideline", null);
        ArrayList term12241 = new ArrayList();
        ((ArrayList) term12241).add(term12243);
        Object term12248 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12248, term12248.getClass(), "checkId", null);
        setField(term12248, term12248.getClass(), "checkName", null);
        setField(term12248, term12248.getClass(), "checkResult", null);
        setField(term12248, term12248.getClass(), "bcCheckId", null);
        setField(term12248, term12248.getClass(), "codeBlock", null);
        setField(term12248, term12248.getClass(), "filePath", null);
        setField(term12248, term12248.getClass(), "repoFilePath", null);
        setField(term12248, term12248.getClass(), "fileLineRange", null);
        setField(term12248, term12248.getClass(), "resource", null);
        setField(term12248, term12248.getClass(), "fileAbsPath", null);
        setField(term12248, term12248.getClass(), "entityTags", null);
        setField(term12248, term12248.getClass(), "callerFilePath", null);
        setField(term12248, term12248.getClass(), "callerFileLineRange", null);
        setField(term12248, term12248.getClass(), "fixedDefinition", null);
        setField(term12248, term12248.getClass(), "evaluations", null);
        setField(term12248, term12248.getClass(), "checkClass", null);
        setField(term12248, term12248.getClass(), "guideline", null);
        Object term12249 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12249, term12249.getClass(), "checkId", null);
        setField(term12249, term12249.getClass(), "checkName", null);
        setField(term12249, term12249.getClass(), "checkResult", null);
        setField(term12249, term12249.getClass(), "bcCheckId", null);
        setField(term12249, term12249.getClass(), "codeBlock", null);
        setField(term12249, term12249.getClass(), "filePath", null);
        setField(term12249, term12249.getClass(), "repoFilePath", null);
        setField(term12249, term12249.getClass(), "fileLineRange", null);
        setField(term12249, term12249.getClass(), "resource", null);
        setField(term12249, term12249.getClass(), "fileAbsPath", null);
        setField(term12249, term12249.getClass(), "entityTags", null);
        setField(term12249, term12249.getClass(), "callerFilePath", null);
        setField(term12249, term12249.getClass(), "callerFileLineRange", null);
        setField(term12249, term12249.getClass(), "fixedDefinition", null);
        setField(term12249, term12249.getClass(), "evaluations", null);
        setField(term12249, term12249.getClass(), "checkClass", null);
        setField(term12249, term12249.getClass(), "guideline", null);
        Object term12250 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12250, term12250.getClass(), "checkId", null);
        setField(term12250, term12250.getClass(), "checkName", null);
        setField(term12250, term12250.getClass(), "checkResult", null);
        setField(term12250, term12250.getClass(), "bcCheckId", null);
        setField(term12250, term12250.getClass(), "codeBlock", null);
        setField(term12250, term12250.getClass(), "filePath", null);
        setField(term12250, term12250.getClass(), "repoFilePath", null);
        setField(term12250, term12250.getClass(), "fileLineRange", null);
        setField(term12250, term12250.getClass(), "resource", null);
        setField(term12250, term12250.getClass(), "fileAbsPath", null);
        setField(term12250, term12250.getClass(), "entityTags", null);
        setField(term12250, term12250.getClass(), "callerFilePath", null);
        setField(term12250, term12250.getClass(), "callerFileLineRange", null);
        setField(term12250, term12250.getClass(), "fixedDefinition", null);
        setField(term12250, term12250.getClass(), "evaluations", null);
        setField(term12250, term12250.getClass(), "checkClass", null);
        setField(term12250, term12250.getClass(), "guideline", null);
        ArrayList term12246 = new ArrayList();
        ((ArrayList) term12246).add(term12248);
        ((ArrayList) term12246).add(term12249);
        ((ArrayList) term12246).add(term12250);
        ArrayList term12253 = new ArrayList();
        ((ArrayList) term12253).add("");
        ((ArrayList) term12253).add("");
        ((ArrayList) term12253).add("");
        ArrayList term12260 = new ArrayList();
        ((ArrayList) term12260).add("");
        ((ArrayList) term12260).add("");
        ((ArrayList) term12260).add("");
        ((ArrayList) term12260).add("");
        term12209 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovReport"));
        Object term12222 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary"));
        Object term12240 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovResults"));
        setField(term12209, term12209.getClass(), "checkType", "IbxeAMwLVt");
        setIntField(term12222, term12222.getClass(), "passed", -1772434990);
        setIntField(term12222, term12222.getClass(), "failed", -1845499264);
        setIntField(term12222, term12222.getClass(), "skipped", -505439934);
        setIntField(term12222, term12222.getClass(), "resourceCount", -344842608);
        setIntField(term12222, term12222.getClass(), "parsingErrors", 941650513);
        setField(term12222, term12222.getClass(), "checkovVersion", "bShlAqoTmZ");
        setField(term12209, term12209.getClass(), "summary", term12222);
        setField(term12240, term12240.getClass(), "passedChecks", term12241);
        setField(term12240, term12240.getClass(), "failedChecks", term12246);
        setField(term12240, term12240.getClass(), "skippedChecks", term12253);
        setField(term12240, term12240.getClass(), "parsingErrors", term12260);
        setField(term12209, term12209.getClass(), "results", term12240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovReport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSummary", argTypes, term12209, args);
    }

};



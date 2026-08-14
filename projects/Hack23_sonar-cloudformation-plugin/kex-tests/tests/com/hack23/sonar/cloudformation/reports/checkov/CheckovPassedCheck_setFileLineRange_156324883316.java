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
import java.util.LinkedList;

public class CheckovPassedCheck_setFileLineRange_156324883316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5157;
     Object term5335;

    public CheckovPassedCheck_setFileLineRange_156324883316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5195 = new ArrayList();
        Integer term5225 = new Integer(691577392);
        Integer term5227 = new Integer(-893623680);
        Integer term5229 = new Integer(-1963434938);
        Integer term5231 = new Integer(906181092);
        Integer term5233 = new Integer(1045657203);
        Integer term5235 = new Integer(1386130016);
        Integer term5237 = new Integer(1072005683);
        ArrayList term5223 = new ArrayList();
        ((ArrayList) term5223).add(term5225);
        ((ArrayList) term5223).add(term5227);
        ((ArrayList) term5223).add(term5229);
        ((ArrayList) term5223).add(term5231);
        ((ArrayList) term5223).add(term5233);
        ((ArrayList) term5223).add(term5235);
        ((ArrayList) term5223).add(term5237);
        Integer term5292 = new Integer(1861318859);
        Integer term5294 = new Integer(1474524152);
        ArrayList term5290 = new ArrayList();
        ((ArrayList) term5290).add(term5292);
        ((ArrayList) term5290).add(term5294);
        term5157 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term5182 = newInstance(Class.forName("java.lang.Object"));
        Object term5265 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term5310 = newInstance(Class.forName("java.lang.Object"));
        setField(term5157, term5157.getClass(), "checkId", "nhoHrZfnIN");
        setField(term5157, term5157.getClass(), "checkName", "ZkMALXpEAZ");
        setField(term5157, term5157.getClass(), "checkResult", term5182);
        setField(term5157, term5157.getClass(), "bcCheckId", "tXfQjSqDzN");
        setField(term5157, term5157.getClass(), "codeBlock", term5195);
        setField(term5157, term5157.getClass(), "filePath", "BjugTaMcxJ");
        setField(term5157, term5157.getClass(), "repoFilePath", "vGiuZVPJNH");
        setField(term5157, term5157.getClass(), "fileLineRange", term5223);
        setField(term5157, term5157.getClass(), "resource", "tlzpzIjMib");
        setField(term5157, term5157.getClass(), "fileAbsPath", "AZdLeSugwv");
        setField(term5265, term5265.getClass(), "name", "RMsXuyzKJV");
        setField(term5157, term5157.getClass(), "entityTags", term5265);
        setField(term5157, term5157.getClass(), "callerFilePath", "FwPbDZcHmB");
        setField(term5157, term5157.getClass(), "callerFileLineRange", term5290);
        setField(term5157, term5157.getClass(), "fixedDefinition", "hOncybyCAH");
        setField(term5157, term5157.getClass(), "evaluations", term5310);
        setField(term5157, term5157.getClass(), "checkClass", "QduALnDSVo");
        setField(term5157, term5157.getClass(), "guideline", "izPpKDErnQ");
        term5335 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5335;
        callMethod(klass, "setFileLineRange", argTypes, term5157, args);
    }

};



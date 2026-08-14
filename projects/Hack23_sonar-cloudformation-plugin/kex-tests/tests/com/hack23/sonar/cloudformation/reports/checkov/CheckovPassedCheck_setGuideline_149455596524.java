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

public class CheckovPassedCheck_setGuideline_149455596524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7625;

    public CheckovPassedCheck_setGuideline_149455596524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7663 = new ArrayList();
        Integer term7693 = new Integer(-1970452551);
        Integer term7695 = new Integer(-1896376975);
        Integer term7697 = new Integer(729658803);
        Integer term7699 = new Integer(114754804);
        Integer term7701 = new Integer(1687361082);
        Integer term7703 = new Integer(584893196);
        ArrayList term7691 = new ArrayList();
        ((ArrayList) term7691).add(term7693);
        ((ArrayList) term7691).add(term7695);
        ((ArrayList) term7691).add(term7697);
        ((ArrayList) term7691).add(term7699);
        ((ArrayList) term7691).add(term7701);
        ((ArrayList) term7691).add(term7703);
        Integer term7758 = new Integer(497269071);
        Integer term7760 = new Integer(-1899301124);
        Integer term7762 = new Integer(-1882480155);
        Integer term7764 = new Integer(-1410220680);
        Integer term7766 = new Integer(389427431);
        ArrayList term7756 = new ArrayList();
        ((ArrayList) term7756).add(term7758);
        ((ArrayList) term7756).add(term7760);
        ((ArrayList) term7756).add(term7762);
        ((ArrayList) term7756).add(term7764);
        ((ArrayList) term7756).add(term7766);
        term7625 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term7650 = newInstance(Class.forName("java.lang.Object"));
        Object term7731 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term7782 = newInstance(Class.forName("java.lang.Object"));
        setField(term7625, term7625.getClass(), "checkId", "PXdVZyoJyC");
        setField(term7625, term7625.getClass(), "checkName", "vLerpqavFM");
        setField(term7625, term7625.getClass(), "checkResult", term7650);
        setField(term7625, term7625.getClass(), "bcCheckId", "qnvxzwuGKX");
        setField(term7625, term7625.getClass(), "codeBlock", term7663);
        setField(term7625, term7625.getClass(), "filePath", "EdPAvpluZg");
        setField(term7625, term7625.getClass(), "repoFilePath", "DzHVBMqWtE");
        setField(term7625, term7625.getClass(), "fileLineRange", term7691);
        setField(term7625, term7625.getClass(), "resource", "THZSpzBRYP");
        setField(term7625, term7625.getClass(), "fileAbsPath", "ZfBIVGBQOE");
        setField(term7731, term7731.getClass(), "name", "QSrDQfEsTR");
        setField(term7625, term7625.getClass(), "entityTags", term7731);
        setField(term7625, term7625.getClass(), "callerFilePath", "PsqusYmejD");
        setField(term7625, term7625.getClass(), "callerFileLineRange", term7756);
        setField(term7625, term7625.getClass(), "fixedDefinition", "NTWMiBEaDF");
        setField(term7625, term7625.getClass(), "evaluations", term7782);
        setField(term7625, term7625.getClass(), "checkClass", "SPBstwKFVr");
        setField(term7625, term7625.getClass(), "guideline", "WxYUTuqmIq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OeQLvhVERT";
        callMethod(klass, "setGuideline", argTypes, term7625, args);
    }

};



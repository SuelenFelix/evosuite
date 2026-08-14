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

public class CheckovPassedCheck_setCallerFilePath_15650918130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9499;

    public CheckovPassedCheck_setCallerFilePath_15650918130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9539 = newInstance(Class.forName("java.lang.Object"));
        Object term9540 = newInstance(Class.forName("java.lang.Object"));
        Object term9541 = newInstance(Class.forName("java.lang.Object"));
        Object term9542 = newInstance(Class.forName("java.lang.Object"));
        Object term9543 = newInstance(Class.forName("java.lang.Object"));
        Object term9544 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term9537 = new ArrayList();
        ((ArrayList) term9537).add(term9539);
        ((ArrayList) term9537).add(term9540);
        ((ArrayList) term9537).add(term9541);
        ((ArrayList) term9537).add(term9542);
        ((ArrayList) term9537).add(term9543);
        ((ArrayList) term9537).add(term9544);
        Integer term9573 = new Integer(534834644);
        Integer term9575 = new Integer(1959097203);
        Integer term9577 = new Integer(-209654048);
        Integer term9579 = new Integer(477625804);
        Integer term9581 = new Integer(252575029);
        Integer term9583 = new Integer(57189932);
        Integer term9585 = new Integer(1460722225);
        Integer term9587 = new Integer(1743224434);
        ArrayList term9571 = new ArrayList();
        ((ArrayList) term9571).add(term9573);
        ((ArrayList) term9571).add(term9575);
        ((ArrayList) term9571).add(term9577);
        ((ArrayList) term9571).add(term9579);
        ((ArrayList) term9571).add(term9581);
        ((ArrayList) term9571).add(term9583);
        ((ArrayList) term9571).add(term9585);
        ((ArrayList) term9571).add(term9587);
        Integer term9642 = new Integer(842904495);
        Integer term9644 = new Integer(1008080511);
        Integer term9646 = new Integer(1935707624);
        Integer term9648 = new Integer(1507074215);
        Integer term9650 = new Integer(-282881827);
        Integer term9652 = new Integer(-1183353915);
        ArrayList term9640 = new ArrayList();
        ((ArrayList) term9640).add(term9642);
        ((ArrayList) term9640).add(term9644);
        ((ArrayList) term9640).add(term9646);
        ((ArrayList) term9640).add(term9648);
        ((ArrayList) term9640).add(term9650);
        ((ArrayList) term9640).add(term9652);
        term9499 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term9524 = newInstance(Class.forName("java.lang.Object"));
        Object term9615 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term9668 = newInstance(Class.forName("java.lang.Object"));
        setField(term9499, term9499.getClass(), "checkId", "lBOokzEPfe");
        setField(term9499, term9499.getClass(), "checkName", "dtGZCsKXbW");
        setField(term9499, term9499.getClass(), "checkResult", term9524);
        setField(term9499, term9499.getClass(), "bcCheckId", "bdyhHbDAmJ");
        setField(term9499, term9499.getClass(), "codeBlock", term9537);
        setField(term9499, term9499.getClass(), "filePath", "BBXiTNHqGE");
        setField(term9499, term9499.getClass(), "repoFilePath", "IEYhJmgCVd");
        setField(term9499, term9499.getClass(), "fileLineRange", term9571);
        setField(term9499, term9499.getClass(), "resource", "KSJeYkkvpk");
        setField(term9499, term9499.getClass(), "fileAbsPath", "qUtkFGMNUV");
        setField(term9615, term9615.getClass(), "name", "mGRiYhnMcR");
        setField(term9499, term9499.getClass(), "entityTags", term9615);
        setField(term9499, term9499.getClass(), "callerFilePath", "NFlvfJCVPO");
        setField(term9499, term9499.getClass(), "callerFileLineRange", term9640);
        setField(term9499, term9499.getClass(), "fixedDefinition", "KarbTXFmUU");
        setField(term9499, term9499.getClass(), "evaluations", term9668);
        setField(term9499, term9499.getClass(), "checkClass", "jiUSjqwSIQ");
        setField(term9499, term9499.getClass(), "guideline", "MgLCedQfoj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zgKiINdgNu";
        callMethod(klass, "setCallerFilePath", argTypes, term9499, args);
    }

};



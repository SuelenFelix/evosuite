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

public class CheckovPassedCheck_getCodeBlock_353547149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3018;

    public CheckovPassedCheck_getCodeBlock_353547149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3058 = newInstance(Class.forName("java.lang.Object"));
        Object term3059 = newInstance(Class.forName("java.lang.Object"));
        Object term3060 = newInstance(Class.forName("java.lang.Object"));
        Object term3061 = newInstance(Class.forName("java.lang.Object"));
        Object term3062 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3056 = new ArrayList();
        ((ArrayList) term3056).add(term3058);
        ((ArrayList) term3056).add(term3059);
        ((ArrayList) term3056).add(term3060);
        ((ArrayList) term3056).add(term3061);
        ((ArrayList) term3056).add(term3062);
        Integer term3091 = new Integer(1324040357);
        Integer term3093 = new Integer(-1588772968);
        Integer term3095 = new Integer(-93135961);
        Integer term3097 = new Integer(-112921587);
        Integer term3099 = new Integer(933028652);
        Integer term3101 = new Integer(287287233);
        ArrayList term3089 = new ArrayList();
        ((ArrayList) term3089).add(term3091);
        ((ArrayList) term3089).add(term3093);
        ((ArrayList) term3089).add(term3095);
        ((ArrayList) term3089).add(term3097);
        ((ArrayList) term3089).add(term3099);
        ((ArrayList) term3089).add(term3101);
        Integer term3156 = new Integer(962840079);
        Integer term3158 = new Integer(1540719661);
        Integer term3160 = new Integer(1265463001);
        Integer term3162 = new Integer(335112684);
        Integer term3164 = new Integer(1551099402);
        ArrayList term3154 = new ArrayList();
        ((ArrayList) term3154).add(term3156);
        ((ArrayList) term3154).add(term3158);
        ((ArrayList) term3154).add(term3160);
        ((ArrayList) term3154).add(term3162);
        ((ArrayList) term3154).add(term3164);
        term3018 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term3043 = newInstance(Class.forName("java.lang.Object"));
        Object term3129 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term3180 = newInstance(Class.forName("java.lang.Object"));
        setField(term3018, term3018.getClass(), "checkId", "MvRIxilFMJ");
        setField(term3018, term3018.getClass(), "checkName", "iNwOJRBEjp");
        setField(term3018, term3018.getClass(), "checkResult", term3043);
        setField(term3018, term3018.getClass(), "bcCheckId", "XylxrMBraH");
        setField(term3018, term3018.getClass(), "codeBlock", term3056);
        setField(term3018, term3018.getClass(), "filePath", "pORebkoRdD");
        setField(term3018, term3018.getClass(), "repoFilePath", "mXGCWJDOqA");
        setField(term3018, term3018.getClass(), "fileLineRange", term3089);
        setField(term3018, term3018.getClass(), "resource", "dpNsDgfPso");
        setField(term3018, term3018.getClass(), "fileAbsPath", "hCWPJQKpdc");
        setField(term3129, term3129.getClass(), "name", "WzMEhMXkKx");
        setField(term3018, term3018.getClass(), "entityTags", term3129);
        setField(term3018, term3018.getClass(), "callerFilePath", "XOiDvlDhdc");
        setField(term3018, term3018.getClass(), "callerFileLineRange", term3154);
        setField(term3018, term3018.getClass(), "fixedDefinition", "AdxvLJhNLe");
        setField(term3018, term3018.getClass(), "evaluations", term3180);
        setField(term3018, term3018.getClass(), "checkClass", "lHfTrWKMPk");
        setField(term3018, term3018.getClass(), "guideline", "JDaAnsVTGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCodeBlock", argTypes, term3018, args);
    }

};



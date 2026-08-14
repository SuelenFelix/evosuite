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

public class CheckovPassedCheck_getCheckName_4548198405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1806;

    public CheckovPassedCheck_getCheckName_4548198405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1846 = newInstance(Class.forName("java.lang.Object"));
        Object term1847 = newInstance(Class.forName("java.lang.Object"));
        Object term1848 = newInstance(Class.forName("java.lang.Object"));
        Object term1849 = newInstance(Class.forName("java.lang.Object"));
        Object term1850 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term1844 = new ArrayList();
        ((ArrayList) term1844).add(term1846);
        ((ArrayList) term1844).add(term1847);
        ((ArrayList) term1844).add(term1848);
        ((ArrayList) term1844).add(term1849);
        ((ArrayList) term1844).add(term1850);
        Integer term1879 = new Integer(-1145578966);
        Integer term1881 = new Integer(679763016);
        ArrayList term1877 = new ArrayList();
        ((ArrayList) term1877).add(term1879);
        ((ArrayList) term1877).add(term1881);
        Integer term1936 = new Integer(1962444399);
        Integer term1938 = new Integer(767834723);
        Integer term1940 = new Integer(-602026508);
        ArrayList term1934 = new ArrayList();
        ((ArrayList) term1934).add(term1936);
        ((ArrayList) term1934).add(term1938);
        ((ArrayList) term1934).add(term1940);
        term1806 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term1831 = newInstance(Class.forName("java.lang.Object"));
        Object term1909 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term1956 = newInstance(Class.forName("java.lang.Object"));
        setField(term1806, term1806.getClass(), "checkId", "kBdSllIBVz");
        setField(term1806, term1806.getClass(), "checkName", "TJmVBGfTML");
        setField(term1806, term1806.getClass(), "checkResult", term1831);
        setField(term1806, term1806.getClass(), "bcCheckId", "tPlsykYBqO");
        setField(term1806, term1806.getClass(), "codeBlock", term1844);
        setField(term1806, term1806.getClass(), "filePath", "bLPjGVBhlX");
        setField(term1806, term1806.getClass(), "repoFilePath", "whBvTVIIlC");
        setField(term1806, term1806.getClass(), "fileLineRange", term1877);
        setField(term1806, term1806.getClass(), "resource", "IgRJUzaCwW");
        setField(term1806, term1806.getClass(), "fileAbsPath", "JUmudUmaaV");
        setField(term1909, term1909.getClass(), "name", "KoyGrUJeJW");
        setField(term1806, term1806.getClass(), "entityTags", term1909);
        setField(term1806, term1806.getClass(), "callerFilePath", "HqBOwkVqjD");
        setField(term1806, term1806.getClass(), "callerFileLineRange", term1934);
        setField(term1806, term1806.getClass(), "fixedDefinition", "MAcUBcBckh");
        setField(term1806, term1806.getClass(), "evaluations", term1956);
        setField(term1806, term1806.getClass(), "checkClass", "oVgzLbrsFr");
        setField(term1806, term1806.getClass(), "guideline", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCheckName", argTypes, term1806, args);
    }

};



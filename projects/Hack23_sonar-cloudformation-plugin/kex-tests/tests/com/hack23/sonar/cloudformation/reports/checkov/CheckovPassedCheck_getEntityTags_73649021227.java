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

public class CheckovPassedCheck_getEntityTags_73649021227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8569;

    public CheckovPassedCheck_getEntityTags_73649021227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8607 = new ArrayList();
        Integer term8637 = new Integer(937859191);
        Integer term8639 = new Integer(-916584829);
        Integer term8641 = new Integer(-2131181468);
        Integer term8643 = new Integer(282916351);
        Integer term8645 = new Integer(880977281);
        Integer term8647 = new Integer(371943306);
        Integer term8649 = new Integer(982388293);
        ArrayList term8635 = new ArrayList();
        ((ArrayList) term8635).add(term8637);
        ((ArrayList) term8635).add(term8639);
        ((ArrayList) term8635).add(term8641);
        ((ArrayList) term8635).add(term8643);
        ((ArrayList) term8635).add(term8645);
        ((ArrayList) term8635).add(term8647);
        ((ArrayList) term8635).add(term8649);
        Integer term8704 = new Integer(-159494544);
        ArrayList term8702 = new ArrayList();
        ((ArrayList) term8702).add(term8704);
        term8569 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term8594 = newInstance(Class.forName("java.lang.Object"));
        Object term8677 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term8720 = newInstance(Class.forName("java.lang.Object"));
        setField(term8569, term8569.getClass(), "checkId", "TSyCeEZPaT");
        setField(term8569, term8569.getClass(), "checkName", "JeZFtaqkzW");
        setField(term8569, term8569.getClass(), "checkResult", term8594);
        setField(term8569, term8569.getClass(), "bcCheckId", "vOVuNSCCLe");
        setField(term8569, term8569.getClass(), "codeBlock", term8607);
        setField(term8569, term8569.getClass(), "filePath", "fzeqPnzpnt");
        setField(term8569, term8569.getClass(), "repoFilePath", "RxbhrFBjkO");
        setField(term8569, term8569.getClass(), "fileLineRange", term8635);
        setField(term8569, term8569.getClass(), "resource", "aanyiAOJCl");
        setField(term8569, term8569.getClass(), "fileAbsPath", "VDokbsCuqq");
        setField(term8677, term8677.getClass(), "name", "xClUIcPECX");
        setField(term8569, term8569.getClass(), "entityTags", term8677);
        setField(term8569, term8569.getClass(), "callerFilePath", "avhRaGZaBF");
        setField(term8569, term8569.getClass(), "callerFileLineRange", term8702);
        setField(term8569, term8569.getClass(), "fixedDefinition", "JkgoRtImdE");
        setField(term8569, term8569.getClass(), "evaluations", term8720);
        setField(term8569, term8569.getClass(), "checkClass", "qFGKIJjlmV");
        setField(term8569, term8569.getClass(), "guideline", "IHqvyhMtuM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEntityTags", argTypes, term8569, args);
    }

};



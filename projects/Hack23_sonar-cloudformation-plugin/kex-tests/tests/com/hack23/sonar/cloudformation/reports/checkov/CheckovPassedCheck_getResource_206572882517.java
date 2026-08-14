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

public class CheckovPassedCheck_getResource_206572882517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5458;

    public CheckovPassedCheck_getResource_206572882517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5498 = newInstance(Class.forName("java.lang.Object"));
        Object term5499 = newInstance(Class.forName("java.lang.Object"));
        Object term5500 = newInstance(Class.forName("java.lang.Object"));
        Object term5501 = newInstance(Class.forName("java.lang.Object"));
        Object term5502 = newInstance(Class.forName("java.lang.Object"));
        Object term5503 = newInstance(Class.forName("java.lang.Object"));
        Object term5504 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5496 = new ArrayList();
        ((ArrayList) term5496).add(term5498);
        ((ArrayList) term5496).add(term5499);
        ((ArrayList) term5496).add(term5500);
        ((ArrayList) term5496).add(term5501);
        ((ArrayList) term5496).add(term5502);
        ((ArrayList) term5496).add(term5503);
        ((ArrayList) term5496).add(term5504);
        Integer term5533 = new Integer(568954359);
        Integer term5535 = new Integer(53410913);
        Integer term5537 = new Integer(-375014958);
        ArrayList term5531 = new ArrayList();
        ((ArrayList) term5531).add(term5533);
        ((ArrayList) term5531).add(term5535);
        ((ArrayList) term5531).add(term5537);
        Integer term5592 = new Integer(1107176718);
        Integer term5594 = new Integer(480137250);
        Integer term5596 = new Integer(-341152642);
        Integer term5598 = new Integer(-2015854073);
        ArrayList term5590 = new ArrayList();
        ((ArrayList) term5590).add(term5592);
        ((ArrayList) term5590).add(term5594);
        ((ArrayList) term5590).add(term5596);
        ((ArrayList) term5590).add(term5598);
        term5458 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term5483 = newInstance(Class.forName("java.lang.Object"));
        Object term5565 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term5614 = newInstance(Class.forName("java.lang.Object"));
        setField(term5458, term5458.getClass(), "checkId", "NnpwZBUTvx");
        setField(term5458, term5458.getClass(), "checkName", "tlQSNgTkQX");
        setField(term5458, term5458.getClass(), "checkResult", term5483);
        setField(term5458, term5458.getClass(), "bcCheckId", "PCipZnmBOF");
        setField(term5458, term5458.getClass(), "codeBlock", term5496);
        setField(term5458, term5458.getClass(), "filePath", "zcorEihhLK");
        setField(term5458, term5458.getClass(), "repoFilePath", "GrqozDKFOk");
        setField(term5458, term5458.getClass(), "fileLineRange", term5531);
        setField(term5458, term5458.getClass(), "resource", "CFyoseFGLF");
        setField(term5458, term5458.getClass(), "fileAbsPath", "SFqCrhEWLm");
        setField(term5565, term5565.getClass(), "name", "GZdcJyZntS");
        setField(term5458, term5458.getClass(), "entityTags", term5565);
        setField(term5458, term5458.getClass(), "callerFilePath", "OIHoJeysUi");
        setField(term5458, term5458.getClass(), "callerFileLineRange", term5590);
        setField(term5458, term5458.getClass(), "fixedDefinition", "WXMWFDGcLB");
        setField(term5458, term5458.getClass(), "evaluations", term5614);
        setField(term5458, term5458.getClass(), "checkClass", "wKWbJssZuG");
        setField(term5458, term5458.getClass(), "guideline", "NzBMMhkhpT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResource", argTypes, term5458, args);
    }

};



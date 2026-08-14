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

public class CheckovPassedCheck_toString_135261022335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11060;

    public CheckovPassedCheck_toString_135261022335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11100 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11098 = new ArrayList();
        ((ArrayList) term11098).add(term11100);
        Integer term11129 = new Integer(-123338791);
        Integer term11131 = new Integer(-1467089634);
        Integer term11133 = new Integer(413548937);
        Integer term11135 = new Integer(1901317214);
        Integer term11137 = new Integer(1166710220);
        ArrayList term11127 = new ArrayList();
        ((ArrayList) term11127).add(term11129);
        ((ArrayList) term11127).add(term11131);
        ((ArrayList) term11127).add(term11133);
        ((ArrayList) term11127).add(term11135);
        ((ArrayList) term11127).add(term11137);
        Integer term11192 = new Integer(-1070592289);
        Integer term11194 = new Integer(-1464172784);
        Integer term11196 = new Integer(32185364);
        Integer term11198 = new Integer(1768204942);
        Integer term11200 = new Integer(1252951645);
        Integer term11202 = new Integer(574481092);
        ArrayList term11190 = new ArrayList();
        ((ArrayList) term11190).add(term11192);
        ((ArrayList) term11190).add(term11194);
        ((ArrayList) term11190).add(term11196);
        ((ArrayList) term11190).add(term11198);
        ((ArrayList) term11190).add(term11200);
        ((ArrayList) term11190).add(term11202);
        term11060 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term11085 = newInstance(Class.forName("java.lang.Object"));
        Object term11165 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term11218 = newInstance(Class.forName("java.lang.Object"));
        setField(term11060, term11060.getClass(), "checkId", "NxgmYPzWCI");
        setField(term11060, term11060.getClass(), "checkName", "SqjyKmayBx");
        setField(term11060, term11060.getClass(), "checkResult", term11085);
        setField(term11060, term11060.getClass(), "bcCheckId", "XjDhvToxJy");
        setField(term11060, term11060.getClass(), "codeBlock", term11098);
        setField(term11060, term11060.getClass(), "filePath", "nxSTJflLQy");
        setField(term11060, term11060.getClass(), "repoFilePath", "FlHzxEfFzI");
        setField(term11060, term11060.getClass(), "fileLineRange", term11127);
        setField(term11060, term11060.getClass(), "resource", "aSATgQUpoe");
        setField(term11060, term11060.getClass(), "fileAbsPath", "VkPSXewZfB");
        setField(term11165, term11165.getClass(), "name", "ubodzJoMGW");
        setField(term11060, term11060.getClass(), "entityTags", term11165);
        setField(term11060, term11060.getClass(), "callerFilePath", "weddIktxOA");
        setField(term11060, term11060.getClass(), "callerFileLineRange", term11190);
        setField(term11060, term11060.getClass(), "fixedDefinition", "uSlMeISsDD");
        setField(term11060, term11060.getClass(), "evaluations", term11218);
        setField(term11060, term11060.getClass(), "checkClass", "WdCiTDUKqn");
        setField(term11060, term11060.getClass(), "guideline", "PSizQDoxxe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11060, args);
    }

};



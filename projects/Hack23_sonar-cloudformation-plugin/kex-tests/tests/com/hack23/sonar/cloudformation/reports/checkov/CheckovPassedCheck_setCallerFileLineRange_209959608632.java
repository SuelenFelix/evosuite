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

public class CheckovPassedCheck_setCallerFileLineRange_209959608632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10129;
     Object term10324;

    public CheckovPassedCheck_setCallerFileLineRange_209959608632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10169 = newInstance(Class.forName("java.lang.Object"));
        Object term10170 = newInstance(Class.forName("java.lang.Object"));
        Object term10171 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term10167 = new ArrayList();
        ((ArrayList) term10167).add(term10169);
        ((ArrayList) term10167).add(term10170);
        ((ArrayList) term10167).add(term10171);
        Integer term10200 = new Integer(34470066);
        Integer term10202 = new Integer(2058711405);
        Integer term10204 = new Integer(1743683601);
        Integer term10206 = new Integer(-945116798);
        Integer term10208 = new Integer(1593461795);
        Integer term10210 = new Integer(515182546);
        Integer term10212 = new Integer(-936895502);
        Integer term10214 = new Integer(-129547140);
        Integer term10216 = new Integer(199287428);
        ArrayList term10198 = new ArrayList();
        ((ArrayList) term10198).add(term10200);
        ((ArrayList) term10198).add(term10202);
        ((ArrayList) term10198).add(term10204);
        ((ArrayList) term10198).add(term10206);
        ((ArrayList) term10198).add(term10208);
        ((ArrayList) term10198).add(term10210);
        ((ArrayList) term10198).add(term10212);
        ((ArrayList) term10198).add(term10214);
        ((ArrayList) term10198).add(term10216);
        Integer term10271 = new Integer(-1195339592);
        Integer term10273 = new Integer(-376422566);
        Integer term10275 = new Integer(306847454);
        Integer term10277 = new Integer(1745276158);
        Integer term10279 = new Integer(2009020256);
        Integer term10281 = new Integer(2049577015);
        Integer term10283 = new Integer(1236004505);
        ArrayList term10269 = new ArrayList();
        ((ArrayList) term10269).add(term10271);
        ((ArrayList) term10269).add(term10273);
        ((ArrayList) term10269).add(term10275);
        ((ArrayList) term10269).add(term10277);
        ((ArrayList) term10269).add(term10279);
        ((ArrayList) term10269).add(term10281);
        ((ArrayList) term10269).add(term10283);
        term10129 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term10154 = newInstance(Class.forName("java.lang.Object"));
        Object term10244 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term10299 = newInstance(Class.forName("java.lang.Object"));
        setField(term10129, term10129.getClass(), "checkId", "oKwCDqywym");
        setField(term10129, term10129.getClass(), "checkName", "zjZYTddemL");
        setField(term10129, term10129.getClass(), "checkResult", term10154);
        setField(term10129, term10129.getClass(), "bcCheckId", "QtrylgCLiF");
        setField(term10129, term10129.getClass(), "codeBlock", term10167);
        setField(term10129, term10129.getClass(), "filePath", "orEuhCStGM");
        setField(term10129, term10129.getClass(), "repoFilePath", "HhEaSXWvrY");
        setField(term10129, term10129.getClass(), "fileLineRange", term10198);
        setField(term10129, term10129.getClass(), "resource", "CVRGEomOth");
        setField(term10129, term10129.getClass(), "fileAbsPath", "vSeruUyNWX");
        setField(term10244, term10244.getClass(), "name", "UkKvaeJfEC");
        setField(term10129, term10129.getClass(), "entityTags", term10244);
        setField(term10129, term10129.getClass(), "callerFilePath", "WPxXsahPRq");
        setField(term10129, term10129.getClass(), "callerFileLineRange", term10269);
        setField(term10129, term10129.getClass(), "fixedDefinition", "IENRuqmwUU");
        setField(term10129, term10129.getClass(), "evaluations", term10299);
        setField(term10129, term10129.getClass(), "checkClass", "GsWxOwXvSu");
        setField(term10129, term10129.getClass(), "guideline", "bKBSncrMEZ");
        term10324 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10324;
        callMethod(klass, "setCallerFileLineRange", argTypes, term10129, args);
    }

};



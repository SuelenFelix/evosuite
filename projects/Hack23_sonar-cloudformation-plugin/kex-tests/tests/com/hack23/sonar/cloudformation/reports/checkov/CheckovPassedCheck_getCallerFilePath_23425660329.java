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

public class CheckovPassedCheck_getCallerFilePath_23425660329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9194;

    public CheckovPassedCheck_getCallerFilePath_23425660329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9234 = newInstance(Class.forName("java.lang.Object"));
        Object term9235 = newInstance(Class.forName("java.lang.Object"));
        Object term9236 = newInstance(Class.forName("java.lang.Object"));
        Object term9237 = newInstance(Class.forName("java.lang.Object"));
        Object term9238 = newInstance(Class.forName("java.lang.Object"));
        Object term9239 = newInstance(Class.forName("java.lang.Object"));
        Object term9240 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term9232 = new ArrayList();
        ((ArrayList) term9232).add(term9234);
        ((ArrayList) term9232).add(term9235);
        ((ArrayList) term9232).add(term9236);
        ((ArrayList) term9232).add(term9237);
        ((ArrayList) term9232).add(term9238);
        ((ArrayList) term9232).add(term9239);
        ((ArrayList) term9232).add(term9240);
        ArrayList term9267 = new ArrayList();
        Integer term9322 = new Integer(1045547089);
        Integer term9324 = new Integer(-1122880881);
        Integer term9326 = new Integer(-542712742);
        Integer term9328 = new Integer(-1254072822);
        Integer term9330 = new Integer(-1111249833);
        Integer term9332 = new Integer(-1692331299);
        Integer term9334 = new Integer(479531250);
        Integer term9336 = new Integer(1320570890);
        Integer term9338 = new Integer(-130649791);
        ArrayList term9320 = new ArrayList();
        ((ArrayList) term9320).add(term9322);
        ((ArrayList) term9320).add(term9324);
        ((ArrayList) term9320).add(term9326);
        ((ArrayList) term9320).add(term9328);
        ((ArrayList) term9320).add(term9330);
        ((ArrayList) term9320).add(term9332);
        ((ArrayList) term9320).add(term9334);
        ((ArrayList) term9320).add(term9336);
        ((ArrayList) term9320).add(term9338);
        term9194 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term9219 = newInstance(Class.forName("java.lang.Object"));
        Object term9295 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term9354 = newInstance(Class.forName("java.lang.Object"));
        setField(term9194, term9194.getClass(), "checkId", "llRfwANcVF");
        setField(term9194, term9194.getClass(), "checkName", "sUEeHQTWkA");
        setField(term9194, term9194.getClass(), "checkResult", term9219);
        setField(term9194, term9194.getClass(), "bcCheckId", "BDIRCxAWLA");
        setField(term9194, term9194.getClass(), "codeBlock", term9232);
        setField(term9194, term9194.getClass(), "filePath", "eOJfbiZLnb");
        setField(term9194, term9194.getClass(), "repoFilePath", "nKZKnxWYCK");
        setField(term9194, term9194.getClass(), "fileLineRange", term9267);
        setField(term9194, term9194.getClass(), "resource", "JOqQxuzRuZ");
        setField(term9194, term9194.getClass(), "fileAbsPath", "RSaoipUlsg");
        setField(term9295, term9295.getClass(), "name", "cSHGbqKqlN");
        setField(term9194, term9194.getClass(), "entityTags", term9295);
        setField(term9194, term9194.getClass(), "callerFilePath", "pFAfANnxup");
        setField(term9194, term9194.getClass(), "callerFileLineRange", term9320);
        setField(term9194, term9194.getClass(), "fixedDefinition", "FbSIUZyBXZ");
        setField(term9194, term9194.getClass(), "evaluations", term9354);
        setField(term9194, term9194.getClass(), "checkClass", "mhQDwIyrRi");
        setField(term9194, term9194.getClass(), "guideline", "HpZXWDPhlg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCallerFilePath", argTypes, term9194, args);
    }

};



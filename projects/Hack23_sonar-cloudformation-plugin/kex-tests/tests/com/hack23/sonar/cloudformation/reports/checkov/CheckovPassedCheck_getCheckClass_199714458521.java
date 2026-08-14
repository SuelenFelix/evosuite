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

public class CheckovPassedCheck_getCheckClass_199714458521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6688;

    public CheckovPassedCheck_getCheckClass_199714458521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6728 = newInstance(Class.forName("java.lang.Object"));
        Object term6729 = newInstance(Class.forName("java.lang.Object"));
        Object term6730 = newInstance(Class.forName("java.lang.Object"));
        Object term6731 = newInstance(Class.forName("java.lang.Object"));
        Object term6732 = newInstance(Class.forName("java.lang.Object"));
        Object term6733 = newInstance(Class.forName("java.lang.Object"));
        Object term6734 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term6726 = new ArrayList();
        ((ArrayList) term6726).add(term6728);
        ((ArrayList) term6726).add(term6729);
        ((ArrayList) term6726).add(term6730);
        ((ArrayList) term6726).add(term6731);
        ((ArrayList) term6726).add(term6732);
        ((ArrayList) term6726).add(term6733);
        ((ArrayList) term6726).add(term6734);
        Integer term6763 = new Integer(11724947);
        Integer term6765 = new Integer(1953277050);
        Integer term6767 = new Integer(1283079251);
        Integer term6769 = new Integer(-523949691);
        Integer term6771 = new Integer(1398204340);
        Integer term6773 = new Integer(229204365);
        Integer term6775 = new Integer(-461771056);
        Integer term6777 = new Integer(-243422082);
        Integer term6779 = new Integer(1384592638);
        ArrayList term6761 = new ArrayList();
        ((ArrayList) term6761).add(term6763);
        ((ArrayList) term6761).add(term6765);
        ((ArrayList) term6761).add(term6767);
        ((ArrayList) term6761).add(term6769);
        ((ArrayList) term6761).add(term6771);
        ((ArrayList) term6761).add(term6773);
        ((ArrayList) term6761).add(term6775);
        ((ArrayList) term6761).add(term6777);
        ((ArrayList) term6761).add(term6779);
        Integer term6834 = new Integer(-1002370457);
        Integer term6836 = new Integer(-2014576105);
        Integer term6838 = new Integer(1296895584);
        Integer term6840 = new Integer(628918458);
        Integer term6842 = new Integer(-1274456137);
        Integer term6844 = new Integer(1041916673);
        Integer term6846 = new Integer(-601863069);
        ArrayList term6832 = new ArrayList();
        ((ArrayList) term6832).add(term6834);
        ((ArrayList) term6832).add(term6836);
        ((ArrayList) term6832).add(term6838);
        ((ArrayList) term6832).add(term6840);
        ((ArrayList) term6832).add(term6842);
        ((ArrayList) term6832).add(term6844);
        ((ArrayList) term6832).add(term6846);
        term6688 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term6713 = newInstance(Class.forName("java.lang.Object"));
        Object term6807 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term6862 = newInstance(Class.forName("java.lang.Object"));
        setField(term6688, term6688.getClass(), "checkId", "pvDEABOxLt");
        setField(term6688, term6688.getClass(), "checkName", "beAMpkroCQ");
        setField(term6688, term6688.getClass(), "checkResult", term6713);
        setField(term6688, term6688.getClass(), "bcCheckId", "uSUvKAyuvd");
        setField(term6688, term6688.getClass(), "codeBlock", term6726);
        setField(term6688, term6688.getClass(), "filePath", "onQLVONGuf");
        setField(term6688, term6688.getClass(), "repoFilePath", "SOrEHbcbmn");
        setField(term6688, term6688.getClass(), "fileLineRange", term6761);
        setField(term6688, term6688.getClass(), "resource", "bnsyeQXFdu");
        setField(term6688, term6688.getClass(), "fileAbsPath", "BwtdjiefJn");
        setField(term6807, term6807.getClass(), "name", "jDmhBrIoDa");
        setField(term6688, term6688.getClass(), "entityTags", term6807);
        setField(term6688, term6688.getClass(), "callerFilePath", "SPtPatHeOm");
        setField(term6688, term6688.getClass(), "callerFileLineRange", term6832);
        setField(term6688, term6688.getClass(), "fixedDefinition", "ywmcuThdfL");
        setField(term6688, term6688.getClass(), "evaluations", term6862);
        setField(term6688, term6688.getClass(), "checkClass", "GBOEuByOfr");
        setField(term6688, term6688.getClass(), "guideline", "NHbOFFjyVK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCheckClass", argTypes, term6688, args);
    }

};



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

public class CheckovPassedCheck_setCheckResult_8638989808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2712;
     Object term2897;

    public CheckovPassedCheck_setCheckResult_8638989808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2752 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term2750 = new ArrayList();
        ((ArrayList) term2750).add(term2752);
        Integer term2781 = new Integer(2055867847);
        Integer term2783 = new Integer(-1048298087);
        Integer term2785 = new Integer(292681826);
        Integer term2787 = new Integer(458147407);
        Integer term2789 = new Integer(-184153539);
        Integer term2791 = new Integer(493620644);
        Integer term2793 = new Integer(1328271830);
        Integer term2795 = new Integer(1596070772);
        Integer term2797 = new Integer(97029295);
        ArrayList term2779 = new ArrayList();
        ((ArrayList) term2779).add(term2781);
        ((ArrayList) term2779).add(term2783);
        ((ArrayList) term2779).add(term2785);
        ((ArrayList) term2779).add(term2787);
        ((ArrayList) term2779).add(term2789);
        ((ArrayList) term2779).add(term2791);
        ((ArrayList) term2779).add(term2793);
        ((ArrayList) term2779).add(term2795);
        ((ArrayList) term2779).add(term2797);
        Integer term2852 = new Integer(-1371869594);
        Integer term2854 = new Integer(-2095575670);
        Integer term2856 = new Integer(1225272962);
        ArrayList term2850 = new ArrayList();
        ((ArrayList) term2850).add(term2852);
        ((ArrayList) term2850).add(term2854);
        ((ArrayList) term2850).add(term2856);
        term2712 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term2737 = newInstance(Class.forName("java.lang.Object"));
        Object term2825 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term2872 = newInstance(Class.forName("java.lang.Object"));
        setField(term2712, term2712.getClass(), "checkId", "vjxIhXHxGR");
        setField(term2712, term2712.getClass(), "checkName", "QXzGXbEXMu");
        setField(term2712, term2712.getClass(), "checkResult", term2737);
        setField(term2712, term2712.getClass(), "bcCheckId", "qxSDVejjiY");
        setField(term2712, term2712.getClass(), "codeBlock", term2750);
        setField(term2712, term2712.getClass(), "filePath", "xBsXSDjXYK");
        setField(term2712, term2712.getClass(), "repoFilePath", "sEnIVFtZuQ");
        setField(term2712, term2712.getClass(), "fileLineRange", term2779);
        setField(term2712, term2712.getClass(), "resource", "ZVecLZMLHF");
        setField(term2712, term2712.getClass(), "fileAbsPath", "fztQhjqwdP");
        setField(term2825, term2825.getClass(), "name", "eVpkWxjuki");
        setField(term2712, term2712.getClass(), "entityTags", term2825);
        setField(term2712, term2712.getClass(), "callerFilePath", "SJiQaLvSKv");
        setField(term2712, term2712.getClass(), "callerFileLineRange", term2850);
        setField(term2712, term2712.getClass(), "fixedDefinition", "OEXDRUKcFl");
        setField(term2712, term2712.getClass(), "evaluations", term2872);
        setField(term2712, term2712.getClass(), "checkClass", "RYdKCNNMBR");
        setField(term2712, term2712.getClass(), "guideline", "yGtHPyvYiQ");
        term2897 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2897;
        callMethod(klass, "setCheckResult", argTypes, term2712, args);
    }

};



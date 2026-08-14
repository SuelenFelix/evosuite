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

public class CheckovPassedCheck_hashCode_186336991337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11677;

    public CheckovPassedCheck_hashCode_186336991337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11717 = newInstance(Class.forName("java.lang.Object"));
        Object term11718 = newInstance(Class.forName("java.lang.Object"));
        Object term11719 = newInstance(Class.forName("java.lang.Object"));
        Object term11720 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11715 = new ArrayList();
        ((ArrayList) term11715).add(term11717);
        ((ArrayList) term11715).add(term11718);
        ((ArrayList) term11715).add(term11719);
        ((ArrayList) term11715).add(term11720);
        Integer term11749 = new Integer(1466373988);
        Integer term11751 = new Integer(-358526505);
        Integer term11753 = new Integer(1843268026);
        Integer term11755 = new Integer(954660603);
        ArrayList term11747 = new ArrayList();
        ((ArrayList) term11747).add(term11749);
        ((ArrayList) term11747).add(term11751);
        ((ArrayList) term11747).add(term11753);
        ((ArrayList) term11747).add(term11755);
        Integer term11810 = new Integer(-1351605385);
        Integer term11812 = new Integer(278355793);
        Integer term11814 = new Integer(-310648604);
        Integer term11816 = new Integer(-648200466);
        ArrayList term11808 = new ArrayList();
        ((ArrayList) term11808).add(term11810);
        ((ArrayList) term11808).add(term11812);
        ((ArrayList) term11808).add(term11814);
        ((ArrayList) term11808).add(term11816);
        term11677 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term11702 = newInstance(Class.forName("java.lang.Object"));
        Object term11783 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term11832 = newInstance(Class.forName("java.lang.Object"));
        setField(term11677, term11677.getClass(), "checkId", "QITgiBrmfj");
        setField(term11677, term11677.getClass(), "checkName", "pXxkiXgQnq");
        setField(term11677, term11677.getClass(), "checkResult", term11702);
        setField(term11677, term11677.getClass(), "bcCheckId", "tKmrUDURku");
        setField(term11677, term11677.getClass(), "codeBlock", term11715);
        setField(term11677, term11677.getClass(), "filePath", "JeZbrwZmsP");
        setField(term11677, term11677.getClass(), "repoFilePath", "bxyfeicqrK");
        setField(term11677, term11677.getClass(), "fileLineRange", term11747);
        setField(term11677, term11677.getClass(), "resource", "vBnWPlsZMk");
        setField(term11677, term11677.getClass(), "fileAbsPath", "fIZsWucfXz");
        setField(term11783, term11783.getClass(), "name", "IApvtmfhnq");
        setField(term11677, term11677.getClass(), "entityTags", term11783);
        setField(term11677, term11677.getClass(), "callerFilePath", "VSaNnhMpRc");
        setField(term11677, term11677.getClass(), "callerFileLineRange", term11808);
        setField(term11677, term11677.getClass(), "fixedDefinition", "QNjNTLlUaV");
        setField(term11677, term11677.getClass(), "evaluations", term11832);
        setField(term11677, term11677.getClass(), "checkClass", "hIYsRyOZxk");
        setField(term11677, term11677.getClass(), "guideline", "RjNoEywJbC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term11677, args);
    }

};



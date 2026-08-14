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

public class CheckovPassedCheck_setEntityTags_155113535828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8865;
     Object term9051;

    public CheckovPassedCheck_setEntityTags_155113535828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8905 = newInstance(Class.forName("java.lang.Object"));
        Object term8906 = newInstance(Class.forName("java.lang.Object"));
        Object term8907 = newInstance(Class.forName("java.lang.Object"));
        Object term8908 = newInstance(Class.forName("java.lang.Object"));
        Object term8909 = newInstance(Class.forName("java.lang.Object"));
        Object term8910 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term8903 = new ArrayList();
        ((ArrayList) term8903).add(term8905);
        ((ArrayList) term8903).add(term8906);
        ((ArrayList) term8903).add(term8907);
        ((ArrayList) term8903).add(term8908);
        ((ArrayList) term8903).add(term8909);
        ((ArrayList) term8903).add(term8910);
        Integer term8939 = new Integer(-75206835);
        Integer term8941 = new Integer(-1618206977);
        Integer term8943 = new Integer(-1747406163);
        Integer term8945 = new Integer(388157121);
        ArrayList term8937 = new ArrayList();
        ((ArrayList) term8937).add(term8939);
        ((ArrayList) term8937).add(term8941);
        ((ArrayList) term8937).add(term8943);
        ((ArrayList) term8937).add(term8945);
        Integer term9000 = new Integer(1684998508);
        Integer term9002 = new Integer(-1476644457);
        Integer term9004 = new Integer(1270666529);
        Integer term9006 = new Integer(-1146679443);
        Integer term9008 = new Integer(-860131894);
        Integer term9010 = new Integer(-1022990421);
        ArrayList term8998 = new ArrayList();
        ((ArrayList) term8998).add(term9000);
        ((ArrayList) term8998).add(term9002);
        ((ArrayList) term8998).add(term9004);
        ((ArrayList) term8998).add(term9006);
        ((ArrayList) term8998).add(term9008);
        ((ArrayList) term8998).add(term9010);
        term8865 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term8890 = newInstance(Class.forName("java.lang.Object"));
        Object term8973 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term9026 = newInstance(Class.forName("java.lang.Object"));
        setField(term8865, term8865.getClass(), "checkId", "dAldIGYAXV");
        setField(term8865, term8865.getClass(), "checkName", "mLwibAPEsa");
        setField(term8865, term8865.getClass(), "checkResult", term8890);
        setField(term8865, term8865.getClass(), "bcCheckId", "zsWKWiTFuo");
        setField(term8865, term8865.getClass(), "codeBlock", term8903);
        setField(term8865, term8865.getClass(), "filePath", "UPUbwyHQKN");
        setField(term8865, term8865.getClass(), "repoFilePath", "lgQkrXANyI");
        setField(term8865, term8865.getClass(), "fileLineRange", term8937);
        setField(term8865, term8865.getClass(), "resource", "MeTmRZXErV");
        setField(term8865, term8865.getClass(), "fileAbsPath", "jNxbVmoZgq");
        setField(term8973, term8973.getClass(), "name", "PvmBHIXaMY");
        setField(term8865, term8865.getClass(), "entityTags", term8973);
        setField(term8865, term8865.getClass(), "callerFilePath", "hulYxtowxw");
        setField(term8865, term8865.getClass(), "callerFileLineRange", term8998);
        setField(term8865, term8865.getClass(), "fixedDefinition", "GNEmuHPNcU");
        setField(term8865, term8865.getClass(), "evaluations", term9026);
        setField(term8865, term8865.getClass(), "checkClass", "IoSfuKDFRe");
        setField(term8865, term8865.getClass(), "guideline", "AWYyZiNfsm");
        term9051 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        setField(term9051, term9051.getClass(), "name", "ITRRYiuDwH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags");
        Object[] args = new Object[1];
        args[0] = term9051;
        callMethod(klass, "setEntityTags", argTypes, term8865, args);
    }

};



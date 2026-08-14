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

public class CheckovPassedCheck_setCheckClass_54742345722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7007;

    public CheckovPassedCheck_setCheckClass_54742345722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7047 = newInstance(Class.forName("java.lang.Object"));
        Object term7048 = newInstance(Class.forName("java.lang.Object"));
        Object term7049 = newInstance(Class.forName("java.lang.Object"));
        Object term7050 = newInstance(Class.forName("java.lang.Object"));
        Object term7051 = newInstance(Class.forName("java.lang.Object"));
        Object term7052 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term7045 = new ArrayList();
        ((ArrayList) term7045).add(term7047);
        ((ArrayList) term7045).add(term7048);
        ((ArrayList) term7045).add(term7049);
        ((ArrayList) term7045).add(term7050);
        ((ArrayList) term7045).add(term7051);
        ((ArrayList) term7045).add(term7052);
        Integer term7081 = new Integer(663292551);
        Integer term7083 = new Integer(-1885090354);
        Integer term7085 = new Integer(-2066804303);
        Integer term7087 = new Integer(-1731761810);
        Integer term7089 = new Integer(197109649);
        Integer term7091 = new Integer(-1239406390);
        ArrayList term7079 = new ArrayList();
        ((ArrayList) term7079).add(term7081);
        ((ArrayList) term7079).add(term7083);
        ((ArrayList) term7079).add(term7085);
        ((ArrayList) term7079).add(term7087);
        ((ArrayList) term7079).add(term7089);
        ((ArrayList) term7079).add(term7091);
        ArrayList term7144 = new ArrayList();
        term7007 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term7032 = newInstance(Class.forName("java.lang.Object"));
        Object term7119 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term7160 = newInstance(Class.forName("java.lang.Object"));
        setField(term7007, term7007.getClass(), "checkId", "zaloBqlrSo");
        setField(term7007, term7007.getClass(), "checkName", "vvoLrMGCoN");
        setField(term7007, term7007.getClass(), "checkResult", term7032);
        setField(term7007, term7007.getClass(), "bcCheckId", "pXdglvyrQe");
        setField(term7007, term7007.getClass(), "codeBlock", term7045);
        setField(term7007, term7007.getClass(), "filePath", "OcfNzHYdki");
        setField(term7007, term7007.getClass(), "repoFilePath", "uPuCVuZYOI");
        setField(term7007, term7007.getClass(), "fileLineRange", term7079);
        setField(term7007, term7007.getClass(), "resource", "TweMFhxNdj");
        setField(term7007, term7007.getClass(), "fileAbsPath", "NBrvVzvQHe");
        setField(term7119, term7119.getClass(), "name", "FjOiNAfBOc");
        setField(term7007, term7007.getClass(), "entityTags", term7119);
        setField(term7007, term7007.getClass(), "callerFilePath", "iCCsaLHohG");
        setField(term7007, term7007.getClass(), "callerFileLineRange", term7144);
        setField(term7007, term7007.getClass(), "fixedDefinition", "NJhGgctbdj");
        setField(term7007, term7007.getClass(), "evaluations", term7160);
        setField(term7007, term7007.getClass(), "checkClass", "MYWYUeLGOp");
        setField(term7007, term7007.getClass(), "guideline", "tsTGdgQYUL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TtGbVmKcnX";
        callMethod(klass, "setCheckClass", argTypes, term7007, args);
    }

};



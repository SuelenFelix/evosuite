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

public class CheckovPassedCheck_setFixedDefinition_147926222034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10746;

    public CheckovPassedCheck_setFixedDefinition_147926222034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10786 = newInstance(Class.forName("java.lang.Object"));
        Object term10787 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term10784 = new ArrayList();
        ((ArrayList) term10784).add(term10786);
        ((ArrayList) term10784).add(term10787);
        Integer term10816 = new Integer(-680920524);
        Integer term10818 = new Integer(-916335264);
        Integer term10820 = new Integer(-919416536);
        Integer term10822 = new Integer(-43417861);
        Integer term10824 = new Integer(-1533843432);
        ArrayList term10814 = new ArrayList();
        ((ArrayList) term10814).add(term10816);
        ((ArrayList) term10814).add(term10818);
        ((ArrayList) term10814).add(term10820);
        ((ArrayList) term10814).add(term10822);
        ((ArrayList) term10814).add(term10824);
        ArrayList term10877 = new ArrayList();
        term10746 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term10771 = newInstance(Class.forName("java.lang.Object"));
        Object term10852 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term10893 = newInstance(Class.forName("java.lang.Object"));
        setField(term10746, term10746.getClass(), "checkId", "qYtAeLzOhW");
        setField(term10746, term10746.getClass(), "checkName", "tJzmOfcUnY");
        setField(term10746, term10746.getClass(), "checkResult", term10771);
        setField(term10746, term10746.getClass(), "bcCheckId", "TKlccZUpjz");
        setField(term10746, term10746.getClass(), "codeBlock", term10784);
        setField(term10746, term10746.getClass(), "filePath", "GGzwMoHZXC");
        setField(term10746, term10746.getClass(), "repoFilePath", "IpmgwHTgnG");
        setField(term10746, term10746.getClass(), "fileLineRange", term10814);
        setField(term10746, term10746.getClass(), "resource", "tIpkeYIezR");
        setField(term10746, term10746.getClass(), "fileAbsPath", "YkZtEtthvz");
        setField(term10852, term10852.getClass(), "name", "dwlZSxlXOo");
        setField(term10746, term10746.getClass(), "entityTags", term10852);
        setField(term10746, term10746.getClass(), "callerFilePath", "lKrEAkypza");
        setField(term10746, term10746.getClass(), "callerFileLineRange", term10877);
        setField(term10746, term10746.getClass(), "fixedDefinition", "KtuuNAqGCQ");
        setField(term10746, term10746.getClass(), "evaluations", term10893);
        setField(term10746, term10746.getClass(), "checkClass", "OGQsfjmReM");
        setField(term10746, term10746.getClass(), "guideline", "YsUtbngnRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JisaWUxcNb";
        callMethod(klass, "setFixedDefinition", argTypes, term10746, args);
    }

};



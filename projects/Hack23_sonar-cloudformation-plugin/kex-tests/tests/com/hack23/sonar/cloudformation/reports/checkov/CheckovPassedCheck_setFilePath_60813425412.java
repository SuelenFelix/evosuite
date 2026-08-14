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

public class CheckovPassedCheck_setFilePath_60813425412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3938;

    public CheckovPassedCheck_setFilePath_60813425412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3978 = newInstance(Class.forName("java.lang.Object"));
        Object term3979 = newInstance(Class.forName("java.lang.Object"));
        Object term3980 = newInstance(Class.forName("java.lang.Object"));
        Object term3981 = newInstance(Class.forName("java.lang.Object"));
        Object term3982 = newInstance(Class.forName("java.lang.Object"));
        Object term3983 = newInstance(Class.forName("java.lang.Object"));
        Object term3984 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3976 = new ArrayList();
        ((ArrayList) term3976).add(term3978);
        ((ArrayList) term3976).add(term3979);
        ((ArrayList) term3976).add(term3980);
        ((ArrayList) term3976).add(term3981);
        ((ArrayList) term3976).add(term3982);
        ((ArrayList) term3976).add(term3983);
        ((ArrayList) term3976).add(term3984);
        Integer term4013 = new Integer(941650513);
        Integer term4015 = new Integer(444029505);
        ArrayList term4011 = new ArrayList();
        ((ArrayList) term4011).add(term4013);
        ((ArrayList) term4011).add(term4015);
        Integer term4070 = new Integer(-1034506028);
        Integer term4072 = new Integer(-1263114719);
        ArrayList term4068 = new ArrayList();
        ((ArrayList) term4068).add(term4070);
        ((ArrayList) term4068).add(term4072);
        term3938 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term3963 = newInstance(Class.forName("java.lang.Object"));
        Object term4043 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term4088 = newInstance(Class.forName("java.lang.Object"));
        setField(term3938, term3938.getClass(), "checkId", "ZfdXfCCFDf");
        setField(term3938, term3938.getClass(), "checkName", "MwwjNtdOFT");
        setField(term3938, term3938.getClass(), "checkResult", term3963);
        setField(term3938, term3938.getClass(), "bcCheckId", "VYkqXKVlAJ");
        setField(term3938, term3938.getClass(), "codeBlock", term3976);
        setField(term3938, term3938.getClass(), "filePath", "XkIoWJRNwN");
        setField(term3938, term3938.getClass(), "repoFilePath", "aNWLJdrZMq");
        setField(term3938, term3938.getClass(), "fileLineRange", term4011);
        setField(term3938, term3938.getClass(), "resource", "HHmNoYxIGj");
        setField(term3938, term3938.getClass(), "fileAbsPath", "PtirvZmsGt");
        setField(term4043, term4043.getClass(), "name", "HWkpTmtlrc");
        setField(term3938, term3938.getClass(), "entityTags", term4043);
        setField(term3938, term3938.getClass(), "callerFilePath", "hMmaoREuCK");
        setField(term3938, term3938.getClass(), "callerFileLineRange", term4068);
        setField(term3938, term3938.getClass(), "fixedDefinition", "VeDtgDzGAN");
        setField(term3938, term3938.getClass(), "evaluations", term4088);
        setField(term3938, term3938.getClass(), "checkClass", "aWYOWZFyaX");
        setField(term3938, term3938.getClass(), "guideline", "BRIVNtfUWU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DbiCVtPPCT";
        callMethod(klass, "setFilePath", argTypes, term3938, args);
    }

};



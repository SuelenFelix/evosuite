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

public class CheckovPassedCheck_getCallerFileLineRange_179682258431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9835;

    public CheckovPassedCheck_getCallerFileLineRange_179682258431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9875 = newInstance(Class.forName("java.lang.Object"));
        Object term9876 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term9873 = new ArrayList();
        ((ArrayList) term9873).add(term9875);
        ((ArrayList) term9873).add(term9876);
        Integer term9905 = new Integer(-420030135);
        ArrayList term9903 = new ArrayList();
        ((ArrayList) term9903).add(term9905);
        Integer term9960 = new Integer(267763294);
        Integer term9962 = new Integer(-1497710478);
        Integer term9964 = new Integer(49950830);
        Integer term9966 = new Integer(-525257914);
        Integer term9968 = new Integer(147209682);
        ArrayList term9958 = new ArrayList();
        ((ArrayList) term9958).add(term9960);
        ((ArrayList) term9958).add(term9962);
        ((ArrayList) term9958).add(term9964);
        ((ArrayList) term9958).add(term9966);
        ((ArrayList) term9958).add(term9968);
        term9835 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term9860 = newInstance(Class.forName("java.lang.Object"));
        Object term9933 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term9984 = newInstance(Class.forName("java.lang.Object"));
        setField(term9835, term9835.getClass(), "checkId", "zLMTXDQHYH");
        setField(term9835, term9835.getClass(), "checkName", "PqywFWJlpE");
        setField(term9835, term9835.getClass(), "checkResult", term9860);
        setField(term9835, term9835.getClass(), "bcCheckId", "OzXRsFGTIp");
        setField(term9835, term9835.getClass(), "codeBlock", term9873);
        setField(term9835, term9835.getClass(), "filePath", "TjWpyghUWN");
        setField(term9835, term9835.getClass(), "repoFilePath", "dkZFDZxcde");
        setField(term9835, term9835.getClass(), "fileLineRange", term9903);
        setField(term9835, term9835.getClass(), "resource", "WXcZEtUKlI");
        setField(term9835, term9835.getClass(), "fileAbsPath", "IkpjUOuWQU");
        setField(term9933, term9933.getClass(), "name", "boSSpezHeU");
        setField(term9835, term9835.getClass(), "entityTags", term9933);
        setField(term9835, term9835.getClass(), "callerFilePath", "OUeBWNTQDh");
        setField(term9835, term9835.getClass(), "callerFileLineRange", term9958);
        setField(term9835, term9835.getClass(), "fixedDefinition", "gltJarNuUk");
        setField(term9835, term9835.getClass(), "evaluations", term9984);
        setField(term9835, term9835.getClass(), "checkClass", "ZwZIDwYcSW");
        setField(term9835, term9835.getClass(), "guideline", "sOdkipUKRu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCallerFileLineRange", argTypes, term9835, args);
    }

};



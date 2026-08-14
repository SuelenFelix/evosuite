package org.openapijsonschematools.codegen.config;

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
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class GeneratorSettings_setDefaults_24828692819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46555;

    public GeneratorSettings_setDefaults_24828692819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46689 = new HashMap();
        term46555 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term46688 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term46555, term46555.getClass(), "generatorName", "bIqaKgXgPm");
        setField(term46555, term46555.getClass(), "apiPackage", "uOJFOUcNvv");
        setField(term46555, term46555.getClass(), "modelPackage", "tkmmGweDwJ");
        setField(term46555, term46555.getClass(), "invokerPackage", "pMfTuAFXxg");
        setField(term46555, term46555.getClass(), "packageName", "XCZmhkblRc");
        setField(term46555, term46555.getClass(), "apiNameSuffix", "gFUWMydGCU");
        setField(term46555, term46555.getClass(), "modelNamePrefix", "LLegSTfqJt");
        setField(term46555, term46555.getClass(), "modelNameSuffix", "XQfmqLbqHS");
        setField(term46555, term46555.getClass(), "groupId", "jLVLqQSjqg");
        setField(term46555, term46555.getClass(), "artifactId", "JKGueoHesL");
        setField(term46555, term46555.getClass(), "artifactVersion", "CRAUqtVBkU");
        setField(term46688, term46688.getClass(), "m", term46689);
        setField(term46688, term46688.getClass(), "keySet", null);
        setField(term46688, term46688.getClass(), "entrySet", null);
        setField(term46688, term46688.getClass(), "values", null);
        setField(term46555, term46555.getClass(), "additionalProperties", term46688);
        setField(term46555, term46555.getClass(), "gitHost", "github.com");
        setField(term46555, term46555.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term46555, term46555.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term46555, term46555.getClass(), "releaseNote", "Minor update");
        setField(term46555, term46555.getClass(), "httpUserAgent", "DddqUYfomL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setDefaults", argTypes, term46555, args);
    }

};



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

public class GeneratorSettings_getPackageName_16227195924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41440;

    public GeneratorSettings_getPackageName_16227195924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term41574 = new HashMap();
        term41440 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term41573 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term41440, term41440.getClass(), "generatorName", "ndAITnOsny");
        setField(term41440, term41440.getClass(), "apiPackage", "CVZnTiJucs");
        setField(term41440, term41440.getClass(), "modelPackage", "ecHEQufXoq");
        setField(term41440, term41440.getClass(), "invokerPackage", "btBLMvHzJg");
        setField(term41440, term41440.getClass(), "packageName", "JdOMfNWgLP");
        setField(term41440, term41440.getClass(), "apiNameSuffix", "uWqXrwAsDU");
        setField(term41440, term41440.getClass(), "modelNamePrefix", "hgFbWAUtsu");
        setField(term41440, term41440.getClass(), "modelNameSuffix", "HqoTWlkbwF");
        setField(term41440, term41440.getClass(), "groupId", "CwNELDTAPP");
        setField(term41440, term41440.getClass(), "artifactId", "GSzQdbHLHw");
        setField(term41440, term41440.getClass(), "artifactVersion", "IkfarsYNJO");
        setField(term41573, term41573.getClass(), "m", term41574);
        setField(term41573, term41573.getClass(), "keySet", null);
        setField(term41573, term41573.getClass(), "entrySet", null);
        setField(term41573, term41573.getClass(), "values", null);
        setField(term41440, term41440.getClass(), "additionalProperties", term41573);
        setField(term41440, term41440.getClass(), "gitHost", "github.com");
        setField(term41440, term41440.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term41440, term41440.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term41440, term41440.getClass(), "releaseNote", "Minor update");
        setField(term41440, term41440.getClass(), "httpUserAgent", "aZKOWhHMEh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPackageName", argTypes, term41440, args);
    }

};



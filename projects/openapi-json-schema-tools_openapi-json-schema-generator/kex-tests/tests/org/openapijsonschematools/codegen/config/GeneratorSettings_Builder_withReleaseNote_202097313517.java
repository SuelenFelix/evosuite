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
import java.util.HashMap;

public class GeneratorSettings_Builder_withReleaseNote_202097313517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5859;

    public GeneratorSettings_Builder_withReleaseNote_202097313517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5980 = new HashMap();
        term5859 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term5859, term5859.getClass(), "generatorName", "PgPzMSEjjX");
        setField(term5859, term5859.getClass(), "apiPackage", "wzsPSPcRdj");
        setField(term5859, term5859.getClass(), "invokerPackage", "kGMQdqJYyB");
        setField(term5859, term5859.getClass(), "packageName", "XJJNClzHRf");
        setField(term5859, term5859.getClass(), "apiNameSuffix", "HDaezxQfQR");
        setField(term5859, term5859.getClass(), "modelNamePrefix", "iikZEapDlu");
        setField(term5859, term5859.getClass(), "modelNameSuffix", "nhoHrZfnIN");
        setField(term5859, term5859.getClass(), "groupId", "ZkMALXpEAZ");
        setField(term5859, term5859.getClass(), "artifactId", "tXfQjSqDzN");
        setField(term5859, term5859.getClass(), "artifactVersion", "BjugTaMcxJ");
        setField(term5859, term5859.getClass(), "additionalProperties", term5980);
        setField(term5859, term5859.getClass(), "gitHost", "github.com");
        setField(term5859, term5859.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term5859, term5859.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term5859, term5859.getClass(), "releaseNote", "Minor update");
        setField(term5859, term5859.getClass(), "httpUserAgent", "vGiuZVPJNH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tlzpzIjMib";
        callMethod(klass, "withReleaseNote", argTypes, term5859, args);
    }

};



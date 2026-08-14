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

public class GeneratorSettings_Builder_additionalProperties_20248805510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GeneratorSettings_Builder_additionalProperties_20248805510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term122 = new HashMap();
        term1 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term1, term1.getClass(), "generatorName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "apiPackage", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "invokerPackage", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "packageName", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "apiNameSuffix", "jJCZpVmanW");
        setField(term1, term1.getClass(), "modelNamePrefix", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "modelNameSuffix", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "groupId", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "artifactId", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "artifactVersion", "RMFIsYGgne");
        setField(term1, term1.getClass(), "additionalProperties", term122);
        setField(term1, term1.getClass(), "gitHost", "github.com");
        setField(term1, term1.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term1, term1.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term1, term1.getClass(), "releaseNote", "Minor update");
        setField(term1, term1.getClass(), "httpUserAgent", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "additionalProperties", argTypes, term1, args);
    }

};



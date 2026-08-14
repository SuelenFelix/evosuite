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

public class GeneratorSettings_getGeneratorName_7315360530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39972;

    public GeneratorSettings_getGeneratorName_7315360530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term40106 = new HashMap();
        term39972 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term40105 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term39972, term39972.getClass(), "generatorName", "VBUahCvyxC");
        setField(term39972, term39972.getClass(), "apiPackage", "MlzTkzKMCX");
        setField(term39972, term39972.getClass(), "modelPackage", "UqKUbMyPMJ");
        setField(term39972, term39972.getClass(), "invokerPackage", "QpYltHAdyY");
        setField(term39972, term39972.getClass(), "packageName", "lbmSGBwIiV");
        setField(term39972, term39972.getClass(), "apiNameSuffix", "DAxyHoTLzZ");
        setField(term39972, term39972.getClass(), "modelNamePrefix", "fhZgTouhCC");
        setField(term39972, term39972.getClass(), "modelNameSuffix", "wrikqJwXvL");
        setField(term39972, term39972.getClass(), "groupId", "UiWhvbypdr");
        setField(term39972, term39972.getClass(), "artifactId", "CgleElJNje");
        setField(term39972, term39972.getClass(), "artifactVersion", "ZrchvNGMtd");
        setField(term40105, term40105.getClass(), "m", term40106);
        setField(term40105, term40105.getClass(), "keySet", null);
        setField(term40105, term40105.getClass(), "entrySet", null);
        setField(term40105, term40105.getClass(), "values", null);
        setField(term39972, term39972.getClass(), "additionalProperties", term40105);
        setField(term39972, term39972.getClass(), "gitHost", "github.com");
        setField(term39972, term39972.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term39972, term39972.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term39972, term39972.getClass(), "releaseNote", "Minor update");
        setField(term39972, term39972.getClass(), "httpUserAgent", "WaEcyVlcIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneratorName", argTypes, term39972, args);
    }

};



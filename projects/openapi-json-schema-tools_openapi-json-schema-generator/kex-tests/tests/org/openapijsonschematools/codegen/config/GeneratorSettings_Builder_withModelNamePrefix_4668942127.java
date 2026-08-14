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

public class GeneratorSettings_Builder_withModelNamePrefix_4668942127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2175;

    public GeneratorSettings_Builder_withModelNamePrefix_4668942127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2296 = new HashMap();
        term2175 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term2175, term2175.getClass(), "generatorName", "IgRJUzaCwW");
        setField(term2175, term2175.getClass(), "apiPackage", "JUmudUmaaV");
        setField(term2175, term2175.getClass(), "invokerPackage", "KoyGrUJeJW");
        setField(term2175, term2175.getClass(), "packageName", "HqBOwkVqjD");
        setField(term2175, term2175.getClass(), "apiNameSuffix", "MAcUBcBckh");
        setField(term2175, term2175.getClass(), "modelNamePrefix", "oVgzLbrsFr");
        setField(term2175, term2175.getClass(), "modelNameSuffix", "vQVyKLdtaz");
        setField(term2175, term2175.getClass(), "groupId", "OWKQODBLzb");
        setField(term2175, term2175.getClass(), "artifactId", "wGmYcqUkgE");
        setField(term2175, term2175.getClass(), "artifactVersion", "idgaQsnJpQ");
        setField(term2175, term2175.getClass(), "additionalProperties", term2296);
        setField(term2175, term2175.getClass(), "gitHost", "github.com");
        setField(term2175, term2175.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term2175, term2175.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term2175, term2175.getClass(), "releaseNote", "Minor update");
        setField(term2175, term2175.getClass(), "httpUserAgent", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jUbSRrkrYZ";
        callMethod(klass, "withModelNamePrefix", argTypes, term2175, args);
    }

};



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

public class GeneratorSettings_Builder_withAdditionalProperty_77657141113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4394;
     Object term4596;

    public GeneratorSettings_Builder_withAdditionalProperty_77657141113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4515 = new HashMap();
        term4394 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term4394, term4394.getClass(), "generatorName", "FPvxVzzSvD");
        setField(term4394, term4394.getClass(), "apiPackage", "WHcwFgsGFC");
        setField(term4394, term4394.getClass(), "invokerPackage", "HzqpegHiRq");
        setField(term4394, term4394.getClass(), "packageName", "jwsfVjMoJT");
        setField(term4394, term4394.getClass(), "apiNameSuffix", "ZfdXfCCFDf");
        setField(term4394, term4394.getClass(), "modelNamePrefix", "MwwjNtdOFT");
        setField(term4394, term4394.getClass(), "modelNameSuffix", "VYkqXKVlAJ");
        setField(term4394, term4394.getClass(), "groupId", "XkIoWJRNwN");
        setField(term4394, term4394.getClass(), "artifactId", "aNWLJdrZMq");
        setField(term4394, term4394.getClass(), "artifactVersion", "HHmNoYxIGj");
        setField(term4394, term4394.getClass(), "additionalProperties", term4515);
        setField(term4394, term4394.getClass(), "gitHost", "github.com");
        setField(term4394, term4394.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term4394, term4394.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term4394, term4394.getClass(), "releaseNote", "Minor update");
        setField(term4394, term4394.getClass(), "httpUserAgent", "PtirvZmsGt");
        term4596 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "HWkpTmtlrc";
        args[1] = term4596;
        callMethod(klass, "withAdditionalProperty", argTypes, term4394, args);
    }

};



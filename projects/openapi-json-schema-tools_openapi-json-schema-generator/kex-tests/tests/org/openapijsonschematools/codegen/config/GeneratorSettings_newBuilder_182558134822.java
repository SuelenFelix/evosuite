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

public class GeneratorSettings_newBuilder_182558134822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47311;

    public GeneratorSettings_newBuilder_182558134822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term47445 = new HashMap();
        term47311 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term47444 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term47311, term47311.getClass(), "generatorName", "cDOXXottZh");
        setField(term47311, term47311.getClass(), "apiPackage", "rfqJDkDppz");
        setField(term47311, term47311.getClass(), "modelPackage", "MGorMVGauT");
        setField(term47311, term47311.getClass(), "invokerPackage", "jXKxUGTuEF");
        setField(term47311, term47311.getClass(), "packageName", "nDCcyhiTnS");
        setField(term47311, term47311.getClass(), "apiNameSuffix", "Bcivwcjece");
        setField(term47311, term47311.getClass(), "modelNamePrefix", "QTefjRuiez");
        setField(term47311, term47311.getClass(), "modelNameSuffix", "SQZVNkAVBB");
        setField(term47311, term47311.getClass(), "groupId", "mrSAYJlddZ");
        setField(term47311, term47311.getClass(), "artifactId", "KbwxawvYsw");
        setField(term47311, term47311.getClass(), "artifactVersion", "gvjdfHNzOa");
        setField(term47444, term47444.getClass(), "m", term47445);
        setField(term47444, term47444.getClass(), "keySet", null);
        setField(term47444, term47444.getClass(), "entrySet", null);
        setField(term47444, term47444.getClass(), "values", null);
        setField(term47311, term47311.getClass(), "additionalProperties", term47444);
        setField(term47311, term47311.getClass(), "gitHost", "github.com");
        setField(term47311, term47311.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term47311, term47311.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term47311, term47311.getClass(), "releaseNote", "Minor update");
        setField(term47311, term47311.getClass(), "httpUserAgent", "HqitWglYWX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Object[] args = new Object[1];
        args[0] = term47311;
        callMethod(klass, "newBuilder", argTypes, null, args);
    }

};



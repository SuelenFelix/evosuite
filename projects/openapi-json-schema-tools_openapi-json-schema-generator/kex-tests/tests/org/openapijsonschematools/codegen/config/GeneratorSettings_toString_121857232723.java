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

public class GeneratorSettings_toString_121857232723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47678;

    public GeneratorSettings_toString_121857232723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term47812 = new HashMap();
        term47678 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term47811 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term47678, term47678.getClass(), "generatorName", "pOuFRlHmbK");
        setField(term47678, term47678.getClass(), "apiPackage", "WrzdBkinqV");
        setField(term47678, term47678.getClass(), "modelPackage", "vydWXHfFTw");
        setField(term47678, term47678.getClass(), "invokerPackage", "DRhkpDneCC");
        setField(term47678, term47678.getClass(), "packageName", "vuIJRrypuA");
        setField(term47678, term47678.getClass(), "apiNameSuffix", "AxfSZmaiyA");
        setField(term47678, term47678.getClass(), "modelNamePrefix", "lBpveIKbea");
        setField(term47678, term47678.getClass(), "modelNameSuffix", "uyLBVQYcOV");
        setField(term47678, term47678.getClass(), "groupId", "PoTZjDuBHa");
        setField(term47678, term47678.getClass(), "artifactId", "MIwvgVrhzP");
        setField(term47678, term47678.getClass(), "artifactVersion", "HcUUieXdep");
        setField(term47811, term47811.getClass(), "m", term47812);
        setField(term47811, term47811.getClass(), "keySet", null);
        setField(term47811, term47811.getClass(), "entrySet", null);
        setField(term47811, term47811.getClass(), "values", null);
        setField(term47678, term47678.getClass(), "additionalProperties", term47811);
        setField(term47678, term47678.getClass(), "gitHost", "github.com");
        setField(term47678, term47678.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term47678, term47678.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term47678, term47678.getClass(), "releaseNote", "Minor update");
        setField(term47678, term47678.getClass(), "httpUserAgent", "AbonCTtbef");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term47678, args);
    }

};



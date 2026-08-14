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
import java.util.LinkedHashMap;

public class GeneratorSettings_Builder_withAdditionalProperties_13688131712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4005;
     Object term4195;

    public GeneratorSettings_Builder_withAdditionalProperties_13688131712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4126 = new HashMap();
        term4005 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term4005, term4005.getClass(), "generatorName", "AKNapTAfmD");
        setField(term4005, term4005.getClass(), "apiPackage", "xJgPlLxpgC");
        setField(term4005, term4005.getClass(), "invokerPackage", "EYtfuJaxiM");
        setField(term4005, term4005.getClass(), "packageName", "gCWtLVKVVe");
        setField(term4005, term4005.getClass(), "apiNameSuffix", "fWKJoSoCwE");
        setField(term4005, term4005.getClass(), "modelNamePrefix", "wfaXBpWAUH");
        setField(term4005, term4005.getClass(), "modelNameSuffix", "VMeAzAHwZj");
        setField(term4005, term4005.getClass(), "groupId", "PznxWXsZME");
        setField(term4005, term4005.getClass(), "artifactId", "ZzIujlwVsw");
        setField(term4005, term4005.getClass(), "artifactVersion", "LWyEaeIyAo");
        setField(term4005, term4005.getClass(), "additionalProperties", term4126);
        setField(term4005, term4005.getClass(), "gitHost", "github.com");
        setField(term4005, term4005.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term4005, term4005.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term4005, term4005.getClass(), "releaseNote", "Minor update");
        setField(term4005, term4005.getClass(), "httpUserAgent", "yVMkkQhvmN");
        term4195 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4195;
        callMethod(klass, "withAdditionalProperties", argTypes, term4005, args);
    }

};



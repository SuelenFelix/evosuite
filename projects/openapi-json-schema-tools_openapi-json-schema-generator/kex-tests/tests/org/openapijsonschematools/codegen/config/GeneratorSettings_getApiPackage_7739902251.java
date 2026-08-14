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

public class GeneratorSettings_getApiPackage_7739902251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40339;

    public GeneratorSettings_getApiPackage_7739902251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term40473 = new HashMap();
        term40339 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term40472 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term40339, term40339.getClass(), "generatorName", "ONcbPCQnHd");
        setField(term40339, term40339.getClass(), "apiPackage", "AobDaplFLl");
        setField(term40339, term40339.getClass(), "modelPackage", "pDkMNnAGgv");
        setField(term40339, term40339.getClass(), "invokerPackage", "PaCpFXGzdX");
        setField(term40339, term40339.getClass(), "packageName", "FftYCNbnks");
        setField(term40339, term40339.getClass(), "apiNameSuffix", "lJoltmsadS");
        setField(term40339, term40339.getClass(), "modelNamePrefix", "mvfDtZNEHr");
        setField(term40339, term40339.getClass(), "modelNameSuffix", "bvSgmFUDOU");
        setField(term40339, term40339.getClass(), "groupId", "XMHwbfiHRl");
        setField(term40339, term40339.getClass(), "artifactId", "bucTnYicnp");
        setField(term40339, term40339.getClass(), "artifactVersion", "EkgprvqZlM");
        setField(term40472, term40472.getClass(), "m", term40473);
        setField(term40472, term40472.getClass(), "keySet", null);
        setField(term40472, term40472.getClass(), "entrySet", null);
        setField(term40472, term40472.getClass(), "values", null);
        setField(term40339, term40339.getClass(), "additionalProperties", term40472);
        setField(term40339, term40339.getClass(), "gitHost", "github.com");
        setField(term40339, term40339.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term40339, term40339.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term40339, term40339.getClass(), "releaseNote", "Minor update");
        setField(term40339, term40339.getClass(), "httpUserAgent", "fbnKvthhOz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getApiPackage", argTypes, term40339, args);
    }

};



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

public class GeneratorSettings_getModelNameSuffix_18955356767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42541;

    public GeneratorSettings_getModelNameSuffix_18955356767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42675 = new HashMap();
        term42541 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term42674 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term42541, term42541.getClass(), "generatorName", "lLiSiPCciB");
        setField(term42541, term42541.getClass(), "apiPackage", "PsMKIIEwdR");
        setField(term42541, term42541.getClass(), "modelPackage", "RbQmXqfXAT");
        setField(term42541, term42541.getClass(), "invokerPackage", "fcCAsvfBbe");
        setField(term42541, term42541.getClass(), "packageName", "mUNcKUxghj");
        setField(term42541, term42541.getClass(), "apiNameSuffix", "lnvLKbtveE");
        setField(term42541, term42541.getClass(), "modelNamePrefix", "FfrrEhTHzQ");
        setField(term42541, term42541.getClass(), "modelNameSuffix", "LXnDNrMsqT");
        setField(term42541, term42541.getClass(), "groupId", "ZLQamJFBmu");
        setField(term42541, term42541.getClass(), "artifactId", "ZWcOCwKNvd");
        setField(term42541, term42541.getClass(), "artifactVersion", "GTmoNrziyc");
        setField(term42674, term42674.getClass(), "m", term42675);
        setField(term42674, term42674.getClass(), "keySet", null);
        setField(term42674, term42674.getClass(), "entrySet", null);
        setField(term42674, term42674.getClass(), "values", null);
        setField(term42541, term42541.getClass(), "additionalProperties", term42674);
        setField(term42541, term42541.getClass(), "gitHost", "github.com");
        setField(term42541, term42541.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term42541, term42541.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term42541, term42541.getClass(), "releaseNote", "Minor update");
        setField(term42541, term42541.getClass(), "httpUserAgent", "LvztehSlhM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModelNameSuffix", argTypes, term42541, args);
    }

};



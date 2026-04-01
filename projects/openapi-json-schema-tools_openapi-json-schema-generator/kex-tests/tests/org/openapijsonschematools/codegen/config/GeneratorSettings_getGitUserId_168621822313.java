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

public class GeneratorSettings_getGitUserId_168621822313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44743;

    public GeneratorSettings_getGitUserId_168621822313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term44877 = new HashMap();
        term44743 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term44876 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term44743, term44743.getClass(), "generatorName", "XildIRoZHG");
        setField(term44743, term44743.getClass(), "apiPackage", "lEcrFlxJXH");
        setField(term44743, term44743.getClass(), "modelPackage", "VNdDwXMYxR");
        setField(term44743, term44743.getClass(), "invokerPackage", "bVbexZPmwW");
        setField(term44743, term44743.getClass(), "packageName", "tvxYdqiyGc");
        setField(term44743, term44743.getClass(), "apiNameSuffix", "ZEXFoMSKeG");
        setField(term44743, term44743.getClass(), "modelNamePrefix", "HvxahUfZcJ");
        setField(term44743, term44743.getClass(), "modelNameSuffix", "WkLpmqoQxy");
        setField(term44743, term44743.getClass(), "groupId", "XiNoscmYhd");
        setField(term44743, term44743.getClass(), "artifactId", "asMqnMNrZp");
        setField(term44743, term44743.getClass(), "artifactVersion", "pqFUMTCKJd");
        setField(term44876, term44876.getClass(), "m", term44877);
        setField(term44876, term44876.getClass(), "keySet", null);
        setField(term44876, term44876.getClass(), "entrySet", null);
        setField(term44876, term44876.getClass(), "values", null);
        setField(term44743, term44743.getClass(), "additionalProperties", term44876);
        setField(term44743, term44743.getClass(), "gitHost", "github.com");
        setField(term44743, term44743.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term44743, term44743.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term44743, term44743.getClass(), "releaseNote", "Minor update");
        setField(term44743, term44743.getClass(), "httpUserAgent", "PTEndmPMzk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGitUserId", argTypes, term44743, args);
    }

};



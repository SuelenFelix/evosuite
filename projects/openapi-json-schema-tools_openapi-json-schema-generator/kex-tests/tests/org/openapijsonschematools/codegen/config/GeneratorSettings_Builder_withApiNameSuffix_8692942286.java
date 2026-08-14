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

public class GeneratorSettings_Builder_withApiNameSuffix_8692942286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1809;

    public GeneratorSettings_Builder_withApiNameSuffix_8692942286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1930 = new HashMap();
        term1809 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term1809, term1809.getClass(), "generatorName", "nHXjMycHlU");
        setField(term1809, term1809.getClass(), "apiPackage", "ieCtQFdkii");
        setField(term1809, term1809.getClass(), "invokerPackage", "dEnhdmILtU");
        setField(term1809, term1809.getClass(), "packageName", "hoicvmsovO");
        setField(term1809, term1809.getClass(), "apiNameSuffix", "eqJfYWRaEL");
        setField(term1809, term1809.getClass(), "modelNamePrefix", "fhkbdRViHi");
        setField(term1809, term1809.getClass(), "modelNameSuffix", "uWHnvSvaPl");
        setField(term1809, term1809.getClass(), "groupId", "kBdSllIBVz");
        setField(term1809, term1809.getClass(), "artifactId", "TJmVBGfTML");
        setField(term1809, term1809.getClass(), "artifactVersion", "tPlsykYBqO");
        setField(term1809, term1809.getClass(), "additionalProperties", term1930);
        setField(term1809, term1809.getClass(), "gitHost", "github.com");
        setField(term1809, term1809.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term1809, term1809.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term1809, term1809.getClass(), "releaseNote", "Minor update");
        setField(term1809, term1809.getClass(), "httpUserAgent", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "whBvTVIIlC";
        callMethod(klass, "withApiNameSuffix", argTypes, term1809, args);
    }

};



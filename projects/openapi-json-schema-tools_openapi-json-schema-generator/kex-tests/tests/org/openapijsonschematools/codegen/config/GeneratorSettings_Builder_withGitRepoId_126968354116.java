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

public class GeneratorSettings_Builder_withGitRepoId_126968354116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5493;

    public GeneratorSettings_Builder_withGitRepoId_126968354116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5614 = new HashMap();
        term5493 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term5493, term5493.getClass(), "generatorName", "ekxGuOYIwi");
        setField(term5493, term5493.getClass(), "apiPackage", "RbVQXSpxXy");
        setField(term5493, term5493.getClass(), "invokerPackage", "YpJbIgJWWv");
        setField(term5493, term5493.getClass(), "packageName", "JppkknKVOw");
        setField(term5493, term5493.getClass(), "apiNameSuffix", "iljANwuEjk");
        setField(term5493, term5493.getClass(), "modelNamePrefix", "kNqaJKIATy");
        setField(term5493, term5493.getClass(), "modelNameSuffix", "vKQukfbJUd");
        setField(term5493, term5493.getClass(), "groupId", "lFRJFUMVbx");
        setField(term5493, term5493.getClass(), "artifactId", "sZdUNdggUW");
        setField(term5493, term5493.getClass(), "artifactVersion", "OqbwYQfvAe");
        setField(term5493, term5493.getClass(), "additionalProperties", term5614);
        setField(term5493, term5493.getClass(), "gitHost", "github.com");
        setField(term5493, term5493.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term5493, term5493.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term5493, term5493.getClass(), "releaseNote", "Minor update");
        setField(term5493, term5493.getClass(), "httpUserAgent", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DhjNLmRMCu";
        callMethod(klass, "withGitRepoId", argTypes, term5493, args);
    }

};



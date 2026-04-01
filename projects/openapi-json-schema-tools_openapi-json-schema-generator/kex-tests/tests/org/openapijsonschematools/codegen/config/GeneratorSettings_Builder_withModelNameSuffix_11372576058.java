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

public class GeneratorSettings_Builder_withModelNameSuffix_11372576058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2541;

    public GeneratorSettings_Builder_withModelNameSuffix_11372576058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2662 = new HashMap();
        term2541 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term2541, term2541.getClass(), "generatorName", "bWWfajKbEX");
        setField(term2541, term2541.getClass(), "apiPackage", "cAPeiZHKGJ");
        setField(term2541, term2541.getClass(), "invokerPackage", "LvJFtLBaxj");
        setField(term2541, term2541.getClass(), "packageName", "PHvxnGHptP");
        setField(term2541, term2541.getClass(), "apiNameSuffix", "TimdotUuNC");
        setField(term2541, term2541.getClass(), "modelNamePrefix", "PkWMRdJcBb");
        setField(term2541, term2541.getClass(), "modelNameSuffix", "jSpAteRute");
        setField(term2541, term2541.getClass(), "groupId", "swZVeJAxjt");
        setField(term2541, term2541.getClass(), "artifactId", "xOcJIiQQDu");
        setField(term2541, term2541.getClass(), "artifactVersion", "GVizqqzXpy");
        setField(term2541, term2541.getClass(), "additionalProperties", term2662);
        setField(term2541, term2541.getClass(), "gitHost", "github.com");
        setField(term2541, term2541.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term2541, term2541.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term2541, term2541.getClass(), "releaseNote", "Minor update");
        setField(term2541, term2541.getClass(), "httpUserAgent", "JqXGgAhZPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiKYgYHqIS";
        callMethod(klass, "withModelNameSuffix", argTypes, term2541, args);
    }

};



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

public class GeneratorSettings_getModelNamePrefix_17290682276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42174;

    public GeneratorSettings_getModelNamePrefix_17290682276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42308 = new HashMap();
        term42174 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term42307 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term42174, term42174.getClass(), "generatorName", "ZDhASPHjDG");
        setField(term42174, term42174.getClass(), "apiPackage", "HNVOAXYNEZ");
        setField(term42174, term42174.getClass(), "modelPackage", "gbbYBYyfvr");
        setField(term42174, term42174.getClass(), "invokerPackage", "SrWMUlbtWV");
        setField(term42174, term42174.getClass(), "packageName", "VePIumgrrU");
        setField(term42174, term42174.getClass(), "apiNameSuffix", "DPwIqlszZo");
        setField(term42174, term42174.getClass(), "modelNamePrefix", "mNgDshwZNc");
        setField(term42174, term42174.getClass(), "modelNameSuffix", "pDqgDbJoFw");
        setField(term42174, term42174.getClass(), "groupId", "iVOvTzOxwt");
        setField(term42174, term42174.getClass(), "artifactId", "BjZQdecXvB");
        setField(term42174, term42174.getClass(), "artifactVersion", "iUkOOQhEkw");
        setField(term42307, term42307.getClass(), "m", term42308);
        setField(term42307, term42307.getClass(), "keySet", null);
        setField(term42307, term42307.getClass(), "entrySet", null);
        setField(term42307, term42307.getClass(), "values", null);
        setField(term42174, term42174.getClass(), "additionalProperties", term42307);
        setField(term42174, term42174.getClass(), "gitHost", "github.com");
        setField(term42174, term42174.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term42174, term42174.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term42174, term42174.getClass(), "releaseNote", "Minor update");
        setField(term42174, term42174.getClass(), "httpUserAgent", "wmVoFoUVmU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModelNamePrefix", argTypes, term42174, args);
    }

};



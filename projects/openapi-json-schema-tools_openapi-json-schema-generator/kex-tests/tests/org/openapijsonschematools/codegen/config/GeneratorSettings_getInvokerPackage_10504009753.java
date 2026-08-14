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

public class GeneratorSettings_getInvokerPackage_10504009753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41073;

    public GeneratorSettings_getInvokerPackage_10504009753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term41207 = new HashMap();
        term41073 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term41206 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term41073, term41073.getClass(), "generatorName", "aYLvcxZohT");
        setField(term41073, term41073.getClass(), "apiPackage", "mnHyQbMyld");
        setField(term41073, term41073.getClass(), "modelPackage", "KHtaDOIcJZ");
        setField(term41073, term41073.getClass(), "invokerPackage", "vgdwrCZczl");
        setField(term41073, term41073.getClass(), "packageName", "gKMNrpKBpu");
        setField(term41073, term41073.getClass(), "apiNameSuffix", "ZbHJVEqcoa");
        setField(term41073, term41073.getClass(), "modelNamePrefix", "awDQVEVIKi");
        setField(term41073, term41073.getClass(), "modelNameSuffix", "HJwNgUzZZR");
        setField(term41073, term41073.getClass(), "groupId", "FvUCZgTXhq");
        setField(term41073, term41073.getClass(), "artifactId", "wWWidPCHzx");
        setField(term41073, term41073.getClass(), "artifactVersion", "OwPIiBRuKK");
        setField(term41206, term41206.getClass(), "m", term41207);
        setField(term41206, term41206.getClass(), "keySet", null);
        setField(term41206, term41206.getClass(), "entrySet", null);
        setField(term41206, term41206.getClass(), "values", null);
        setField(term41073, term41073.getClass(), "additionalProperties", term41206);
        setField(term41073, term41073.getClass(), "gitHost", "github.com");
        setField(term41073, term41073.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term41073, term41073.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term41073, term41073.getClass(), "releaseNote", "Minor update");
        setField(term41073, term41073.getClass(), "httpUserAgent", "sgfGySMODT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInvokerPackage", argTypes, term41073, args);
    }

};



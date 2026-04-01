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

public class GeneratorSettings_hashCode_70781263725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48413;

    public GeneratorSettings_hashCode_70781263725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term48547 = new HashMap();
        term48413 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term48546 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term48413, term48413.getClass(), "generatorName", "IdGzDFfcZf");
        setField(term48413, term48413.getClass(), "apiPackage", "KDdRNhZmnU");
        setField(term48413, term48413.getClass(), "modelPackage", "iMsqJaKlDC");
        setField(term48413, term48413.getClass(), "invokerPackage", "aPkGHbZyjj");
        setField(term48413, term48413.getClass(), "packageName", "nSWdsVyJRI");
        setField(term48413, term48413.getClass(), "apiNameSuffix", "JBOPGgGKnc");
        setField(term48413, term48413.getClass(), "modelNamePrefix", "GlPTiCMCGP");
        setField(term48413, term48413.getClass(), "modelNameSuffix", "jlcBpLoWfd");
        setField(term48413, term48413.getClass(), "groupId", "oYymmLqbfJ");
        setField(term48413, term48413.getClass(), "artifactId", "YaDWphDOSz");
        setField(term48413, term48413.getClass(), "artifactVersion", "nnnmCgFBLw");
        setField(term48546, term48546.getClass(), "m", term48547);
        setField(term48546, term48546.getClass(), "keySet", null);
        setField(term48546, term48546.getClass(), "entrySet", null);
        setField(term48546, term48546.getClass(), "values", null);
        setField(term48413, term48413.getClass(), "additionalProperties", term48546);
        setField(term48413, term48413.getClass(), "gitHost", "github.com");
        setField(term48413, term48413.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term48413, term48413.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term48413, term48413.getClass(), "releaseNote", "Minor update");
        setField(term48413, term48413.getClass(), "httpUserAgent", "hSSCyNEhyH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term48413, args);
    }

};



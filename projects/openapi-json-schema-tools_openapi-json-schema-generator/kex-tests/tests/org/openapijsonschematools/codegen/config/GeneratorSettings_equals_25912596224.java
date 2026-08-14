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

public class GeneratorSettings_equals_25912596224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48045;
     Object term48248;

    public GeneratorSettings_equals_25912596224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term48179 = new HashMap();
        term48045 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term48178 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term48045, term48045.getClass(), "generatorName", "maXrGOGoKA");
        setField(term48045, term48045.getClass(), "apiPackage", "zAkgWQVCpM");
        setField(term48045, term48045.getClass(), "modelPackage", "yQUDyOroXU");
        setField(term48045, term48045.getClass(), "invokerPackage", "xweqkPdyJH");
        setField(term48045, term48045.getClass(), "packageName", "kwteHWzwcc");
        setField(term48045, term48045.getClass(), "apiNameSuffix", "uMsWXqNhln");
        setField(term48045, term48045.getClass(), "modelNamePrefix", "MAnhIPOtHL");
        setField(term48045, term48045.getClass(), "modelNameSuffix", "dikKjYjmRO");
        setField(term48045, term48045.getClass(), "groupId", "GJnnMDVnEP");
        setField(term48045, term48045.getClass(), "artifactId", "zSMVllDpfk");
        setField(term48045, term48045.getClass(), "artifactVersion", "iptRXVDoYE");
        setField(term48178, term48178.getClass(), "m", term48179);
        setField(term48178, term48178.getClass(), "keySet", null);
        setField(term48178, term48178.getClass(), "entrySet", null);
        setField(term48178, term48178.getClass(), "values", null);
        setField(term48045, term48045.getClass(), "additionalProperties", term48178);
        setField(term48045, term48045.getClass(), "gitHost", "github.com");
        setField(term48045, term48045.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term48045, term48045.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term48045, term48045.getClass(), "releaseNote", "Minor update");
        setField(term48045, term48045.getClass(), "httpUserAgent", "kucsxnvbES");
        term48248 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term48248;
        callMethod(klass, "equals", argTypes, term48045, args);
    }

};



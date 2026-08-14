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

public class GeneratorSettings_getModelPackage_20825162242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40706;

    public GeneratorSettings_getModelPackage_20825162242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term40840 = new HashMap();
        term40706 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term40839 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term40706, term40706.getClass(), "generatorName", "PGfCDJTBek");
        setField(term40706, term40706.getClass(), "apiPackage", "ZwjARhAtHC");
        setField(term40706, term40706.getClass(), "modelPackage", "XXvscsYBWv");
        setField(term40706, term40706.getClass(), "invokerPackage", "uePedtiAfL");
        setField(term40706, term40706.getClass(), "packageName", "AdSHvysxQB");
        setField(term40706, term40706.getClass(), "apiNameSuffix", "jlraKkBWFA");
        setField(term40706, term40706.getClass(), "modelNamePrefix", "mRBtFTxVdE");
        setField(term40706, term40706.getClass(), "modelNameSuffix", "IVacFDAZcj");
        setField(term40706, term40706.getClass(), "groupId", "EEYmuwyVDP");
        setField(term40706, term40706.getClass(), "artifactId", "EWFbEDAVrE");
        setField(term40706, term40706.getClass(), "artifactVersion", "EMiMtYgfvr");
        setField(term40839, term40839.getClass(), "m", term40840);
        setField(term40839, term40839.getClass(), "keySet", null);
        setField(term40839, term40839.getClass(), "entrySet", null);
        setField(term40839, term40839.getClass(), "values", null);
        setField(term40706, term40706.getClass(), "additionalProperties", term40839);
        setField(term40706, term40706.getClass(), "gitHost", "github.com");
        setField(term40706, term40706.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term40706, term40706.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term40706, term40706.getClass(), "releaseNote", "Minor update");
        setField(term40706, term40706.getClass(), "httpUserAgent", "OyYyYYnJuF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModelPackage", argTypes, term40706, args);
    }

};



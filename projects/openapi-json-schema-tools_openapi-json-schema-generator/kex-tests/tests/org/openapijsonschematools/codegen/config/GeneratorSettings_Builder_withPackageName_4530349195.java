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

public class GeneratorSettings_Builder_withPackageName_4530349195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1443;

    public GeneratorSettings_Builder_withPackageName_4530349195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1564 = new HashMap();
        term1443 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term1443, term1443.getClass(), "generatorName", "LvtrsXUliU");
        setField(term1443, term1443.getClass(), "apiPackage", "xLbjWUgOIL");
        setField(term1443, term1443.getClass(), "invokerPackage", "jDtqGUpnZN");
        setField(term1443, term1443.getClass(), "packageName", "nGKItKLYNC");
        setField(term1443, term1443.getClass(), "apiNameSuffix", "UiUYnPrcCi");
        setField(term1443, term1443.getClass(), "modelNamePrefix", "UoYtihxVaS");
        setField(term1443, term1443.getClass(), "modelNameSuffix", "JDswTTCZHV");
        setField(term1443, term1443.getClass(), "groupId", "onpbIeEKoi");
        setField(term1443, term1443.getClass(), "artifactId", "YRHGsAkhxb");
        setField(term1443, term1443.getClass(), "artifactVersion", "ffYhPOzlUs");
        setField(term1443, term1443.getClass(), "additionalProperties", term1564);
        setField(term1443, term1443.getClass(), "gitHost", "github.com");
        setField(term1443, term1443.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term1443, term1443.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term1443, term1443.getClass(), "releaseNote", "Minor update");
        setField(term1443, term1443.getClass(), "httpUserAgent", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "withPackageName", argTypes, term1443, args);
    }

};



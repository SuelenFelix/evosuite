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

public class GeneratorSettings_Builder_withInvokerPackage_2260615504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;

    public GeneratorSettings_Builder_withInvokerPackage_2260615504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1198 = new HashMap();
        term1077 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term1077, term1077.getClass(), "generatorName", "Ghbwtircqb");
        setField(term1077, term1077.getClass(), "apiPackage", "xrwlQZdwCp");
        setField(term1077, term1077.getClass(), "invokerPackage", "IDCWpPLRkE");
        setField(term1077, term1077.getClass(), "packageName", "nyiiPDVjAc");
        setField(term1077, term1077.getClass(), "apiNameSuffix", "aKnKipADSo");
        setField(term1077, term1077.getClass(), "modelNamePrefix", "wSQxaModmm");
        setField(term1077, term1077.getClass(), "modelNameSuffix", "UlajhuVLaP");
        setField(term1077, term1077.getClass(), "groupId", "gGSMzuGICf");
        setField(term1077, term1077.getClass(), "artifactId", "hxCBltsObl");
        setField(term1077, term1077.getClass(), "artifactVersion", "BndsHwAFMv");
        setField(term1077, term1077.getClass(), "additionalProperties", term1198);
        setField(term1077, term1077.getClass(), "gitHost", "github.com");
        setField(term1077, term1077.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term1077, term1077.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term1077, term1077.getClass(), "releaseNote", "Minor update");
        setField(term1077, term1077.getClass(), "httpUserAgent", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "withInvokerPackage", argTypes, term1077, args);
    }

};



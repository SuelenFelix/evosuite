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

public class GeneratorSettings_Builder_withGitHost_14043828814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4761;

    public GeneratorSettings_Builder_withGitHost_14043828814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4882 = new HashMap();
        term4761 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term4761, term4761.getClass(), "generatorName", "hMmaoREuCK");
        setField(term4761, term4761.getClass(), "apiPackage", "VeDtgDzGAN");
        setField(term4761, term4761.getClass(), "invokerPackage", "aWYOWZFyaX");
        setField(term4761, term4761.getClass(), "packageName", "BRIVNtfUWU");
        setField(term4761, term4761.getClass(), "apiNameSuffix", "DbiCVtPPCT");
        setField(term4761, term4761.getClass(), "modelNamePrefix", "WzFopsaDuG");
        setField(term4761, term4761.getClass(), "modelNameSuffix", "PapWxkhEWe");
        setField(term4761, term4761.getClass(), "groupId", "smnHEqRFRx");
        setField(term4761, term4761.getClass(), "artifactId", "XYtryyobou");
        setField(term4761, term4761.getClass(), "artifactVersion", "OYbzXylRWW");
        setField(term4761, term4761.getClass(), "additionalProperties", term4882);
        setField(term4761, term4761.getClass(), "gitHost", "github.com");
        setField(term4761, term4761.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term4761, term4761.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term4761, term4761.getClass(), "releaseNote", "Minor update");
        setField(term4761, term4761.getClass(), "httpUserAgent", "DSNsTGYXDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sQvGcVjdEx";
        callMethod(klass, "withGitHost", argTypes, term4761, args);
    }

};



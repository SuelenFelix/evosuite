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

public class GeneratorSettings_getGroupId_1914718238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42908;

    public GeneratorSettings_getGroupId_1914718238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43042 = new HashMap();
        term42908 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term43041 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term42908, term42908.getClass(), "generatorName", "njvnWFTMxN");
        setField(term42908, term42908.getClass(), "apiPackage", "fLRqcTSfzF");
        setField(term42908, term42908.getClass(), "modelPackage", "EBYHwsuWAU");
        setField(term42908, term42908.getClass(), "invokerPackage", "PtIjKpiSix");
        setField(term42908, term42908.getClass(), "packageName", "NZdTuwSCIM");
        setField(term42908, term42908.getClass(), "apiNameSuffix", "dDHcmzPAmP");
        setField(term42908, term42908.getClass(), "modelNamePrefix", "HEaTkWYBgv");
        setField(term42908, term42908.getClass(), "modelNameSuffix", "MpJsPKLTIU");
        setField(term42908, term42908.getClass(), "groupId", "IiNCZfdouL");
        setField(term42908, term42908.getClass(), "artifactId", "AhOHzCsHKW");
        setField(term42908, term42908.getClass(), "artifactVersion", "UqgLPaaAHi");
        setField(term43041, term43041.getClass(), "m", term43042);
        setField(term43041, term43041.getClass(), "keySet", null);
        setField(term43041, term43041.getClass(), "entrySet", null);
        setField(term43041, term43041.getClass(), "values", null);
        setField(term42908, term42908.getClass(), "additionalProperties", term43041);
        setField(term42908, term42908.getClass(), "gitHost", "github.com");
        setField(term42908, term42908.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term42908, term42908.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term42908, term42908.getClass(), "releaseNote", "Minor update");
        setField(term42908, term42908.getClass(), "httpUserAgent", "xypryEkUPF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term42908, args);
    }

};



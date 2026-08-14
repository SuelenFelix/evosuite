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

public class GeneratorSettings_getAdditionalProperties_87392113211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44009;

    public GeneratorSettings_getAdditionalProperties_87392113211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term44143 = new HashMap();
        term44009 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term44142 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term44009, term44009.getClass(), "generatorName", "TVxGTjeDcu");
        setField(term44009, term44009.getClass(), "apiPackage", "ABPtcyCzkR");
        setField(term44009, term44009.getClass(), "modelPackage", "QgHhxMyKvr");
        setField(term44009, term44009.getClass(), "invokerPackage", "VGiXZZTWRO");
        setField(term44009, term44009.getClass(), "packageName", "MlPtwXnJOJ");
        setField(term44009, term44009.getClass(), "apiNameSuffix", "DbfiyFeaTe");
        setField(term44009, term44009.getClass(), "modelNamePrefix", "dQxXGBtDLZ");
        setField(term44009, term44009.getClass(), "modelNameSuffix", "EgSgEFIyyN");
        setField(term44009, term44009.getClass(), "groupId", "iAOFcXaLSf");
        setField(term44009, term44009.getClass(), "artifactId", "EHoNUaeyvT");
        setField(term44009, term44009.getClass(), "artifactVersion", "ZwKmasCVIy");
        setField(term44142, term44142.getClass(), "m", term44143);
        setField(term44142, term44142.getClass(), "keySet", null);
        setField(term44142, term44142.getClass(), "entrySet", null);
        setField(term44142, term44142.getClass(), "values", null);
        setField(term44009, term44009.getClass(), "additionalProperties", term44142);
        setField(term44009, term44009.getClass(), "gitHost", "github.com");
        setField(term44009, term44009.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term44009, term44009.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term44009, term44009.getClass(), "releaseNote", "Minor update");
        setField(term44009, term44009.getClass(), "httpUserAgent", "pxokrVaeMd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAdditionalProperties", argTypes, term44009, args);
    }

};



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

public class GeneratorSettings_getArtifactVersion_153177212510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43642;

    public GeneratorSettings_getArtifactVersion_153177212510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43776 = new HashMap();
        term43642 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term43775 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term43642, term43642.getClass(), "generatorName", "XZkOUcbfFg");
        setField(term43642, term43642.getClass(), "apiPackage", "TGiJfagfky");
        setField(term43642, term43642.getClass(), "modelPackage", "BJklinBmhN");
        setField(term43642, term43642.getClass(), "invokerPackage", "IOddzvEWcl");
        setField(term43642, term43642.getClass(), "packageName", "bIrtpkYJWT");
        setField(term43642, term43642.getClass(), "apiNameSuffix", "VuLLXpvPpZ");
        setField(term43642, term43642.getClass(), "modelNamePrefix", "UEdzEKEEEV");
        setField(term43642, term43642.getClass(), "modelNameSuffix", "BcENaQFYSd");
        setField(term43642, term43642.getClass(), "groupId", "POPYycoDBy");
        setField(term43642, term43642.getClass(), "artifactId", "LuWMOXdAPA");
        setField(term43642, term43642.getClass(), "artifactVersion", "blSffTnsOv");
        setField(term43775, term43775.getClass(), "m", term43776);
        setField(term43775, term43775.getClass(), "keySet", null);
        setField(term43775, term43775.getClass(), "entrySet", null);
        setField(term43775, term43775.getClass(), "values", null);
        setField(term43642, term43642.getClass(), "additionalProperties", term43775);
        setField(term43642, term43642.getClass(), "gitHost", "github.com");
        setField(term43642, term43642.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term43642, term43642.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term43642, term43642.getClass(), "releaseNote", "Minor update");
        setField(term43642, term43642.getClass(), "httpUserAgent", "qbUMcIvEXH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtifactVersion", argTypes, term43642, args);
    }

};



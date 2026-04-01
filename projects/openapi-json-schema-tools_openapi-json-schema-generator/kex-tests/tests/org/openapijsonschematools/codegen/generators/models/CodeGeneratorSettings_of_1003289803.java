package org.openapijsonschematools.codegen.generators.models;

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
import static org.openapijsonschematools.codegen.generators.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CodeGeneratorSettings_of_1003289803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3899;

    public CodeGeneratorSettings_of_1003289803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3899 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CodeGeneratorSettings"));
        setField(term3899, term3899.getClass(), "apiPackage", null);
        setField(term3899, term3899.getClass(), "artifactId", null);
        setField(term3899, term3899.getClass(), "outputFolder", null);
        setField(term3899, term3899.getClass(), "templateDir", null);
        setField(term3899, term3899.getClass(), "embeddedTemplateDir", null);
        setField(term3899, term3899.getClass(), "packageName", null);
        setBooleanField(term3899, term3899.getClass(), "strictSpecBehavior", false);
        setBooleanField(term3899, term3899.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term3899, term3899.getClass(), "skipOverwrite", false);
        setBooleanField(term3899, term3899.getClass(), "removeOperationIdPrefix", false);
        setField(term3899, term3899.getClass(), "ignoreFilePathOverride", null);
        setBooleanField(term3899, term3899.getClass(), "skipOperationExample", false);
        setBooleanField(term3899, term3899.getClass(), "enablePostProcessFile", false);
        setField(term3899, term3899.getClass(), "templateEngineName", null);
        setField(term3899, term3899.getClass(), "inputSpecLocation", null);
        setBooleanField(term3899, term3899.getClass(), "removeEnumValuePrefix", false);
        setBooleanField(term3899, term3899.getClass(), "hideGenerationTimestamp", false);
        setBooleanField(term3899, term3899.getClass(), "intsAllowedForFloatDoubleFormats", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CodeGeneratorSettings");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "of", argTypes, term3899, args);
    }

};



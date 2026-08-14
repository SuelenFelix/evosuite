package org.openapijsonschematools.codegen.templating;

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
import static org.openapijsonschematools.codegen.templating.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TemplateDefinition_getTemplateType_16326020366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6466;

    public TemplateDefinition_getTemplateType_16326020366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6510 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term6509 = ((Class) term6510).getDeclaredField((String) "SupportingFiles");
        ((Field) term6509).setAccessible(true);
        Object enum14 = ((Field) term6509).get((Object) null);
        term6466 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term6466, term6466.getClass(), "templateFile", "");
        setField(term6466, term6466.getClass(), "folder", "");
        setField(term6466, term6466.getClass(), "destinationFilename", "");
        setField(term6466, term6466.getClass(), "templateType", enum14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateType", argTypes, term6466, args);
    }

};



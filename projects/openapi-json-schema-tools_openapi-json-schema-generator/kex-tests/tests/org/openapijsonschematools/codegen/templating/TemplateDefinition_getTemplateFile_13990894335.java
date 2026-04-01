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

public class TemplateDefinition_getTemplateFile_13990894335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6061;

    public TemplateDefinition_getTemplateFile_13990894335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6105 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term6104 = ((Class) term6105).getDeclaredField((String) "SupportingFiles");
        ((Field) term6104).setAccessible(true);
        Object enum13 = ((Field) term6104).get((Object) null);
        term6061 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term6061, term6061.getClass(), "templateFile", "");
        setField(term6061, term6061.getClass(), "folder", "");
        setField(term6061, term6061.getClass(), "destinationFilename", "");
        setField(term6061, term6061.getClass(), "templateType", enum13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateFile", argTypes, term6061, args);
    }

};



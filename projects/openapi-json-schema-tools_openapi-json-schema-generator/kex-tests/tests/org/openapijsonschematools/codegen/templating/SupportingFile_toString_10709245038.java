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

public class SupportingFile_toString_10709245038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3327;

    public SupportingFile_toString_10709245038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3413 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term3412 = ((Class) term3413).getDeclaredField((String) "Model");
        ((Field) term3412).setAccessible(true);
        Object enum7 = ((Field) term3412).get((Object) null);
        term3327 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile"));
        setBooleanField(term3327, term3327.getClass(), "canOverwrite", true);
        setField(term3327, term3327.getClass(), "templateFile", "flxyYxBRtu");
        setField(term3327, term3327.getClass(), "folder", "OclPbYPkcH");
        setField(term3327, term3327.getClass(), "destinationFilename", "IoAlmYsBwc");
        setField(term3327, term3327.getClass(), "templateType", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3327, args);
    }

};



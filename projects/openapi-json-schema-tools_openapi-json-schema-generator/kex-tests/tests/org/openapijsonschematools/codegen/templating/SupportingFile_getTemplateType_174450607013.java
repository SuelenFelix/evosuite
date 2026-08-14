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

public class SupportingFile_getTemplateType_174450607013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3748;

    public SupportingFile_getTemplateType_174450607013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3748 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile"));
        setBooleanField(term3748, term3748.getClass(), "canOverwrite", false);
        setField(term3748, term3748.getClass(), "templateFile", null);
        setField(term3748, term3748.getClass(), "folder", null);
        setField(term3748, term3748.getClass(), "destinationFilename", null);
        setField(term3748, term3748.getClass(), "templateType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateType", argTypes, term3748, args);
    }

};



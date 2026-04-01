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

public class SupportingFile_getTemplateType_17445060704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1591;

    public SupportingFile_getTemplateType_17445060704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1686 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term1685 = ((Class) term1686).getDeclaredField((String) "ModelTests");
        ((Field) term1685).setAccessible(true);
        Object enum3 = ((Field) term1685).get((Object) null);
        term1591 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile"));
        setBooleanField(term1591, term1591.getClass(), "canOverwrite", false);
        setField(term1591, term1591.getClass(), "templateFile", "oVcInYnLWB");
        setField(term1591, term1591.getClass(), "folder", "aJlieCFVtF");
        setField(term1591, term1591.getClass(), "destinationFilename", "ZiaGIbnzTs");
        setField(term1591, term1591.getClass(), "templateType", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateType", argTypes, term1591, args);
    }

};



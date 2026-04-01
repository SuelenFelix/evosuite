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

public class SupportingFile_isCanOverwrite_13947711896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2474;

    public SupportingFile_isCanOverwrite_13947711896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2567 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term2566 = ((Class) term2567).getDeclaredField((String) "ModelDocs");
        ((Field) term2566).setAccessible(true);
        Object enum5 = ((Field) term2566).get((Object) null);
        term2474 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile"));
        setBooleanField(term2474, term2474.getClass(), "canOverwrite", true);
        setField(term2474, term2474.getClass(), "templateFile", "hNxWaHcfhY");
        setField(term2474, term2474.getClass(), "folder", "RkybSrpybU");
        setField(term2474, term2474.getClass(), "destinationFilename", "xOEqzGAmDU");
        setField(term2474, term2474.getClass(), "templateType", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCanOverwrite", argTypes, term2474, args);
    }

};



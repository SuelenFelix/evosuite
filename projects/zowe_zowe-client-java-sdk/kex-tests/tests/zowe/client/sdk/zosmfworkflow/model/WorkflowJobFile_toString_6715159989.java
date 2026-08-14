package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class WorkflowJobFile_toString_6715159989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30629;

    public WorkflowJobFile_toString_6715159989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30630 = new Integer(-1772434990);
        Integer term30644 = new Integer(-1845499264);
        Integer term30646 = new Integer(-505439934);
        term30629 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term30629, term30629.getClass(), "id", term30630);
        setField(term30629, term30629.getClass(), "ddname", "tloEDDASGy");
        setField(term30629, term30629.getClass(), "byteCount", term30644);
        setField(term30629, term30629.getClass(), "recordCount", term30646);
        setField(term30629, term30629.getClass(), "classs", "CQMdMBIICe");
        setField(term30629, term30629.getClass(), "stepname", "rbJaIkrSnM");
        setField(term30629, term30629.getClass(), "procstep", "EAKcPFEKbX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30629, args);
    }

};



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

public class WorkflowJobFile_getProcstep_192068971418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30731;

    public WorkflowJobFile_getProcstep_192068971418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30731 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term30731, term30731.getClass(), "id", null);
        setField(term30731, term30731.getClass(), "ddname", null);
        setField(term30731, term30731.getClass(), "byteCount", null);
        setField(term30731, term30731.getClass(), "recordCount", null);
        setField(term30731, term30731.getClass(), "classs", null);
        setField(term30731, term30731.getClass(), "stepname", null);
        setField(term30731, term30731.getClass(), "procstep", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProcstep", argTypes, term30731, args);
    }

};



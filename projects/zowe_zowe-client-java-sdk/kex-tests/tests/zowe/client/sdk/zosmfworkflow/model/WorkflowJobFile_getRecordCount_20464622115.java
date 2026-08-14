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

public class WorkflowJobFile_getRecordCount_20464622115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30249;

    public WorkflowJobFile_getRecordCount_20464622115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30250 = new Integer(1375330971);
        Integer term30264 = new Integer(-478195677);
        Integer term30266 = new Integer(972867650);
        term30249 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term30249, term30249.getClass(), "id", term30250);
        setField(term30249, term30249.getClass(), "ddname", "ADhlvQDtuh");
        setField(term30249, term30249.getClass(), "byteCount", term30264);
        setField(term30249, term30249.getClass(), "recordCount", term30266);
        setField(term30249, term30249.getClass(), "classs", "rvUfMhtNrD");
        setField(term30249, term30249.getClass(), "stepname", "tVJNKfGPYg");
        setField(term30249, term30249.getClass(), "procstep", "AlAUNSOTmH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecordCount", argTypes, term30249, args);
    }

};



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

public class WorkflowJobFile_getClasss_3238962956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30344;

    public WorkflowJobFile_getClasss_3238962956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30345 = new Integer(1655935355);
        Integer term30359 = new Integer(-481533957);
        Integer term30361 = new Integer(1240914516);
        term30344 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term30344, term30344.getClass(), "id", term30345);
        setField(term30344, term30344.getClass(), "ddname", "IeuSZGvhvH");
        setField(term30344, term30344.getClass(), "byteCount", term30359);
        setField(term30344, term30344.getClass(), "recordCount", term30361);
        setField(term30344, term30344.getClass(), "classs", "zCejWZdaIc");
        setField(term30344, term30344.getClass(), "stepname", "aCfzlsgXhB");
        setField(term30344, term30344.getClass(), "procstep", "HmhoMiUgEv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClasss", argTypes, term30344, args);
    }

};



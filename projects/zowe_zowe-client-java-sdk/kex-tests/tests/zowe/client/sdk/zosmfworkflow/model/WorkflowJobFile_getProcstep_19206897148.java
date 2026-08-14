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

public class WorkflowJobFile_getProcstep_19206897148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30534;

    public WorkflowJobFile_getProcstep_19206897148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30535 = new Integer(1442160736);
        Integer term30549 = new Integer(1114000454);
        Integer term30551 = new Integer(-556405712);
        term30534 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term30534, term30534.getClass(), "id", term30535);
        setField(term30534, term30534.getClass(), "ddname", "uVnPUUZHSY");
        setField(term30534, term30534.getClass(), "byteCount", term30549);
        setField(term30534, term30534.getClass(), "recordCount", term30551);
        setField(term30534, term30534.getClass(), "classs", "LaWPqdDqyl");
        setField(term30534, term30534.getClass(), "stepname", "BGDjrSZTJY");
        setField(term30534, term30534.getClass(), "procstep", "VUVCEVItic");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProcstep", argTypes, term30534, args);
    }

};



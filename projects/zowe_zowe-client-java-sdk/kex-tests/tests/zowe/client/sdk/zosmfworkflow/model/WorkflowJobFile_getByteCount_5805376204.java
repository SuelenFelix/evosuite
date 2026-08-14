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

public class WorkflowJobFile_getByteCount_5805376204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30154;

    public WorkflowJobFile_getByteCount_5805376204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30155 = new Integer(1551099402);
        Integer term30169 = new Integer(-2027534003);
        Integer term30171 = new Integer(1063420942);
        term30154 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term30154, term30154.getClass(), "id", term30155);
        setField(term30154, term30154.getClass(), "ddname", "nDUyFfanYp");
        setField(term30154, term30154.getClass(), "byteCount", term30169);
        setField(term30154, term30154.getClass(), "recordCount", term30171);
        setField(term30154, term30154.getClass(), "classs", "hYmQxPxTFd");
        setField(term30154, term30154.getClass(), "stepname", "Clkrygzvpw");
        setField(term30154, term30154.getClass(), "procstep", "TPzGOBNENK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getByteCount", argTypes, term30154, args);
    }

};



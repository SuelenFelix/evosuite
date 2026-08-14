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

public class WorkflowJobFile_getStepname_7087423397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30439;

    public WorkflowJobFile_getStepname_7087423397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30440 = new Integer(-1465035361);
        Integer term30454 = new Integer(1090617576);
        Integer term30456 = new Integer(-1547384488);
        term30439 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term30439, term30439.getClass(), "id", term30440);
        setField(term30439, term30439.getClass(), "ddname", "MuJvYyPzjX");
        setField(term30439, term30439.getClass(), "byteCount", term30454);
        setField(term30439, term30439.getClass(), "recordCount", term30456);
        setField(term30439, term30439.getClass(), "classs", "pEZeQhLjKN");
        setField(term30439, term30439.getClass(), "stepname", "saKRDpPnGD");
        setField(term30439, term30439.getClass(), "procstep", "UesGweYSco");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStepname", argTypes, term30439, args);
    }

};



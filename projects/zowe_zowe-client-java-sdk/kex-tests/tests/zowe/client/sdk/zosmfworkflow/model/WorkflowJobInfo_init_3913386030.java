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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class WorkflowJobInfo_init_3913386030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55182;
     Object term55279;

    public WorkflowJobInfo_init_3913386030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55182 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term55182, term55182.getClass(), "retcode", "DMjvFejbDc");
        setField(term55182, term55182.getClass(), "jobName", "LsszPdpMvX");
        setField(term55182, term55182.getClass(), "status", "YJYOluXjkb");
        setField(term55182, term55182.getClass(), "owner", "NRsURcfaWn");
        setField(term55182, term55182.getClass(), "subsystem", "ykYKNlqHwA");
        setField(term55182, term55182.getClass(), "jobClass", "CaYUiktPks");
        setField(term55182, term55182.getClass(), "type", "xSNRqymNqF");
        setField(term55182, term55182.getClass(), "jobId", "rswcpmelQS");
        Integer term55283 = new Integer(1658391716);
        Integer term55297 = new Integer(2143282300);
        Integer term55299 = new Integer(1137624258);
        Object term55282 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term55282, term55282.getClass(), "id", term55283);
        setField(term55282, term55282.getClass(), "ddname", "OyCqSonMpX");
        setField(term55282, term55282.getClass(), "byteCount", term55297);
        setField(term55282, term55282.getClass(), "recordCount", term55299);
        setField(term55282, term55282.getClass(), "classs", "iUUqZhloeC");
        setField(term55282, term55282.getClass(), "stepname", "HGSlDwqOUA");
        setField(term55282, term55282.getClass(), "procstep", "snPorJFlwz");
        term55279 = new LinkedList();
        ((LinkedList) term55279).add(term55282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term55182;
        args[1] = term55279;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



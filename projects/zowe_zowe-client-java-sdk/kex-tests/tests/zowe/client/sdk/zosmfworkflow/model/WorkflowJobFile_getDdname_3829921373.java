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

public class WorkflowJobFile_getDdname_3829921373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30059;

    public WorkflowJobFile_getDdname_3829921373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30060 = new Integer(1540719661);
        Integer term30074 = new Integer(1265463001);
        Integer term30076 = new Integer(335112684);
        term30059 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term30059, term30059.getClass(), "id", term30060);
        setField(term30059, term30059.getClass(), "ddname", "MQzXbKeQIa");
        setField(term30059, term30059.getClass(), "byteCount", term30074);
        setField(term30059, term30059.getClass(), "recordCount", term30076);
        setField(term30059, term30059.getClass(), "classs", "YHDwlXeRTi");
        setField(term30059, term30059.getClass(), "stepname", "WIJiLZqEqc");
        setField(term30059, term30059.getClass(), "procstep", "OuZMVgPpoE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDdname", argTypes, term30059, args);
    }

};



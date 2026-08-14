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

public class WorkflowJobFile_getId_10462003722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29964;

    public WorkflowJobFile_getId_10462003722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29965 = new Integer(933028652);
        Integer term29979 = new Integer(287287233);
        Integer term29981 = new Integer(962840079);
        term29964 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term29964, term29964.getClass(), "id", term29965);
        setField(term29964, term29964.getClass(), "ddname", "btqCBRPcNd");
        setField(term29964, term29964.getClass(), "byteCount", term29979);
        setField(term29964, term29964.getClass(), "recordCount", term29981);
        setField(term29964, term29964.getClass(), "classs", "LEbiLyVKDG");
        setField(term29964, term29964.getClass(), "stepname", "PzUzEwZhUT");
        setField(term29964, term29964.getClass(), "procstep", "bJKvwEFeLG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term29964, args);
    }

};



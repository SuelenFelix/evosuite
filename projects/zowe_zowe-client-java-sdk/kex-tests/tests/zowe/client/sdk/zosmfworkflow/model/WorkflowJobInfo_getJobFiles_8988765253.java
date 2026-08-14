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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class WorkflowJobInfo_getJobFiles_8988765253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55742;

    public WorkflowJobInfo_getJobFiles_8988765253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term55843 = new Integer(1707220033);
        Integer term55846 = new Integer(-1792504217);
        Integer term55848 = new Integer(1824538861);
        Object term55842 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term55842, term55842.getClass(), "id", term55843);
        setField(term55842, term55842.getClass(), "ddname", "");
        setField(term55842, term55842.getClass(), "byteCount", term55846);
        setField(term55842, term55842.getClass(), "recordCount", term55848);
        setField(term55842, term55842.getClass(), "classs", "");
        setField(term55842, term55842.getClass(), "stepname", "");
        setField(term55842, term55842.getClass(), "procstep", "");
        Integer term55854 = new Integer(499519708);
        Integer term55857 = new Integer(1501165033);
        Integer term55859 = new Integer(510162332);
        Object term55853 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term55853, term55853.getClass(), "id", term55854);
        setField(term55853, term55853.getClass(), "ddname", "");
        setField(term55853, term55853.getClass(), "byteCount", term55857);
        setField(term55853, term55853.getClass(), "recordCount", term55859);
        setField(term55853, term55853.getClass(), "classs", "");
        setField(term55853, term55853.getClass(), "stepname", "");
        setField(term55853, term55853.getClass(), "procstep", "");
        Integer term55865 = new Integer(888506903);
        Integer term55868 = new Integer(200252898);
        Integer term55870 = new Integer(-1831826725);
        Object term55864 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term55864, term55864.getClass(), "id", term55865);
        setField(term55864, term55864.getClass(), "ddname", "");
        setField(term55864, term55864.getClass(), "byteCount", term55868);
        setField(term55864, term55864.getClass(), "recordCount", term55870);
        setField(term55864, term55864.getClass(), "classs", "");
        setField(term55864, term55864.getClass(), "stepname", "");
        setField(term55864, term55864.getClass(), "procstep", "");
        Integer term55876 = new Integer(752152965);
        Integer term55879 = new Integer(-1577069773);
        Integer term55881 = new Integer(-266625190);
        Object term55875 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term55875, term55875.getClass(), "id", term55876);
        setField(term55875, term55875.getClass(), "ddname", "");
        setField(term55875, term55875.getClass(), "byteCount", term55879);
        setField(term55875, term55875.getClass(), "recordCount", term55881);
        setField(term55875, term55875.getClass(), "classs", "");
        setField(term55875, term55875.getClass(), "stepname", "");
        setField(term55875, term55875.getClass(), "procstep", "");
        Integer term55887 = new Integer(489201218);
        Integer term55890 = new Integer(464181937);
        Integer term55892 = new Integer(-1455526612);
        Object term55886 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term55886, term55886.getClass(), "id", term55887);
        setField(term55886, term55886.getClass(), "ddname", "");
        setField(term55886, term55886.getClass(), "byteCount", term55890);
        setField(term55886, term55886.getClass(), "recordCount", term55892);
        setField(term55886, term55886.getClass(), "classs", "");
        setField(term55886, term55886.getClass(), "stepname", "");
        setField(term55886, term55886.getClass(), "procstep", "");
        Integer term55898 = new Integer(-941356098);
        Integer term55901 = new Integer(-201517446);
        Integer term55903 = new Integer(-97742366);
        Object term55897 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term55897, term55897.getClass(), "id", term55898);
        setField(term55897, term55897.getClass(), "ddname", "");
        setField(term55897, term55897.getClass(), "byteCount", term55901);
        setField(term55897, term55897.getClass(), "recordCount", term55903);
        setField(term55897, term55897.getClass(), "classs", "");
        setField(term55897, term55897.getClass(), "stepname", "");
        setField(term55897, term55897.getClass(), "procstep", "");
        ArrayList term55840 = new ArrayList();
        ((ArrayList) term55840).add(term55842);
        ((ArrayList) term55840).add(term55853);
        ((ArrayList) term55840).add(term55864);
        ((ArrayList) term55840).add(term55875);
        ((ArrayList) term55840).add(term55886);
        ((ArrayList) term55840).add(term55897);
        term55742 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term55743 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term55743, term55743.getClass(), "retcode", "nWudcjLvSq");
        setField(term55743, term55743.getClass(), "jobName", "WdAMelVmvU");
        setField(term55743, term55743.getClass(), "status", "FSZMcVNHZZ");
        setField(term55743, term55743.getClass(), "owner", "uasckiUYzs");
        setField(term55743, term55743.getClass(), "subsystem", "dyPJplpZGY");
        setField(term55743, term55743.getClass(), "jobClass", "FidoqFOZww");
        setField(term55743, term55743.getClass(), "type", "VthnTywRxB");
        setField(term55743, term55743.getClass(), "jobId", "yHLHaopFRB");
        setField(term55742, term55742.getClass(), "jobStatus", term55743);
        setField(term55742, term55742.getClass(), "jobFiles", term55840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobFiles", argTypes, term55742, args);
    }

};



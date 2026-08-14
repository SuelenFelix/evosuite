package zowe.client.sdk.zosmfworkflow.input;

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
import static zowe.client.sdk.zosmfworkflow.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class WorkflowCreateInputData_getComments_80713660810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9999;

    public WorkflowCreateInputData_getComments_80713660810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10050 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10050, term10050.getClass(), "name", "");
        setField(term10050, term10050.getClass(), "value", "");
        Object term10053 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10053, term10053.getClass(), "name", "");
        setField(term10053, term10053.getClass(), "value", "");
        ArrayList term10048 = new ArrayList();
        ((ArrayList) term10048).add(term10050);
        ((ArrayList) term10048).add(term10053);
        Boolean term10118 = new Boolean(true);
        ArrayList term10144 = new ArrayList();
        ((ArrayList) term10144).add("SPBstwKFVr");
        Boolean term10160 = new Boolean(true);
        Boolean term10174 = new Boolean(true);
        term9999 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term9999, term9999.getClass(), "workflowName", "DIbeDHICho");
        setField(term9999, term9999.getClass(), "workflowDefinitionFile", "dJGPlmSRnz");
        setField(term9999, term9999.getClass(), "workflowDefinitionFileSystem", "DPskuFUobI");
        setField(term9999, term9999.getClass(), "variableInputFile", "wBGfLpNNiZ");
        setField(term9999, term9999.getClass(), "variables", term10048);
        setField(term9999, term9999.getClass(), "resolveGlobalConflictByUsing", "EdPAvpluZg");
        setField(term9999, term9999.getClass(), "system", "DzHVBMqWtE");
        setField(term9999, term9999.getClass(), "owner", "THZSpzBRYP");
        setField(term9999, term9999.getClass(), "workflowArchiveSAFID", "ZfBIVGBQOE");
        setField(term9999, term9999.getClass(), "comments", "QSrDQfEsTR");
        setField(term9999, term9999.getClass(), "assignToOwner", term10118);
        setField(term9999, term9999.getClass(), "accessType", "PsqusYmejD");
        setField(term9999, term9999.getClass(), "accountInfo", "NTWMiBEaDF");
        setField(term9999, term9999.getClass(), "jobStatement", term10144);
        setField(term9999, term9999.getClass(), "deleteCompletedJobs", term10160);
        setField(term9999, term9999.getClass(), "jobsOutputDirectory", "WxYUTuqmIq");
        setField(term9999, term9999.getClass(), "autoDeleteOnCompletion", term10174);
        setField(term9999, term9999.getClass(), "targetSystemuid", "OeQLvhVERT");
        setField(term9999, term9999.getClass(), "targetSystempwd", "IlvgFINwIa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term9999, args);
    }

};



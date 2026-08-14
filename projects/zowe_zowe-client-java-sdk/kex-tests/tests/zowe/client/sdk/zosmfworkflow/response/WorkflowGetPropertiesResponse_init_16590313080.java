package zowe.client.sdk.zosmfworkflow.response;

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
import static zowe.client.sdk.zosmfworkflow.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import java.util.LinkedList;
import java.lang.Object;

public class WorkflowGetPropertiesResponse_init_16590313080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4377;
     Object term4379;
     Object term4381;
     Object term4407;
     Object term4409;
     Object term4486;
     Object term4644;
     Object term4655;

    public WorkflowGetPropertiesResponse_init_16590313080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4377 = new Integer(568599855);
        term4379 = new Boolean(false);
        term4381 = new Boolean(false);
        term4407 = new Boolean(false);
        Long term4422 = new Long(2442117782898005296L);
        Long term4424 = new Long(6375119433582206027L);
        term4409 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term4409, term4409.getClass(), "startUser", "FwPbDZcHmB");
        setField(term4409, term4409.getClass(), "startedTime", term4422);
        setField(term4409, term4409.getClass(), "stoppedTime", term4424);
        setField(term4409, term4409.getClass(), "currentStepName", "hOncybyCAH");
        setField(term4409, term4409.getClass(), "currentStepNumber", "QduALnDSVo");
        setField(term4409, term4409.getClass(), "currentStepTitle", "izPpKDErnQ");
        setField(term4409, term4409.getClass(), "messageID", "NnpwZBUTvx");
        setField(term4409, term4409.getClass(), "messageText", "tlQSNgTkQX");
        term4486 = new Boolean(false);
        term4644 = new LinkedList();
        ((LinkedList) term4644).add((Object)null);
        ((LinkedList) term4644).add((Object)null);
        ((LinkedList) term4644).add((Object)null);
        ((LinkedList) term4644).add((Object)null);
        ((LinkedList) term4644).add((Object)null);
        ((LinkedList) term4644).add((Object)null);
        ((LinkedList) term4644).add((Object)null);
        ((LinkedList) term4644).add((Object)null);
        Object term4658 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term4658, term4658.getClass(), "name", "gUvcueTURF");
        setField(term4658, term4658.getClass(), "scope", "EwQBhZjCIT");
        setField(term4658, term4658.getClass(), "type", "aSkmSwTnEw");
        setField(term4658, term4658.getClass(), "value", "xvkbvaEGYd");
        setField(term4658, term4658.getClass(), "visibility", "HBGNxdNURv");
        Object term4720 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term4720, term4720.getClass(), "name", "");
        setField(term4720, term4720.getClass(), "scope", "");
        setField(term4720, term4720.getClass(), "type", "");
        setField(term4720, term4720.getClass(), "value", "");
        setField(term4720, term4720.getClass(), "visibility", "");
        Object term4727 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term4727, term4727.getClass(), "name", null);
        setField(term4727, term4727.getClass(), "scope", null);
        setField(term4727, term4727.getClass(), "type", null);
        setField(term4727, term4727.getClass(), "value", null);
        setField(term4727, term4727.getClass(), "visibility", null);
        term4655 = new LinkedList();
        ((LinkedList) term4655).add(term4658);
        ((LinkedList) term4655).add(term4720);
        ((LinkedList) term4655).add(term4727);
        ((LinkedList) term4655).add((Object)null);
        ((LinkedList) term4655).add((Object)null);
        ((LinkedList) term4655).add((Object)null);
        ((LinkedList) term4655).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[38];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.Integer");
        argTypes[16] = Class.forName("java.lang.Boolean");
        argTypes[17] = Class.forName("java.lang.Boolean");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.String");
        argTypes[20] = Class.forName("java.lang.Boolean");
        argTypes[21] = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        argTypes[22] = Class.forName("java.lang.Boolean");
        argTypes[23] = Class.forName("java.lang.String");
        argTypes[24] = Class.forName("java.lang.String");
        argTypes[25] = Class.forName("java.lang.String");
        argTypes[26] = Class.forName("java.lang.String");
        argTypes[27] = Class.forName("java.lang.String");
        argTypes[28] = Class.forName("java.lang.String");
        argTypes[29] = Class.forName("java.lang.String");
        argTypes[30] = Class.forName("java.lang.String");
        argTypes[31] = Class.forName("java.lang.String");
        argTypes[32] = Class.forName("java.lang.String");
        argTypes[33] = Class.forName("java.lang.String");
        argTypes[34] = Class.forName("java.lang.String");
        argTypes[35] = Class.forName("java.lang.String");
        argTypes[36] = Class.forName("java.util.List");
        argTypes[37] = Class.forName("java.util.List");
        Object[] args = new Object[38];
        args[0] = "OqbwYQfvAe";
        args[1] = "tRxZafjqIx";
        args[2] = "DhjNLmRMCu";
        args[3] = "PgPzMSEjjX";
        args[4] = "wzsPSPcRdj";
        args[5] = "kGMQdqJYyB";
        args[6] = "XJJNClzHRf";
        args[7] = "HDaezxQfQR";
        args[8] = "iikZEapDlu";
        args[9] = "nhoHrZfnIN";
        args[10] = "ZkMALXpEAZ";
        args[11] = "tXfQjSqDzN";
        args[12] = "BjugTaMcxJ";
        args[13] = "vGiuZVPJNH";
        args[14] = "tlzpzIjMib";
        args[15] = term4377;
        args[16] = term4379;
        args[17] = term4381;
        args[18] = "AZdLeSugwv";
        args[19] = "RMsXuyzKJV";
        args[20] = term4407;
        args[21] = term4409;
        args[22] = term4486;
        args[23] = "PCipZnmBOF";
        args[24] = "zcorEihhLK";
        args[25] = "GrqozDKFOk";
        args[26] = "CFyoseFGLF";
        args[27] = "SFqCrhEWLm";
        args[28] = "GZdcJyZntS";
        args[29] = "OIHoJeysUi";
        args[30] = "WXMWFDGcLB";
        args[31] = "wKWbJssZuG";
        args[32] = "NzBMMhkhpT";
        args[33] = "qCpEbQDHdF";
        args[34] = "AHbZyFOmlo";
        args[35] = "TwfWVQGiIj";
        args[36] = term4644;
        args[37] = term4655;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



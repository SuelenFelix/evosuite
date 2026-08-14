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
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class WorkflowGetDefinitionResponse_getContainsParallelSteps_62300463510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43314;

    public WorkflowGetDefinitionResponse_getContainsParallelSteps_62300463510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term43399 = new Boolean(false);
        Boolean term43485 = new Boolean(false);
        ArrayList term43493 = new ArrayList();
        ((ArrayList) term43493).add((Object)null);
        ((ArrayList) term43493).add((Object)null);
        ((ArrayList) term43493).add((Object)null);
        ((ArrayList) term43493).add((Object)null);
        Boolean term43496 = new Boolean(true);
        ArrayList term43498 = new ArrayList();
        ((ArrayList) term43498).add((Object)null);
        ((ArrayList) term43498).add((Object)null);
        ((ArrayList) term43498).add((Object)null);
        ((ArrayList) term43498).add((Object)null);
        ((ArrayList) term43498).add((Object)null);
        ((ArrayList) term43498).add((Object)null);
        ((ArrayList) term43498).add((Object)null);
        ((ArrayList) term43498).add((Object)null);
        ((ArrayList) term43498).add((Object)null);
        ArrayList term43501 = new ArrayList();
        ((ArrayList) term43501).add((Object)null);
        ((ArrayList) term43501).add((Object)null);
        Object term43489 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term43489, term43489.getClass(), "name", "");
        setField(term43489, term43489.getClass(), "title", "");
        setField(term43489, term43489.getClass(), "description", "");
        setField(term43489, term43489.getClass(), "prereqStep", term43493);
        setField(term43489, term43489.getClass(), "optional", term43496);
        setField(term43489, term43489.getClass(), "steps", term43498);
        setField(term43489, term43489.getClass(), "variableSpecifications", term43501);
        ArrayList term43508 = new ArrayList();
        ((ArrayList) term43508).add((Object)null);
        ((ArrayList) term43508).add((Object)null);
        ((ArrayList) term43508).add((Object)null);
        Boolean term43511 = new Boolean(false);
        ArrayList term43513 = new ArrayList();
        ArrayList term43516 = new ArrayList();
        ((ArrayList) term43516).add((Object)null);
        ((ArrayList) term43516).add((Object)null);
        Object term43504 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term43504, term43504.getClass(), "name", "");
        setField(term43504, term43504.getClass(), "title", "");
        setField(term43504, term43504.getClass(), "description", "");
        setField(term43504, term43504.getClass(), "prereqStep", term43508);
        setField(term43504, term43504.getClass(), "optional", term43511);
        setField(term43504, term43504.getClass(), "steps", term43513);
        setField(term43504, term43504.getClass(), "variableSpecifications", term43516);
        ArrayList term43523 = new ArrayList();
        ((ArrayList) term43523).add((Object)null);
        ((ArrayList) term43523).add((Object)null);
        ((ArrayList) term43523).add((Object)null);
        ((ArrayList) term43523).add((Object)null);
        ((ArrayList) term43523).add((Object)null);
        ((ArrayList) term43523).add((Object)null);
        ((ArrayList) term43523).add((Object)null);
        ((ArrayList) term43523).add((Object)null);
        Boolean term43526 = new Boolean(false);
        ArrayList term43528 = new ArrayList();
        ((ArrayList) term43528).add((Object)null);
        ((ArrayList) term43528).add((Object)null);
        ((ArrayList) term43528).add((Object)null);
        ArrayList term43531 = new ArrayList();
        ((ArrayList) term43531).add((Object)null);
        ((ArrayList) term43531).add((Object)null);
        Object term43519 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term43519, term43519.getClass(), "name", "");
        setField(term43519, term43519.getClass(), "title", "");
        setField(term43519, term43519.getClass(), "description", "");
        setField(term43519, term43519.getClass(), "prereqStep", term43523);
        setField(term43519, term43519.getClass(), "optional", term43526);
        setField(term43519, term43519.getClass(), "steps", term43528);
        setField(term43519, term43519.getClass(), "variableSpecifications", term43531);
        ArrayList term43538 = new ArrayList();
        ((ArrayList) term43538).add((Object)null);
        ((ArrayList) term43538).add((Object)null);
        ((ArrayList) term43538).add((Object)null);
        ((ArrayList) term43538).add((Object)null);
        ((ArrayList) term43538).add((Object)null);
        ((ArrayList) term43538).add((Object)null);
        Boolean term43541 = new Boolean(false);
        ArrayList term43543 = new ArrayList();
        ((ArrayList) term43543).add((Object)null);
        ((ArrayList) term43543).add((Object)null);
        ((ArrayList) term43543).add((Object)null);
        ((ArrayList) term43543).add((Object)null);
        ((ArrayList) term43543).add((Object)null);
        ((ArrayList) term43543).add((Object)null);
        ((ArrayList) term43543).add((Object)null);
        ((ArrayList) term43543).add((Object)null);
        ArrayList term43546 = new ArrayList();
        ((ArrayList) term43546).add((Object)null);
        ((ArrayList) term43546).add((Object)null);
        ((ArrayList) term43546).add((Object)null);
        ((ArrayList) term43546).add((Object)null);
        ((ArrayList) term43546).add((Object)null);
        ((ArrayList) term43546).add((Object)null);
        Object term43534 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term43534, term43534.getClass(), "name", "");
        setField(term43534, term43534.getClass(), "title", "");
        setField(term43534, term43534.getClass(), "description", "");
        setField(term43534, term43534.getClass(), "prereqStep", term43538);
        setField(term43534, term43534.getClass(), "optional", term43541);
        setField(term43534, term43534.getClass(), "steps", term43543);
        setField(term43534, term43534.getClass(), "variableSpecifications", term43546);
        ArrayList term43487 = new ArrayList();
        ((ArrayList) term43487).add(term43489);
        ((ArrayList) term43487).add(term43504);
        ((ArrayList) term43487).add(term43519);
        ((ArrayList) term43487).add(term43534);
        ArrayList term43558 = new ArrayList();
        Integer term43561 = new Integer(229204365);
        Boolean term43565 = new Boolean(true);
        Integer term43567 = new Integer(-461771056);
        Integer term43570 = new Integer(-243422082);
        Boolean term43573 = new Boolean(true);
        Boolean term43576 = new Boolean(false);
        Boolean term43580 = new Boolean(true);
        Object term43553 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term43553, term43553.getClass(), "name", "");
        setField(term43553, term43553.getClass(), "scope", "");
        setField(term43553, term43553.getClass(), "abstractInfo", "");
        setField(term43553, term43553.getClass(), "category", "");
        setField(term43553, term43553.getClass(), "choice", term43558);
        setField(term43553, term43553.getClass(), "decimalPlaces", term43561);
        setField(term43553, term43553.getClass(), "defaultValue", "");
        setField(term43553, term43553.getClass(), "description", "");
        setField(term43553, term43553.getClass(), "exposeToUser", term43565);
        setField(term43553, term43553.getClass(), "maxLength", term43567);
        setField(term43553, term43553.getClass(), "maxValue", "");
        setField(term43553, term43553.getClass(), "minLength", term43570);
        setField(term43553, term43553.getClass(), "minValue", "");
        setField(term43553, term43553.getClass(), "promptAtCreate", term43573);
        setField(term43553, term43553.getClass(), "regularExpression", "");
        setField(term43553, term43553.getClass(), "requiredAtCreate", term43576);
        setField(term43553, term43553.getClass(), "type", "");
        setField(term43553, term43553.getClass(), "validationType", "");
        setField(term43553, term43553.getClass(), "valueMustBeChoice", term43580);
        setField(term43553, term43553.getClass(), "visibility", "");
        ArrayList term43551 = new ArrayList();
        ((ArrayList) term43551).add(term43553);
        term43314 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse"));
        setField(term43314, term43314.getClass(), "workflowDefaultName", "NSPCJaizlC");
        setField(term43314, term43314.getClass(), "workflowDescription", "JoFUYaQQtF");
        setField(term43314, term43314.getClass(), "workflowID", "SAKoORlZVA");
        setField(term43314, term43314.getClass(), "workflowVersion", "HhYVbmMRiN");
        setField(term43314, term43314.getClass(), "vendor", "UYEVBNEKyf");
        setField(term43314, term43314.getClass(), "workflowDefinitionFileMD5Value", "EXduYtKPaE");
        setField(term43314, term43314.getClass(), "isCallable", "UVMEqArKpY");
        setField(term43314, term43314.getClass(), "containsParallelSteps", term43399);
        setField(term43314, term43314.getClass(), "scope", "fLbDziHEHK");
        setField(term43314, term43314.getClass(), "jobsOutputDirectory", "lzRecPiQNU");
        setField(term43314, term43314.getClass(), "category", "CVfKmjoLKq");
        setField(term43314, term43314.getClass(), "productID", "zvqciKTUAl");
        setField(term43314, term43314.getClass(), "productName", "hvNiDuvOYJ");
        setField(term43314, term43314.getClass(), "productVersion", "unTIyPhfcW");
        setField(term43314, term43314.getClass(), "globalVariableGroup", "McPsgamHga");
        setField(term43314, term43314.getClass(), "isInstanceVariableWithoutPrefix", term43485);
        setField(term43314, term43314.getClass(), "steps", term43487);
        setField(term43314, term43314.getClass(), "variables", term43551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContainsParallelSteps", argTypes, term43314, args);
    }

};



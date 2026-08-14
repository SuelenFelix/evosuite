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
import java.lang.Boolean;
import java.util.ArrayList;

public class WorkflowStepDefinition_init_17646458260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;
     Object term343;
     Object term345;
     Object term489;

    public WorkflowStepDefinition_init_17646458260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298 = new LinkedList();
        ((LinkedList) term298).add("oVcInYnLWB");
        ((LinkedList) term298).add("aJlieCFVtF");
        ((LinkedList) term298).add("");
        ((LinkedList) term298).add((Object)null);
        ((LinkedList) term298).add((Object)null);
        term343 = new Boolean(true);
        ArrayList term385 = new ArrayList();
        ((ArrayList) term385).add((Object)null);
        ((ArrayList) term385).add((Object)null);
        ((ArrayList) term385).add((Object)null);
        ((ArrayList) term385).add((Object)null);
        Boolean term389 = new Boolean(true);
        ArrayList term391 = new ArrayList();
        ((ArrayList) term391).add((Object)null);
        ((ArrayList) term391).add((Object)null);
        ((ArrayList) term391).add((Object)null);
        ArrayList term395 = new ArrayList();
        ((ArrayList) term395).add((Object)null);
        ((ArrayList) term395).add((Object)null);
        ((ArrayList) term395).add((Object)null);
        ((ArrayList) term395).add((Object)null);
        ((ArrayList) term395).add((Object)null);
        ((ArrayList) term395).add((Object)null);
        Object term348 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term348, term348.getClass(), "name", "pCTimMblYc");
        setField(term348, term348.getClass(), "title", "hNxWaHcfhY");
        setField(term348, term348.getClass(), "description", "RkybSrpybU");
        setField(term348, term348.getClass(), "prereqStep", term385);
        setField(term348, term348.getClass(), "optional", term389);
        setField(term348, term348.getClass(), "steps", term391);
        setField(term348, term348.getClass(), "variableSpecifications", term395);
        ArrayList term404 = new ArrayList();
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        Boolean term407 = new Boolean(false);
        ArrayList term409 = new ArrayList();
        ((ArrayList) term409).add((Object)null);
        ((ArrayList) term409).add((Object)null);
        ArrayList term412 = new ArrayList();
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        Object term400 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term400, term400.getClass(), "name", "");
        setField(term400, term400.getClass(), "title", "");
        setField(term400, term400.getClass(), "description", "");
        setField(term400, term400.getClass(), "prereqStep", term404);
        setField(term400, term400.getClass(), "optional", term407);
        setField(term400, term400.getClass(), "steps", term409);
        setField(term400, term400.getClass(), "variableSpecifications", term412);
        Boolean term417 = new Boolean(true);
        Object term416 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term416, term416.getClass(), "name", null);
        setField(term416, term416.getClass(), "title", null);
        setField(term416, term416.getClass(), "description", null);
        setField(term416, term416.getClass(), "prereqStep", null);
        setField(term416, term416.getClass(), "optional", term417);
        setField(term416, term416.getClass(), "steps", null);
        setField(term416, term416.getClass(), "variableSpecifications", null);
        term345 = new LinkedList();
        ((LinkedList) term345).add(term348);
        ((LinkedList) term345).add(term400);
        ((LinkedList) term345).add(term416);
        ((LinkedList) term345).add((Object)null);
        ((LinkedList) term345).add((Object)null);
        ((LinkedList) term345).add((Object)null);
        term489 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("java.lang.Boolean");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.util.List");
        Object[] args = new Object[7];
        args[0] = "uuaPigETmJ";
        args[1] = "MxlszYVzRf";
        args[2] = "LQFpaHEwXR";
        args[3] = term298;
        args[4] = term343;
        args[5] = term345;
        args[6] = term489;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



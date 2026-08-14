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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class WorkflowTemplateStepInfo_getTimeout_160739646419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50055;

    public WorkflowTemplateStepInfo_getTimeout_160739646419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term50068 = new Boolean(false);
        Integer term50082 = new Integer(798043553);
        Integer term50185 = new Integer(533197381);
        Integer term50187 = new Integer(1048271679);
        Integer term50189 = new Integer(-1529797673);
        Object term50184 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term50184, term50184.getClass(), "id", term50185);
        setField(term50184, term50184.getClass(), "ddname", null);
        setField(term50184, term50184.getClass(), "byteCount", term50187);
        setField(term50184, term50184.getClass(), "recordCount", term50189);
        setField(term50184, term50184.getClass(), "classs", null);
        setField(term50184, term50184.getClass(), "stepname", null);
        setField(term50184, term50184.getClass(), "procstep", null);
        Integer term50192 = new Integer(-868676396);
        Integer term50194 = new Integer(1922684808);
        Integer term50196 = new Integer(-2005784375);
        Object term50191 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term50191, term50191.getClass(), "id", term50192);
        setField(term50191, term50191.getClass(), "ddname", null);
        setField(term50191, term50191.getClass(), "byteCount", term50194);
        setField(term50191, term50191.getClass(), "recordCount", term50196);
        setField(term50191, term50191.getClass(), "classs", null);
        setField(term50191, term50191.getClass(), "stepname", null);
        setField(term50191, term50191.getClass(), "procstep", null);
        Integer term50199 = new Integer(-288604325);
        Integer term50201 = new Integer(-1268314569);
        Integer term50203 = new Integer(877649659);
        Object term50198 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term50198, term50198.getClass(), "id", term50199);
        setField(term50198, term50198.getClass(), "ddname", null);
        setField(term50198, term50198.getClass(), "byteCount", term50201);
        setField(term50198, term50198.getClass(), "recordCount", term50203);
        setField(term50198, term50198.getClass(), "classs", null);
        setField(term50198, term50198.getClass(), "stepname", null);
        setField(term50198, term50198.getClass(), "procstep", null);
        ArrayList term50182 = new ArrayList();
        ((ArrayList) term50182).add(term50184);
        ((ArrayList) term50182).add(term50191);
        ((ArrayList) term50182).add(term50198);
        Boolean term50219 = new Boolean(false);
        Boolean term50281 = new Boolean(false);
        Boolean term50295 = new Boolean(true);
        ArrayList term50321 = new ArrayList();
        ((ArrayList) term50321).add("FAPbpaVZzb");
        ((ArrayList) term50321).add("jMmGJiFUkL");
        ((ArrayList) term50321).add("fHyUJhfoxR");
        ((ArrayList) term50321).add("CgnkREXVNP");
        ((ArrayList) term50321).add("mBAKehIGeW");
        ((ArrayList) term50321).add("tmiPUgRXrn");
        Boolean term50421 = new Boolean(false);
        Object term50425 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term50425, term50425.getClass(), "name", "");
        setField(term50425, term50425.getClass(), "scope", "");
        ArrayList term50423 = new ArrayList();
        ((ArrayList) term50423).add(term50425);
        Boolean term50490 = new Boolean(false);
        Boolean term50492 = new Boolean(false);
        ArrayList term50494 = new ArrayList();
        ((ArrayList) term50494).add("KzrkBfSzqK");
        ((ArrayList) term50494).add("cFNqeNRwhB");
        ((ArrayList) term50494).add("TQJASDuFUN");
        ((ArrayList) term50494).add("mOILNTkENv");
        ((ArrayList) term50494).add("xgjvpKAqFv");
        ((ArrayList) term50494).add("RspkCWCAFM");
        ((ArrayList) term50494).add("zAkmDkobmH");
        ((ArrayList) term50494).add("FASdrZqBfN");
        Boolean term50594 = new Boolean(false);
        Boolean term50608 = new Boolean(false);
        Boolean term50610 = new Boolean(false);
        Boolean term50660 = new Boolean(true);
        Boolean term50662 = new Boolean(false);
        ArrayList term50664 = new ArrayList();
        ((ArrayList) term50664).add((Object)null);
        ((ArrayList) term50664).add((Object)null);
        ((ArrayList) term50664).add((Object)null);
        ((ArrayList) term50664).add((Object)null);
        ((ArrayList) term50664).add((Object)null);
        ((ArrayList) term50664).add((Object)null);
        ((ArrayList) term50664).add((Object)null);
        ((ArrayList) term50664).add((Object)null);
        ((ArrayList) term50664).add((Object)null);
        term50055 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term50084 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term50085 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term50055, term50055.getClass(), "template", "liEYQdFeWW");
        setField(term50055, term50055.getClass(), "templateSub", term50068);
        setField(term50055, term50055.getClass(), "submitAs", "ADqXMyhBwX");
        setField(term50055, term50055.getClass(), "maxLrecl", term50082);
        setField(term50085, term50085.getClass(), "retcode", "bxkUNyUzCb");
        setField(term50085, term50085.getClass(), "jobName", "lyiWNZdiRp");
        setField(term50085, term50085.getClass(), "status", "BeeLASibwX");
        setField(term50085, term50085.getClass(), "owner", "BqctwXkUdR");
        setField(term50085, term50085.getClass(), "subsystem", "GRVnFiwbnZ");
        setField(term50085, term50085.getClass(), "jobClass", "bZevkoTsGp");
        setField(term50085, term50085.getClass(), "type", "TjanzjjMgi");
        setField(term50085, term50085.getClass(), "jobId", "UOZvJkhjUs");
        setField(term50084, term50084.getClass(), "jobStatus", term50085);
        setField(term50084, term50084.getClass(), "jobFiles", term50182);
        setField(term50055, term50055.getClass(), "jobInfo", term50084);
        setField(term50055, term50055.getClass(), "output", "MfaucIGOtB");
        setField(term50055, term50055.getClass(), "outputSub", term50219);
        setField(term50055, term50055.getClass(), "outputVariablesPrefix", "InUomUyBlU");
        setField(term50055, term50055.getClass(), "procName", "JeDxEhXsPC");
        setField(term50055, term50055.getClass(), "regionSize", "VAGxXrcAsi");
        setField(term50055, term50055.getClass(), "returnCode", "ApYkVuFRIL");
        setField(term50055, term50055.getClass(), "saveAsDataset", "diuhMpMKFr");
        setField(term50055, term50055.getClass(), "saveAsDatasetSub", term50281);
        setField(term50055, term50055.getClass(), "saveAsUnixFile", "jYgdYPEnbw");
        setField(term50055, term50055.getClass(), "saveAsUnixFileSub", term50295);
        setField(term50055, term50055.getClass(), "scriptParameters", "MaWPQSNeis");
        setField(term50055, term50055.getClass(), "successPattern", "SiShLTAOSK");
        setField(term50055, term50055.getClass(), "failedPattern", term50321);
        setField(term50055, term50055.getClass(), "timeout", "VuZmwqnade");
        setField(term50055, term50055.getClass(), "instructions", "ohZrjboUnX");
        setField(term50055, term50055.getClass(), "instructionsSub", term50421);
        setField(term50055, term50055.getClass(), "variableReferences", term50423);
        setField(term50055, term50055.getClass(), "name", "UPbgrEUWQD");
        setField(term50055, term50055.getClass(), "title", "HABnTZidNp");
        setField(term50055, term50055.getClass(), "description", "qXysRdBrsg");
        setField(term50055, term50055.getClass(), "state", "hbtKoWkZLU");
        setField(term50055, term50055.getClass(), "stepNumber", "VCWjXeMQGX");
        setField(term50055, term50055.getClass(), "optional", term50490);
        setField(term50055, term50055.getClass(), "autoEnable", term50492);
        setField(term50055, term50055.getClass(), "prereqStep", term50494);
        setField(term50055, term50055.getClass(), "userDefined", term50594);
        setField(term50055, term50055.getClass(), "runAsUser", "YNwqJgOcWq");
        setField(term50055, term50055.getClass(), "runAsUserDynamic", term50608);
        setField(term50055, term50055.getClass(), "isRestStep", term50610);
        setField(term50055, term50055.getClass(), "owner", "tUcoJjDoJV");
        setField(term50055, term50055.getClass(), "assignees", "ICNsClDoAn");
        setField(term50055, term50055.getClass(), "skills", "LACfLkaJjq");
        setField(term50055, term50055.getClass(), "weight", "OhYEjeUQkK");
        setField(term50055, term50055.getClass(), "hasCalledWorkflow", term50660);
        setField(term50055, term50055.getClass(), "isConditionStep", term50662);
        setField(term50055, term50055.getClass(), "steps", term50664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeout", argTypes, term50055, args);
    }

};



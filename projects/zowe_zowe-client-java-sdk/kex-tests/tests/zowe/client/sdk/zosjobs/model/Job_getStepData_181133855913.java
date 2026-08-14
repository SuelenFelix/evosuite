package zowe.client.sdk.zosjobs.model;

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
import static zowe.client.sdk.zosjobs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Job_getStepData_181133855913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15271;

    public Job_getStepData_181133855913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15383 = new Long(3620247240684476031L);
        Long term15471 = new Long(8313800941204938919L);
        Long term15559 = new Long(-1214968196781083707L);
        Long term15647 = new Long(-1804015692891701666L);
        Long term15735 = new Long(-6432617521836576658L);
        Long term15823 = new Long(-2255965562447970862L);
        Long term15933 = new Long(148047808219672941L);
        term15271 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term15368 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term15369 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term15457 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term15545 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term15633 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term15721 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term15809 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term15271, term15271.getClass(), "jobId", "IOddzvEWcl");
        setField(term15271, term15271.getClass(), "jobName", "bIrtpkYJWT");
        setField(term15271, term15271.getClass(), "subSystem", "VuLLXpvPpZ");
        setField(term15271, term15271.getClass(), "owner", "UEdzEKEEEV");
        setField(term15271, term15271.getClass(), "status", "BcENaQFYSd");
        setField(term15271, term15271.getClass(), "type", "POPYycoDBy");
        setField(term15271, term15271.getClass(), "classs", "LuWMOXdAPA");
        setField(term15271, term15271.getClass(), "retCode", "blSffTnsOv");
        setBooleanField(term15369, term15369.getClass(), "active", false);
        setField(term15369, term15369.getClass(), "smfid", "qbUMcIvEXH");
        setField(term15369, term15369.getClass(), "stepNumber", term15383);
        setField(term15369, term15369.getClass(), "owner", "TVxGTjeDcu");
        setField(term15369, term15369.getClass(), "programName", "ABPtcyCzkR");
        setField(term15369, term15369.getClass(), "stepName", "QgHhxMyKvr");
        setField(term15369, term15369.getClass(), "pathName", "VGiXZZTWRO");
        setField(term15369, term15369.getClass(), "procStepName", "MlPtwXnJOJ");
        setField(term15369, term15369.getClass(), "completion", "DbfiyFeaTe");
        setElement(term15368, 0, term15369);
        setBooleanField(term15457, term15457.getClass(), "active", false);
        setField(term15457, term15457.getClass(), "smfid", "dQxXGBtDLZ");
        setField(term15457, term15457.getClass(), "stepNumber", term15471);
        setField(term15457, term15457.getClass(), "owner", "EgSgEFIyyN");
        setField(term15457, term15457.getClass(), "programName", "iAOFcXaLSf");
        setField(term15457, term15457.getClass(), "stepName", "EHoNUaeyvT");
        setField(term15457, term15457.getClass(), "pathName", "ZwKmasCVIy");
        setField(term15457, term15457.getClass(), "procStepName", "pxokrVaeMd");
        setField(term15457, term15457.getClass(), "completion", "ujxmmZZcbT");
        setElement(term15368, 1, term15457);
        setBooleanField(term15545, term15545.getClass(), "active", true);
        setField(term15545, term15545.getClass(), "smfid", "BOvgwHfoHQ");
        setField(term15545, term15545.getClass(), "stepNumber", term15559);
        setField(term15545, term15545.getClass(), "owner", "hPpFNeDBIb");
        setField(term15545, term15545.getClass(), "programName", "DNOtiLPAIY");
        setField(term15545, term15545.getClass(), "stepName", "FnEkAHBfyV");
        setField(term15545, term15545.getClass(), "pathName", "VfmNFpEuax");
        setField(term15545, term15545.getClass(), "procStepName", "ANHjlWPmZG");
        setField(term15545, term15545.getClass(), "completion", "SibzENsyyy");
        setElement(term15368, 2, term15545);
        setBooleanField(term15633, term15633.getClass(), "active", false);
        setField(term15633, term15633.getClass(), "smfid", "mrqGHotaef");
        setField(term15633, term15633.getClass(), "stepNumber", term15647);
        setField(term15633, term15633.getClass(), "owner", "UbZGBpQZQW");
        setField(term15633, term15633.getClass(), "programName", "SvGTualQPa");
        setField(term15633, term15633.getClass(), "stepName", "mdxcgZwsaP");
        setField(term15633, term15633.getClass(), "pathName", "XildIRoZHG");
        setField(term15633, term15633.getClass(), "procStepName", "lEcrFlxJXH");
        setField(term15633, term15633.getClass(), "completion", "VNdDwXMYxR");
        setElement(term15368, 3, term15633);
        setBooleanField(term15721, term15721.getClass(), "active", true);
        setField(term15721, term15721.getClass(), "smfid", "bVbexZPmwW");
        setField(term15721, term15721.getClass(), "stepNumber", term15735);
        setField(term15721, term15721.getClass(), "owner", "tvxYdqiyGc");
        setField(term15721, term15721.getClass(), "programName", "ZEXFoMSKeG");
        setField(term15721, term15721.getClass(), "stepName", "HvxahUfZcJ");
        setField(term15721, term15721.getClass(), "pathName", "WkLpmqoQxy");
        setField(term15721, term15721.getClass(), "procStepName", "XiNoscmYhd");
        setField(term15721, term15721.getClass(), "completion", "asMqnMNrZp");
        setElement(term15368, 4, term15721);
        setBooleanField(term15809, term15809.getClass(), "active", false);
        setField(term15809, term15809.getClass(), "smfid", "pqFUMTCKJd");
        setField(term15809, term15809.getClass(), "stepNumber", term15823);
        setField(term15809, term15809.getClass(), "owner", "PTEndmPMzk");
        setField(term15809, term15809.getClass(), "programName", "aJQuCOCvZs");
        setField(term15809, term15809.getClass(), "stepName", "lHYNCJRiOv");
        setField(term15809, term15809.getClass(), "pathName", "QVLresHoaP");
        setField(term15809, term15809.getClass(), "procStepName", "IbxeAMwLVt");
        setField(term15809, term15809.getClass(), "completion", "bShlAqoTmZ");
        setElement(term15368, 5, term15809);
        setField(term15271, term15271.getClass(), "stepData", term15368);
        setField(term15271, term15271.getClass(), "url", "nOKlKlNhtU");
        setField(term15271, term15271.getClass(), "filesUrl", "gXFNBHJSey");
        setField(term15271, term15271.getClass(), "jobCorrelator", "wUcSfItZgv");
        setField(term15271, term15271.getClass(), "phase", term15933);
        setField(term15271, term15271.getClass(), "phaseName", "rOfPCPHmtJ");
        setField(term15271, term15271.getClass(), "execSystem", "EnmiAvfpJv");
        setField(term15271, term15271.getClass(), "execMember", "AdYzLPMcwe");
        setField(term15271, term15271.getClass(), "execSubmitted", "FrTZLybkKk");
        setField(term15271, term15271.getClass(), "execStarted", "FlxVmiMYKP");
        setField(term15271, term15271.getClass(), "execEnded", "fgOpAWlGYN");
        setField(term15271, term15271.getClass(), "reasonNotRunning", "PNzNzzjSXM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStepData", argTypes, term15271, args);
    }

};



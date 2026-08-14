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

public class Job_Builder_type_10888143786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33982;

    public Job_Builder_type_10888143786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34094 = new Long(860079646007397083L);
        Long term34182 = new Long(3230472384687362867L);
        Long term34270 = new Long(-1145146470850585022L);
        Long term34358 = new Long(1993646237353405740L);
        Long term34446 = new Long(-4043093655001688454L);
        Long term34534 = new Long(-419800263764810394L);
        Long term34622 = new Long(5904678961906211249L);
        Long term34732 = new Long(-1820639665251914495L);
        term33982 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term34079 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 7);
        Object term34080 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term34168 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term34256 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term34344 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term34432 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term34520 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term34608 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term33982, term33982.getClass(), "jobId", "btdGZUcaZl");
        setField(term33982, term33982.getClass(), "jobName", "WnEAVdCxna");
        setField(term33982, term33982.getClass(), "subSystem", "lnPIxHHyEK");
        setField(term33982, term33982.getClass(), "owner", "unvQfYuBUz");
        setField(term33982, term33982.getClass(), "status", "RqnYUpQBbG");
        setField(term33982, term33982.getClass(), "type", "sKnuhmcjCC");
        setField(term33982, term33982.getClass(), "classs", "oCBbVNwMnb");
        setField(term33982, term33982.getClass(), "retCode", "miJxAzOVJy");
        setBooleanField(term34080, term34080.getClass(), "active", false);
        setField(term34080, term34080.getClass(), "smfid", "kjqlBVaviD");
        setField(term34080, term34080.getClass(), "stepNumber", term34094);
        setField(term34080, term34080.getClass(), "owner", "iVRXRDCrcM");
        setField(term34080, term34080.getClass(), "programName", "WAZFhrxcSM");
        setField(term34080, term34080.getClass(), "stepName", "gCRUlTuVMX");
        setField(term34080, term34080.getClass(), "pathName", "tYBgGQtkhi");
        setField(term34080, term34080.getClass(), "procStepName", "PhGPFLIMKH");
        setField(term34080, term34080.getClass(), "completion", "pWCYcLhoms");
        setElement(term34079, 0, term34080);
        setBooleanField(term34168, term34168.getClass(), "active", false);
        setField(term34168, term34168.getClass(), "smfid", "IWNJVfvTuw");
        setField(term34168, term34168.getClass(), "stepNumber", term34182);
        setField(term34168, term34168.getClass(), "owner", "DLpKfwPpvr");
        setField(term34168, term34168.getClass(), "programName", "DLFXidLbuT");
        setField(term34168, term34168.getClass(), "stepName", "FjkxfTXGIH");
        setField(term34168, term34168.getClass(), "pathName", "KJkWSFFnmR");
        setField(term34168, term34168.getClass(), "procStepName", "FBYRIDZvmW");
        setField(term34168, term34168.getClass(), "completion", "IyjLfrDZrV");
        setElement(term34079, 1, term34168);
        setBooleanField(term34256, term34256.getClass(), "active", false);
        setField(term34256, term34256.getClass(), "smfid", "BRMTHqqoRg");
        setField(term34256, term34256.getClass(), "stepNumber", term34270);
        setField(term34256, term34256.getClass(), "owner", "nOElYZBeyU");
        setField(term34256, term34256.getClass(), "programName", "eUXPtGmoNg");
        setField(term34256, term34256.getClass(), "stepName", "ZjqXyUmAJY");
        setField(term34256, term34256.getClass(), "pathName", "pjEERkBbYo");
        setField(term34256, term34256.getClass(), "procStepName", "FQPqmjhWog");
        setField(term34256, term34256.getClass(), "completion", "sYtJsiIiSX");
        setElement(term34079, 2, term34256);
        setBooleanField(term34344, term34344.getClass(), "active", false);
        setField(term34344, term34344.getClass(), "smfid", "KgfsAwTFFn");
        setField(term34344, term34344.getClass(), "stepNumber", term34358);
        setField(term34344, term34344.getClass(), "owner", "hFnFlgThhp");
        setField(term34344, term34344.getClass(), "programName", "aEZAnHuGSR");
        setField(term34344, term34344.getClass(), "stepName", "uMzGGnJFYF");
        setField(term34344, term34344.getClass(), "pathName", "iAIRLRjFkP");
        setField(term34344, term34344.getClass(), "procStepName", "cdXvvxXVTz");
        setField(term34344, term34344.getClass(), "completion", "tXsfWIqIPn");
        setElement(term34079, 3, term34344);
        setBooleanField(term34432, term34432.getClass(), "active", true);
        setField(term34432, term34432.getClass(), "smfid", "tDmfqEyHaN");
        setField(term34432, term34432.getClass(), "stepNumber", term34446);
        setField(term34432, term34432.getClass(), "owner", "mTSMXFkWRr");
        setField(term34432, term34432.getClass(), "programName", "qdIiMKwfzT");
        setField(term34432, term34432.getClass(), "stepName", "qrmUWIxufo");
        setField(term34432, term34432.getClass(), "pathName", "SeWCUkXfZv");
        setField(term34432, term34432.getClass(), "procStepName", "woQcQRYwNH");
        setField(term34432, term34432.getClass(), "completion", "uQjzusifTg");
        setElement(term34079, 4, term34432);
        setBooleanField(term34520, term34520.getClass(), "active", false);
        setField(term34520, term34520.getClass(), "smfid", "mOulGkUjOk");
        setField(term34520, term34520.getClass(), "stepNumber", term34534);
        setField(term34520, term34520.getClass(), "owner", "hNWRuNEgOf");
        setField(term34520, term34520.getClass(), "programName", "CEtjGBplmv");
        setField(term34520, term34520.getClass(), "stepName", "XosDTAzIAT");
        setField(term34520, term34520.getClass(), "pathName", "lcCEhCpiZM");
        setField(term34520, term34520.getClass(), "procStepName", "OPJlqMJxdq");
        setField(term34520, term34520.getClass(), "completion", "COhzwXcfds");
        setElement(term34079, 5, term34520);
        setBooleanField(term34608, term34608.getClass(), "active", false);
        setField(term34608, term34608.getClass(), "smfid", "anncJTnzrg");
        setField(term34608, term34608.getClass(), "stepNumber", term34622);
        setField(term34608, term34608.getClass(), "owner", "GMylOocLnB");
        setField(term34608, term34608.getClass(), "programName", "spOehuHwSl");
        setField(term34608, term34608.getClass(), "stepName", "cyobgydTWP");
        setField(term34608, term34608.getClass(), "pathName", "moHYQFfLnp");
        setField(term34608, term34608.getClass(), "procStepName", "BrPqlvIbEQ");
        setField(term34608, term34608.getClass(), "completion", "JDTrhGRsDT");
        setElement(term34079, 6, term34608);
        setField(term33982, term33982.getClass(), "stepData", term34079);
        setField(term33982, term33982.getClass(), "url", "vHxsVQImjS");
        setField(term33982, term33982.getClass(), "filesUrl", "jkVaRrZHQX");
        setField(term33982, term33982.getClass(), "jobCorrelator", "gSFFUuJipG");
        setField(term33982, term33982.getClass(), "phase", term34732);
        setField(term33982, term33982.getClass(), "phaseName", "bQWfIFvxkQ");
        setField(term33982, term33982.getClass(), "execSystem", "aDoBLXfFQI");
        setField(term33982, term33982.getClass(), "execMember", "HTimNhSNVi");
        setField(term33982, term33982.getClass(), "execSubmitted", "IWJWbrHcqm");
        setField(term33982, term33982.getClass(), "execStarted", "ucTcadpUdW");
        setField(term33982, term33982.getClass(), "execEnded", "AscVKZhCwm");
        setField(term33982, term33982.getClass(), "reasonNotRunning", "HCvSsQWjLn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FTuOcSieav";
        callMethod(klass, "type", argTypes, term33982, args);
    }

};



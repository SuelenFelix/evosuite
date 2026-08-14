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

public class Job_Builder_build_703898621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51489;

    public Job_Builder_build_703898621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51601 = new Long(2022482096970820459L);
        Long term51689 = new Long(6315101499811179240L);
        Long term51777 = new Long(-3033337370154155851L);
        Long term51865 = new Long(-3130003589475815807L);
        Long term51953 = new Long(-5344598381371854750L);
        Long term52041 = new Long(-3718250311794019732L);
        Long term52129 = new Long(-5935517391653614345L);
        Long term52217 = new Long(-6521561238735301071L);
        Long term52327 = new Long(-6609679920238945303L);
        term51489 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term51586 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 8);
        Object term51587 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term51675 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term51763 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term51851 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term51939 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term52027 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term52115 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term52203 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term51489, term51489.getClass(), "jobId", "bIqbgRdzpB");
        setField(term51489, term51489.getClass(), "jobName", "FIUbHJmAEj");
        setField(term51489, term51489.getClass(), "subSystem", "mJrFDaDdyY");
        setField(term51489, term51489.getClass(), "owner", "HqyBQNuLnz");
        setField(term51489, term51489.getClass(), "status", "xWkZKbrvmX");
        setField(term51489, term51489.getClass(), "type", "PTEWoxLNqQ");
        setField(term51489, term51489.getClass(), "classs", "XiAUBffMZP");
        setField(term51489, term51489.getClass(), "retCode", "pkfsHvqODq");
        setBooleanField(term51587, term51587.getClass(), "active", true);
        setField(term51587, term51587.getClass(), "smfid", "OoRBUdwown");
        setField(term51587, term51587.getClass(), "stepNumber", term51601);
        setField(term51587, term51587.getClass(), "owner", "lSidZunNtu");
        setField(term51587, term51587.getClass(), "programName", "TLUhUnoanK");
        setField(term51587, term51587.getClass(), "stepName", "JXyQTIyIrU");
        setField(term51587, term51587.getClass(), "pathName", "uplmRQRGWr");
        setField(term51587, term51587.getClass(), "procStepName", "ZEmNnaQFYB");
        setField(term51587, term51587.getClass(), "completion", "FNxFpCZxLW");
        setElement(term51586, 0, term51587);
        setBooleanField(term51675, term51675.getClass(), "active", true);
        setField(term51675, term51675.getClass(), "smfid", "sXMXSCUbRu");
        setField(term51675, term51675.getClass(), "stepNumber", term51689);
        setField(term51675, term51675.getClass(), "owner", "iualVLfDmL");
        setField(term51675, term51675.getClass(), "programName", "bhEFtkUvDw");
        setField(term51675, term51675.getClass(), "stepName", "ZmbknwMIBa");
        setField(term51675, term51675.getClass(), "pathName", "UiRmBTpDTp");
        setField(term51675, term51675.getClass(), "procStepName", "zQtuUgUIjK");
        setField(term51675, term51675.getClass(), "completion", "VBeGRjPsPN");
        setElement(term51586, 1, term51675);
        setBooleanField(term51763, term51763.getClass(), "active", true);
        setField(term51763, term51763.getClass(), "smfid", "pZrAdSHQIs");
        setField(term51763, term51763.getClass(), "stepNumber", term51777);
        setField(term51763, term51763.getClass(), "owner", "XTOiucaEva");
        setField(term51763, term51763.getClass(), "programName", "JMekRNxFMU");
        setField(term51763, term51763.getClass(), "stepName", "LBNEEquiet");
        setField(term51763, term51763.getClass(), "pathName", "cBMdxJirJj");
        setField(term51763, term51763.getClass(), "procStepName", "kVnxgkemHF");
        setField(term51763, term51763.getClass(), "completion", "JUQnEoujef");
        setElement(term51586, 2, term51763);
        setBooleanField(term51851, term51851.getClass(), "active", false);
        setField(term51851, term51851.getClass(), "smfid", "riXARUiigm");
        setField(term51851, term51851.getClass(), "stepNumber", term51865);
        setField(term51851, term51851.getClass(), "owner", "RbXhBDZbRT");
        setField(term51851, term51851.getClass(), "programName", "QDaTqkWnGj");
        setField(term51851, term51851.getClass(), "stepName", "vNObzQvzxo");
        setField(term51851, term51851.getClass(), "pathName", "uyuWzXeJvn");
        setField(term51851, term51851.getClass(), "procStepName", "jvQHxWAYDO");
        setField(term51851, term51851.getClass(), "completion", "mntnLPfhte");
        setElement(term51586, 3, term51851);
        setBooleanField(term51939, term51939.getClass(), "active", true);
        setField(term51939, term51939.getClass(), "smfid", "rIKLUjcdnZ");
        setField(term51939, term51939.getClass(), "stepNumber", term51953);
        setField(term51939, term51939.getClass(), "owner", "MQaKKukkYD");
        setField(term51939, term51939.getClass(), "programName", "ThGyaiqnHq");
        setField(term51939, term51939.getClass(), "stepName", "AtEuOtHJrK");
        setField(term51939, term51939.getClass(), "pathName", "gzqokHWvLu");
        setField(term51939, term51939.getClass(), "procStepName", "ANCcRsABGP");
        setField(term51939, term51939.getClass(), "completion", "MBadwVIvwu");
        setElement(term51586, 4, term51939);
        setBooleanField(term52027, term52027.getClass(), "active", false);
        setField(term52027, term52027.getClass(), "smfid", "zTMIjtwMQL");
        setField(term52027, term52027.getClass(), "stepNumber", term52041);
        setField(term52027, term52027.getClass(), "owner", "cjJhlsbSLZ");
        setField(term52027, term52027.getClass(), "programName", "BvcBilSFZf");
        setField(term52027, term52027.getClass(), "stepName", "ppUmoMssug");
        setField(term52027, term52027.getClass(), "pathName", "FcponInvBb");
        setField(term52027, term52027.getClass(), "procStepName", "IFOOxmFxbX");
        setField(term52027, term52027.getClass(), "completion", "aDEuPKrSZt");
        setElement(term51586, 5, term52027);
        setBooleanField(term52115, term52115.getClass(), "active", true);
        setField(term52115, term52115.getClass(), "smfid", "aDhkmoCCUK");
        setField(term52115, term52115.getClass(), "stepNumber", term52129);
        setField(term52115, term52115.getClass(), "owner", "ibnuoVVkVm");
        setField(term52115, term52115.getClass(), "programName", "mXVgkxjTjD");
        setField(term52115, term52115.getClass(), "stepName", "qodBmKUkev");
        setField(term52115, term52115.getClass(), "pathName", "QJuqwUQEyr");
        setField(term52115, term52115.getClass(), "procStepName", "qqUAzxxpNB");
        setField(term52115, term52115.getClass(), "completion", "WqaQxuPbzr");
        setElement(term51586, 6, term52115);
        setBooleanField(term52203, term52203.getClass(), "active", true);
        setField(term52203, term52203.getClass(), "smfid", "bjLZqJqmnv");
        setField(term52203, term52203.getClass(), "stepNumber", term52217);
        setField(term52203, term52203.getClass(), "owner", "TPbMBzbcHs");
        setField(term52203, term52203.getClass(), "programName", "spkDvqsOhJ");
        setField(term52203, term52203.getClass(), "stepName", "faFVBESzWc");
        setField(term52203, term52203.getClass(), "pathName", "baFwYJAfPz");
        setField(term52203, term52203.getClass(), "procStepName", "PxBSOwkatN");
        setField(term52203, term52203.getClass(), "completion", "uKjlgaHcoc");
        setElement(term51586, 7, term52203);
        setField(term51489, term51489.getClass(), "stepData", term51586);
        setField(term51489, term51489.getClass(), "url", "ITJMSWaPGZ");
        setField(term51489, term51489.getClass(), "filesUrl", "ivvEvcUacU");
        setField(term51489, term51489.getClass(), "jobCorrelator", "gbSukHPGfP");
        setField(term51489, term51489.getClass(), "phase", term52327);
        setField(term51489, term51489.getClass(), "phaseName", "jEDnJjwhoo");
        setField(term51489, term51489.getClass(), "execSystem", "TkTHRRicKc");
        setField(term51489, term51489.getClass(), "execMember", "xwBoTnuoQg");
        setField(term51489, term51489.getClass(), "execSubmitted", "HHAcgDPghN");
        setField(term51489, term51489.getClass(), "execStarted", "GzmFcFoYft");
        setField(term51489, term51489.getClass(), "execEnded", "LYRdIFgbgt");
        setField(term51489, term51489.getClass(), "reasonNotRunning", "NiKeRXajei");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term51489, args);
    }

};



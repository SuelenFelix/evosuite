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

public class Job_Builder_subSystem_12343790293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30504;

    public Job_Builder_subSystem_12343790293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30616 = new Long(4199886998224701110L);
        Long term30704 = new Long(8540994973773607992L);
        Long term30792 = new Long(-2338103433822116635L);
        Long term30880 = new Long(-1885698929232124806L);
        Long term30968 = new Long(5731563613239387113L);
        Long term31056 = new Long(3381333711768010594L);
        Long term31166 = new Long(3580984732036213717L);
        term30504 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term30601 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term30602 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term30690 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term30778 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term30866 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term30954 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term31042 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term30504, term30504.getClass(), "jobId", "DCepDqVwas");
        setField(term30504, term30504.getClass(), "jobName", "wKIBUlfNCx");
        setField(term30504, term30504.getClass(), "subSystem", "iGfMUWRvod");
        setField(term30504, term30504.getClass(), "owner", "zUXaSvayQe");
        setField(term30504, term30504.getClass(), "status", "bPVcnnQPSC");
        setField(term30504, term30504.getClass(), "type", "PQLyoEKWSa");
        setField(term30504, term30504.getClass(), "classs", "HOgkhttJZS");
        setField(term30504, term30504.getClass(), "retCode", "goqNSmXSSS");
        setBooleanField(term30602, term30602.getClass(), "active", true);
        setField(term30602, term30602.getClass(), "smfid", "AkViBLdqXM");
        setField(term30602, term30602.getClass(), "stepNumber", term30616);
        setField(term30602, term30602.getClass(), "owner", "UlxGFzEifL");
        setField(term30602, term30602.getClass(), "programName", "HilHTbDKDF");
        setField(term30602, term30602.getClass(), "stepName", "IaEqlVwmNS");
        setField(term30602, term30602.getClass(), "pathName", "ljNOgdPWrL");
        setField(term30602, term30602.getClass(), "procStepName", "oBlIZiyRMS");
        setField(term30602, term30602.getClass(), "completion", "QUYAkhtCNh");
        setElement(term30601, 0, term30602);
        setBooleanField(term30690, term30690.getClass(), "active", true);
        setField(term30690, term30690.getClass(), "smfid", "kOaAQOLyqd");
        setField(term30690, term30690.getClass(), "stepNumber", term30704);
        setField(term30690, term30690.getClass(), "owner", "ICBWiKaeHC");
        setField(term30690, term30690.getClass(), "programName", "WAljagiCzu");
        setField(term30690, term30690.getClass(), "stepName", "XKMXfDZajw");
        setField(term30690, term30690.getClass(), "pathName", "avZoBQSrBy");
        setField(term30690, term30690.getClass(), "procStepName", "KIXGeHXdwi");
        setField(term30690, term30690.getClass(), "completion", "tTfdvLMwEE");
        setElement(term30601, 1, term30690);
        setBooleanField(term30778, term30778.getClass(), "active", true);
        setField(term30778, term30778.getClass(), "smfid", "DiSkERzqOE");
        setField(term30778, term30778.getClass(), "stepNumber", term30792);
        setField(term30778, term30778.getClass(), "owner", "hPSZZeYqHQ");
        setField(term30778, term30778.getClass(), "programName", "scReMUKyGq");
        setField(term30778, term30778.getClass(), "stepName", "FmIpnxjRxA");
        setField(term30778, term30778.getClass(), "pathName", "FTjxxGvyun");
        setField(term30778, term30778.getClass(), "procStepName", "qsjXSwKloH");
        setField(term30778, term30778.getClass(), "completion", "DDZHUPglvb");
        setElement(term30601, 2, term30778);
        setBooleanField(term30866, term30866.getClass(), "active", false);
        setField(term30866, term30866.getClass(), "smfid", "rWoaXvNyVg");
        setField(term30866, term30866.getClass(), "stepNumber", term30880);
        setField(term30866, term30866.getClass(), "owner", "FLzaBCFjGv");
        setField(term30866, term30866.getClass(), "programName", "OLYhTSqTqJ");
        setField(term30866, term30866.getClass(), "stepName", "AIHoadcpQz");
        setField(term30866, term30866.getClass(), "pathName", "fWMsLtuOEV");
        setField(term30866, term30866.getClass(), "procStepName", "fvgZQBalnd");
        setField(term30866, term30866.getClass(), "completion", "tViQSKUCLE");
        setElement(term30601, 3, term30866);
        setBooleanField(term30954, term30954.getClass(), "active", true);
        setField(term30954, term30954.getClass(), "smfid", "QbaeHheqiP");
        setField(term30954, term30954.getClass(), "stepNumber", term30968);
        setField(term30954, term30954.getClass(), "owner", "gASHxChKwn");
        setField(term30954, term30954.getClass(), "programName", "iasolXlEEn");
        setField(term30954, term30954.getClass(), "stepName", "cAObIvLmLo");
        setField(term30954, term30954.getClass(), "pathName", "xwiCqRSWSe");
        setField(term30954, term30954.getClass(), "procStepName", "IbUFkzIgzq");
        setField(term30954, term30954.getClass(), "completion", "dTOUSTDdbw");
        setElement(term30601, 4, term30954);
        setBooleanField(term31042, term31042.getClass(), "active", false);
        setField(term31042, term31042.getClass(), "smfid", "PECfBejlfo");
        setField(term31042, term31042.getClass(), "stepNumber", term31056);
        setField(term31042, term31042.getClass(), "owner", "SDbDgydVpg");
        setField(term31042, term31042.getClass(), "programName", "EEMaiNkiOH");
        setField(term31042, term31042.getClass(), "stepName", "sFdmTylvqh");
        setField(term31042, term31042.getClass(), "pathName", "rgniLaOaiz");
        setField(term31042, term31042.getClass(), "procStepName", "fzQzzdIOMC");
        setField(term31042, term31042.getClass(), "completion", "hLVDOhfCKX");
        setElement(term30601, 5, term31042);
        setField(term30504, term30504.getClass(), "stepData", term30601);
        setField(term30504, term30504.getClass(), "url", "yXLTfzOgfX");
        setField(term30504, term30504.getClass(), "filesUrl", "MANlfBKTPY");
        setField(term30504, term30504.getClass(), "jobCorrelator", "mRoEmuCJhW");
        setField(term30504, term30504.getClass(), "phase", term31166);
        setField(term30504, term30504.getClass(), "phaseName", "JJUWbMXpyM");
        setField(term30504, term30504.getClass(), "execSystem", "KDrRQWVXok");
        setField(term30504, term30504.getClass(), "execMember", "oOOwvWgxtf");
        setField(term30504, term30504.getClass(), "execSubmitted", "ywoADeiUfF");
        setField(term30504, term30504.getClass(), "execStarted", "loHiudJxbt");
        setField(term30504, term30504.getClass(), "execEnded", "lRbxbybNew");
        setField(term30504, term30504.getClass(), "reasonNotRunning", "WzGudiEARD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoefPqGtaj";
        callMethod(klass, "subSystem", argTypes, term30504, args);
    }

};



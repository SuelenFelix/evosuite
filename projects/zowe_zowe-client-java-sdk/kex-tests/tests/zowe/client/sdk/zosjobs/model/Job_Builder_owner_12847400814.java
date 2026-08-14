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

public class Job_Builder_owner_12847400814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31874;

    public Job_Builder_owner_12847400814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31986 = new Long(5330761990446327930L);
        Long term32074 = new Long(-3954795081650780841L);
        Long term32162 = new Long(3288791194263207397L);
        Long term32250 = new Long(3288941170644426558L);
        Long term32338 = new Long(-8338004844694486146L);
        Long term32448 = new Long(6426732259596412988L);
        term31874 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term31971 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term31972 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term32060 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term32148 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term32236 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term32324 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term31874, term31874.getClass(), "jobId", "YMmtjELJuB");
        setField(term31874, term31874.getClass(), "jobName", "FzyIShiOmb");
        setField(term31874, term31874.getClass(), "subSystem", "PEUfeJaZTk");
        setField(term31874, term31874.getClass(), "owner", "AIvyeIdskz");
        setField(term31874, term31874.getClass(), "status", "iSQqMWMRlU");
        setField(term31874, term31874.getClass(), "type", "djWEnlbOXu");
        setField(term31874, term31874.getClass(), "classs", "MvDMzQBWME");
        setField(term31874, term31874.getClass(), "retCode", "sZyAwmdGVS");
        setBooleanField(term31972, term31972.getClass(), "active", false);
        setField(term31972, term31972.getClass(), "smfid", "VoKhXiLAaW");
        setField(term31972, term31972.getClass(), "stepNumber", term31986);
        setField(term31972, term31972.getClass(), "owner", "CaalXzRXQI");
        setField(term31972, term31972.getClass(), "programName", "eRBnKPjyVg");
        setField(term31972, term31972.getClass(), "stepName", "svPqsHBvrm");
        setField(term31972, term31972.getClass(), "pathName", "sRzUJLYMmB");
        setField(term31972, term31972.getClass(), "procStepName", "XxILklSDwz");
        setField(term31972, term31972.getClass(), "completion", "TLjhFZbwKO");
        setElement(term31971, 0, term31972);
        setBooleanField(term32060, term32060.getClass(), "active", false);
        setField(term32060, term32060.getClass(), "smfid", "nxEbLIApFc");
        setField(term32060, term32060.getClass(), "stepNumber", term32074);
        setField(term32060, term32060.getClass(), "owner", "zzsdNZhejE");
        setField(term32060, term32060.getClass(), "programName", "ILoodMZrgR");
        setField(term32060, term32060.getClass(), "stepName", "XQiKmsCacK");
        setField(term32060, term32060.getClass(), "pathName", "cTCixEbHYT");
        setField(term32060, term32060.getClass(), "procStepName", "bqKksqtAdT");
        setField(term32060, term32060.getClass(), "completion", "jAIAdEmULK");
        setElement(term31971, 1, term32060);
        setBooleanField(term32148, term32148.getClass(), "active", true);
        setField(term32148, term32148.getClass(), "smfid", "EuAshkmbna");
        setField(term32148, term32148.getClass(), "stepNumber", term32162);
        setField(term32148, term32148.getClass(), "owner", "JwQlbBbGJR");
        setField(term32148, term32148.getClass(), "programName", "HdWLwfVsAM");
        setField(term32148, term32148.getClass(), "stepName", "SxeKEdHXSl");
        setField(term32148, term32148.getClass(), "pathName", "BCAlJpNjIX");
        setField(term32148, term32148.getClass(), "procStepName", "PKClfBAwUr");
        setField(term32148, term32148.getClass(), "completion", "JqbKrmVEMy");
        setElement(term31971, 2, term32148);
        setBooleanField(term32236, term32236.getClass(), "active", true);
        setField(term32236, term32236.getClass(), "smfid", "VygCEWaefB");
        setField(term32236, term32236.getClass(), "stepNumber", term32250);
        setField(term32236, term32236.getClass(), "owner", "PqhYfEyDDA");
        setField(term32236, term32236.getClass(), "programName", "fSLHLeuNoa");
        setField(term32236, term32236.getClass(), "stepName", "IwgPFurObw");
        setField(term32236, term32236.getClass(), "pathName", "WLaHlrYQyz");
        setField(term32236, term32236.getClass(), "procStepName", "CaeIUTuUFo");
        setField(term32236, term32236.getClass(), "completion", "rzoDGjHkzG");
        setElement(term31971, 3, term32236);
        setBooleanField(term32324, term32324.getClass(), "active", false);
        setField(term32324, term32324.getClass(), "smfid", "NsphHxYiuC");
        setField(term32324, term32324.getClass(), "stepNumber", term32338);
        setField(term32324, term32324.getClass(), "owner", "XYJztkznbY");
        setField(term32324, term32324.getClass(), "programName", "NeTiWVoyjZ");
        setField(term32324, term32324.getClass(), "stepName", "CGeclMyIOP");
        setField(term32324, term32324.getClass(), "pathName", "yyWOYvIBsp");
        setField(term32324, term32324.getClass(), "procStepName", "mmpgARMYFV");
        setField(term32324, term32324.getClass(), "completion", "NUqhsZprdZ");
        setElement(term31971, 4, term32324);
        setField(term31874, term31874.getClass(), "stepData", term31971);
        setField(term31874, term31874.getClass(), "url", "jkzgCqWJrA");
        setField(term31874, term31874.getClass(), "filesUrl", "rawiXxuyRn");
        setField(term31874, term31874.getClass(), "jobCorrelator", "ZyAecZGope");
        setField(term31874, term31874.getClass(), "phase", term32448);
        setField(term31874, term31874.getClass(), "phaseName", "uYnmxkwLfB");
        setField(term31874, term31874.getClass(), "execSystem", "RVZTQxYOUO");
        setField(term31874, term31874.getClass(), "execMember", "tydPpKxAbv");
        setField(term31874, term31874.getClass(), "execSubmitted", "CJxQpJUfLJ");
        setField(term31874, term31874.getClass(), "execStarted", "NUUjAyqOva");
        setField(term31874, term31874.getClass(), "execEnded", "EoAMIIUdDX");
        setField(term31874, term31874.getClass(), "reasonNotRunning", "OATNwRncsv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rACmzcmIPm";
        callMethod(klass, "owner", argTypes, term31874, args);
    }

};



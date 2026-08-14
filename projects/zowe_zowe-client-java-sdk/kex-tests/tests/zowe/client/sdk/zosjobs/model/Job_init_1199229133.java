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

public class Job_init_1199229133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6396;
     Object term6785;

    public Job_init_1199229133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6411 = new Long(-1983291584002806658L);
        Long term6499 = new Long(5946780097489996391L);
        Long term6587 = new Long(-8652538484981166496L);
        Long term6675 = new Long(2701184207686293431L);
        term6396 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 4);
        Object term6397 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term6485 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term6573 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term6661 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term6397, term6397.getClass(), "active", true);
        setField(term6397, term6397.getClass(), "smfid", "NJhGgctbdj");
        setField(term6397, term6397.getClass(), "stepNumber", term6411);
        setField(term6397, term6397.getClass(), "owner", "MYWYUeLGOp");
        setField(term6397, term6397.getClass(), "programName", "tsTGdgQYUL");
        setField(term6397, term6397.getClass(), "stepName", "TtGbVmKcnX");
        setField(term6397, term6397.getClass(), "pathName", "GJVkUrCVdD");
        setField(term6397, term6397.getClass(), "procStepName", "zNdorvdUgu");
        setField(term6397, term6397.getClass(), "completion", "oPxuZbkYio");
        setElement(term6396, 0, term6397);
        setBooleanField(term6485, term6485.getClass(), "active", true);
        setField(term6485, term6485.getClass(), "smfid", "vKitydDVnM");
        setField(term6485, term6485.getClass(), "stepNumber", term6499);
        setField(term6485, term6485.getClass(), "owner", "urCiQnUFBM");
        setField(term6485, term6485.getClass(), "programName", "EKjQdtKxAM");
        setField(term6485, term6485.getClass(), "stepName", "TXZAIPQJHt");
        setField(term6485, term6485.getClass(), "pathName", "DIbeDHICho");
        setField(term6485, term6485.getClass(), "procStepName", "dJGPlmSRnz");
        setField(term6485, term6485.getClass(), "completion", "DPskuFUobI");
        setElement(term6396, 1, term6485);
        setBooleanField(term6573, term6573.getClass(), "active", false);
        setField(term6573, term6573.getClass(), "smfid", "wBGfLpNNiZ");
        setField(term6573, term6573.getClass(), "stepNumber", term6587);
        setField(term6573, term6573.getClass(), "owner", "yUGCjlqgJE");
        setField(term6573, term6573.getClass(), "programName", "PXdVZyoJyC");
        setField(term6573, term6573.getClass(), "stepName", "vLerpqavFM");
        setField(term6573, term6573.getClass(), "pathName", "qnvxzwuGKX");
        setField(term6573, term6573.getClass(), "procStepName", "EdPAvpluZg");
        setField(term6573, term6573.getClass(), "completion", "DzHVBMqWtE");
        setElement(term6396, 2, term6573);
        setBooleanField(term6661, term6661.getClass(), "active", false);
        setField(term6661, term6661.getClass(), "smfid", "THZSpzBRYP");
        setField(term6661, term6661.getClass(), "stepNumber", term6675);
        setField(term6661, term6661.getClass(), "owner", "ZfBIVGBQOE");
        setField(term6661, term6661.getClass(), "programName", "QSrDQfEsTR");
        setField(term6661, term6661.getClass(), "stepName", "PsqusYmejD");
        setField(term6661, term6661.getClass(), "pathName", "NTWMiBEaDF");
        setField(term6661, term6661.getClass(), "procStepName", "SPBstwKFVr");
        setField(term6661, term6661.getClass(), "completion", "WxYUTuqmIq");
        setElement(term6396, 3, term6661);
        term6785 = new Long(4474998035090263139L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[20];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Array.newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"), 0).getClass();
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.Long");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.String");
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.String");
        Object[] args = new Object[20];
        args[0] = "vvoLrMGCoN";
        args[1] = "pXdglvyrQe";
        args[2] = "OcfNzHYdki";
        args[3] = "uPuCVuZYOI";
        args[4] = "TweMFhxNdj";
        args[5] = "NBrvVzvQHe";
        args[6] = "FjOiNAfBOc";
        args[7] = "iCCsaLHohG";
        args[8] = term6396;
        args[9] = "OeQLvhVERT";
        args[10] = "IlvgFINwIa";
        args[11] = "GEJABPlHSI";
        args[12] = term6785;
        args[13] = "aQFUvuaYxd";
        args[14] = "zNFLXMifnS";
        args[15] = "HHQcYMSBVc";
        args[16] = "wdoqITnaAP";
        args[17] = "rIPMBcrNqB";
        args[18] = "UDaboHZHhz";
        args[19] = "nRvKihUSPj";
        Object instance = callConstructor(klass, argTypes, args);
    }

};



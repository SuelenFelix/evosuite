package zowe.client.sdk.zosmfinfo.response;

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
import static zowe.client.sdk.zosmfinfo.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ZosmfSystemsResponse_getDefinedSystems_3105441541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6069;

    public ZosmfSystemsResponse_getDefinedSystems_3105441541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6070 = new Long(6375119433582206027L);
        term6069 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse"));
        Object[] term6072 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.DefinedSystem", 5);
        Object term6073 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term6218 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term6363 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term6508 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term6653 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term6069, term6069.getClass(), "numRows", term6070);
        setField(term6073, term6073.getClass(), "systemNickName", "GBOEuByOfr");
        setField(term6073, term6073.getClass(), "groupNames", "NHbOFFjyVK");
        setField(term6073, term6073.getClass(), "cpcSerial", "zaloBqlrSo");
        setField(term6073, term6073.getClass(), "zosVR", "vvoLrMGCoN");
        setField(term6073, term6073.getClass(), "systemName", "pXdglvyrQe");
        setField(term6073, term6073.getClass(), "jesType", "OcfNzHYdki");
        setField(term6073, term6073.getClass(), "sysplexName", "uPuCVuZYOI");
        setField(term6073, term6073.getClass(), "jesMemberName", "TweMFhxNdj");
        setField(term6073, term6073.getClass(), "httpProxyName", "NBrvVzvQHe");
        setField(term6073, term6073.getClass(), "ftpDestinationName", "FjOiNAfBOc");
        setField(term6073, term6073.getClass(), "url", "iCCsaLHohG");
        setField(term6073, term6073.getClass(), "cpcName", "NJhGgctbdj");
        setElement(term6072, 0, term6073);
        setField(term6218, term6218.getClass(), "systemNickName", "MYWYUeLGOp");
        setField(term6218, term6218.getClass(), "groupNames", "tsTGdgQYUL");
        setField(term6218, term6218.getClass(), "cpcSerial", "TtGbVmKcnX");
        setField(term6218, term6218.getClass(), "zosVR", "GJVkUrCVdD");
        setField(term6218, term6218.getClass(), "systemName", "zNdorvdUgu");
        setField(term6218, term6218.getClass(), "jesType", "oPxuZbkYio");
        setField(term6218, term6218.getClass(), "sysplexName", "vKitydDVnM");
        setField(term6218, term6218.getClass(), "jesMemberName", "urCiQnUFBM");
        setField(term6218, term6218.getClass(), "httpProxyName", "EKjQdtKxAM");
        setField(term6218, term6218.getClass(), "ftpDestinationName", "TXZAIPQJHt");
        setField(term6218, term6218.getClass(), "url", "DIbeDHICho");
        setField(term6218, term6218.getClass(), "cpcName", "dJGPlmSRnz");
        setElement(term6072, 1, term6218);
        setField(term6363, term6363.getClass(), "systemNickName", "DPskuFUobI");
        setField(term6363, term6363.getClass(), "groupNames", "wBGfLpNNiZ");
        setField(term6363, term6363.getClass(), "cpcSerial", "yUGCjlqgJE");
        setField(term6363, term6363.getClass(), "zosVR", "PXdVZyoJyC");
        setField(term6363, term6363.getClass(), "systemName", "vLerpqavFM");
        setField(term6363, term6363.getClass(), "jesType", "qnvxzwuGKX");
        setField(term6363, term6363.getClass(), "sysplexName", "EdPAvpluZg");
        setField(term6363, term6363.getClass(), "jesMemberName", "DzHVBMqWtE");
        setField(term6363, term6363.getClass(), "httpProxyName", "THZSpzBRYP");
        setField(term6363, term6363.getClass(), "ftpDestinationName", "ZfBIVGBQOE");
        setField(term6363, term6363.getClass(), "url", "QSrDQfEsTR");
        setField(term6363, term6363.getClass(), "cpcName", "PsqusYmejD");
        setElement(term6072, 2, term6363);
        setField(term6508, term6508.getClass(), "systemNickName", "NTWMiBEaDF");
        setField(term6508, term6508.getClass(), "groupNames", "SPBstwKFVr");
        setField(term6508, term6508.getClass(), "cpcSerial", "WxYUTuqmIq");
        setField(term6508, term6508.getClass(), "zosVR", "OeQLvhVERT");
        setField(term6508, term6508.getClass(), "systemName", "IlvgFINwIa");
        setField(term6508, term6508.getClass(), "jesType", "GEJABPlHSI");
        setField(term6508, term6508.getClass(), "sysplexName", "aQFUvuaYxd");
        setField(term6508, term6508.getClass(), "jesMemberName", "zNFLXMifnS");
        setField(term6508, term6508.getClass(), "httpProxyName", "HHQcYMSBVc");
        setField(term6508, term6508.getClass(), "ftpDestinationName", "wdoqITnaAP");
        setField(term6508, term6508.getClass(), "url", "rIPMBcrNqB");
        setField(term6508, term6508.getClass(), "cpcName", "UDaboHZHhz");
        setElement(term6072, 3, term6508);
        setField(term6653, term6653.getClass(), "systemNickName", "nRvKihUSPj");
        setField(term6653, term6653.getClass(), "groupNames", "BbNeQJpYPr");
        setField(term6653, term6653.getClass(), "cpcSerial", "riMtzCoxNj");
        setField(term6653, term6653.getClass(), "zosVR", "YAXkVjQZcV");
        setField(term6653, term6653.getClass(), "systemName", "pumvwBWvpy");
        setField(term6653, term6653.getClass(), "jesType", "HwLHeGLyhe");
        setField(term6653, term6653.getClass(), "sysplexName", "RDnkgWkcbz");
        setField(term6653, term6653.getClass(), "jesMemberName", "IBpaxltauX");
        setField(term6653, term6653.getClass(), "httpProxyName", "hePqROaplw");
        setField(term6653, term6653.getClass(), "ftpDestinationName", "PJcSNDruWd");
        setField(term6653, term6653.getClass(), "url", "VVNNlAePXF");
        setField(term6653, term6653.getClass(), "cpcName", "jnwVnmKAFv");
        setElement(term6072, 4, term6653);
        setField(term6069, term6069.getClass(), "definedSystems", term6072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefinedSystems", argTypes, term6069, args);
    }

};



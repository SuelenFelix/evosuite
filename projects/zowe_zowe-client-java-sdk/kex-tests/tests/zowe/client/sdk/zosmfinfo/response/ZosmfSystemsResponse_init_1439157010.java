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

public class ZosmfSystemsResponse_init_1439157010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4741;
     Object term4743;

    public ZosmfSystemsResponse_init_1439157010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4741 = new Long(2442117782898005296L);
        term4743 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.DefinedSystem", 5);
        Object term4744 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term4889 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term5034 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term5179 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term5324 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term4744, term4744.getClass(), "systemNickName", "izPpKDErnQ");
        setField(term4744, term4744.getClass(), "groupNames", "NnpwZBUTvx");
        setField(term4744, term4744.getClass(), "cpcSerial", "tlQSNgTkQX");
        setField(term4744, term4744.getClass(), "zosVR", "PCipZnmBOF");
        setField(term4744, term4744.getClass(), "systemName", "zcorEihhLK");
        setField(term4744, term4744.getClass(), "jesType", "GrqozDKFOk");
        setField(term4744, term4744.getClass(), "sysplexName", "CFyoseFGLF");
        setField(term4744, term4744.getClass(), "jesMemberName", "SFqCrhEWLm");
        setField(term4744, term4744.getClass(), "httpProxyName", "GZdcJyZntS");
        setField(term4744, term4744.getClass(), "ftpDestinationName", "OIHoJeysUi");
        setField(term4744, term4744.getClass(), "url", "WXMWFDGcLB");
        setField(term4744, term4744.getClass(), "cpcName", "wKWbJssZuG");
        setElement(term4743, 0, term4744);
        setField(term4889, term4889.getClass(), "systemNickName", "NzBMMhkhpT");
        setField(term4889, term4889.getClass(), "groupNames", "qCpEbQDHdF");
        setField(term4889, term4889.getClass(), "cpcSerial", "AHbZyFOmlo");
        setField(term4889, term4889.getClass(), "zosVR", "TwfWVQGiIj");
        setField(term4889, term4889.getClass(), "systemName", "gUvcueTURF");
        setField(term4889, term4889.getClass(), "jesType", "EwQBhZjCIT");
        setField(term4889, term4889.getClass(), "sysplexName", "aSkmSwTnEw");
        setField(term4889, term4889.getClass(), "jesMemberName", "xvkbvaEGYd");
        setField(term4889, term4889.getClass(), "httpProxyName", "HBGNxdNURv");
        setField(term4889, term4889.getClass(), "ftpDestinationName", "mfCpTPPQQm");
        setField(term4889, term4889.getClass(), "url", "OcJCIDNIXA");
        setField(term4889, term4889.getClass(), "cpcName", "XfRABIFVEp");
        setElement(term4743, 1, term4889);
        setField(term5034, term5034.getClass(), "systemNickName", "MHGKyEnwKc");
        setField(term5034, term5034.getClass(), "groupNames", "ShIELyuULw");
        setField(term5034, term5034.getClass(), "cpcSerial", "IpQuOGMgmj");
        setField(term5034, term5034.getClass(), "zosVR", "pJbnHTYrxn");
        setField(term5034, term5034.getClass(), "systemName", "iIRsCSYqXH");
        setField(term5034, term5034.getClass(), "jesType", "nghfqDXyCG");
        setField(term5034, term5034.getClass(), "sysplexName", "WBAOTqErtm");
        setField(term5034, term5034.getClass(), "jesMemberName", "PqtVXXZMqK");
        setField(term5034, term5034.getClass(), "httpProxyName", "rYbtIDVdnd");
        setField(term5034, term5034.getClass(), "ftpDestinationName", "UKAReurpHG");
        setField(term5034, term5034.getClass(), "url", "WVRMUmrljA");
        setField(term5034, term5034.getClass(), "cpcName", "NTlKJDDWlk");
        setElement(term4743, 2, term5034);
        setField(term5179, term5179.getClass(), "systemNickName", "vOuMEpOQAg");
        setField(term5179, term5179.getClass(), "groupNames", "SIODFGaQhr");
        setField(term5179, term5179.getClass(), "cpcSerial", "qYzsiuXOgS");
        setField(term5179, term5179.getClass(), "zosVR", "bxrCBbrrct");
        setField(term5179, term5179.getClass(), "systemName", "CKWpJaaaxX");
        setField(term5179, term5179.getClass(), "jesType", "UBRmXJmfrt");
        setField(term5179, term5179.getClass(), "sysplexName", "WZzvmIHhzZ");
        setField(term5179, term5179.getClass(), "jesMemberName", "doQLHkjpNm");
        setField(term5179, term5179.getClass(), "httpProxyName", "lCyLIcSuom");
        setField(term5179, term5179.getClass(), "ftpDestinationName", "CGOpQSZZwI");
        setField(term5179, term5179.getClass(), "url", "ypEdrstygY");
        setField(term5179, term5179.getClass(), "cpcName", "sNQFlATEeQ");
        setElement(term4743, 3, term5179);
        setField(term5324, term5324.getClass(), "systemNickName", "ZKMLioamsY");
        setField(term5324, term5324.getClass(), "groupNames", "WVbxuoDBcn");
        setField(term5324, term5324.getClass(), "cpcSerial", "pvDEABOxLt");
        setField(term5324, term5324.getClass(), "zosVR", "beAMpkroCQ");
        setField(term5324, term5324.getClass(), "systemName", "uSUvKAyuvd");
        setField(term5324, term5324.getClass(), "jesType", "onQLVONGuf");
        setField(term5324, term5324.getClass(), "sysplexName", "SOrEHbcbmn");
        setField(term5324, term5324.getClass(), "jesMemberName", "bnsyeQXFdu");
        setField(term5324, term5324.getClass(), "httpProxyName", "BwtdjiefJn");
        setField(term5324, term5324.getClass(), "ftpDestinationName", "jDmhBrIoDa");
        setField(term5324, term5324.getClass(), "url", "SPtPatHeOm");
        setField(term5324, term5324.getClass(), "cpcName", "ywmcuThdfL");
        setElement(term4743, 4, term5324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Array.newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4741;
        args[1] = term4743;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



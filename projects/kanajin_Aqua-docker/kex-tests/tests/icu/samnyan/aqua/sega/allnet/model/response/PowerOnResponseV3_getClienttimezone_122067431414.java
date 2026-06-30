package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV3_getClienttimezone_122067431414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5265;

    public PowerOnResponseV3_getClienttimezone_122067431414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5265 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term5265, term5265.getClass(), "stat", 1585847225);
        setField(term5265, term5265.getClass(), "uri", "IpQuOGMgmj");
        setField(term5265, term5265.getClass(), "host", "pJbnHTYrxn");
        setField(term5265, term5265.getClass(), "place_id", "iIRsCSYqXH");
        setField(term5265, term5265.getClass(), "name", "nghfqDXyCG");
        setField(term5265, term5265.getClass(), "nickname", "WBAOTqErtm");
        setField(term5265, term5265.getClass(), "region0", "PqtVXXZMqK");
        setField(term5265, term5265.getClass(), "region_name0", "rYbtIDVdnd");
        setField(term5265, term5265.getClass(), "region_name1", "UKAReurpHG");
        setField(term5265, term5265.getClass(), "region_name2", "WVRMUmrljA");
        setField(term5265, term5265.getClass(), "region_name3", "NTlKJDDWlk");
        setField(term5265, term5265.getClass(), "country", "vOuMEpOQAg");
        setField(term5265, term5265.getClass(), "allnet_id", "SIODFGaQhr");
        setField(term5265, term5265.getClass(), "client_timezone", "qYzsiuXOgS");
        setField(term5265, term5265.getClass(), "utc_time", "bxrCBbrrct");
        setField(term5265, term5265.getClass(), "setting", "CKWpJaaaxX");
        setField(term5265, term5265.getClass(), "res_ver", "UBRmXJmfrt");
        setField(term5265, term5265.getClass(), "token", "WZzvmIHhzZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClient_timezone", argTypes, term5265, args);
    }

};



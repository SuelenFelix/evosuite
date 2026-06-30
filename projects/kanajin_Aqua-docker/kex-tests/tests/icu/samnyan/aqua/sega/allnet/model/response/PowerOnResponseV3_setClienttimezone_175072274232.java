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

public class PowerOnResponseV3_setClienttimezone_175072274232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12299;

    public PowerOnResponseV3_setClienttimezone_175072274232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12299 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term12299, term12299.getClass(), "stat", -226514366);
        setField(term12299, term12299.getClass(), "uri", "lbmSGBwIiV");
        setField(term12299, term12299.getClass(), "host", "DAxyHoTLzZ");
        setField(term12299, term12299.getClass(), "place_id", "fhZgTouhCC");
        setField(term12299, term12299.getClass(), "name", "wrikqJwXvL");
        setField(term12299, term12299.getClass(), "nickname", "UiWhvbypdr");
        setField(term12299, term12299.getClass(), "region0", "CgleElJNje");
        setField(term12299, term12299.getClass(), "region_name0", "ZrchvNGMtd");
        setField(term12299, term12299.getClass(), "region_name1", "WaEcyVlcIx");
        setField(term12299, term12299.getClass(), "region_name2", "ONcbPCQnHd");
        setField(term12299, term12299.getClass(), "region_name3", "AobDaplFLl");
        setField(term12299, term12299.getClass(), "country", "pDkMNnAGgv");
        setField(term12299, term12299.getClass(), "allnet_id", "PaCpFXGzdX");
        setField(term12299, term12299.getClass(), "client_timezone", "FftYCNbnks");
        setField(term12299, term12299.getClass(), "utc_time", "lJoltmsadS");
        setField(term12299, term12299.getClass(), "setting", "mvfDtZNEHr");
        setField(term12299, term12299.getClass(), "res_ver", "bvSgmFUDOU");
        setField(term12299, term12299.getClass(), "token", "XMHwbfiHRl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bucTnYicnp";
        callMethod(klass, "setClient_timezone", argTypes, term12299, args);
    }

};



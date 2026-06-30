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

public class PowerOnResponseV3_getRegion0_760332557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2633;

    public PowerOnResponseV3_getRegion0_760332557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2633 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term2633, term2633.getClass(), "stat", -2038273078);
        setField(term2633, term2633.getClass(), "uri", "mXGCWJDOqA");
        setField(term2633, term2633.getClass(), "host", "dpNsDgfPso");
        setField(term2633, term2633.getClass(), "place_id", "hCWPJQKpdc");
        setField(term2633, term2633.getClass(), "name", "WzMEhMXkKx");
        setField(term2633, term2633.getClass(), "nickname", "XOiDvlDhdc");
        setField(term2633, term2633.getClass(), "region0", "AdxvLJhNLe");
        setField(term2633, term2633.getClass(), "region_name0", "lHfTrWKMPk");
        setField(term2633, term2633.getClass(), "region_name1", "JDaAnsVTGV");
        setField(term2633, term2633.getClass(), "region_name2", "mLUZFTfjle");
        setField(term2633, term2633.getClass(), "region_name3", "xIeFjkHkOe");
        setField(term2633, term2633.getClass(), "country", "SdCKLMIYnX");
        setField(term2633, term2633.getClass(), "allnet_id", "OJJtVNPyKZ");
        setField(term2633, term2633.getClass(), "client_timezone", "AKNapTAfmD");
        setField(term2633, term2633.getClass(), "utc_time", "xJgPlLxpgC");
        setField(term2633, term2633.getClass(), "setting", "EYtfuJaxiM");
        setField(term2633, term2633.getClass(), "res_ver", "gCWtLVKVVe");
        setField(term2633, term2633.getClass(), "token", "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion0", argTypes, term2633, args);
    }

};



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

public class PowerOnResponseV3_getRegionname2_139894810110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3761;

    public PowerOnResponseV3_getRegionname2_139894810110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3761 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term3761, term3761.getClass(), "stat", 1725571209);
        setField(term3761, term3761.getClass(), "uri", "sQvGcVjdEx");
        setField(term3761, term3761.getClass(), "host", "rLHAoqXgPh");
        setField(term3761, term3761.getClass(), "place_id", "zUlRdimJtU");
        setField(term3761, term3761.getClass(), "name", "vwbEQQNQrx");
        setField(term3761, term3761.getClass(), "nickname", "xtftXXMbem");
        setField(term3761, term3761.getClass(), "region0", "cudZvLMQon");
        setField(term3761, term3761.getClass(), "region_name0", "lihXWlGDxk");
        setField(term3761, term3761.getClass(), "region_name1", "JmcmxoGhIK");
        setField(term3761, term3761.getClass(), "region_name2", "jXzmYyrnnT");
        setField(term3761, term3761.getClass(), "region_name3", "igCAtimmYB");
        setField(term3761, term3761.getClass(), "country", "DyiXbeYIaN");
        setField(term3761, term3761.getClass(), "allnet_id", "VGizxZnyHX");
        setField(term3761, term3761.getClass(), "client_timezone", "kVEZMHmRtR");
        setField(term3761, term3761.getClass(), "utc_time", "ekxGuOYIwi");
        setField(term3761, term3761.getClass(), "setting", "RbVQXSpxXy");
        setField(term3761, term3761.getClass(), "res_ver", "YpJbIgJWWv");
        setField(term3761, term3761.getClass(), "token", "JppkknKVOw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name2", argTypes, term3761, args);
    }

};



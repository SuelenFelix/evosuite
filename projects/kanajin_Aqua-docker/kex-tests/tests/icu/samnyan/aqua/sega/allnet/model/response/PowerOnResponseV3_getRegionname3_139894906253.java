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

public class PowerOnResponseV3_getRegionname3_139894906253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15817;

    public PowerOnResponseV3_getRegionname3_139894906253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15817 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term15817, term15817.getClass(), "stat", 0);
        setField(term15817, term15817.getClass(), "uri", null);
        setField(term15817, term15817.getClass(), "host", null);
        setField(term15817, term15817.getClass(), "place_id", null);
        setField(term15817, term15817.getClass(), "name", null);
        setField(term15817, term15817.getClass(), "nickname", null);
        setField(term15817, term15817.getClass(), "region0", null);
        setField(term15817, term15817.getClass(), "region_name0", null);
        setField(term15817, term15817.getClass(), "region_name1", null);
        setField(term15817, term15817.getClass(), "region_name2", null);
        setField(term15817, term15817.getClass(), "region_name3", null);
        setField(term15817, term15817.getClass(), "country", null);
        setField(term15817, term15817.getClass(), "allnet_id", null);
        setField(term15817, term15817.getClass(), "client_timezone", null);
        setField(term15817, term15817.getClass(), "utc_time", null);
        setField(term15817, term15817.getClass(), "setting", null);
        setField(term15817, term15817.getClass(), "res_ver", null);
        setField(term15817, term15817.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name3", argTypes, term15817, args);
    }

};



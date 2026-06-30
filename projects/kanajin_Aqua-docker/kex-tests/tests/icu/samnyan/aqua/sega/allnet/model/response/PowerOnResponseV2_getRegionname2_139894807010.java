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

public class PowerOnResponseV2_getRegionname2_139894807010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19039;

    public PowerOnResponseV2_getRegionname2_139894807010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19039 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term19039, term19039.getClass(), "stat", -1801760683);
        setField(term19039, term19039.getClass(), "uri", "FLQJOzEXff");
        setField(term19039, term19039.getClass(), "host", "qlaIVJBSfQ");
        setField(term19039, term19039.getClass(), "place_id", "lYvIWBFFsq");
        setField(term19039, term19039.getClass(), "name", "tThwsqWKcE");
        setField(term19039, term19039.getClass(), "nickname", "bkSgsDrkCN");
        setField(term19039, term19039.getClass(), "region0", "hwjlcimgJH");
        setField(term19039, term19039.getClass(), "region_name0", "TLxQzxvizR");
        setField(term19039, term19039.getClass(), "region_name1", "uUgJfKAzDM");
        setField(term19039, term19039.getClass(), "region_name2", "gZPZNkweEp");
        setField(term19039, term19039.getClass(), "region_name3", "vfennwtmqe");
        setField(term19039, term19039.getClass(), "country", "zZxoNkohbw");
        setIntField(term19039, term19039.getClass(), "year", 1141317871);
        setIntField(term19039, term19039.getClass(), "month", 890669485);
        setIntField(term19039, term19039.getClass(), "day", 691577392);
        setIntField(term19039, term19039.getClass(), "hour", -893623680);
        setIntField(term19039, term19039.getClass(), "minute", -1963434938);
        setIntField(term19039, term19039.getClass(), "second", 906181092);
        setField(term19039, term19039.getClass(), "setting", "DQrjPcLysX");
        setField(term19039, term19039.getClass(), "timezone", "VWPFyrpmmb");
        setField(term19039, term19039.getClass(), "res_class", "gYYKrIeThw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name2", argTypes, term19039, args);
    }

};



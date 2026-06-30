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

public class PowerOnResponseV3_setRegionname1_190167933227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10309;

    public PowerOnResponseV3_setRegionname1_190167933227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10309 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term10309, term10309.getClass(), "stat", -1275173084);
        setField(term10309, term10309.getClass(), "uri", "fIZsWucfXz");
        setField(term10309, term10309.getClass(), "host", "IApvtmfhnq");
        setField(term10309, term10309.getClass(), "place_id", "VSaNnhMpRc");
        setField(term10309, term10309.getClass(), "name", "QNjNTLlUaV");
        setField(term10309, term10309.getClass(), "nickname", "hIYsRyOZxk");
        setField(term10309, term10309.getClass(), "region0", "RjNoEywJbC");
        setField(term10309, term10309.getClass(), "region_name0", "RTTvrwwhou");
        setField(term10309, term10309.getClass(), "region_name1", "lRORwXipuk");
        setField(term10309, term10309.getClass(), "region_name2", "fVdTcjgHdw");
        setField(term10309, term10309.getClass(), "region_name3", "wwAwLLcLPp");
        setField(term10309, term10309.getClass(), "country", "nHpMKOmlpQ");
        setField(term10309, term10309.getClass(), "allnet_id", "fKhrQsJToZ");
        setField(term10309, term10309.getClass(), "client_timezone", "wsysQLGFnl");
        setField(term10309, term10309.getClass(), "utc_time", "ckQLZGFjMX");
        setField(term10309, term10309.getClass(), "setting", "qphdrqUtNx");
        setField(term10309, term10309.getClass(), "res_ver", "bwlLFAfNWx");
        setField(term10309, term10309.getClass(), "token", "JWodNQzjjV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CAgxWjhxNf";
        callMethod(klass, "setRegion_name1", argTypes, term10309, args);
    }

};



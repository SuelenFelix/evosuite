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

public class PowerOnResponseV3_setSetting_56207690934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13095;

    public PowerOnResponseV3_setSetting_56207690934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13095 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term13095, term13095.getClass(), "stat", -1087774327);
        setField(term13095, term13095.getClass(), "uri", "gKMNrpKBpu");
        setField(term13095, term13095.getClass(), "host", "ZbHJVEqcoa");
        setField(term13095, term13095.getClass(), "place_id", "awDQVEVIKi");
        setField(term13095, term13095.getClass(), "name", "HJwNgUzZZR");
        setField(term13095, term13095.getClass(), "nickname", "FvUCZgTXhq");
        setField(term13095, term13095.getClass(), "region0", "wWWidPCHzx");
        setField(term13095, term13095.getClass(), "region_name0", "OwPIiBRuKK");
        setField(term13095, term13095.getClass(), "region_name1", "sgfGySMODT");
        setField(term13095, term13095.getClass(), "region_name2", "ndAITnOsny");
        setField(term13095, term13095.getClass(), "region_name3", "CVZnTiJucs");
        setField(term13095, term13095.getClass(), "country", "ecHEQufXoq");
        setField(term13095, term13095.getClass(), "allnet_id", "btBLMvHzJg");
        setField(term13095, term13095.getClass(), "client_timezone", "JdOMfNWgLP");
        setField(term13095, term13095.getClass(), "utc_time", "uWqXrwAsDU");
        setField(term13095, term13095.getClass(), "setting", "hgFbWAUtsu");
        setField(term13095, term13095.getClass(), "res_ver", "HqoTWlkbwF");
        setField(term13095, term13095.getClass(), "token", "CwNELDTAPP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GSzQdbHLHw";
        callMethod(klass, "setSetting", argTypes, term13095, args);
    }

};



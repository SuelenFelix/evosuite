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
import java.lang.Integer;

public class PowerOnResponseV3_setStat_176003392619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7145;
     Object term7351;

    public PowerOnResponseV3_setStat_176003392619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7145 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term7145, term7145.getClass(), "stat", 1048535127);
        setField(term7145, term7145.getClass(), "uri", "YAXkVjQZcV");
        setField(term7145, term7145.getClass(), "host", "pumvwBWvpy");
        setField(term7145, term7145.getClass(), "place_id", "HwLHeGLyhe");
        setField(term7145, term7145.getClass(), "name", "RDnkgWkcbz");
        setField(term7145, term7145.getClass(), "nickname", "IBpaxltauX");
        setField(term7145, term7145.getClass(), "region0", "hePqROaplw");
        setField(term7145, term7145.getClass(), "region_name0", "PJcSNDruWd");
        setField(term7145, term7145.getClass(), "region_name1", "VVNNlAePXF");
        setField(term7145, term7145.getClass(), "region_name2", "jnwVnmKAFv");
        setField(term7145, term7145.getClass(), "region_name3", "TXyHhqeCjR");
        setField(term7145, term7145.getClass(), "country", "lZIgPZPgTu");
        setField(term7145, term7145.getClass(), "allnet_id", "iuCxnHGMoW");
        setField(term7145, term7145.getClass(), "client_timezone", "GPSEWEDSTo");
        setField(term7145, term7145.getClass(), "utc_time", "RCOqfVsRHt");
        setField(term7145, term7145.getClass(), "setting", "TSyCeEZPaT");
        setField(term7145, term7145.getClass(), "res_ver", "JeZFtaqkzW");
        setField(term7145, term7145.getClass(), "token", "vOVuNSCCLe");
        term7351 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7351;
        callMethod(klass, "setStat", argTypes, term7145, args);
    }

};



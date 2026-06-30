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

public class PowerOnResponseV3_setResver_89256374535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13493;

    public PowerOnResponseV3_setResver_89256374535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13493 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term13493, term13493.getClass(), "stat", -1530420153);
        setField(term13493, term13493.getClass(), "uri", "IkfarsYNJO");
        setField(term13493, term13493.getClass(), "host", "aZKOWhHMEh");
        setField(term13493, term13493.getClass(), "place_id", "YfkhviKZwl");
        setField(term13493, term13493.getClass(), "name", "DcOhhAfJTI");
        setField(term13493, term13493.getClass(), "nickname", "gYTIkBFOoS");
        setField(term13493, term13493.getClass(), "region0", "xmzSoVgiED");
        setField(term13493, term13493.getClass(), "region_name0", "pdSvedKgPq");
        setField(term13493, term13493.getClass(), "region_name1", "epPTwvcoyb");
        setField(term13493, term13493.getClass(), "region_name2", "UBPHmOICBs");
        setField(term13493, term13493.getClass(), "region_name3", "IDJUVPgUJf");
        setField(term13493, term13493.getClass(), "country", "JmnWRJUxGr");
        setField(term13493, term13493.getClass(), "allnet_id", "wgRGBNrTGP");
        setField(term13493, term13493.getClass(), "client_timezone", "FIdNVptZpW");
        setField(term13493, term13493.getClass(), "utc_time", "rQjxAhisjm");
        setField(term13493, term13493.getClass(), "setting", "ZDhASPHjDG");
        setField(term13493, term13493.getClass(), "res_ver", "HNVOAXYNEZ");
        setField(term13493, term13493.getClass(), "token", "gbbYBYyfvr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SrWMUlbtWV";
        callMethod(klass, "setRes_ver", argTypes, term13493, args);
    }

};



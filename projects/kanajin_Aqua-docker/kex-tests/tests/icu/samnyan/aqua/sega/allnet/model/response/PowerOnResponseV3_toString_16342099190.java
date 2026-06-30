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

public class PowerOnResponseV3_toString_16342099190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PowerOnResponseV3_toString_16342099190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term1, term1.getClass(), "stat", 568599855);
        setField(term1, term1.getClass(), "uri", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "host", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "place_id", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "name", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "nickname", "jJCZpVmanW");
        setField(term1, term1.getClass(), "region0", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "region_name0", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "region_name1", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "region_name2", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "region_name3", "RMFIsYGgne");
        setField(term1, term1.getClass(), "country", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "allnet_id", "uuaPigETmJ");
        setField(term1, term1.getClass(), "client_timezone", "MxlszYVzRf");
        setField(term1, term1.getClass(), "utc_time", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "setting", "oVcInYnLWB");
        setField(term1, term1.getClass(), "res_ver", "aJlieCFVtF");
        setField(term1, term1.getClass(), "token", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1, args);
    }

};



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

public class PowerOnResponseV3_equals_170131101237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14289;
     Object term14495;

    public PowerOnResponseV3_equals_170131101237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14289 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term14289, term14289.getClass(), "stat", -1145578966);
        setField(term14289, term14289.getClass(), "uri", "GTmoNrziyc");
        setField(term14289, term14289.getClass(), "host", "LvztehSlhM");
        setField(term14289, term14289.getClass(), "place_id", "njvnWFTMxN");
        setField(term14289, term14289.getClass(), "name", "fLRqcTSfzF");
        setField(term14289, term14289.getClass(), "nickname", "EBYHwsuWAU");
        setField(term14289, term14289.getClass(), "region0", "PtIjKpiSix");
        setField(term14289, term14289.getClass(), "region_name0", "NZdTuwSCIM");
        setField(term14289, term14289.getClass(), "region_name1", "dDHcmzPAmP");
        setField(term14289, term14289.getClass(), "region_name2", "HEaTkWYBgv");
        setField(term14289, term14289.getClass(), "region_name3", "MpJsPKLTIU");
        setField(term14289, term14289.getClass(), "country", "IiNCZfdouL");
        setField(term14289, term14289.getClass(), "allnet_id", "AhOHzCsHKW");
        setField(term14289, term14289.getClass(), "client_timezone", "UqgLPaaAHi");
        setField(term14289, term14289.getClass(), "utc_time", "xypryEkUPF");
        setField(term14289, term14289.getClass(), "setting", "zyZTzHNjQr");
        setField(term14289, term14289.getClass(), "res_ver", "YSrFKQQwXE");
        setField(term14289, term14289.getClass(), "token", "qxhOsmyyjm");
        term14495 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14495;
        callMethod(klass, "equals", argTypes, term14289, args);
    }

};



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

public class PowerOnResponseV3_getUri_18266464732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term753;

    public PowerOnResponseV3_getUri_18266464732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term753 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term753, term753.getClass(), "stat", 1484323161);
        setField(term753, term753.getClass(), "uri", "kuTXqwMtDB");
        setField(term753, term753.getClass(), "host", "Ghbwtircqb");
        setField(term753, term753.getClass(), "place_id", "xrwlQZdwCp");
        setField(term753, term753.getClass(), "name", "IDCWpPLRkE");
        setField(term753, term753.getClass(), "nickname", "nyiiPDVjAc");
        setField(term753, term753.getClass(), "region0", "aKnKipADSo");
        setField(term753, term753.getClass(), "region_name0", "wSQxaModmm");
        setField(term753, term753.getClass(), "region_name1", "UlajhuVLaP");
        setField(term753, term753.getClass(), "region_name2", "gGSMzuGICf");
        setField(term753, term753.getClass(), "region_name3", "hxCBltsObl");
        setField(term753, term753.getClass(), "country", "BndsHwAFMv");
        setField(term753, term753.getClass(), "allnet_id", "GzFkzHGYFt");
        setField(term753, term753.getClass(), "client_timezone", "tShwQLRGNe");
        setField(term753, term753.getClass(), "utc_time", "LvtrsXUliU");
        setField(term753, term753.getClass(), "setting", "xLbjWUgOIL");
        setField(term753, term753.getClass(), "res_ver", "jDtqGUpnZN");
        setField(term753, term753.getClass(), "token", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUri", argTypes, term753, args);
    }

};



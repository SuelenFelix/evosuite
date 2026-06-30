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

public class PowerOnResponseV3_setUtctime_17905218333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12697;

    public PowerOnResponseV3_setUtctime_17905218333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12697 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term12697, term12697.getClass(), "stat", 1193880199);
        setField(term12697, term12697.getClass(), "uri", "EkgprvqZlM");
        setField(term12697, term12697.getClass(), "host", "fbnKvthhOz");
        setField(term12697, term12697.getClass(), "place_id", "PGfCDJTBek");
        setField(term12697, term12697.getClass(), "name", "ZwjARhAtHC");
        setField(term12697, term12697.getClass(), "nickname", "XXvscsYBWv");
        setField(term12697, term12697.getClass(), "region0", "uePedtiAfL");
        setField(term12697, term12697.getClass(), "region_name0", "AdSHvysxQB");
        setField(term12697, term12697.getClass(), "region_name1", "jlraKkBWFA");
        setField(term12697, term12697.getClass(), "region_name2", "mRBtFTxVdE");
        setField(term12697, term12697.getClass(), "region_name3", "IVacFDAZcj");
        setField(term12697, term12697.getClass(), "country", "EEYmuwyVDP");
        setField(term12697, term12697.getClass(), "allnet_id", "EWFbEDAVrE");
        setField(term12697, term12697.getClass(), "client_timezone", "EMiMtYgfvr");
        setField(term12697, term12697.getClass(), "utc_time", "OyYyYYnJuF");
        setField(term12697, term12697.getClass(), "setting", "aYLvcxZohT");
        setField(term12697, term12697.getClass(), "res_ver", "mnHyQbMyld");
        setField(term12697, term12697.getClass(), "token", "KHtaDOIcJZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vgdwrCZczl";
        callMethod(klass, "setUtc_time", argTypes, term12697, args);
    }

};



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

public class PowerOnResponseV3_getRegionname3_139894906211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4137;

    public PowerOnResponseV3_getRegionname3_139894906211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4137 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term4137, term4137.getClass(), "stat", -522618178);
        setField(term4137, term4137.getClass(), "uri", "iljANwuEjk");
        setField(term4137, term4137.getClass(), "host", "kNqaJKIATy");
        setField(term4137, term4137.getClass(), "place_id", "vKQukfbJUd");
        setField(term4137, term4137.getClass(), "name", "lFRJFUMVbx");
        setField(term4137, term4137.getClass(), "nickname", "sZdUNdggUW");
        setField(term4137, term4137.getClass(), "region0", "OqbwYQfvAe");
        setField(term4137, term4137.getClass(), "region_name0", "tRxZafjqIx");
        setField(term4137, term4137.getClass(), "region_name1", "DhjNLmRMCu");
        setField(term4137, term4137.getClass(), "region_name2", "PgPzMSEjjX");
        setField(term4137, term4137.getClass(), "region_name3", "wzsPSPcRdj");
        setField(term4137, term4137.getClass(), "country", "kGMQdqJYyB");
        setField(term4137, term4137.getClass(), "allnet_id", "XJJNClzHRf");
        setField(term4137, term4137.getClass(), "client_timezone", "HDaezxQfQR");
        setField(term4137, term4137.getClass(), "utc_time", "iikZEapDlu");
        setField(term4137, term4137.getClass(), "setting", "nhoHrZfnIN");
        setField(term4137, term4137.getClass(), "res_ver", "ZkMALXpEAZ");
        setField(term4137, term4137.getClass(), "token", "tXfQjSqDzN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name3", argTypes, term4137, args);
    }

};



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

public class PowerOnResponseV3_getPlaceid_7047742444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1505;

    public PowerOnResponseV3_getPlaceid_7047742444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1505 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term1505, term1505.getClass(), "stat", -1922583790);
        setField(term1505, term1505.getClass(), "uri", "tPlsykYBqO");
        setField(term1505, term1505.getClass(), "host", "bLPjGVBhlX");
        setField(term1505, term1505.getClass(), "place_id", "whBvTVIIlC");
        setField(term1505, term1505.getClass(), "name", "IgRJUzaCwW");
        setField(term1505, term1505.getClass(), "nickname", "JUmudUmaaV");
        setField(term1505, term1505.getClass(), "region0", "KoyGrUJeJW");
        setField(term1505, term1505.getClass(), "region_name0", "HqBOwkVqjD");
        setField(term1505, term1505.getClass(), "region_name1", "MAcUBcBckh");
        setField(term1505, term1505.getClass(), "region_name2", "oVgzLbrsFr");
        setField(term1505, term1505.getClass(), "region_name3", "vQVyKLdtaz");
        setField(term1505, term1505.getClass(), "country", "OWKQODBLzb");
        setField(term1505, term1505.getClass(), "allnet_id", "wGmYcqUkgE");
        setField(term1505, term1505.getClass(), "client_timezone", "idgaQsnJpQ");
        setField(term1505, term1505.getClass(), "utc_time", "VgZnGoIFwQ");
        setField(term1505, term1505.getClass(), "setting", "jUbSRrkrYZ");
        setField(term1505, term1505.getClass(), "res_ver", "bWWfajKbEX");
        setField(term1505, term1505.getClass(), "token", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlace_id", argTypes, term1505, args);
    }

};



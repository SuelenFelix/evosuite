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

public class PowerOnResponseV3_getRegionname1_13989471409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3385;

    public PowerOnResponseV3_getRegionname1_13989471409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3385 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term3385, term3385.getClass(), "stat", -1339778481);
        setField(term3385, term3385.getClass(), "uri", "VYkqXKVlAJ");
        setField(term3385, term3385.getClass(), "host", "XkIoWJRNwN");
        setField(term3385, term3385.getClass(), "place_id", "aNWLJdrZMq");
        setField(term3385, term3385.getClass(), "name", "HHmNoYxIGj");
        setField(term3385, term3385.getClass(), "nickname", "PtirvZmsGt");
        setField(term3385, term3385.getClass(), "region0", "HWkpTmtlrc");
        setField(term3385, term3385.getClass(), "region_name0", "hMmaoREuCK");
        setField(term3385, term3385.getClass(), "region_name1", "VeDtgDzGAN");
        setField(term3385, term3385.getClass(), "region_name2", "aWYOWZFyaX");
        setField(term3385, term3385.getClass(), "region_name3", "BRIVNtfUWU");
        setField(term3385, term3385.getClass(), "country", "DbiCVtPPCT");
        setField(term3385, term3385.getClass(), "allnet_id", "WzFopsaDuG");
        setField(term3385, term3385.getClass(), "client_timezone", "PapWxkhEWe");
        setField(term3385, term3385.getClass(), "utc_time", "smnHEqRFRx");
        setField(term3385, term3385.getClass(), "setting", "XYtryyobou");
        setField(term3385, term3385.getClass(), "res_ver", "OYbzXylRWW");
        setField(term3385, term3385.getClass(), "token", "DSNsTGYXDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name1", argTypes, term3385, args);
    }

};



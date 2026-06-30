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

public class PowerOnResponseV3_setRegionname3_190167741029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11105;

    public PowerOnResponseV3_setRegionname3_190167741029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11105 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term11105, term11105.getClass(), "stat", -203030934);
        setField(term11105, term11105.getClass(), "uri", "DAujxZPHJC");
        setField(term11105, term11105.getClass(), "host", "IlBhdrCvHq");
        setField(term11105, term11105.getClass(), "place_id", "OirVUQhauU");
        setField(term11105, term11105.getClass(), "name", "GLbyDfbNZI");
        setField(term11105, term11105.getClass(), "nickname", "oNLcCYDAsO");
        setField(term11105, term11105.getClass(), "region0", "CNqMxLvtcJ");
        setField(term11105, term11105.getClass(), "region_name0", "ktbqerIaKW");
        setField(term11105, term11105.getClass(), "region_name1", "VoghngXfsK");
        setField(term11105, term11105.getClass(), "region_name2", "GbahCBMvct");
        setField(term11105, term11105.getClass(), "region_name3", "iiHBhsNFgk");
        setField(term11105, term11105.getClass(), "country", "HknsTajwxJ");
        setField(term11105, term11105.getClass(), "allnet_id", "XtiurrVYKw");
        setField(term11105, term11105.getClass(), "client_timezone", "rsumfoDNHa");
        setField(term11105, term11105.getClass(), "utc_time", "ceCWHUTQUM");
        setField(term11105, term11105.getClass(), "setting", "LrqwfrKKtS");
        setField(term11105, term11105.getClass(), "res_ver", "ZUdnQXfzCI");
        setField(term11105, term11105.getClass(), "token", "EULDrUNQvw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BtvAvsJSei";
        callMethod(klass, "setRegion_name3", argTypes, term11105, args);
    }

};



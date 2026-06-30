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

public class PowerOnResponseV3_getResver_170404476917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6393;

    public PowerOnResponseV3_getResver_170404476917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6393 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term6393, term6393.getClass(), "stat", -1456670397);
        setField(term6393, term6393.getClass(), "uri", "oPxuZbkYio");
        setField(term6393, term6393.getClass(), "host", "vKitydDVnM");
        setField(term6393, term6393.getClass(), "place_id", "urCiQnUFBM");
        setField(term6393, term6393.getClass(), "name", "EKjQdtKxAM");
        setField(term6393, term6393.getClass(), "nickname", "TXZAIPQJHt");
        setField(term6393, term6393.getClass(), "region0", "DIbeDHICho");
        setField(term6393, term6393.getClass(), "region_name0", "dJGPlmSRnz");
        setField(term6393, term6393.getClass(), "region_name1", "DPskuFUobI");
        setField(term6393, term6393.getClass(), "region_name2", "wBGfLpNNiZ");
        setField(term6393, term6393.getClass(), "region_name3", "yUGCjlqgJE");
        setField(term6393, term6393.getClass(), "country", "PXdVZyoJyC");
        setField(term6393, term6393.getClass(), "allnet_id", "vLerpqavFM");
        setField(term6393, term6393.getClass(), "client_timezone", "qnvxzwuGKX");
        setField(term6393, term6393.getClass(), "utc_time", "EdPAvpluZg");
        setField(term6393, term6393.getClass(), "setting", "DzHVBMqWtE");
        setField(term6393, term6393.getClass(), "res_ver", "THZSpzBRYP");
        setField(term6393, term6393.getClass(), "token", "ZfBIVGBQOE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRes_ver", argTypes, term6393, args);
    }

};



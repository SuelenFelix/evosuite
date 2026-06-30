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

public class PowerOnResponseV2_getCountry_120231637212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19671;

    public PowerOnResponseV2_getCountry_120231637212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19671 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term19671, term19671.getClass(), "stat", -375014958);
        setField(term19671, term19671.getClass(), "uri", "uuSYOUCVHU");
        setField(term19671, term19671.getClass(), "host", "DfWwbodtVw");
        setField(term19671, term19671.getClass(), "place_id", "kTbFMpVWqx");
        setField(term19671, term19671.getClass(), "name", "HegRNsidFg");
        setField(term19671, term19671.getClass(), "nickname", "udRdJkgXmH");
        setField(term19671, term19671.getClass(), "region0", "FBCXbjHVXO");
        setField(term19671, term19671.getClass(), "region_name0", "dIWAnvmLiC");
        setField(term19671, term19671.getClass(), "region_name1", "CuWebzZQjZ");
        setField(term19671, term19671.getClass(), "region_name2", "wRVaaJxKYI");
        setField(term19671, term19671.getClass(), "region_name3", "yOQuJXRvOo");
        setField(term19671, term19671.getClass(), "country", "XmLHcnVsch");
        setIntField(term19671, term19671.getClass(), "year", 1107176718);
        setIntField(term19671, term19671.getClass(), "month", 480137250);
        setIntField(term19671, term19671.getClass(), "day", -341152642);
        setIntField(term19671, term19671.getClass(), "hour", -2015854073);
        setIntField(term19671, term19671.getClass(), "minute", 538259104);
        setIntField(term19671, term19671.getClass(), "second", 96566506);
        setField(term19671, term19671.getClass(), "setting", "Yrvtdcltri");
        setField(term19671, term19671.getClass(), "timezone", "RxrsjXRVcT");
        setField(term19671, term19671.getClass(), "res_class", "cfRimmJxqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term19671, args);
    }

};



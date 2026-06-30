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

public class PowerOnResponseV2_getHost_3437996983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16827;

    public PowerOnResponseV2_getHost_3437996983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16827 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term16827, term16827.getClass(), "stat", -2095575670);
        setField(term16827, term16827.getClass(), "uri", "KpurAcrHYT");
        setField(term16827, term16827.getClass(), "host", "QjvDwgKJGz");
        setField(term16827, term16827.getClass(), "place_id", "ngYxiXTZrk");
        setField(term16827, term16827.getClass(), "name", "YTxBqWRAlo");
        setField(term16827, term16827.getClass(), "nickname", "ReruUQRXwl");
        setField(term16827, term16827.getClass(), "region0", "DWEsVQwuaE");
        setField(term16827, term16827.getClass(), "region_name0", "qGkNzZAeDN");
        setField(term16827, term16827.getClass(), "region_name1", "wdtiuPgTVJ");
        setField(term16827, term16827.getClass(), "region_name2", "HUgzMgrpsK");
        setField(term16827, term16827.getClass(), "region_name3", "ubaBUfLolu");
        setField(term16827, term16827.getClass(), "country", "itAUCFhZhq");
        setIntField(term16827, term16827.getClass(), "year", 1225272962);
        setIntField(term16827, term16827.getClass(), "month", 1324040357);
        setIntField(term16827, term16827.getClass(), "day", -1588772968);
        setIntField(term16827, term16827.getClass(), "hour", -93135961);
        setIntField(term16827, term16827.getClass(), "minute", -112921587);
        setIntField(term16827, term16827.getClass(), "second", 933028652);
        setField(term16827, term16827.getClass(), "setting", "bIqaKgXgPm");
        setField(term16827, term16827.getClass(), "timezone", "uOJFOUcNvv");
        setField(term16827, term16827.getClass(), "res_class", "tkmmGweDwJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term16827, args);
    }

};



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

public class PowerOnResponseV2_setRegionname2_190167840231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25853;

    public PowerOnResponseV2_setRegionname2_190167840231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25853 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term25853, term25853.getClass(), "stat", -525257914);
        setField(term25853, term25853.getClass(), "uri", "IlQxArYcgB");
        setField(term25853, term25853.getClass(), "host", "lIgKCvCuoH");
        setField(term25853, term25853.getClass(), "place_id", "dHuWgRwLOm");
        setField(term25853, term25853.getClass(), "name", "PsTQDxNIld");
        setField(term25853, term25853.getClass(), "nickname", "uoBijJjvaj");
        setField(term25853, term25853.getClass(), "region0", "BdsLFSRWda");
        setField(term25853, term25853.getClass(), "region_name0", "tMhhBYonAI");
        setField(term25853, term25853.getClass(), "region_name1", "AaQRshwIQC");
        setField(term25853, term25853.getClass(), "region_name2", "rHgKCfgCsg");
        setField(term25853, term25853.getClass(), "region_name3", "AWtIUOuutt");
        setField(term25853, term25853.getClass(), "country", "jBgJZpHifl");
        setIntField(term25853, term25853.getClass(), "year", 147209682);
        setIntField(term25853, term25853.getClass(), "month", 34470066);
        setIntField(term25853, term25853.getClass(), "day", 2058711405);
        setIntField(term25853, term25853.getClass(), "hour", 1743683601);
        setIntField(term25853, term25853.getClass(), "minute", -945116798);
        setIntField(term25853, term25853.getClass(), "second", 1593461795);
        setField(term25853, term25853.getClass(), "setting", "azMTTmEXnh");
        setField(term25853, term25853.getClass(), "timezone", "BjJtxwsIpt");
        setField(term25853, term25853.getClass(), "res_class", "gUQhOyGfzF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IqDObvPBZX";
        callMethod(klass, "setRegion_name2", argTypes, term25853, args);
    }

};



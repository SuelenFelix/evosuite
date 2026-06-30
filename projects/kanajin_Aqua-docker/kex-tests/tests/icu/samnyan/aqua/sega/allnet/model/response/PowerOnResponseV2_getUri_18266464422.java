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

public class PowerOnResponseV2_getUri_18266464422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16511;

    public PowerOnResponseV2_getUri_18266464422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16511 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term16511, term16511.getClass(), "stat", 458147407);
        setField(term16511, term16511.getClass(), "uri", "utCuuVCKqE");
        setField(term16511, term16511.getClass(), "host", "zSfoqzJbPT");
        setField(term16511, term16511.getClass(), "place_id", "QUymMnsCIj");
        setField(term16511, term16511.getClass(), "name", "ikTtOgdVYS");
        setField(term16511, term16511.getClass(), "nickname", "JptuwlirlS");
        setField(term16511, term16511.getClass(), "region0", "TKOMaGswbU");
        setField(term16511, term16511.getClass(), "region_name0", "YcTbglHiUq");
        setField(term16511, term16511.getClass(), "region_name1", "TiUqHrjoEU");
        setField(term16511, term16511.getClass(), "region_name2", "eoEvZbdLjL");
        setField(term16511, term16511.getClass(), "region_name3", "BkIxsyPkGy");
        setField(term16511, term16511.getClass(), "country", "mrMGwoRgVY");
        setIntField(term16511, term16511.getClass(), "year", -184153539);
        setIntField(term16511, term16511.getClass(), "month", 493620644);
        setIntField(term16511, term16511.getClass(), "day", 1328271830);
        setIntField(term16511, term16511.getClass(), "hour", 1596070772);
        setIntField(term16511, term16511.getClass(), "minute", 97029295);
        setIntField(term16511, term16511.getClass(), "second", -1371869594);
        setField(term16511, term16511.getClass(), "setting", "mxVLTgCwki");
        setField(term16511, term16511.getClass(), "timezone", "wCurppnDSA");
        setField(term16511, term16511.getClass(), "res_class", "JydxSNTMYt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUri", argTypes, term16511, args);
    }

};



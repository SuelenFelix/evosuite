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

public class PowerOnResponseV2_setPlaceid_200385058125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23825;

    public PowerOnResponseV2_setPlaceid_200385058125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23825 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term23825, term23825.getClass(), "stat", 282916351);
        setField(term23825, term23825.getClass(), "uri", "DvRdOzzihn");
        setField(term23825, term23825.getClass(), "host", "wIygCdQAKO");
        setField(term23825, term23825.getClass(), "place_id", "JsXroBYqwr");
        setField(term23825, term23825.getClass(), "name", "YciMAObLwl");
        setField(term23825, term23825.getClass(), "nickname", "qAmVqwwdyf");
        setField(term23825, term23825.getClass(), "region0", "IXPaHQnEUy");
        setField(term23825, term23825.getClass(), "region_name0", "zhcWVVrrjs");
        setField(term23825, term23825.getClass(), "region_name1", "EAMaFLdmaG");
        setField(term23825, term23825.getClass(), "region_name2", "DYZSJMwbhX");
        setField(term23825, term23825.getClass(), "region_name3", "QGcshsIIWo");
        setField(term23825, term23825.getClass(), "country", "dPHtrzKWgf");
        setIntField(term23825, term23825.getClass(), "year", 880977281);
        setIntField(term23825, term23825.getClass(), "month", 371943306);
        setIntField(term23825, term23825.getClass(), "day", 982388293);
        setIntField(term23825, term23825.getClass(), "hour", -159494544);
        setIntField(term23825, term23825.getClass(), "minute", -75206835);
        setIntField(term23825, term23825.getClass(), "second", -1618206977);
        setField(term23825, term23825.getClass(), "setting", "olmFxfIVeh");
        setField(term23825, term23825.getClass(), "timezone", "iSPirUEhXs");
        setField(term23825, term23825.getClass(), "res_class", "WWyLFmYpAy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vbSWeJWOQh";
        callMethod(klass, "setPlace_id", argTypes, term23825, args);
    }

};



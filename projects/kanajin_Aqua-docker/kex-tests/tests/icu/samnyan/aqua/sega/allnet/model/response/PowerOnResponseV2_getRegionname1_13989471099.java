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

public class PowerOnResponseV2_getRegionname1_13989471099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18723;

    public PowerOnResponseV2_getRegionname1_13989471099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18723 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term18723, term18723.getClass(), "stat", -1210583429);
        setField(term18723, term18723.getClass(), "uri", "jDFNSuvZqm");
        setField(term18723, term18723.getClass(), "host", "pLvkKHqNYX");
        setField(term18723, term18723.getClass(), "place_id", "PwqnuJJwjR");
        setField(term18723, term18723.getClass(), "name", "NFkbBiPeiw");
        setField(term18723, term18723.getClass(), "nickname", "tlRvilQyjJ");
        setField(term18723, term18723.getClass(), "region0", "gwTUlYNpjM");
        setField(term18723, term18723.getClass(), "region_name0", "uXYojRmxrM");
        setField(term18723, term18723.getClass(), "region_name1", "cxRwRcodud");
        setField(term18723, term18723.getClass(), "region_name2", "GDGBPlYeLn");
        setField(term18723, term18723.getClass(), "region_name3", "jdQANIXSTq");
        setField(term18723, term18723.getClass(), "country", "stVcZLTNpu");
        setIntField(term18723, term18723.getClass(), "year", -663691365);
        setIntField(term18723, term18723.getClass(), "month", 339854490);
        setIntField(term18723, term18723.getClass(), "day", -615654495);
        setIntField(term18723, term18723.getClass(), "hour", -1476117762);
        setIntField(term18723, term18723.getClass(), "minute", -341962980);
        setIntField(term18723, term18723.getClass(), "second", 1532716628);
        setField(term18723, term18723.getClass(), "setting", "LgXdqWrsLL");
        setField(term18723, term18723.getClass(), "timezone", "bbHWyibNmy");
        setField(term18723, term18723.getClass(), "res_class", "vYYOYhWMWZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name1", argTypes, term18723, args);
    }

};



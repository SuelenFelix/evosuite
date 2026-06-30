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

public class PowerOnResponseV3_setCountry_39083537930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11503;

    public PowerOnResponseV3_setCountry_39083537930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11503 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term11503, term11503.getClass(), "stat", -1179120542);
        setField(term11503, term11503.getClass(), "uri", "vqnBkkxoIa");
        setField(term11503, term11503.getClass(), "host", "bycpZjxXFn");
        setField(term11503, term11503.getClass(), "place_id", "jQWttOAiwL");
        setField(term11503, term11503.getClass(), "name", "DzKFxEuEEC");
        setField(term11503, term11503.getClass(), "nickname", "CAMnvfDLJL");
        setField(term11503, term11503.getClass(), "region0", "mfHtgSbdjD");
        setField(term11503, term11503.getClass(), "region_name0", "cmuaUiHMVL");
        setField(term11503, term11503.getClass(), "region_name1", "xjoSGPWUgu");
        setField(term11503, term11503.getClass(), "region_name2", "uzmqjnOUXu");
        setField(term11503, term11503.getClass(), "region_name3", "xeyjTOCOJb");
        setField(term11503, term11503.getClass(), "country", "DGRqjjdhzy");
        setField(term11503, term11503.getClass(), "allnet_id", "lQFkjJUPAR");
        setField(term11503, term11503.getClass(), "client_timezone", "BsuVlGUUjV");
        setField(term11503, term11503.getClass(), "utc_time", "bHHjfDCntT");
        setField(term11503, term11503.getClass(), "setting", "sEphiduvkv");
        setField(term11503, term11503.getClass(), "res_ver", "PbLgCSAHce");
        setField(term11503, term11503.getClass(), "token", "NWldOLAbqk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qnYaYSpDwO";
        callMethod(klass, "setCountry", argTypes, term11503, args);
    }

};



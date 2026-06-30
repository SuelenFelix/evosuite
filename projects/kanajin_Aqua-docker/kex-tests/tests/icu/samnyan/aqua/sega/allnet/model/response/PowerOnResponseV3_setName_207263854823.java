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

public class PowerOnResponseV3_setName_207263854823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8717;

    public PowerOnResponseV3_setName_207263854823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8717 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term8717, term8717.getClass(), "stat", -1007160944);
        setField(term8717, term8717.getClass(), "uri", "boSSpezHeU");
        setField(term8717, term8717.getClass(), "host", "OUeBWNTQDh");
        setField(term8717, term8717.getClass(), "place_id", "gltJarNuUk");
        setField(term8717, term8717.getClass(), "name", "ZwZIDwYcSW");
        setField(term8717, term8717.getClass(), "nickname", "sOdkipUKRu");
        setField(term8717, term8717.getClass(), "region0", "oKwCDqywym");
        setField(term8717, term8717.getClass(), "region_name0", "zjZYTddemL");
        setField(term8717, term8717.getClass(), "region_name1", "QtrylgCLiF");
        setField(term8717, term8717.getClass(), "region_name2", "orEuhCStGM");
        setField(term8717, term8717.getClass(), "region_name3", "HhEaSXWvrY");
        setField(term8717, term8717.getClass(), "country", "CVRGEomOth");
        setField(term8717, term8717.getClass(), "allnet_id", "vSeruUyNWX");
        setField(term8717, term8717.getClass(), "client_timezone", "UkKvaeJfEC");
        setField(term8717, term8717.getClass(), "utc_time", "WPxXsahPRq");
        setField(term8717, term8717.getClass(), "setting", "IENRuqmwUU");
        setField(term8717, term8717.getClass(), "res_ver", "GsWxOwXvSu");
        setField(term8717, term8717.getClass(), "token", "bKBSncrMEZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yeSXGqQExb";
        callMethod(klass, "setName", argTypes, term8717, args);
    }

};



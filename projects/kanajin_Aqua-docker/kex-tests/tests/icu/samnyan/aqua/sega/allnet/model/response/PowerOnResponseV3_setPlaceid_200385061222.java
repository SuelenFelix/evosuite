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

public class PowerOnResponseV3_setPlaceid_200385061222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8319;

    public PowerOnResponseV3_setPlaceid_200385061222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8319 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term8319, term8319.getClass(), "stat", -117576464);
        setField(term8319, term8319.getClass(), "uri", "bdyhHbDAmJ");
        setField(term8319, term8319.getClass(), "host", "BBXiTNHqGE");
        setField(term8319, term8319.getClass(), "place_id", "IEYhJmgCVd");
        setField(term8319, term8319.getClass(), "name", "KSJeYkkvpk");
        setField(term8319, term8319.getClass(), "nickname", "qUtkFGMNUV");
        setField(term8319, term8319.getClass(), "region0", "mGRiYhnMcR");
        setField(term8319, term8319.getClass(), "region_name0", "NFlvfJCVPO");
        setField(term8319, term8319.getClass(), "region_name1", "KarbTXFmUU");
        setField(term8319, term8319.getClass(), "region_name2", "jiUSjqwSIQ");
        setField(term8319, term8319.getClass(), "region_name3", "MgLCedQfoj");
        setField(term8319, term8319.getClass(), "country", "zgKiINdgNu");
        setField(term8319, term8319.getClass(), "allnet_id", "zLMTXDQHYH");
        setField(term8319, term8319.getClass(), "client_timezone", "PqywFWJlpE");
        setField(term8319, term8319.getClass(), "utc_time", "OzXRsFGTIp");
        setField(term8319, term8319.getClass(), "setting", "TjWpyghUWN");
        setField(term8319, term8319.getClass(), "res_ver", "dkZFDZxcde");
        setField(term8319, term8319.getClass(), "token", "WXcZEtUKlI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IkpjUOuWQU";
        callMethod(klass, "setPlace_id", argTypes, term8319, args);
    }

};



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

public class PowerOnResponseV3_setHost_206367629721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7921;

    public PowerOnResponseV3_setHost_206367629721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7921 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term7921, term7921.getClass(), "stat", -2068769794);
        setField(term7921, term7921.getClass(), "uri", "GNEmuHPNcU");
        setField(term7921, term7921.getClass(), "host", "IoSfuKDFRe");
        setField(term7921, term7921.getClass(), "place_id", "AWYyZiNfsm");
        setField(term7921, term7921.getClass(), "name", "ITRRYiuDwH");
        setField(term7921, term7921.getClass(), "nickname", "llRfwANcVF");
        setField(term7921, term7921.getClass(), "region0", "sUEeHQTWkA");
        setField(term7921, term7921.getClass(), "region_name0", "BDIRCxAWLA");
        setField(term7921, term7921.getClass(), "region_name1", "eOJfbiZLnb");
        setField(term7921, term7921.getClass(), "region_name2", "nKZKnxWYCK");
        setField(term7921, term7921.getClass(), "region_name3", "JOqQxuzRuZ");
        setField(term7921, term7921.getClass(), "country", "RSaoipUlsg");
        setField(term7921, term7921.getClass(), "allnet_id", "cSHGbqKqlN");
        setField(term7921, term7921.getClass(), "client_timezone", "pFAfANnxup");
        setField(term7921, term7921.getClass(), "utc_time", "FbSIUZyBXZ");
        setField(term7921, term7921.getClass(), "setting", "mhQDwIyrRi");
        setField(term7921, term7921.getClass(), "res_ver", "HpZXWDPhlg");
        setField(term7921, term7921.getClass(), "token", "lBOokzEPfe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dtGZCsKXbW";
        callMethod(klass, "setHost", argTypes, term7921, args);
    }

};



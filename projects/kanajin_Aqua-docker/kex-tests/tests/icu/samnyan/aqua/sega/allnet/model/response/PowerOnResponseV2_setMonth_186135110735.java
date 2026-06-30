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
import java.lang.Integer;

public class PowerOnResponseV2_setMonth_186135110735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27185;
     Object term27361;

    public PowerOnResponseV2_setMonth_186135110735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27185 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term27185, term27185.getClass(), "stat", -123338791);
        setField(term27185, term27185.getClass(), "uri", "DbZKLwYBgy");
        setField(term27185, term27185.getClass(), "host", "LnNRVsjmxw");
        setField(term27185, term27185.getClass(), "place_id", "PlOnDkNrvX");
        setField(term27185, term27185.getClass(), "name", "MltgFGldop");
        setField(term27185, term27185.getClass(), "nickname", "JCWSoxnBJs");
        setField(term27185, term27185.getClass(), "region0", "vAxcpvjEEa");
        setField(term27185, term27185.getClass(), "region_name0", "FCkOgIBqXE");
        setField(term27185, term27185.getClass(), "region_name1", "kadRHthQRD");
        setField(term27185, term27185.getClass(), "region_name2", "cGbJSRSpNn");
        setField(term27185, term27185.getClass(), "region_name3", "MzXzaqaiHW");
        setField(term27185, term27185.getClass(), "country", "jWOWtrhVkA");
        setIntField(term27185, term27185.getClass(), "year", -1467089634);
        setIntField(term27185, term27185.getClass(), "month", 413548937);
        setIntField(term27185, term27185.getClass(), "day", 1901317214);
        setIntField(term27185, term27185.getClass(), "hour", 1166710220);
        setIntField(term27185, term27185.getClass(), "minute", -1070592289);
        setIntField(term27185, term27185.getClass(), "second", -1464172784);
        setField(term27185, term27185.getClass(), "setting", "IyOhWYyaDV");
        setField(term27185, term27185.getClass(), "timezone", "omWrkCSFzy");
        setField(term27185, term27185.getClass(), "res_class", "VFYvUTgYFB");
        term27361 = new Integer(32185364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27361;
        callMethod(klass, "setMonth", argTypes, term27185, args);
    }

};



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

public class PowerOnResponseV2_setSecond_58382770739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28457;
     Object term28633;

    public PowerOnResponseV2_setSecond_58382770739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28457 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term28457, term28457.getClass(), "stat", -310648604);
        setField(term28457, term28457.getClass(), "uri", "zHcDSJHKAb");
        setField(term28457, term28457.getClass(), "host", "WRIQkTdeMl");
        setField(term28457, term28457.getClass(), "place_id", "rLSEheWsHd");
        setField(term28457, term28457.getClass(), "name", "DoUKDhlGCY");
        setField(term28457, term28457.getClass(), "nickname", "IeoToWsQWU");
        setField(term28457, term28457.getClass(), "region0", "QxiiHtQAzN");
        setField(term28457, term28457.getClass(), "region_name0", "gQgTBlRIvX");
        setField(term28457, term28457.getClass(), "region_name1", "ulKaKnANzj");
        setField(term28457, term28457.getClass(), "region_name2", "ABwhdjjeJi");
        setField(term28457, term28457.getClass(), "region_name3", "KKEcpYXNZV");
        setField(term28457, term28457.getClass(), "country", "shLHFznysy");
        setIntField(term28457, term28457.getClass(), "year", -648200466);
        setIntField(term28457, term28457.getClass(), "month", 2007134147);
        setIntField(term28457, term28457.getClass(), "day", 993388358);
        setIntField(term28457, term28457.getClass(), "hour", -765191335);
        setIntField(term28457, term28457.getClass(), "minute", -1697741155);
        setIntField(term28457, term28457.getClass(), "second", 1295839803);
        setField(term28457, term28457.getClass(), "setting", "YCKIloBHLj");
        setField(term28457, term28457.getClass(), "timezone", "qUWDhAeFJY");
        setField(term28457, term28457.getClass(), "res_class", "wboNBMhRjP");
        term28633 = new Integer(-1891015523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28633;
        callMethod(klass, "setSecond", argTypes, term28457, args);
    }

};



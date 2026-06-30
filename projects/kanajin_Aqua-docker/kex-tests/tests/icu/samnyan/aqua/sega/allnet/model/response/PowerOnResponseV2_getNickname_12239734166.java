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

public class PowerOnResponseV2_getNickname_12239734166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17775;

    public PowerOnResponseV2_getNickname_12239734166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17775 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term17775, term17775.getClass(), "stat", -1465035361);
        setField(term17775, term17775.getClass(), "uri", "QTefjRuiez");
        setField(term17775, term17775.getClass(), "host", "SQZVNkAVBB");
        setField(term17775, term17775.getClass(), "place_id", "mrSAYJlddZ");
        setField(term17775, term17775.getClass(), "name", "KbwxawvYsw");
        setField(term17775, term17775.getClass(), "nickname", "gvjdfHNzOa");
        setField(term17775, term17775.getClass(), "region0", "HqitWglYWX");
        setField(term17775, term17775.getClass(), "region_name0", "pOuFRlHmbK");
        setField(term17775, term17775.getClass(), "region_name1", "WrzdBkinqV");
        setField(term17775, term17775.getClass(), "region_name2", "vydWXHfFTw");
        setField(term17775, term17775.getClass(), "region_name3", "DRhkpDneCC");
        setField(term17775, term17775.getClass(), "country", "vuIJRrypuA");
        setIntField(term17775, term17775.getClass(), "year", 1090617576);
        setIntField(term17775, term17775.getClass(), "month", -1547384488);
        setIntField(term17775, term17775.getClass(), "day", 1442160736);
        setIntField(term17775, term17775.getClass(), "hour", 1114000454);
        setIntField(term17775, term17775.getClass(), "minute", -556405712);
        setIntField(term17775, term17775.getClass(), "second", -1772434990);
        setField(term17775, term17775.getClass(), "setting", "AxfSZmaiyA");
        setField(term17775, term17775.getClass(), "timezone", "lBpveIKbea");
        setField(term17775, term17775.getClass(), "res_class", "uyLBVQYcOV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickname", argTypes, term17775, args);
    }

};



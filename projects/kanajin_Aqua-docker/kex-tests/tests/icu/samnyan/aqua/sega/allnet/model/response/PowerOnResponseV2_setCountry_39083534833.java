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

public class PowerOnResponseV2_setCountry_39083534833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26529;

    public PowerOnResponseV2_setCountry_39083534833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26529 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term26529, term26529.getClass(), "stat", 1745276158);
        setField(term26529, term26529.getClass(), "uri", "iqFRvFmVID");
        setField(term26529, term26529.getClass(), "host", "pNAEtppZdv");
        setField(term26529, term26529.getClass(), "place_id", "VsFWNMdyRt");
        setField(term26529, term26529.getClass(), "name", "QaoYFZhScg");
        setField(term26529, term26529.getClass(), "nickname", "UTvXIenLCR");
        setField(term26529, term26529.getClass(), "region0", "PLeKpWaxhQ");
        setField(term26529, term26529.getClass(), "region_name0", "EBSKhqDdUW");
        setField(term26529, term26529.getClass(), "region_name1", "LvLbdICdfA");
        setField(term26529, term26529.getClass(), "region_name2", "rtifrlITwl");
        setField(term26529, term26529.getClass(), "region_name3", "yGWXZDjnPS");
        setField(term26529, term26529.getClass(), "country", "vZucxbGVyo");
        setIntField(term26529, term26529.getClass(), "year", 2009020256);
        setIntField(term26529, term26529.getClass(), "month", 2049577015);
        setIntField(term26529, term26529.getClass(), "day", 1236004505);
        setIntField(term26529, term26529.getClass(), "hour", 1050765721);
        setIntField(term26529, term26529.getClass(), "minute", 474518942);
        setIntField(term26529, term26529.getClass(), "second", -1656687479);
        setField(term26529, term26529.getClass(), "setting", "ZZoLNbeORl");
        setField(term26529, term26529.getClass(), "timezone", "XjIOUIzJUP");
        setField(term26529, term26529.getClass(), "res_class", "iGTpXnnTqB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XgJzBOYfQB";
        callMethod(klass, "setCountry", argTypes, term26529, args);
    }

};



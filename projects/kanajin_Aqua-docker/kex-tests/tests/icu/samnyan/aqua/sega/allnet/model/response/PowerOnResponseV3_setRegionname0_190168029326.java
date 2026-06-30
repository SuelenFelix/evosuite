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

public class PowerOnResponseV3_setRegionname0_190168029326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9911;

    public PowerOnResponseV3_setRegionname0_190168029326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9911 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term9911, term9911.getClass(), "stat", 865208305);
        setField(term9911, term9911.getClass(), "uri", "mKaHyMybrK");
        setField(term9911, term9911.getClass(), "host", "AyrEXuGrEj");
        setField(term9911, term9911.getClass(), "place_id", "yevIIoVYHq");
        setField(term9911, term9911.getClass(), "name", "UuYWMTqWTV");
        setField(term9911, term9911.getClass(), "nickname", "DSFGlcaXUb");
        setField(term9911, term9911.getClass(), "region0", "sHMXNUzNeM");
        setField(term9911, term9911.getClass(), "region_name0", "gPzGDOEPPw");
        setField(term9911, term9911.getClass(), "region_name1", "rwKoAngzCu");
        setField(term9911, term9911.getClass(), "region_name2", "VUkRVwROTl");
        setField(term9911, term9911.getClass(), "region_name3", "UDlkdccCRn");
        setField(term9911, term9911.getClass(), "country", "McpzErOcYb");
        setField(term9911, term9911.getClass(), "allnet_id", "jqrVEUvYEz");
        setField(term9911, term9911.getClass(), "client_timezone", "QITgiBrmfj");
        setField(term9911, term9911.getClass(), "utc_time", "pXxkiXgQnq");
        setField(term9911, term9911.getClass(), "setting", "tKmrUDURku");
        setField(term9911, term9911.getClass(), "res_ver", "JeZbrwZmsP");
        setField(term9911, term9911.getClass(), "token", "bxyfeicqrK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vBnWPlsZMk";
        callMethod(klass, "setRegion_name0", argTypes, term9911, args);
    }

};



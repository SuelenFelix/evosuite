package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BuyCstmzItmResponse_setShprslt_17244393536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2150;
     Object enum6;

    public BuyCstmzItmResponse_setShprslt_17244393536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2214 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term2213 = ((Class) term2214).getDeclaredField((String) "SUCCESS");
        ((Field) term2213).setAccessible(true);
        enum6 = ((Field) term2213).get((Object) null);
        term2150 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term2150, term2150.getClass(), "shp_rslt", enum6);
        setIntField(term2150, term2150.getClass(), "cstmz_itm_id", 1725571209);
        setField(term2150, term2150.getClass(), "cstmz_itm_have", "eZFUvlxvGV");
        setIntField(term2150, term2150.getClass(), "vcld_pts", -522618178);
        setField(term2150, term2150.getClass(), "cmd", "BYqFIqCKAV");
        setField(term2150, term2150.getClass(), "req_id", "vrQLuWIDJX");
        setField(term2150, term2150.getClass(), "stat", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = enum6;
        callMethod(klass, "setShp_rslt", argTypes, term2150, args);
    }

};



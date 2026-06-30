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

public class ShopExitResponse_getShprslt_4901670261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3980;

    public ShopExitResponse_getShprslt_4901670261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4029 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term4028 = ((Class) term4029).getDeclaredField((String) "FAILED");
        ((Field) term4028).setAccessible(true);
        Object enum11 = ((Field) term4028).get((Object) null);
        term3980 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.ShopExitResponse"));
        setField(term3980, term3980.getClass(), "shp_rslt", enum11);
        setField(term3980, term3980.getClass(), "cmd", "hxCBltsObl");
        setField(term3980, term3980.getClass(), "req_id", "BndsHwAFMv");
        setField(term3980, term3980.getClass(), "stat", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.ShopExitResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShp_rslt", argTypes, term3980, args);
    }

};



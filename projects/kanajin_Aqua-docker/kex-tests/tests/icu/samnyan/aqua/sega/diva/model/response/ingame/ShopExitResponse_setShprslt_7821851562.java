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

public class ShopExitResponse_setShprslt_7821851562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4313;
     Object enum13;

    public ShopExitResponse_setShprslt_7821851562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4374 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term4373 = ((Class) term4374).getDeclaredField((String) "SUCCESS");
        ((Field) term4373).setAccessible(true);
        Object enum12 = ((Field) term4373).get((Object) null);
        term4313 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.ShopExitResponse"));
        setField(term4313, term4313.getClass(), "shp_rslt", enum12);
        setField(term4313, term4313.getClass(), "cmd", "tShwQLRGNe");
        setField(term4313, term4313.getClass(), "req_id", "LvtrsXUliU");
        setField(term4313, term4313.getClass(), "stat", "xLbjWUgOIL");
        Class<? extends Object> term4662 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term4661 = ((Class) term4662).getDeclaredField((String) "FAILED");
        ((Field) term4661).setAccessible(true);
        enum13 = ((Field) term4661).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.ShopExitResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = enum13;
        callMethod(klass, "setShp_rslt", argTypes, term4313, args);
    }

};



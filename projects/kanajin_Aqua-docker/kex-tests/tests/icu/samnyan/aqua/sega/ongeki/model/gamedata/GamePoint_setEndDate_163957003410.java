package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GamePoint_setEndDate_163957003410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25715;

    public GamePoint_setEndDate_163957003410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25791 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term25790 = ((Class) term25791).getDeclaredField((String) "B_Credit1");
        ((Field) term25790).setAccessible(true);
        Object enum24 = ((Field) term25790).get((Object) null);
        term25715 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term25715, term25715.getClass(), "id", -7115418542247301000L);
        setField(term25715, term25715.getClass(), "type", enum24);
        setIntField(term25715, term25715.getClass(), "cost", -1692331299);
        setField(term25715, term25715.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term25715, term25715.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IOddzvEWcl";
        callMethod(klass, "setEndDate", argTypes, term25715, args);
    }

};



package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameCharge_equals_143918895746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2367;

    public GameCharge_equals_143918895746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2367 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        setLongField(term2367, term2367.getClass(), "id", 0L);
        setIntField(term2367, term2367.getClass(), "orderId", 0);
        setIntField(term2367, term2367.getClass(), "chargeId", 0);
        setIntField(term2367, term2367.getClass(), "price", 0);
        setField(term2367, term2367.getClass(), "startDate", null);
        setField(term2367, term2367.getClass(), "endDate", null);
        setIntField(term2367, term2367.getClass(), "salePrice", 0);
        setField(term2367, term2367.getClass(), "saleStartDate", null);
        setField(term2367, term2367.getClass(), "saleEndDate", null);
        setField(term2367, term2367.getClass(), "remarks", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term2367, args);
    }

};



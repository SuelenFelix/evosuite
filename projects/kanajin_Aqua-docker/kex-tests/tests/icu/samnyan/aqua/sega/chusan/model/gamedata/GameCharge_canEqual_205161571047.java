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

public class GameCharge_canEqual_205161571047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2373;

    public GameCharge_canEqual_205161571047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2373 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        setLongField(term2373, term2373.getClass(), "id", 0L);
        setIntField(term2373, term2373.getClass(), "orderId", 0);
        setIntField(term2373, term2373.getClass(), "chargeId", 0);
        setIntField(term2373, term2373.getClass(), "price", 0);
        setField(term2373, term2373.getClass(), "startDate", null);
        setField(term2373, term2373.getClass(), "endDate", null);
        setIntField(term2373, term2373.getClass(), "salePrice", 0);
        setField(term2373, term2373.getClass(), "saleStartDate", null);
        setField(term2373, term2373.getClass(), "saleEndDate", null);
        setField(term2373, term2373.getClass(), "remarks", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term2373, args);
    }

};



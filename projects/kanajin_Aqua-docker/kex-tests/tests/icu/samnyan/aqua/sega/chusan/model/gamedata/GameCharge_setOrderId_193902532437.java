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
import java.lang.Integer;

public class GameCharge_setOrderId_193902532437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305;
     Object term2311;

    public GameCharge_setOrderId_193902532437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        setLongField(term2305, term2305.getClass(), "id", 0L);
        setIntField(term2305, term2305.getClass(), "orderId", 0);
        setIntField(term2305, term2305.getClass(), "chargeId", 0);
        setIntField(term2305, term2305.getClass(), "price", 0);
        setField(term2305, term2305.getClass(), "startDate", null);
        setField(term2305, term2305.getClass(), "endDate", null);
        setIntField(term2305, term2305.getClass(), "salePrice", 0);
        setField(term2305, term2305.getClass(), "saleStartDate", null);
        setField(term2305, term2305.getClass(), "saleEndDate", null);
        setField(term2305, term2305.getClass(), "remarks", null);
        term2311 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2311;
        callMethod(klass, "setOrderId", argTypes, term2305, args);
    }

};



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
import java.lang.Long;

public class GameCharge_setId_151876124636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2297;
     Object term2303;

    public GameCharge_setId_151876124636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2297 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        setLongField(term2297, term2297.getClass(), "id", 0L);
        setIntField(term2297, term2297.getClass(), "orderId", 0);
        setIntField(term2297, term2297.getClass(), "chargeId", 0);
        setIntField(term2297, term2297.getClass(), "price", 0);
        setField(term2297, term2297.getClass(), "startDate", null);
        setField(term2297, term2297.getClass(), "endDate", null);
        setIntField(term2297, term2297.getClass(), "salePrice", 0);
        setField(term2297, term2297.getClass(), "saleStartDate", null);
        setField(term2297, term2297.getClass(), "saleEndDate", null);
        setField(term2297, term2297.getClass(), "remarks", null);
        term2303 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2303;
        callMethod(klass, "setId", argTypes, term2297, args);
    }

};



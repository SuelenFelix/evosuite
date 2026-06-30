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

public class GameCharge_getStartDate_39953117430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2261;

    public GameCharge_getStartDate_39953117430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2261 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        setLongField(term2261, term2261.getClass(), "id", 0L);
        setIntField(term2261, term2261.getClass(), "orderId", 0);
        setIntField(term2261, term2261.getClass(), "chargeId", 0);
        setIntField(term2261, term2261.getClass(), "price", 0);
        setField(term2261, term2261.getClass(), "startDate", null);
        setField(term2261, term2261.getClass(), "endDate", null);
        setIntField(term2261, term2261.getClass(), "salePrice", 0);
        setField(term2261, term2261.getClass(), "saleStartDate", null);
        setField(term2261, term2261.getClass(), "saleEndDate", null);
        setField(term2261, term2261.getClass(), "remarks", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term2261, args);
    }

};



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

public class GameCharge_setSaleEndDate_100106885244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2355;

    public GameCharge_setSaleEndDate_100106885244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2355 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        setLongField(term2355, term2355.getClass(), "id", 0L);
        setIntField(term2355, term2355.getClass(), "orderId", 0);
        setIntField(term2355, term2355.getClass(), "chargeId", 0);
        setIntField(term2355, term2355.getClass(), "price", 0);
        setField(term2355, term2355.getClass(), "startDate", null);
        setField(term2355, term2355.getClass(), "endDate", null);
        setIntField(term2355, term2355.getClass(), "salePrice", 0);
        setField(term2355, term2355.getClass(), "saleStartDate", null);
        setField(term2355, term2355.getClass(), "saleEndDate", null);
        setField(term2355, term2355.getClass(), "remarks", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSaleEndDate", argTypes, term2355, args);
    }

};



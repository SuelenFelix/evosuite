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

public class GameCharge_setSalePrice_35018031542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2341;
     Object term2347;

    public GameCharge_setSalePrice_35018031542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2341 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        setLongField(term2341, term2341.getClass(), "id", 0L);
        setIntField(term2341, term2341.getClass(), "orderId", 0);
        setIntField(term2341, term2341.getClass(), "chargeId", 0);
        setIntField(term2341, term2341.getClass(), "price", 0);
        setField(term2341, term2341.getClass(), "startDate", null);
        setField(term2341, term2341.getClass(), "endDate", null);
        setIntField(term2341, term2341.getClass(), "salePrice", 0);
        setField(term2341, term2341.getClass(), "saleStartDate", null);
        setField(term2341, term2341.getClass(), "saleEndDate", null);
        setField(term2341, term2341.getClass(), "remarks", null);
        term2347 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2347;
        callMethod(klass, "setSalePrice", argTypes, term2341, args);
    }

};



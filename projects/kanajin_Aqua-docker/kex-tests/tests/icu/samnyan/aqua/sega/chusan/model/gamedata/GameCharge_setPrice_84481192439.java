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

public class GameCharge_setPrice_84481192439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2321;
     Object term2327;

    public GameCharge_setPrice_84481192439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2321 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        setLongField(term2321, term2321.getClass(), "id", 0L);
        setIntField(term2321, term2321.getClass(), "orderId", 0);
        setIntField(term2321, term2321.getClass(), "chargeId", 0);
        setIntField(term2321, term2321.getClass(), "price", 0);
        setField(term2321, term2321.getClass(), "startDate", null);
        setField(term2321, term2321.getClass(), "endDate", null);
        setIntField(term2321, term2321.getClass(), "salePrice", 0);
        setField(term2321, term2321.getClass(), "saleStartDate", null);
        setField(term2321, term2321.getClass(), "saleEndDate", null);
        setField(term2321, term2321.getClass(), "remarks", null);
        term2327 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2327;
        callMethod(klass, "setPrice", argTypes, term2321, args);
    }

};



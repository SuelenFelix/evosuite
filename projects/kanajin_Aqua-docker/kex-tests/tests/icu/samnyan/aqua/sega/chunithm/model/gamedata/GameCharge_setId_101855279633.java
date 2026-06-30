package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GameCharge_setId_101855279633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1627;
     Object term1633;

    public GameCharge_setId_101855279633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1627 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        setLongField(term1627, term1627.getClass(), "id", 0L);
        setIntField(term1627, term1627.getClass(), "orderId", 0);
        setIntField(term1627, term1627.getClass(), "chargeId", 0);
        setIntField(term1627, term1627.getClass(), "price", 0);
        setField(term1627, term1627.getClass(), "startDate", null);
        setField(term1627, term1627.getClass(), "endDate", null);
        setIntField(term1627, term1627.getClass(), "salePrice", 0);
        setField(term1627, term1627.getClass(), "saleStartDate", null);
        setField(term1627, term1627.getClass(), "saleEndDate", null);
        term1633 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1633;
        callMethod(klass, "setId", argTypes, term1627, args);
    }

};



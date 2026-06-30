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

public class GameCharge_getOrderId_88661389225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1579;

    public GameCharge_getOrderId_88661389225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1579 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        setLongField(term1579, term1579.getClass(), "id", 0L);
        setIntField(term1579, term1579.getClass(), "orderId", 0);
        setIntField(term1579, term1579.getClass(), "chargeId", 0);
        setIntField(term1579, term1579.getClass(), "price", 0);
        setField(term1579, term1579.getClass(), "startDate", null);
        setField(term1579, term1579.getClass(), "endDate", null);
        setIntField(term1579, term1579.getClass(), "salePrice", 0);
        setField(term1579, term1579.getClass(), "saleStartDate", null);
        setField(term1579, term1579.getClass(), "saleEndDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term1579, args);
    }

};



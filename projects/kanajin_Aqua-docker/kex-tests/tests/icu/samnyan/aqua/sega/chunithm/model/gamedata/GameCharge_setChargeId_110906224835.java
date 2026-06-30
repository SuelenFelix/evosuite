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
import java.lang.Integer;

public class GameCharge_setChargeId_110906224835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1643;
     Object term1649;

    public GameCharge_setChargeId_110906224835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1643 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        setLongField(term1643, term1643.getClass(), "id", 0L);
        setIntField(term1643, term1643.getClass(), "orderId", 0);
        setIntField(term1643, term1643.getClass(), "chargeId", 0);
        setIntField(term1643, term1643.getClass(), "price", 0);
        setField(term1643, term1643.getClass(), "startDate", null);
        setField(term1643, term1643.getClass(), "endDate", null);
        setIntField(term1643, term1643.getClass(), "salePrice", 0);
        setField(term1643, term1643.getClass(), "saleStartDate", null);
        setField(term1643, term1643.getClass(), "saleEndDate", null);
        term1649 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1649;
        callMethod(klass, "setChargeId", argTypes, term1643, args);
    }

};



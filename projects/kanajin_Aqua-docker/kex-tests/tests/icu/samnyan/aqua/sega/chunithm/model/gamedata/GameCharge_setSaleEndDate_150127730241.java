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

public class GameCharge_setSaleEndDate_150127730241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1685;

    public GameCharge_setSaleEndDate_150127730241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1685 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        setLongField(term1685, term1685.getClass(), "id", 0L);
        setIntField(term1685, term1685.getClass(), "orderId", 0);
        setIntField(term1685, term1685.getClass(), "chargeId", 0);
        setIntField(term1685, term1685.getClass(), "price", 0);
        setField(term1685, term1685.getClass(), "startDate", null);
        setField(term1685, term1685.getClass(), "endDate", null);
        setIntField(term1685, term1685.getClass(), "salePrice", 0);
        setField(term1685, term1685.getClass(), "saleStartDate", null);
        setField(term1685, term1685.getClass(), "saleEndDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSaleEndDate", argTypes, term1685, args);
    }

};



package icu.samnyan.aqua.sega.maimai2.model.gamedata;

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
import static icu.samnyan.aqua.sega.maimai2.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameCharge_getEndDate_116255305923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;

    public GameCharge_getEndDate_116255305923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge"));
        setLongField(term916, term916.getClass(), "id", 0L);
        setIntField(term916, term916.getClass(), "orderId", 0);
        setIntField(term916, term916.getClass(), "chargeId", 0);
        setIntField(term916, term916.getClass(), "price", 0);
        setField(term916, term916.getClass(), "startDate", null);
        setField(term916, term916.getClass(), "endDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term916, args);
    }

};



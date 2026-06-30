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

public class GameCharge_getOrderId_6336204561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;

    public GameCharge_getOrderId_6336204561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge"));
        setLongField(term50, term50.getClass(), "id", 6375119433582206027L);
        setIntField(term50, term50.getClass(), "orderId", 391863371);
        setIntField(term50, term50.getClass(), "chargeId", -1922583790);
        setIntField(term50, term50.getClass(), "price", -616727354);
        setField(term50, term50.getClass(), "startDate", "MuLcgQHgqz");
        setField(term50, term50.getClass(), "endDate", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term50, args);
    }

};



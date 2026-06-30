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

public class GameCharge_getEndDate_11625530595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;

    public GameCharge_getEndDate_11625530595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge"));
        setLongField(term246, term246.getClass(), "id", 7411271909051562686L);
        setIntField(term246, term246.getClass(), "orderId", 597278769);
        setIntField(term246, term246.getClass(), "chargeId", -1685132342);
        setIntField(term246, term246.getClass(), "price", -1456670397);
        setField(term246, term246.getClass(), "startDate", "NRdvgJlhkX");
        setField(term246, term246.getClass(), "endDate", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term246, args);
    }

};



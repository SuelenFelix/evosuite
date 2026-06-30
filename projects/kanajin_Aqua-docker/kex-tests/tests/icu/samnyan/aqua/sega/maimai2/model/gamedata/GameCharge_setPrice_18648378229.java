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
import java.lang.Integer;

public class GameCharge_setPrice_18648378229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term477;

    public GameCharge_setPrice_18648378229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge"));
        setLongField(term448, term448.getClass(), "id", -2813493605142626659L);
        setIntField(term448, term448.getClass(), "orderId", -244121226);
        setIntField(term448, term448.getClass(), "chargeId", -203030934);
        setIntField(term448, term448.getClass(), "price", -1179120542);
        setField(term448, term448.getClass(), "startDate", "HyxfbSQYBe");
        setField(term448, term448.getClass(), "endDate", "pCTimMblYc");
        term477 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term477;
        callMethod(klass, "setPrice", argTypes, term448, args);
    }

};



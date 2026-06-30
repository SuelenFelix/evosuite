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

public class GameCharge_getId_3075576420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GameCharge_getId_3075576420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setIntField(term1, term1.getClass(), "orderId", 568599855);
        setIntField(term1, term1.getClass(), "chargeId", 1162663216);
        setIntField(term1, term1.getClass(), "price", 1484323161);
        setField(term1, term1.getClass(), "startDate", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "endDate", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};



package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameSale_setRate_107455142827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510;
     Object term515;

    public GameSale_setRate_107455142827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        setIntField(term510, term510.getClass(), "orderId", 0);
        setIntField(term510, term510.getClass(), "type", 0);
        setIntField(term510, term510.getClass(), "id", 0);
        setIntField(term510, term510.getClass(), "rate", 0);
        setField(term510, term510.getClass(), "startDate", null);
        setField(term510, term510.getClass(), "endDate", null);
        term515 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term515;
        callMethod(klass, "setRate", argTypes, term510, args);
    }

};



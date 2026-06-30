package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameEventItem_canEqual_147145105223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8105;

    public GameEventItem_canEqual_147145105223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8105 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameEventItem"));
        setLongField(term8105, term8105.getClass(), "id", 0L);
        setIntField(term8105, term8105.getClass(), "type", 0);
        setField(term8105, term8105.getClass(), "startDate", null);
        setField(term8105, term8105.getClass(), "endDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameEventItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term8105, args);
    }

};



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
import java.lang.Long;

public class GameEventItem_setId_20043055164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7600;
     Object term7627;

    public GameEventItem_setId_20043055164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7600 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameEventItem"));
        setLongField(term7600, term7600.getClass(), "id", 8039153062846287600L);
        setIntField(term7600, term7600.getClass(), "type", 994300935);
        setField(term7600, term7600.getClass(), "startDate", "eWnrMSbYbT");
        setField(term7600, term7600.getClass(), "endDate", "AjoFvDFyCY");
        term7627 = new Long(-7087265016767824631L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameEventItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7627;
        callMethod(klass, "setId", argTypes, term7600, args);
    }

};



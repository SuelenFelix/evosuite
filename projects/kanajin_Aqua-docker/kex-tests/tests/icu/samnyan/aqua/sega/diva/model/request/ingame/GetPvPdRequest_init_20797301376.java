package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GetPvPdRequest_init_20797301376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273072;
     Object term273074;
     Object term273076;

    public GetPvPdRequest_init_20797301376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273072 = new Integer(1698488383);
        term273074 = new Integer(927121331);
        term273076 = (int[]) newIntArray(7);
        setIntElement(term273076, 0, -1006536193);
        setIntElement(term273076, 1, 615344378);
        setIntElement(term273076, 2, -1668154433);
        setIntElement(term273076, 3, 1858839281);
        setIntElement(term273076, 4, -1206520765);
        setIntElement(term273076, 5, 2098806652);
        setIntElement(term273076, 6, 1659783043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term273072;
        args[1] = term273074;
        args[2] = term273076;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



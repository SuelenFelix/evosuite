package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class MapEncountNpc_setId_127373105021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184529;
     Object term184533;

    public MapEncountNpc_setId_127373105021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184529 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.MapEncountNpc"));
        setLongField(term184529, term184529.getClass(), "id", 0L);
        setIntField(term184529, term184529.getClass(), "npcId", 0);
        setIntField(term184529, term184529.getClass(), "musicId", 0);
        setField(term184529, term184529.getClass(), "userExtend", null);
        setField(term184529, term184529.getClass(), "user", null);
        term184533 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.MapEncountNpc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term184533;
        callMethod(klass, "setId", argTypes, term184529, args);
    }

};



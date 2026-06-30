package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PsRankingCollection_setSecond_61103970516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2019454;

    public PsRankingCollection_setSecond_61103970516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2019454 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.PsRankingCollection"));
        setField(term2019454, term2019454.getClass(), "first", null);
        setField(term2019454, term2019454.getClass(), "second", null);
        setField(term2019454, term2019454.getClass(), "third", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.PsRankingCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSecond", argTypes, term2019454, args);
    }

};



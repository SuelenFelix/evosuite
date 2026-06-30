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

public class UserEventRankingItem_hashCode_122503956312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765;

    public UserEventRankingItem_hashCode_122503956312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term765 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserEventRankingItem"));
        setIntField(term765, term765.getClass(), "eventId", 1328271830);
        setIntField(term765, term765.getClass(), "type", 1596070772);
        setField(term765, term765.getClass(), "date", "vrQLuWIDJX");
        setIntField(term765, term765.getClass(), "rank", 97029295);
        setLongField(term765, term765.getClass(), "point", 1439298019805881866L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserEventRankingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term765, args);
    }

};



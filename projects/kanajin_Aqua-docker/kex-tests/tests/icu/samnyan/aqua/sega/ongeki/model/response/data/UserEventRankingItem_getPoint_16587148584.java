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

public class UserEventRankingItem_getPoint_16587148584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517;

    public UserEventRankingItem_getPoint_16587148584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserEventRankingItem"));
        setIntField(term517, term517.getClass(), "eventId", -73683645);
        setIntField(term517, term517.getClass(), "type", -226514366);
        setField(term517, term517.getClass(), "date", "ZiaGIbnzTs");
        setIntField(term517, term517.getClass(), "rank", 1193880199);
        setLongField(term517, term517.getClass(), "point", 1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserEventRankingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term517, args);
    }

};



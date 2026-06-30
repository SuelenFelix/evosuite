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
import java.lang.Integer;

public class UserEventRankingItem_setRank_156920590824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893;
     Object term898;

    public UserEventRankingItem_setRank_156920590824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term893 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserEventRankingItem"));
        setIntField(term893, term893.getClass(), "eventId", 0);
        setIntField(term893, term893.getClass(), "type", 0);
        setField(term893, term893.getClass(), "date", null);
        setIntField(term893, term893.getClass(), "rank", 0);
        setLongField(term893, term893.getClass(), "point", 0L);
        term898 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserEventRankingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term898;
        callMethod(klass, "setRank", argTypes, term893, args);
    }

};



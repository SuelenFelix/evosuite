package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Deck_getDescription_14286959332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19916;

    public Deck_getDescription_14286959332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19917 = new Long(-4507768716367203234L);
        Long term19946 = new Long(-192072503176550129L);
        Long term19949 = new Long(-4726601557653351735L);
        Long term19952 = new Long(-3548672426577893003L);
        Object term19945 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term19948 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term19951 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term19945, term19945.getClass(), "id", term19946);
        setField(term19948, term19948.getClass(), "id", term19949);
        setField(term19948, term19948.getClass(), "rank", null);
        setField(term19948, term19948.getClass(), "suit", null);
        setField(term19948, term19948.getClass(), "paoCards", null);
        setField(term19945, term19945.getClass(), "card", term19948);
        setField(term19951, term19951.getClass(), "id", term19952);
        setField(term19951, term19951.getClass(), "imageUrl", null);
        setField(term19951, term19951.getClass(), "person", null);
        setField(term19951, term19951.getClass(), "action", null);
        setField(term19951, term19951.getClass(), "object", null);
        setField(term19951, term19951.getClass(), "paoCard", null);
        setField(term19945, term19945.getClass(), "pao", term19951);
        Long term19955 = new Long(987797117310260031L);
        Object term19954 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term19957 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term19958 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term19954, term19954.getClass(), "id", term19955);
        setField(term19957, term19957.getClass(), "id", null);
        setField(term19957, term19957.getClass(), "rank", null);
        setField(term19957, term19957.getClass(), "suit", null);
        setField(term19957, term19957.getClass(), "paoCards", null);
        setField(term19954, term19954.getClass(), "card", term19957);
        setField(term19958, term19958.getClass(), "id", null);
        setField(term19958, term19958.getClass(), "imageUrl", null);
        setField(term19958, term19958.getClass(), "person", null);
        setField(term19958, term19958.getClass(), "action", null);
        setField(term19958, term19958.getClass(), "object", null);
        setField(term19958, term19958.getClass(), "paoCard", null);
        setField(term19954, term19954.getClass(), "pao", term19958);
        ArrayList term19943 = new ArrayList();
        ((ArrayList) term19943).add(term19945);
        ((ArrayList) term19943).add(term19954);
        term19916 = newInstance(Class.forName("com.example.backend.entity.Deck"));
        setField(term19916, term19916.getClass(), "id", term19917);
        setField(term19916, term19916.getClass(), "name", "fgOpAWlGYN");
        setField(term19916, term19916.getClass(), "description", "PNzNzzjSXM");
        setField(term19916, term19916.getClass(), "paoCards", term19943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Deck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term19916, args);
    }

};



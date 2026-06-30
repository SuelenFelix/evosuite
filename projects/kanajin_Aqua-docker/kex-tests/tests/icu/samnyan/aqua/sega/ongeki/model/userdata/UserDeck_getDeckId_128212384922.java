package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDeck_getDeckId_128212384922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150165;

    public UserDeck_getDeckId_128212384922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150165 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        setLongField(term150165, term150165.getClass(), "id", 0L);
        setField(term150165, term150165.getClass(), "user", null);
        setIntField(term150165, term150165.getClass(), "deckId", 0);
        setIntField(term150165, term150165.getClass(), "cardId1", 0);
        setIntField(term150165, term150165.getClass(), "cardId2", 0);
        setIntField(term150165, term150165.getClass(), "cardId3", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeckId", argTypes, term150165, args);
    }

};



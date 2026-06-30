package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerPvCustomize_getButtonSe_188604539437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021257;

    public PlayerPvCustomize_getButtonSe_188604539437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1021257 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        setLongField(term1021257, term1021257.getClass(), "id", 0L);
        setField(term1021257, term1021257.getClass(), "pdId", null);
        setIntField(term1021257, term1021257.getClass(), "pvId", 0);
        setField(term1021257, term1021257.getClass(), "module", null);
        setField(term1021257, term1021257.getClass(), "customize", null);
        setField(term1021257, term1021257.getClass(), "customizeFlag", null);
        setIntField(term1021257, term1021257.getClass(), "skin", 0);
        setIntField(term1021257, term1021257.getClass(), "buttonSe", 0);
        setIntField(term1021257, term1021257.getClass(), "slideSe", 0);
        setIntField(term1021257, term1021257.getClass(), "chainSlideSe", 0);
        setIntField(term1021257, term1021257.getClass(), "sliderTouchSe", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getButtonSe", argTypes, term1021257, args);
    }

};



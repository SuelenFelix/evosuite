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
import java.lang.Integer;

public class PlayerPvCustomize_setButtonSe_110828692848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021351;
     Object term1021359;

    public PlayerPvCustomize_setButtonSe_110828692848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1021351 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        setLongField(term1021351, term1021351.getClass(), "id", 0L);
        setField(term1021351, term1021351.getClass(), "pdId", null);
        setIntField(term1021351, term1021351.getClass(), "pvId", 0);
        setField(term1021351, term1021351.getClass(), "module", null);
        setField(term1021351, term1021351.getClass(), "customize", null);
        setField(term1021351, term1021351.getClass(), "customizeFlag", null);
        setIntField(term1021351, term1021351.getClass(), "skin", 0);
        setIntField(term1021351, term1021351.getClass(), "buttonSe", 0);
        setIntField(term1021351, term1021351.getClass(), "slideSe", 0);
        setIntField(term1021351, term1021351.getClass(), "chainSlideSe", 0);
        setIntField(term1021351, term1021351.getClass(), "sliderTouchSe", 0);
        term1021359 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1021359;
        callMethod(klass, "setButtonSe", argTypes, term1021351, args);
    }

};



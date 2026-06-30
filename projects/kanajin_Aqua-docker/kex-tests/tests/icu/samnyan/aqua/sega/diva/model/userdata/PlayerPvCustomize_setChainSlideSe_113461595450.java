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

public class PlayerPvCustomize_setChainSlideSe_113461595450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021371;
     Object term1021379;

    public PlayerPvCustomize_setChainSlideSe_113461595450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1021371 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        setLongField(term1021371, term1021371.getClass(), "id", 0L);
        setField(term1021371, term1021371.getClass(), "pdId", null);
        setIntField(term1021371, term1021371.getClass(), "pvId", 0);
        setField(term1021371, term1021371.getClass(), "module", null);
        setField(term1021371, term1021371.getClass(), "customize", null);
        setField(term1021371, term1021371.getClass(), "customizeFlag", null);
        setIntField(term1021371, term1021371.getClass(), "skin", 0);
        setIntField(term1021371, term1021371.getClass(), "buttonSe", 0);
        setIntField(term1021371, term1021371.getClass(), "slideSe", 0);
        setIntField(term1021371, term1021371.getClass(), "chainSlideSe", 0);
        setIntField(term1021371, term1021371.getClass(), "sliderTouchSe", 0);
        term1021379 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1021379;
        callMethod(klass, "setChainSlideSe", argTypes, term1021371, args);
    }

};



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

public class PlayerPvCustomize_setPvId_143903934743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021307;
     Object term1021315;

    public PlayerPvCustomize_setPvId_143903934743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1021307 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        setLongField(term1021307, term1021307.getClass(), "id", 0L);
        setField(term1021307, term1021307.getClass(), "pdId", null);
        setIntField(term1021307, term1021307.getClass(), "pvId", 0);
        setField(term1021307, term1021307.getClass(), "module", null);
        setField(term1021307, term1021307.getClass(), "customize", null);
        setField(term1021307, term1021307.getClass(), "customizeFlag", null);
        setIntField(term1021307, term1021307.getClass(), "skin", 0);
        setIntField(term1021307, term1021307.getClass(), "buttonSe", 0);
        setIntField(term1021307, term1021307.getClass(), "slideSe", 0);
        setIntField(term1021307, term1021307.getClass(), "chainSlideSe", 0);
        setIntField(term1021307, term1021307.getClass(), "sliderTouchSe", 0);
        term1021315 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1021315;
        callMethod(klass, "setPvId", argTypes, term1021307, args);
    }

};



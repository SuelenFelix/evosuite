package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PvListEntry_setEdition_76032148623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775;
     Object term779;

    public PvListEntry_setEdition_76032148623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term775, term775.getClass(), "PVID", 0);
        setIntField(term775, term775.getClass(), "Version", 0);
        setIntField(term775, term775.getClass(), "Edition", 0);
        setField(term775, term775.getClass(), "AdvDemo", null);
        setField(term775, term775.getClass(), "Playable", null);
        term779 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term779;
        callMethod(klass, "setEdition", argTypes, term775, args);
    }

};



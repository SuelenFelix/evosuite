package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class QstInfResponse_getQhistr_18727896662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11618;

    public QstInfResponse_getQhistr_18727896662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11618 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse"));
        setField(term11618, term11618.getClass(), "qi_lut", "EULDrUNQvw");
        setField(term11618, term11618.getClass(), "qhi_str", "BtvAvsJSei");
        setField(term11618, term11618.getClass(), "qrai_str", "vqnBkkxoIa");
        setField(term11618, term11618.getClass(), "cmd", "bycpZjxXFn");
        setField(term11618, term11618.getClass(), "req_id", "jQWttOAiwL");
        setField(term11618, term11618.getClass(), "stat", "DzKFxEuEEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQhi_str", argTypes, term11618, args);
    }

};



package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DanMuFormatModel_hashCode_11043083824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3155;

    public DanMuFormatModel_hashCode_11043083824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3156 = new Integer(-817164822);
        term3155 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel"));
        setField(term3155, term3155.getClass(), "id", term3156);
        setIntField(term3155, term3155.getClass(), "fontColor", -1339778481);
        setIntField(term3155, term3155.getClass(), "fontSize", 25);
        setIntField(term3155, term3155.getClass(), "textSpeed", 1725571209);
        setIntField(term3155, term3155.getClass(), "transitionType", 1);
        setIntField(term3155, term3155.getClass(), "popupStyle", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3155, args);
    }

};



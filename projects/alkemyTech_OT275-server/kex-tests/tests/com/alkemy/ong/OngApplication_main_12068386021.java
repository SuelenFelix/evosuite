package com.alkemy.ong;

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
import static com.alkemy.ong.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OngApplication_main_12068386021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27986;

    public OngApplication_main_12068386021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27986 = (Object[]) newArray("java.lang.String", 9);
        setElement(term27986, 0, "cBtfnWBMkE");
        setElement(term27986, 1, "sFixkFlMhw");
        setElement(term27986, 2, "wNaCYPwDGZ");
        setElement(term27986, 3, "CFojehEtAR");
        setElement(term27986, 4, "EYeLeoxDrM");
        setElement(term27986, 5, "zIPJJJubgX");
        setElement(term27986, 6, "WRbxmSFTaO");
        setElement(term27986, 7, "ZekQCuvPXT");
        setElement(term27986, 8, "GUXdlpmVNQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.OngApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27986;
        callMethod(klass, "main", argTypes, null, args);
    }

};



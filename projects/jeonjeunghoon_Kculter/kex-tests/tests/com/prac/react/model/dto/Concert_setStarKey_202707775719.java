package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Concert_setStarKey_202707775719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21247;
     Object term21353;

    public Concert_setStarKey_202707775719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21247 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term21285 = newInstance(Class.forName("java.util.Date"));
        Object term21287 = newInstance(Class.forName("java.util.Date"));
        setIntField(term21247, term21247.getClass(), "concertNum", 213831054);
        setField(term21247, term21247.getClass(), "concertHash", "rLSEheWsHd");
        setField(term21247, term21247.getClass(), "concertName", "DoUKDhlGCY");
        setField(term21247, term21247.getClass(), "explain", "IeoToWsQWU");
        setLongField(term21285, term21285.getClass(), "fastTime", 1595517583842L);
        setField(term21285, term21285.getClass(), "cdate", null);
        setField(term21247, term21247.getClass(), "startDate", term21285);
        setLongField(term21287, term21287.getClass(), "fastTime", 1464421789888L);
        setField(term21287, term21287.getClass(), "cdate", null);
        setField(term21247, term21247.getClass(), "endDate", term21287);
        setDoubleField(term21247, term21247.getClass(), "lat", 0.6221715730666386);
        setDoubleField(term21247, term21247.getClass(), "lng", 0.6375926466054153);
        setIntField(term21247, term21247.getClass(), "starKey", 330043745);
        setField(term21247, term21247.getClass(), "starHash", "QxiiHtQAzN");
        setField(term21247, term21247.getClass(), "imageUrl", "gQgTBlRIvX");
        setIntField(term21247, term21247.getClass(), "status", -509349195);
        setField(term21247, term21247.getClass(), "starName", "ulKaKnANzj");
        setField(term21247, term21247.getClass(), "placeName", "ABwhdjjeJi");
        setField(term21247, term21247.getClass(), "buySite", "KKEcpYXNZV");
        term21353 = new Integer(-1639041228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21353;
        callMethod(klass, "setStarKey", argTypes, term21247, args);
    }

};



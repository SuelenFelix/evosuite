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

public class Concert_setStatus_166737338225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22409;
     Object term22515;

    public Concert_setStatus_166737338225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22409 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term22447 = newInstance(Class.forName("java.util.Date"));
        Object term22449 = newInstance(Class.forName("java.util.Date"));
        setIntField(term22409, term22409.getClass(), "concertNum", -1539747985);
        setField(term22409, term22409.getClass(), "concertHash", "lGVACSQceQ");
        setField(term22409, term22409.getClass(), "concertName", "jpgWRbSvyQ");
        setField(term22409, term22409.getClass(), "explain", "tFMlYmPEBX");
        setLongField(term22447, term22447.getClass(), "fastTime", 1695425269458L);
        setField(term22447, term22447.getClass(), "cdate", null);
        setField(term22409, term22409.getClass(), "startDate", term22447);
        setLongField(term22449, term22449.getClass(), "fastTime", 1362780563394L);
        setField(term22449, term22449.getClass(), "cdate", null);
        setField(term22409, term22409.getClass(), "endDate", term22449);
        setDoubleField(term22409, term22409.getClass(), "lat", 0.13747524521333288);
        setDoubleField(term22409, term22409.getClass(), "lng", 0.7149120009558162);
        setIntField(term22409, term22409.getClass(), "starKey", -1982489643);
        setField(term22409, term22409.getClass(), "starHash", "ljkZxGNgjZ");
        setField(term22409, term22409.getClass(), "imageUrl", "hrFtgdcZKS");
        setIntField(term22409, term22409.getClass(), "status", 550892835);
        setField(term22409, term22409.getClass(), "starName", "ZhZJvpPaTU");
        setField(term22409, term22409.getClass(), "placeName", "NZwUsJxDLI");
        setField(term22409, term22409.getClass(), "buySite", "wlusYBOfXW");
        term22515 = new Integer(1237549886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22515;
        callMethod(klass, "setStatus", argTypes, term22409, args);
    }

};



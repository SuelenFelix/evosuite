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

public class Concert_toString_195244731532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23779;

    public Concert_toString_195244731532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23779 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term23817 = newInstance(Class.forName("java.util.Date"));
        Object term23819 = newInstance(Class.forName("java.util.Date"));
        setIntField(term23779, term23779.getClass(), "concertNum", -781832877);
        setField(term23779, term23779.getClass(), "concertHash", "rWoaXvNyVg");
        setField(term23779, term23779.getClass(), "concertName", "FLzaBCFjGv");
        setField(term23779, term23779.getClass(), "explain", "OLYhTSqTqJ");
        setLongField(term23817, term23817.getClass(), "fastTime", 1332871705432L);
        setField(term23817, term23817.getClass(), "cdate", null);
        setField(term23779, term23779.getClass(), "startDate", term23817);
        setLongField(term23819, term23819.getClass(), "fastTime", 1597233967116L);
        setField(term23819, term23819.getClass(), "cdate", null);
        setField(term23779, term23779.getClass(), "endDate", term23819);
        setDoubleField(term23779, term23779.getClass(), "lat", 0.4335752168808029);
        setDoubleField(term23779, term23779.getClass(), "lng", 0.9196949182738653);
        setIntField(term23779, term23779.getClass(), "starKey", 797203987);
        setField(term23779, term23779.getClass(), "starHash", "AIHoadcpQz");
        setField(term23779, term23779.getClass(), "imageUrl", "fWMsLtuOEV");
        setIntField(term23779, term23779.getClass(), "status", 1973060703);
        setField(term23779, term23779.getClass(), "starName", "fvgZQBalnd");
        setField(term23779, term23779.getClass(), "placeName", "tViQSKUCLE");
        setField(term23779, term23779.getClass(), "buySite", "QbaeHheqiP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term23779, args);
    }

};



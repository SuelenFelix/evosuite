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

public class Concert_setBuySite_104949799231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23571;

    public Concert_setBuySite_104949799231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23571 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term23609 = newInstance(Class.forName("java.util.Date"));
        Object term23611 = newInstance(Class.forName("java.util.Date"));
        setIntField(term23571, term23571.getClass(), "concertNum", 864645689);
        setField(term23571, term23571.getClass(), "concertHash", "KIXGeHXdwi");
        setField(term23571, term23571.getClass(), "concertName", "tTfdvLMwEE");
        setField(term23571, term23571.getClass(), "explain", "DiSkERzqOE");
        setLongField(term23609, term23609.getClass(), "fastTime", 1345923503543L);
        setField(term23609, term23609.getClass(), "cdate", null);
        setField(term23571, term23571.getClass(), "startDate", term23609);
        setLongField(term23611, term23611.getClass(), "fastTime", 1838357779277L);
        setField(term23611, term23611.getClass(), "cdate", null);
        setField(term23571, term23571.getClass(), "endDate", term23611);
        setDoubleField(term23571, term23571.getClass(), "lat", 0.6101411757610665);
        setDoubleField(term23571, term23571.getClass(), "lng", 0.07932996853888874);
        setIntField(term23571, term23571.getClass(), "starKey", 279384872);
        setField(term23571, term23571.getClass(), "starHash", "hPSZZeYqHQ");
        setField(term23571, term23571.getClass(), "imageUrl", "scReMUKyGq");
        setIntField(term23571, term23571.getClass(), "status", 1427305953);
        setField(term23571, term23571.getClass(), "starName", "FmIpnxjRxA");
        setField(term23571, term23571.getClass(), "placeName", "FTjxxGvyun");
        setField(term23571, term23571.getClass(), "buySite", "qsjXSwKloH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DDZHUPglvb";
        callMethod(klass, "setBuySite", argTypes, term23571, args);
    }

};



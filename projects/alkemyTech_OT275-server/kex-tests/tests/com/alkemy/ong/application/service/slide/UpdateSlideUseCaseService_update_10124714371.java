package com.alkemy.ong.application.service.slide;

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
import static com.alkemy.ong.application.service.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class UpdateSlideUseCaseService_update_10124714371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;
     Object term197;
     Object term250;

    public UpdateSlideUseCaseService_update_10124714371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196 = newInstance(Class.forName("com.alkemy.ong.application.service.slide.UpdateSlideUseCaseService"));
        setField(term196, term196.getClass(), "slideRepository", null);
        Long term198 = new Long(-8257434502486459194L);
        Integer term212 = new Integer(1484323161);
        term197 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term197, term197.getClass(), "id", term198);
        setField(term197, term197.getClass(), "imageUrl", "hRNSzYYIrc");
        setField(term197, term197.getClass(), "order", term212);
        setField(term197, term197.getClass(), "text", "RMFIsYGgne");
        setField(term197, term197.getClass(), "base64FileEncoded", "NRdvgJlhkX");
        setField(term197, term197.getClass(), "contentType", "uuaPigETmJ");
        Long term251 = new Long(-8400487765614892086L);
        Integer term265 = new Integer(391863371);
        term250 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term250, term250.getClass(), "id", term251);
        setField(term250, term250.getClass(), "imageUrl", "MxlszYVzRf");
        setField(term250, term250.getClass(), "order", term265);
        setField(term250, term250.getClass(), "text", "LQFpaHEwXR");
        setField(term250, term250.getClass(), "base64FileEncoded", "oVcInYnLWB");
        setField(term250, term250.getClass(), "contentType", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.slide.UpdateSlideUseCaseService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[2];
        args[0] = term197;
        args[1] = term250;
        callMethod(klass, "update", argTypes, term196, args);
    }

};



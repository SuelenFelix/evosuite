package com.alkemy.ong.infrastructure.rest.response.organization;

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
import static com.alkemy.ong.infrastructure.rest.response.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class GetOrganizationResponse_getAddress_8556691083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;

    public GetOrganizationResponse_getAddress_8556691083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term595 = new Integer(1134449235);
        Object term592 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term592, term592.getClass(), "text", "");
        setField(term592, term592.getClass(), "imageUrl", "");
        setField(term592, term592.getClass(), "order", term595);
        Integer term600 = new Integer(-883034806);
        Object term597 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term597, term597.getClass(), "text", "");
        setField(term597, term597.getClass(), "imageUrl", "");
        setField(term597, term597.getClass(), "order", term600);
        Integer term605 = new Integer(1585847225);
        Object term602 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term602, term602.getClass(), "text", "");
        setField(term602, term602.getClass(), "imageUrl", "");
        setField(term602, term602.getClass(), "order", term605);
        Integer term610 = new Integer(597278769);
        Object term607 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term607, term607.getClass(), "text", "");
        setField(term607, term607.getClass(), "imageUrl", "");
        setField(term607, term607.getClass(), "order", term610);
        ArrayList term590 = new ArrayList();
        ((ArrayList) term590).add(term592);
        ((ArrayList) term590).add(term597);
        ((ArrayList) term590).add(term602);
        ((ArrayList) term590).add(term607);
        term541 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term614 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term541, term541.getClass(), "name", "GzFkzHGYFt");
        setField(term541, term541.getClass(), "image", "tShwQLRGNe");
        setField(term541, term541.getClass(), "phone", "LvtrsXUliU");
        setField(term541, term541.getClass(), "address", "xLbjWUgOIL");
        setField(term541, term541.getClass(), "slides", term590);
        setField(term614, term614.getClass(), "facebookUrl", "MLqYREekMl");
        setField(term614, term614.getClass(), "linkedInUrl", "ytSBIKXogI");
        setField(term614, term614.getClass(), "instagramUrl", "nHXjMycHlU");
        setField(term541, term541.getClass(), "socialMedia", term614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term541, args);
    }

};



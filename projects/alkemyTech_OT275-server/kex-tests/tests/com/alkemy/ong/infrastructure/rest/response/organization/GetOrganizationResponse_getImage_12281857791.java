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

public class GetOrganizationResponse_getImage_12281857791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;

    public GetOrganizationResponse_getImage_12281857791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term240 = new Integer(-616727354);
        Object term237 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term237, term237.getClass(), "text", "");
        setField(term237, term237.getClass(), "imageUrl", "");
        setField(term237, term237.getClass(), "order", term240);
        Integer term245 = new Integer(-1955890973);
        Object term242 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term242, term242.getClass(), "text", "");
        setField(term242, term242.getClass(), "imageUrl", "");
        setField(term242, term242.getClass(), "order", term245);
        Integer term250 = new Integer(-2038273078);
        Object term247 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term247, term247.getClass(), "text", "");
        setField(term247, term247.getClass(), "imageUrl", "");
        setField(term247, term247.getClass(), "order", term250);
        Integer term255 = new Integer(1227103734);
        Object term252 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term252, term252.getClass(), "text", "");
        setField(term252, term252.getClass(), "imageUrl", "");
        setField(term252, term252.getClass(), "order", term255);
        ArrayList term235 = new ArrayList();
        ((ArrayList) term235).add(term237);
        ((ArrayList) term235).add(term242);
        ((ArrayList) term235).add(term247);
        ((ArrayList) term235).add(term252);
        term186 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term259 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term186, term186.getClass(), "name", "tbcdzjIfER");
        setField(term186, term186.getClass(), "image", "HyxfbSQYBe");
        setField(term186, term186.getClass(), "phone", "pCTimMblYc");
        setField(term186, term186.getClass(), "address", "hNxWaHcfhY");
        setField(term186, term186.getClass(), "slides", term235);
        setField(term259, term259.getClass(), "facebookUrl", "TEParAifyi");
        setField(term259, term259.getClass(), "linkedInUrl", "OWDIEULEFu");
        setField(term259, term259.getClass(), "instagramUrl", "dWRymuLBtr");
        setField(term186, term186.getClass(), "socialMedia", term259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term186, args);
    }

};



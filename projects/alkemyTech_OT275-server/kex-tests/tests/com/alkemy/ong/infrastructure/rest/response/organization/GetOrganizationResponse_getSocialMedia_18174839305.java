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

public class GetOrganizationResponse_getSocialMedia_18174839305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886;

    public GetOrganizationResponse_getSocialMedia_18174839305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term940 = new Integer(-1456670397);
        Object term937 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term937, term937.getClass(), "text", "");
        setField(term937, term937.getClass(), "imageUrl", "");
        setField(term937, term937.getClass(), "order", term940);
        Integer term945 = new Integer(1622346318);
        Object term942 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term942, term942.getClass(), "text", "");
        setField(term942, term942.getClass(), "imageUrl", "");
        setField(term942, term942.getClass(), "order", term945);
        Integer term950 = new Integer(1048535127);
        Object term947 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term947, term947.getClass(), "text", "");
        setField(term947, term947.getClass(), "imageUrl", "");
        setField(term947, term947.getClass(), "order", term950);
        Integer term955 = new Integer(-655067527);
        Object term952 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term952, term952.getClass(), "text", "");
        setField(term952, term952.getClass(), "imageUrl", "");
        setField(term952, term952.getClass(), "order", term955);
        Integer term960 = new Integer(-6029667);
        Object term957 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term957, term957.getClass(), "text", "");
        setField(term957, term957.getClass(), "imageUrl", "");
        setField(term957, term957.getClass(), "order", term960);
        Integer term965 = new Integer(-2068769794);
        Object term962 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term962, term962.getClass(), "text", "");
        setField(term962, term962.getClass(), "imageUrl", "");
        setField(term962, term962.getClass(), "order", term965);
        ArrayList term935 = new ArrayList();
        ((ArrayList) term935).add(term937);
        ((ArrayList) term935).add(term942);
        ((ArrayList) term935).add(term947);
        ((ArrayList) term935).add(term952);
        ((ArrayList) term935).add(term957);
        ((ArrayList) term935).add(term962);
        term886 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term969 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term886, term886.getClass(), "name", "bLPjGVBhlX");
        setField(term886, term886.getClass(), "image", "whBvTVIIlC");
        setField(term886, term886.getClass(), "phone", "IgRJUzaCwW");
        setField(term886, term886.getClass(), "address", "JUmudUmaaV");
        setField(term886, term886.getClass(), "slides", term935);
        setField(term969, term969.getClass(), "facebookUrl", "LvJFtLBaxj");
        setField(term969, term969.getClass(), "linkedInUrl", "PHvxnGHptP");
        setField(term969, term969.getClass(), "instagramUrl", "TimdotUuNC");
        setField(term886, term886.getClass(), "socialMedia", term969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialMedia", argTypes, term886, args);
    }

};



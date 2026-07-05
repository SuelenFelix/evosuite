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

public class GetOrganizationResponse_getSlides_10380554554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term721;

    public GetOrganizationResponse_getSlides_10380554554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term775 = new Integer(-1685132342);
        Object term772 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term772, term772.getClass(), "text", "");
        setField(term772, term772.getClass(), "imageUrl", "");
        setField(term772, term772.getClass(), "order", term775);
        ArrayList term770 = new ArrayList();
        ((ArrayList) term770).add(term772);
        term721 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term779 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term721, term721.getClass(), "name", "ieCtQFdkii");
        setField(term721, term721.getClass(), "image", "dEnhdmILtU");
        setField(term721, term721.getClass(), "phone", "hoicvmsovO");
        setField(term721, term721.getClass(), "address", "eqJfYWRaEL");
        setField(term721, term721.getClass(), "slides", term770);
        setField(term779, term779.getClass(), "facebookUrl", "kBdSllIBVz");
        setField(term779, term779.getClass(), "linkedInUrl", "TJmVBGfTML");
        setField(term779, term779.getClass(), "instagramUrl", "tPlsykYBqO");
        setField(term721, term721.getClass(), "socialMedia", term779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlides", argTypes, term721, args);
    }

};



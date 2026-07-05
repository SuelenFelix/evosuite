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
import java.util.LinkedList;

public class GetOrganizationResponse_setSlides_135500803710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1884;
     Object term2004;

    public GetOrganizationResponse_setSlides_135500803710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1938 = new Integer(679763016);
        Object term1935 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1935, term1935.getClass(), "text", "");
        setField(term1935, term1935.getClass(), "imageUrl", "");
        setField(term1935, term1935.getClass(), "order", term1938);
        Integer term1943 = new Integer(1962444399);
        Object term1940 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1940, term1940.getClass(), "text", "");
        setField(term1940, term1940.getClass(), "imageUrl", "");
        setField(term1940, term1940.getClass(), "order", term1943);
        Integer term1948 = new Integer(767834723);
        Object term1945 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1945, term1945.getClass(), "text", "");
        setField(term1945, term1945.getClass(), "imageUrl", "");
        setField(term1945, term1945.getClass(), "order", term1948);
        Integer term1953 = new Integer(-602026508);
        Object term1950 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1950, term1950.getClass(), "text", "");
        setField(term1950, term1950.getClass(), "imageUrl", "");
        setField(term1950, term1950.getClass(), "order", term1953);
        Integer term1958 = new Integer(-157887805);
        Object term1955 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1955, term1955.getClass(), "text", "");
        setField(term1955, term1955.getClass(), "imageUrl", "");
        setField(term1955, term1955.getClass(), "order", term1958);
        Integer term1963 = new Integer(1876565163);
        Object term1960 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1960, term1960.getClass(), "text", "");
        setField(term1960, term1960.getClass(), "imageUrl", "");
        setField(term1960, term1960.getClass(), "order", term1963);
        ArrayList term1933 = new ArrayList();
        ((ArrayList) term1933).add(term1935);
        ((ArrayList) term1933).add(term1940);
        ((ArrayList) term1933).add(term1945);
        ((ArrayList) term1933).add(term1950);
        ((ArrayList) term1933).add(term1955);
        ((ArrayList) term1933).add(term1960);
        term1884 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term1967 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1884, term1884.getClass(), "name", "MwwjNtdOFT");
        setField(term1884, term1884.getClass(), "image", "VYkqXKVlAJ");
        setField(term1884, term1884.getClass(), "phone", "XkIoWJRNwN");
        setField(term1884, term1884.getClass(), "address", "aNWLJdrZMq");
        setField(term1884, term1884.getClass(), "slides", term1933);
        setField(term1967, term1967.getClass(), "facebookUrl", "OYbzXylRWW");
        setField(term1967, term1967.getClass(), "linkedInUrl", "DSNsTGYXDF");
        setField(term1967, term1967.getClass(), "instagramUrl", "sQvGcVjdEx");
        setField(term1884, term1884.getClass(), "socialMedia", term1967);
        term2004 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2004;
        callMethod(klass, "setSlides", argTypes, term1884, args);
    }

};



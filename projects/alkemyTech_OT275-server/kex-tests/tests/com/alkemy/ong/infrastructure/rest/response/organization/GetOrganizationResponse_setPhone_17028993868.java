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

public class GetOrganizationResponse_setPhone_17028993868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1480;

    public GetOrganizationResponse_setPhone_17028993868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1534 = new Integer(-1179120542);
        Object term1531 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1531, term1531.getClass(), "text", "");
        setField(term1531, term1531.getClass(), "imageUrl", "");
        setField(term1531, term1531.getClass(), "order", term1534);
        Integer term1539 = new Integer(-73683645);
        Object term1536 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1536, term1536.getClass(), "text", "");
        setField(term1536, term1536.getClass(), "imageUrl", "");
        setField(term1536, term1536.getClass(), "order", term1539);
        Integer term1544 = new Integer(-226514366);
        Object term1541 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1541, term1541.getClass(), "text", "");
        setField(term1541, term1541.getClass(), "imageUrl", "");
        setField(term1541, term1541.getClass(), "order", term1544);
        Integer term1549 = new Integer(1193880199);
        Object term1546 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1546, term1546.getClass(), "text", "");
        setField(term1546, term1546.getClass(), "imageUrl", "");
        setField(term1546, term1546.getClass(), "order", term1549);
        Integer term1554 = new Integer(-1087774327);
        Object term1551 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1551, term1551.getClass(), "text", "");
        setField(term1551, term1551.getClass(), "imageUrl", "");
        setField(term1551, term1551.getClass(), "order", term1554);
        Integer term1559 = new Integer(-1530420153);
        Object term1556 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1556, term1556.getClass(), "text", "");
        setField(term1556, term1556.getClass(), "imageUrl", "");
        setField(term1556, term1556.getClass(), "order", term1559);
        Integer term1564 = new Integer(-469968304);
        Object term1561 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1561, term1561.getClass(), "text", "");
        setField(term1561, term1561.getClass(), "imageUrl", "");
        setField(term1561, term1561.getClass(), "order", term1564);
        ArrayList term1529 = new ArrayList();
        ((ArrayList) term1529).add(term1531);
        ((ArrayList) term1529).add(term1536);
        ((ArrayList) term1529).add(term1541);
        ((ArrayList) term1529).add(term1546);
        ((ArrayList) term1529).add(term1551);
        ((ArrayList) term1529).add(term1556);
        ((ArrayList) term1529).add(term1561);
        term1480 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term1568 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1480, term1480.getClass(), "name", "dpNsDgfPso");
        setField(term1480, term1480.getClass(), "image", "hCWPJQKpdc");
        setField(term1480, term1480.getClass(), "phone", "WzMEhMXkKx");
        setField(term1480, term1480.getClass(), "address", "XOiDvlDhdc");
        setField(term1480, term1480.getClass(), "slides", term1529);
        setField(term1568, term1568.getClass(), "facebookUrl", "PznxWXsZME");
        setField(term1568, term1568.getClass(), "linkedInUrl", "ZzIujlwVsw");
        setField(term1568, term1568.getClass(), "instagramUrl", "LWyEaeIyAo");
        setField(term1480, term1480.getClass(), "socialMedia", term1568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        callMethod(klass, "setPhone", argTypes, term1480, args);
    }

};



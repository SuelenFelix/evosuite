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

public class GetOrganizationResponse_setImage_8045173637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268;

    public GetOrganizationResponse_setImage_8045173637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1322 = new Integer(1135664017);
        Object term1319 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1319, term1319.getClass(), "text", "");
        setField(term1319, term1319.getClass(), "imageUrl", "");
        setField(term1319, term1319.getClass(), "order", term1322);
        Integer term1327 = new Integer(590364439);
        Object term1324 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1324, term1324.getClass(), "text", "");
        setField(term1324, term1324.getClass(), "imageUrl", "");
        setField(term1324, term1324.getClass(), "order", term1327);
        Integer term1332 = new Integer(865208305);
        Object term1329 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1329, term1329.getClass(), "text", "");
        setField(term1329, term1329.getClass(), "imageUrl", "");
        setField(term1329, term1329.getClass(), "order", term1332);
        Integer term1337 = new Integer(-1275173084);
        Object term1334 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1334, term1334.getClass(), "text", "");
        setField(term1334, term1334.getClass(), "imageUrl", "");
        setField(term1334, term1334.getClass(), "order", term1337);
        Integer term1342 = new Integer(-244121226);
        Object term1339 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1339, term1339.getClass(), "text", "");
        setField(term1339, term1339.getClass(), "imageUrl", "");
        setField(term1339, term1339.getClass(), "order", term1342);
        Integer term1347 = new Integer(-203030934);
        Object term1344 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term1344, term1344.getClass(), "text", "");
        setField(term1344, term1344.getClass(), "imageUrl", "");
        setField(term1344, term1344.getClass(), "order", term1347);
        ArrayList term1317 = new ArrayList();
        ((ArrayList) term1317).add(term1319);
        ((ArrayList) term1317).add(term1324);
        ((ArrayList) term1317).add(term1329);
        ((ArrayList) term1317).add(term1334);
        ((ArrayList) term1317).add(term1339);
        ((ArrayList) term1317).add(term1344);
        term1268 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term1351 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1268, term1268.getClass(), "name", "SPpkrGcPRr");
        setField(term1268, term1268.getClass(), "image", "sEccwbJKYE");
        setField(term1268, term1268.getClass(), "phone", "AWRooQKkdW");
        setField(term1268, term1268.getClass(), "address", "vjxIhXHxGR");
        setField(term1268, term1268.getClass(), "slides", term1317);
        setField(term1351, term1351.getClass(), "facebookUrl", "iNwOJRBEjp");
        setField(term1351, term1351.getClass(), "linkedInUrl", "XylxrMBraH");
        setField(term1351, term1351.getClass(), "instagramUrl", "pORebkoRdD");
        setField(term1268, term1268.getClass(), "socialMedia", term1351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mXGCWJDOqA";
        callMethod(klass, "setImage", argTypes, term1268, args);
    }

};



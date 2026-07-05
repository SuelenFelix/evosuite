package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Organization_getSlides_67395947410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2849;

    public Organization_getSlides_67395947410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2850 = new Long(5953383087795962419L);
        Long term2976 = new Long(7994303628307559416L);
        Integer term2979 = new Integer(1632125673);
        Object term2975 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2975, term2975.getClass(), "id", term2976);
        setField(term2975, term2975.getClass(), "imageUrl", "");
        setField(term2975, term2975.getClass(), "order", term2979);
        setField(term2975, term2975.getClass(), "text", "");
        setField(term2975, term2975.getClass(), "base64FileEncoded", "");
        setField(term2975, term2975.getClass(), "contentType", "");
        Long term2985 = new Long(2443640364875054177L);
        Integer term2988 = new Integer(454281060);
        Object term2984 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2984, term2984.getClass(), "id", term2985);
        setField(term2984, term2984.getClass(), "imageUrl", "");
        setField(term2984, term2984.getClass(), "order", term2988);
        setField(term2984, term2984.getClass(), "text", "");
        setField(term2984, term2984.getClass(), "base64FileEncoded", "");
        setField(term2984, term2984.getClass(), "contentType", "");
        Long term2994 = new Long(-1610676979013636850L);
        Integer term2997 = new Integer(-1786399638);
        Object term2993 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2993, term2993.getClass(), "id", term2994);
        setField(term2993, term2993.getClass(), "imageUrl", "");
        setField(term2993, term2993.getClass(), "order", term2997);
        setField(term2993, term2993.getClass(), "text", "");
        setField(term2993, term2993.getClass(), "base64FileEncoded", "");
        setField(term2993, term2993.getClass(), "contentType", "");
        ArrayList term2973 = new ArrayList();
        ((ArrayList) term2973).add(term2975);
        ((ArrayList) term2973).add(term2984);
        ((ArrayList) term2973).add(term2993);
        term2849 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term2912 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term2849, term2849.getClass(), "id", term2850);
        setField(term2849, term2849.getClass(), "name", "vLerpqavFM");
        setField(term2849, term2849.getClass(), "image", "qnvxzwuGKX");
        setField(term2849, term2849.getClass(), "phone", "EdPAvpluZg");
        setField(term2849, term2849.getClass(), "address", "DzHVBMqWtE");
        setField(term2849, term2849.getClass(), "email", "THZSpzBRYP");
        setField(term2912, term2912.getClass(), "facebookUrl", "ZfBIVGBQOE");
        setField(term2912, term2912.getClass(), "linkedInUrl", "QSrDQfEsTR");
        setField(term2912, term2912.getClass(), "instagramUrl", "PsqusYmejD");
        setField(term2849, term2849.getClass(), "socialMedia", term2912);
        setField(term2849, term2849.getClass(), "aboutUsText", "NTWMiBEaDF");
        setField(term2849, term2849.getClass(), "welcomeText", "SPBstwKFVr");
        setField(term2849, term2849.getClass(), "slides", term2973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlides", argTypes, term2849, args);
    }

};



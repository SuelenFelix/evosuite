package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class OrganizationMapper_toEntity_5721414481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term993;
     Object term994;

    public OrganizationMapper_toEntity_5721414481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term993 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.OrganizationMapper"));
        Long term995 = new Long(-6573104506744284592L);
        Long term1121 = new Long(-4920224193275732920L);
        Integer term1124 = new Integer(1227103734);
        Object term1120 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1120, term1120.getClass(), "id", term1121);
        setField(term1120, term1120.getClass(), "imageUrl", "");
        setField(term1120, term1120.getClass(), "order", term1124);
        setField(term1120, term1120.getClass(), "text", "");
        setField(term1120, term1120.getClass(), "base64FileEncoded", "");
        setField(term1120, term1120.getClass(), "contentType", "");
        Long term1130 = new Long(8428634514691209827L);
        Integer term1133 = new Integer(-1339778481);
        Object term1129 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1129, term1129.getClass(), "id", term1130);
        setField(term1129, term1129.getClass(), "imageUrl", "");
        setField(term1129, term1129.getClass(), "order", term1133);
        setField(term1129, term1129.getClass(), "text", "");
        setField(term1129, term1129.getClass(), "base64FileEncoded", "");
        setField(term1129, term1129.getClass(), "contentType", "");
        Long term1139 = new Long(-2585684163342970173L);
        Integer term1142 = new Integer(1725571209);
        Object term1138 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1138, term1138.getClass(), "id", term1139);
        setField(term1138, term1138.getClass(), "imageUrl", "");
        setField(term1138, term1138.getClass(), "order", term1142);
        setField(term1138, term1138.getClass(), "text", "");
        setField(term1138, term1138.getClass(), "base64FileEncoded", "");
        setField(term1138, term1138.getClass(), "contentType", "");
        Long term1148 = new Long(8059786003080744426L);
        Integer term1151 = new Integer(-522618178);
        Object term1147 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1147, term1147.getClass(), "id", term1148);
        setField(term1147, term1147.getClass(), "imageUrl", "");
        setField(term1147, term1147.getClass(), "order", term1151);
        setField(term1147, term1147.getClass(), "text", "");
        setField(term1147, term1147.getClass(), "base64FileEncoded", "");
        setField(term1147, term1147.getClass(), "contentType", "");
        ArrayList term1118 = new ArrayList();
        ((ArrayList) term1118).add(term1120);
        ((ArrayList) term1118).add(term1129);
        ((ArrayList) term1118).add(term1138);
        ((ArrayList) term1118).add(term1147);
        term994 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term1057 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term994, term994.getClass(), "id", term995);
        setField(term994, term994.getClass(), "name", "hoicvmsovO");
        setField(term994, term994.getClass(), "image", "eqJfYWRaEL");
        setField(term994, term994.getClass(), "phone", "fhkbdRViHi");
        setField(term994, term994.getClass(), "address", "uWHnvSvaPl");
        setField(term994, term994.getClass(), "email", "kBdSllIBVz");
        setField(term1057, term1057.getClass(), "facebookUrl", "TJmVBGfTML");
        setField(term1057, term1057.getClass(), "linkedInUrl", "tPlsykYBqO");
        setField(term1057, term1057.getClass(), "instagramUrl", "bLPjGVBhlX");
        setField(term994, term994.getClass(), "socialMedia", term1057);
        setField(term994, term994.getClass(), "aboutUsText", "whBvTVIIlC");
        setField(term994, term994.getClass(), "welcomeText", "IgRJUzaCwW");
        setField(term994, term994.getClass(), "slides", term1118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.OrganizationMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[1];
        args[0] = term994;
        callMethod(klass, "toEntity", argTypes, term993, args);
    }

};



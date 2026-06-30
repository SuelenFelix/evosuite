package com.alkemy.ong.infrastructure.rest.mapper.organization;

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
import static com.alkemy.ong.infrastructure.rest.mapper.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UpdateOrganizationMapper_toResponse_20669209821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term227;

    public UpdateOrganizationMapper_toResponse_20669209821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.UpdateOrganizationMapper"));
        Object term226 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term225, term225.getClass(), "socialMediaMapper", term226);
        Long term228 = new Long(2442117782898005296L);
        Long term354 = new Long(6375119433582206027L);
        Integer term357 = new Integer(568599855);
        Object term353 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term353, term353.getClass(), "id", term354);
        setField(term353, term353.getClass(), "imageUrl", "");
        setField(term353, term353.getClass(), "order", term357);
        setField(term353, term353.getClass(), "text", "");
        setField(term353, term353.getClass(), "base64FileEncoded", "");
        setField(term353, term353.getClass(), "contentType", "");
        Long term363 = new Long(-8257434502486459194L);
        Integer term366 = new Integer(1162663216);
        Object term362 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term362, term362.getClass(), "id", term363);
        setField(term362, term362.getClass(), "imageUrl", "");
        setField(term362, term362.getClass(), "order", term366);
        setField(term362, term362.getClass(), "text", "");
        setField(term362, term362.getClass(), "base64FileEncoded", "");
        setField(term362, term362.getClass(), "contentType", "");
        Long term372 = new Long(-8400487765614892086L);
        Integer term375 = new Integer(1484323161);
        Object term371 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term371, term371.getClass(), "id", term372);
        setField(term371, term371.getClass(), "imageUrl", "");
        setField(term371, term371.getClass(), "order", term375);
        setField(term371, term371.getClass(), "text", "");
        setField(term371, term371.getClass(), "base64FileEncoded", "");
        setField(term371, term371.getClass(), "contentType", "");
        Long term381 = new Long(5270370404989704783L);
        Integer term384 = new Integer(391863371);
        Object term380 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term380, term380.getClass(), "id", term381);
        setField(term380, term380.getClass(), "imageUrl", "");
        setField(term380, term380.getClass(), "order", term384);
        setField(term380, term380.getClass(), "text", "");
        setField(term380, term380.getClass(), "base64FileEncoded", "");
        setField(term380, term380.getClass(), "contentType", "");
        Long term390 = new Long(7411271909051562686L);
        Integer term393 = new Integer(-1922583790);
        Object term389 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term389, term389.getClass(), "id", term390);
        setField(term389, term389.getClass(), "imageUrl", "");
        setField(term389, term389.getClass(), "order", term393);
        setField(term389, term389.getClass(), "text", "");
        setField(term389, term389.getClass(), "base64FileEncoded", "");
        setField(term389, term389.getClass(), "contentType", "");
        ArrayList term351 = new ArrayList();
        ((ArrayList) term351).add(term353);
        ((ArrayList) term351).add(term362);
        ((ArrayList) term351).add(term371);
        ((ArrayList) term351).add(term380);
        ((ArrayList) term351).add(term389);
        term227 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term290 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term227, term227.getClass(), "id", term228);
        setField(term227, term227.getClass(), "name", "NRdvgJlhkX");
        setField(term227, term227.getClass(), "image", "uuaPigETmJ");
        setField(term227, term227.getClass(), "phone", "MxlszYVzRf");
        setField(term227, term227.getClass(), "address", "LQFpaHEwXR");
        setField(term227, term227.getClass(), "email", "oVcInYnLWB");
        setField(term290, term290.getClass(), "facebookUrl", "aJlieCFVtF");
        setField(term290, term290.getClass(), "linkedInUrl", "ZiaGIbnzTs");
        setField(term290, term290.getClass(), "instagramUrl", "tbcdzjIfER");
        setField(term227, term227.getClass(), "socialMedia", term290);
        setField(term227, term227.getClass(), "aboutUsText", "HyxfbSQYBe");
        setField(term227, term227.getClass(), "welcomeText", "pCTimMblYc");
        setField(term227, term227.getClass(), "slides", term351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.UpdateOrganizationMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[1];
        args[0] = term227;
        callMethod(klass, "toResponse", argTypes, term225, args);
    }

};



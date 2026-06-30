package com.alkemy.ong.infrastructure.rest.mapper.member;

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
import static com.alkemy.ong.infrastructure.rest.mapper.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UpdateMemberMapper_toDomain_9865662221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;
     Object term419;
     Object term421;

    public UpdateMemberMapper_toDomain_9865662221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.UpdateMemberMapper"));
        Object term418 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term417, term417.getClass(), "socialMediaMapper", term418);
        term419 = new Long(4872422362414183754L);
        term421 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest"));
        Object term458 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term421, term421.getClass(), "name", "gGSMzuGICf");
        setField(term421, term421.getClass(), "image", "hxCBltsObl");
        setField(term421, term421.getClass(), "description", "BndsHwAFMv");
        setField(term458, term458.getClass(), "facebookUrl", "GzFkzHGYFt");
        setField(term458, term458.getClass(), "linkedInUrl", "tShwQLRGNe");
        setField(term458, term458.getClass(), "instagramUrl", "LvtrsXUliU");
        setField(term421, term421.getClass(), "socialMedia", term458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.UpdateMemberMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest");
        Object[] args = new Object[2];
        args[0] = term419;
        args[1] = term421;
        callMethod(klass, "toDomain", argTypes, term417, args);
    }

};



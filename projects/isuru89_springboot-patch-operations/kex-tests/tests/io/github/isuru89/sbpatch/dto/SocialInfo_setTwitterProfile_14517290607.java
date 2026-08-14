package io.github.isuru89.sbpatch.dto;

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
import static io.github.isuru89.sbpatch.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class SocialInfo_setTwitterProfile_14517290607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1149;

    public SocialInfo_setTwitterProfile_14517290607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1151 = new Long(-2585684163342970173L);
        Object term1203 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1203, term1203.getClass(), "email", null);
        Object term1204 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1204, term1204.getClass(), "email", null);
        Object term1205 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1205, term1205.getClass(), "email", null);
        Object term1206 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1206, term1206.getClass(), "email", null);
        Object term1207 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1207, term1207.getClass(), "email", null);
        Object term1208 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1208, term1208.getClass(), "email", null);
        ArrayList term1201 = new ArrayList();
        ((ArrayList) term1201).add(term1203);
        ((ArrayList) term1201).add(term1204);
        ((ArrayList) term1201).add(term1205);
        ((ArrayList) term1201).add(term1206);
        ((ArrayList) term1201).add(term1207);
        ((ArrayList) term1201).add(term1208);
        Long term1211 = new Long(8059786003080744426L);
        Long term1213 = new Long(-4365849114644724155L);
        term1149 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term1150 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term1150, term1150.getClass(), "id", term1151);
        setField(term1150, term1150.getClass(), "userName", "JUmudUmaaV");
        setField(term1150, term1150.getClass(), "firstName", "KoyGrUJeJW");
        setField(term1150, term1150.getClass(), "lastName", "HqBOwkVqjD");
        setField(term1150, term1150.getClass(), "primaryEmail", "MAcUBcBckh");
        setField(term1150, term1150.getClass(), "secondaryEmails", term1201);
        setField(term1150, term1150.getClass(), "createdAt", term1211);
        setField(term1150, term1150.getClass(), "updatedAt", term1213);
        setField(term1149, term1149.getClass(), "user", term1150);
        setField(term1149, term1149.getClass(), "githubProfile", "jUbSRrkrYZ");
        setField(term1149, term1149.getClass(), "twitterProfile", "bWWfajKbEX");
        setField(term1149, term1149.getClass(), "linkedInProfile", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "setTwitterProfile", argTypes, term1149, args);
    }

};



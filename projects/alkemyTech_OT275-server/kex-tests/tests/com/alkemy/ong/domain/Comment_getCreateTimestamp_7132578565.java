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

public class Comment_getCreateTimestamp_7132578565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8164;

    public Comment_getCreateTimestamp_7132578565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8165 = new Long(-1820639665251914495L);
        Long term8180 = new Long(3238645206498300107L);
        Long term8243 = new Long(-1592696983130738594L);
        Long term8282 = new Long(6902365338255307910L);
        Long term8321 = new Long(-8019730974733786399L);
        Long term8362 = new Long(394960377236392159L);
        Object term8361 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term8361, term8361.getClass(), "id", term8362);
        setField(term8361, term8361.getClass(), "body", null);
        setField(term8361, term8361.getClass(), "createdBy", null);
        setField(term8361, term8361.getClass(), "associatedNews", null);
        setField(term8361, term8361.getClass(), "createTimestamp", null);
        Object term8364 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term8364, term8364.getClass(), "id", null);
        setField(term8364, term8364.getClass(), "body", null);
        setField(term8364, term8364.getClass(), "createdBy", null);
        setField(term8364, term8364.getClass(), "associatedNews", null);
        setField(term8364, term8364.getClass(), "createTimestamp", null);
        ArrayList term8359 = new ArrayList();
        ((ArrayList) term8359).add(term8361);
        ((ArrayList) term8359).add(term8364);
        term8164 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term8179 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term8242 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term8281 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term8320 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term8367 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term8164, term8164.getClass(), "id", term8165);
        setField(term8164, term8164.getClass(), "body", "osFrHWYeRy");
        setField(term8179, term8179.getClass(), "id", term8180);
        setField(term8179, term8179.getClass(), "firstName", "scpIQUfPKw");
        setField(term8179, term8179.getClass(), "lastName", "QKYBpCjuYt");
        setField(term8179, term8179.getClass(), "email", "vjiRfoGdkl");
        setField(term8179, term8179.getClass(), "password", "TwaxeSHvnR");
        setField(term8179, term8179.getClass(), "imageUrl", "paPzDETzIq");
        setField(term8242, term8242.getClass(), "id", term8243);
        setField(term8242, term8242.getClass(), "name", "fufeuGfwpN");
        setField(term8242, term8242.getClass(), "description", "XJbkXbljvz");
        setField(term8179, term8179.getClass(), "role", term8242);
        setField(term8179, term8179.getClass(), "token", "fuvdkDwBeH");
        setField(term8164, term8164.getClass(), "createdBy", term8179);
        setField(term8281, term8281.getClass(), "id", term8282);
        setField(term8281, term8281.getClass(), "name", "NTefzwLPhx");
        setField(term8281, term8281.getClass(), "content", "dirFuhqyNu");
        setField(term8281, term8281.getClass(), "imageUrl", "YVLRenzuoR");
        setField(term8320, term8320.getClass(), "id", term8321);
        setField(term8320, term8320.getClass(), "name", "JukEMhPWql");
        setField(term8320, term8320.getClass(), "description", "ZdNcodHERG");
        setField(term8320, term8320.getClass(), "imageUrl", "CLHomjAqIM");
        setField(term8281, term8281.getClass(), "category", term8320);
        setField(term8281, term8281.getClass(), "comments", term8359);
        setField(term8164, term8164.getClass(), "associatedNews", term8281);
        setIntField(term8367, term8367.getClass(), "nanos", 759000000);
        setLongField(term8367, term8367.getClass(), "fastTime", 1630941844000L);
        setField(term8367, term8367.getClass(), "cdate", null);
        setField(term8164, term8164.getClass(), "createTimestamp", term8367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term8164, args);
    }

};



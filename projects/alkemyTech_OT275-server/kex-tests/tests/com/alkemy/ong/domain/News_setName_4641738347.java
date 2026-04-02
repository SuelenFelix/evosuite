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

public class News_setName_4641738347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18411;

    public News_setName_4641738347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18412 = new Long(-1283936527800858962L);
        Long term18451 = new Long(-8901189796092679153L);
        Long term18492 = new Long(1731335447688885587L);
        Long term18496 = new Long(-6206610574921547811L);
        Long term18499 = new Long(3778691000276335279L);
        Object term18491 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term18495 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term18498 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term18501 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term18491, term18491.getClass(), "id", term18492);
        setField(term18491, term18491.getClass(), "body", "");
        setField(term18495, term18495.getClass(), "id", term18496);
        setField(term18495, term18495.getClass(), "firstName", null);
        setField(term18495, term18495.getClass(), "lastName", null);
        setField(term18495, term18495.getClass(), "email", null);
        setField(term18495, term18495.getClass(), "password", null);
        setField(term18495, term18495.getClass(), "imageUrl", null);
        setField(term18495, term18495.getClass(), "role", null);
        setField(term18495, term18495.getClass(), "token", null);
        setField(term18491, term18491.getClass(), "createdBy", term18495);
        setField(term18498, term18498.getClass(), "id", term18499);
        setField(term18498, term18498.getClass(), "name", null);
        setField(term18498, term18498.getClass(), "content", null);
        setField(term18498, term18498.getClass(), "imageUrl", null);
        setField(term18498, term18498.getClass(), "category", null);
        setField(term18498, term18498.getClass(), "comments", null);
        setField(term18491, term18491.getClass(), "associatedNews", term18498);
        setIntField(term18501, term18501.getClass(), "nanos", 658000000);
        setLongField(term18501, term18501.getClass(), "fastTime", 1456363915000L);
        setField(term18501, term18501.getClass(), "cdate", null);
        setField(term18491, term18491.getClass(), "createTimestamp", term18501);
        ArrayList term18489 = new ArrayList();
        ((ArrayList) term18489).add(term18491);
        term18411 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term18450 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term18411, term18411.getClass(), "id", term18412);
        setField(term18411, term18411.getClass(), "name", "PvtJhtGffh");
        setField(term18411, term18411.getClass(), "content", "KReGJTSQuY");
        setField(term18411, term18411.getClass(), "imageUrl", "hqZmoXoMuS");
        setField(term18450, term18450.getClass(), "id", term18451);
        setField(term18450, term18450.getClass(), "name", "PUPJWadLXP");
        setField(term18450, term18450.getClass(), "description", "TBNsemBBKA");
        setField(term18450, term18450.getClass(), "imageUrl", "DpNDxwXKkX");
        setField(term18411, term18411.getClass(), "category", term18450);
        setField(term18411, term18411.getClass(), "comments", term18489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.News");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "riyKkxMvWm";
        callMethod(klass, "setName", argTypes, term18411, args);
    }

};



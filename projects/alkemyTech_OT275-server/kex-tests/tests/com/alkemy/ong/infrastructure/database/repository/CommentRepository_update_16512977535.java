package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class CommentRepository_update_16512977535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362;

    public CommentRepository_update_16512977535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term363 = new Long(-7672528020740371001L);
        Long term378 = new Long(-4502405999831680926L);
        Long term441 = new Long(1967728129628047933L);
        Long term480 = new Long(2120084523938730454L);
        Long term519 = new Long(6855071767938501807L);
        Long term560 = new Long(-5892135042702373494L);
        Object term559 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term559, term559.getClass(), "id", term560);
        setField(term559, term559.getClass(), "body", null);
        setField(term559, term559.getClass(), "createdBy", null);
        setField(term559, term559.getClass(), "associatedNews", null);
        setField(term559, term559.getClass(), "createTimestamp", null);
        Object term562 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term562, term562.getClass(), "id", null);
        setField(term562, term562.getClass(), "body", null);
        setField(term562, term562.getClass(), "createdBy", null);
        setField(term562, term562.getClass(), "associatedNews", null);
        setField(term562, term562.getClass(), "createTimestamp", null);
        ArrayList term557 = new ArrayList();
        ((ArrayList) term557).add(term559);
        ((ArrayList) term557).add(term562);
        term362 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term377 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term440 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term479 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term518 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term565 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term362, term362.getClass(), "id", term363);
        setField(term362, term362.getClass(), "body", "idgaQsnJpQ");
        setField(term377, term377.getClass(), "id", term378);
        setField(term377, term377.getClass(), "firstName", "VgZnGoIFwQ");
        setField(term377, term377.getClass(), "lastName", "jUbSRrkrYZ");
        setField(term377, term377.getClass(), "email", "bWWfajKbEX");
        setField(term377, term377.getClass(), "password", "cAPeiZHKGJ");
        setField(term377, term377.getClass(), "imageUrl", "LvJFtLBaxj");
        setField(term440, term440.getClass(), "id", term441);
        setField(term440, term440.getClass(), "name", "PHvxnGHptP");
        setField(term440, term440.getClass(), "description", "TimdotUuNC");
        setField(term377, term377.getClass(), "role", term440);
        setField(term377, term377.getClass(), "token", "PkWMRdJcBb");
        setField(term362, term362.getClass(), "createdBy", term377);
        setField(term479, term479.getClass(), "id", term480);
        setField(term479, term479.getClass(), "name", "jSpAteRute");
        setField(term479, term479.getClass(), "content", "swZVeJAxjt");
        setField(term479, term479.getClass(), "imageUrl", "xOcJIiQQDu");
        setField(term518, term518.getClass(), "id", term519);
        setField(term518, term518.getClass(), "name", "GVizqqzXpy");
        setField(term518, term518.getClass(), "description", "JqXGgAhZPl");
        setField(term518, term518.getClass(), "imageUrl", "jiKYgYHqIS");
        setField(term479, term479.getClass(), "category", term518);
        setField(term479, term479.getClass(), "comments", term557);
        setField(term362, term362.getClass(), "associatedNews", term479);
        setIntField(term565, term565.getClass(), "nanos", 25000000);
        setLongField(term565, term565.getClass(), "fastTime", 1797192828000L);
        setField(term565, term565.getClass(), "cdate", null);
        setField(term362, term362.getClass(), "createTimestamp", term565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.CommentRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[1];
        args[0] = term362;
        callMethod(klass, "update", argTypes, null, args);
    }

};



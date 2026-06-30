package com.alkemy.ong.infrastructure.rest.mapper.comment;

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
import static com.alkemy.ong.infrastructure.rest.mapper.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class GetCommentMapper_toResponse_12265524341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;
     Object term605;

    public GetCommentMapper_toResponse_12265524341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.GetCommentMapper"));
        Long term606 = new Long(-5892135042702373494L);
        Long term621 = new Long(5262507301787091109L);
        Long term684 = new Long(-6823727938421990489L);
        Long term723 = new Long(-484994522244390100L);
        Long term762 = new Long(1233889271256172047L);
        Long term803 = new Long(6617340557564669657L);
        Object term802 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term802, term802.getClass(), "id", term803);
        setField(term802, term802.getClass(), "body", null);
        setField(term802, term802.getClass(), "createdBy", null);
        setField(term802, term802.getClass(), "associatedNews", null);
        setField(term802, term802.getClass(), "createTimestamp", null);
        Object term805 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term805, term805.getClass(), "id", null);
        setField(term805, term805.getClass(), "body", null);
        setField(term805, term805.getClass(), "createdBy", null);
        setField(term805, term805.getClass(), "associatedNews", null);
        setField(term805, term805.getClass(), "createTimestamp", null);
        ArrayList term800 = new ArrayList();
        ((ArrayList) term800).add(term802);
        ((ArrayList) term800).add(term805);
        term605 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term620 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term683 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term722 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term761 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term808 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term605, term605.getClass(), "id", term606);
        setField(term605, term605.getClass(), "body", "swZVeJAxjt");
        setField(term620, term620.getClass(), "id", term621);
        setField(term620, term620.getClass(), "firstName", "xOcJIiQQDu");
        setField(term620, term620.getClass(), "lastName", "GVizqqzXpy");
        setField(term620, term620.getClass(), "email", "JqXGgAhZPl");
        setField(term620, term620.getClass(), "password", "jiKYgYHqIS");
        setField(term620, term620.getClass(), "imageUrl", "DfISiziTgG");
        setField(term683, term683.getClass(), "id", term684);
        setField(term683, term683.getClass(), "name", "XqgfKFvPSD");
        setField(term683, term683.getClass(), "description", "JiVRgTZvKc");
        setField(term620, term620.getClass(), "role", term683);
        setField(term620, term620.getClass(), "token", "XPKmummaqg");
        setField(term605, term605.getClass(), "createdBy", term620);
        setField(term722, term722.getClass(), "id", term723);
        setField(term722, term722.getClass(), "name", "BKLfkLiZTH");
        setField(term722, term722.getClass(), "content", "SPpkrGcPRr");
        setField(term722, term722.getClass(), "imageUrl", "sEccwbJKYE");
        setField(term761, term761.getClass(), "id", term762);
        setField(term761, term761.getClass(), "name", "AWRooQKkdW");
        setField(term761, term761.getClass(), "description", "vjxIhXHxGR");
        setField(term761, term761.getClass(), "imageUrl", "QXzGXbEXMu");
        setField(term722, term722.getClass(), "category", term761);
        setField(term722, term722.getClass(), "comments", term800);
        setField(term605, term605.getClass(), "associatedNews", term722);
        setIntField(term808, term808.getClass(), "nanos", 25000000);
        setLongField(term808, term808.getClass(), "fastTime", 1797192828000L);
        setField(term808, term808.getClass(), "cdate", null);
        setField(term605, term605.getClass(), "createTimestamp", term808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.GetCommentMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[1];
        args[0] = term605;
        callMethod(klass, "toResponse", argTypes, term604, args);
    }

};



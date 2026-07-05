package com.alkemy.ong.infrastructure.rest.mapper.news;

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
import static com.alkemy.ong.infrastructure.rest.mapper.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Long;
import java.util.ArrayList;

public class GetNewsMapper_toResponse_6333372091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;
     Object term200;

    public GetNewsMapper_toResponse_6333372091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsMapper"));
        Object term199 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        setField(term198, term198.getClass(), "getCategoryMapper", term199);
        Long term204 = new Long(5262507301787091109L);
        Long term243 = new Long(-6823727938421990489L);
        ArrayList term248 = new ArrayList();
        Object term203 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term242 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term203, term203.getClass(), "id", term204);
        setField(term203, term203.getClass(), "name", "PHvxnGHptP");
        setField(term203, term203.getClass(), "content", "TimdotUuNC");
        setField(term203, term203.getClass(), "imageUrl", "PkWMRdJcBb");
        setField(term242, term242.getClass(), "id", term243);
        setField(term242, term242.getClass(), "name", "");
        setField(term242, term242.getClass(), "description", "");
        setField(term242, term242.getClass(), "imageUrl", "");
        setField(term203, term203.getClass(), "category", term242);
        setField(term203, term203.getClass(), "comments", term248);
        Long term254 = new Long(-484994522244390100L);
        Long term260 = new Long(1233889271256172047L);
        ArrayList term262 = new ArrayList();
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        Object term253 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term259 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term253, term253.getClass(), "id", term254);
        setField(term253, term253.getClass(), "name", "");
        setField(term253, term253.getClass(), "content", "");
        setField(term253, term253.getClass(), "imageUrl", "");
        setField(term259, term259.getClass(), "id", term260);
        setField(term259, term259.getClass(), "name", null);
        setField(term259, term259.getClass(), "description", null);
        setField(term259, term259.getClass(), "imageUrl", null);
        setField(term253, term253.getClass(), "category", term259);
        setField(term253, term253.getClass(), "comments", term262);
        Long term267 = new Long(682356318767179819L);
        Object term266 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        setField(term266, term266.getClass(), "id", term267);
        setField(term266, term266.getClass(), "name", null);
        setField(term266, term266.getClass(), "content", null);
        setField(term266, term266.getClass(), "imageUrl", null);
        setField(term266, term266.getClass(), "category", null);
        setField(term266, term266.getClass(), "comments", null);
        term200 = new LinkedList();
        ((LinkedList) term200).add(term203);
        ((LinkedList) term200).add(term253);
        ((LinkedList) term200).add(term266);
        ((LinkedList) term200).add((Object)null);
        ((LinkedList) term200).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term200;
        callMethod(klass, "toResponse", argTypes, term198, args);
    }

};



package com.alkemy.ong.infrastructure.rest.mapper.slide;

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
import static com.alkemy.ong.infrastructure.rest.mapper.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class SlideWithTextMapper_toResponse_11772762860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;
     Object term269;

    public SlideWithTextMapper_toResponse_11772762860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideWithTextMapper"));
        Long term273 = new Long(4872422362414183754L);
        Integer term287 = new Integer(-1955890973);
        Object term272 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term272, term272.getClass(), "id", term273);
        setField(term272, term272.getClass(), "imageUrl", "BYqFIqCKAV");
        setField(term272, term272.getClass(), "order", term287);
        setField(term272, term272.getClass(), "text", "vrQLuWIDJX");
        setField(term272, term272.getClass(), "base64FileEncoded", "flxyYxBRtu");
        setField(term272, term272.getClass(), "contentType", "OclPbYPkcH");
        Long term327 = new Long(6811161968424632369L);
        Integer term330 = new Integer(-2038273078);
        Object term326 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term326, term326.getClass(), "id", term327);
        setField(term326, term326.getClass(), "imageUrl", "");
        setField(term326, term326.getClass(), "order", term330);
        setField(term326, term326.getClass(), "text", "");
        setField(term326, term326.getClass(), "base64FileEncoded", "");
        setField(term326, term326.getClass(), "contentType", "");
        Long term337 = new Long(-7237588299778557629L);
        Integer term339 = new Integer(1227103734);
        Object term336 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term336, term336.getClass(), "id", term337);
        setField(term336, term336.getClass(), "imageUrl", null);
        setField(term336, term336.getClass(), "order", term339);
        setField(term336, term336.getClass(), "text", null);
        setField(term336, term336.getClass(), "base64FileEncoded", null);
        setField(term336, term336.getClass(), "contentType", null);
        term269 = new LinkedList();
        ((LinkedList) term269).add(term272);
        ((LinkedList) term269).add(term326);
        ((LinkedList) term269).add(term336);
        ((LinkedList) term269).add((Object)null);
        ((LinkedList) term269).add((Object)null);
        ((LinkedList) term269).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideWithTextMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term269;
        callMethod(klass, "toResponse", argTypes, term268, args);
    }

};



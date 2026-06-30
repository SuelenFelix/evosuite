package com.datajpa.relationship.dto.requestDto;

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
import static com.datajpa.relationship.dto.requestDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class BookRequestDto_getName_17774713041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;

    public BookRequestDto_getName_17774713041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term820 = new Long(-6573104506744284592L);
        Long term822 = new Long(-4920224193275732920L);
        Long term824 = new Long(8428634514691209827L);
        Long term826 = new Long(-2585684163342970173L);
        Long term828 = new Long(8059786003080744426L);
        ArrayList term818 = new ArrayList();
        ((ArrayList) term818).add(term820);
        ((ArrayList) term818).add(term822);
        ((ArrayList) term818).add(term824);
        ((ArrayList) term818).add(term826);
        ((ArrayList) term818).add(term828);
        Long term832 = new Long(-4365849114644724155L);
        term805 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term805, term805.getClass(), "name", "AijpHYOFuy");
        setField(term805, term805.getClass(), "authorIds", term818);
        setField(term805, term805.getClass(), "categoryId", term832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term805, args);
    }

};



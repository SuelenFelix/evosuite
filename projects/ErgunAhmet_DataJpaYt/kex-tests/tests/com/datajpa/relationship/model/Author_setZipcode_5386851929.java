package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Author_setZipcode_5386851929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3583;
     Object term3632;

    public Author_setZipcode_5386851929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3584 = new Long(-8603648071751666348L);
        Long term3599 = new Long(-7884871963229073324L);
        Long term3614 = new Long(-8649738738252714180L);
        ArrayList term3628 = new ArrayList();
        term3583 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3598 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3613 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3583, term3583.getClass(), "id", term3584);
        setField(term3583, term3583.getClass(), "name", "hMmaoREuCK");
        setField(term3598, term3598.getClass(), "id", term3599);
        setField(term3598, term3598.getClass(), "name", "VeDtgDzGAN");
        setField(term3613, term3613.getClass(), "id", term3614);
        setField(term3613, term3613.getClass(), "name", "aWYOWZFyaX");
        setField(term3598, term3598.getClass(), "city", term3613);
        setField(term3583, term3583.getClass(), "zipcode", term3598);
        setField(term3583, term3583.getClass(), "books", term3628);
        Long term3633 = new Long(-7278883608542636188L);
        Long term3648 = new Long(-1539859611880912454L);
        term3632 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3647 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3632, term3632.getClass(), "id", term3633);
        setField(term3632, term3632.getClass(), "name", "BRIVNtfUWU");
        setField(term3647, term3647.getClass(), "id", term3648);
        setField(term3647, term3647.getClass(), "name", "DbiCVtPPCT");
        setField(term3632, term3632.getClass(), "city", term3647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Zipcode");
        Object[] args = new Object[1];
        args[0] = term3632;
        callMethod(klass, "setZipcode", argTypes, term3583, args);
    }

};



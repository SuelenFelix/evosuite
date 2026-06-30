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
import java.util.ArrayList;
import java.lang.Object;

public class Book_deleteAuthor_19708109232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528;
     Object term566;

    public Book_deleteAuthor_19708109232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term529 = new Long(6855071767938501807L);
        ArrayList term543 = new ArrayList();
        Long term548 = new Long(-5892135042702373494L);
        ArrayList term562 = new ArrayList();
        term528 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term547 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term528, term528.getClass(), "id", term529);
        setField(term528, term528.getClass(), "name", "AijpHYOFuy");
        setField(term528, term528.getClass(), "authors", term543);
        setField(term547, term547.getClass(), "id", term548);
        setField(term547, term547.getClass(), "name", "SbAoxhfrkn");
        setField(term547, term547.getClass(), "books", term562);
        setField(term528, term528.getClass(), "category", term547);
        Long term567 = new Long(5262507301787091109L);
        Long term582 = new Long(-6823727938421990489L);
        Long term597 = new Long(-484994522244390100L);
        ArrayList term611 = new ArrayList();
        term566 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term581 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term596 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term566, term566.getClass(), "id", term567);
        setField(term566, term566.getClass(), "name", "kuTXqwMtDB");
        setField(term581, term581.getClass(), "id", term582);
        setField(term581, term581.getClass(), "name", "Ghbwtircqb");
        setField(term596, term596.getClass(), "id", term597);
        setField(term596, term596.getClass(), "name", "xrwlQZdwCp");
        setField(term581, term581.getClass(), "city", term596);
        setField(term566, term566.getClass(), "zipcode", term581);
        setField(term566, term566.getClass(), "books", term611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Author");
        Object[] args = new Object[1];
        args[0] = term566;
        callMethod(klass, "deleteAuthor", argTypes, term528, args);
    }

};



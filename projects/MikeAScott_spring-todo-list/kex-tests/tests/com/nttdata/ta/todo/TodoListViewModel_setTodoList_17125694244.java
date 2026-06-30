package com.nttdata.ta.todo;

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
import static com.nttdata.ta.todo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class TodoListViewModel_setTodoList_17125694244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678;
     Object term683;

    public TodoListViewModel_setTodoList_17125694244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term679 = new ArrayList();
        term678 = newInstance(Class.forName("com.nttdata.ta.todo.TodoListViewModel"));
        setField(term678, term678.getClass(), "todoList", term679);
        Long term686 = new Long(-8885298608300233488L);
        Object term685 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term685, term685.getClass(), "id", term686);
        setField(term685, term685.getClass(), "category", "IoAlmYsBwc");
        setField(term685, term685.getClass(), "name", "TEParAifyi");
        setBooleanField(term685, term685.getClass(), "complete", true);
        Long term714 = new Long(-4325723315152823407L);
        Object term713 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term713, term713.getClass(), "id", term714);
        setField(term713, term713.getClass(), "category", "OWDIEULEFu");
        setField(term713, term713.getClass(), "name", "dWRymuLBtr");
        setBooleanField(term713, term713.getClass(), "complete", false);
        Long term742 = new Long(2535595959091595249L);
        Object term741 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term741, term741.getClass(), "id", term742);
        setField(term741, term741.getClass(), "category", "AijpHYOFuy");
        setField(term741, term741.getClass(), "name", "SbAoxhfrkn");
        setBooleanField(term741, term741.getClass(), "complete", true);
        Long term770 = new Long(-5476826692763582090L);
        Object term769 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term769, term769.getClass(), "id", term770);
        setField(term769, term769.getClass(), "category", "kuTXqwMtDB");
        setField(term769, term769.getClass(), "name", "Ghbwtircqb");
        setBooleanField(term769, term769.getClass(), "complete", false);
        Long term798 = new Long(-872011222785455006L);
        Object term797 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term797, term797.getClass(), "id", term798);
        setField(term797, term797.getClass(), "category", "xrwlQZdwCp");
        setField(term797, term797.getClass(), "name", "IDCWpPLRkE");
        setBooleanField(term797, term797.getClass(), "complete", false);
        Long term826 = new Long(-316468845751588286L);
        Object term825 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term825, term825.getClass(), "id", term826);
        setField(term825, term825.getClass(), "category", "nyiiPDVjAc");
        setField(term825, term825.getClass(), "name", "aKnKipADSo");
        setBooleanField(term825, term825.getClass(), "complete", true);
        term683 = new ArrayList();
        ((ArrayList) term683).add(term685);
        ((ArrayList) term683).add(term713);
        ((ArrayList) term683).add(term741);
        ((ArrayList) term683).add(term769);
        ((ArrayList) term683).add(term797);
        ((ArrayList) term683).add(term825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoListViewModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = term683;
        callMethod(klass, "setTodoList", argTypes, term678, args);
    }

};



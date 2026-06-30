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

public class TodoListViewModel_init_11411053082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;

    public TodoListViewModel_init_11411053082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term432 = new Long(4872422362414183754L);
        Object term431 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term431, term431.getClass(), "id", term432);
        setField(term431, term431.getClass(), "category", "HyxfbSQYBe");
        setField(term431, term431.getClass(), "name", "pCTimMblYc");
        setBooleanField(term431, term431.getClass(), "complete", true);
        Long term460 = new Long(6811161968424632369L);
        Object term459 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term459, term459.getClass(), "id", term460);
        setField(term459, term459.getClass(), "category", "hNxWaHcfhY");
        setField(term459, term459.getClass(), "name", "RkybSrpybU");
        setBooleanField(term459, term459.getClass(), "complete", true);
        Long term488 = new Long(-7237588299778557629L);
        Object term487 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term487, term487.getClass(), "id", term488);
        setField(term487, term487.getClass(), "category", "xOEqzGAmDU");
        setField(term487, term487.getClass(), "name", "eZFUvlxvGV");
        setBooleanField(term487, term487.getClass(), "complete", false);
        Long term516 = new Long(6967924379644551255L);
        Object term515 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term515, term515.getClass(), "id", term516);
        setField(term515, term515.getClass(), "category", "BYqFIqCKAV");
        setField(term515, term515.getClass(), "name", "vrQLuWIDJX");
        setBooleanField(term515, term515.getClass(), "complete", true);
        Long term544 = new Long(-2813493605142626659L);
        Object term543 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term543, term543.getClass(), "id", term544);
        setField(term543, term543.getClass(), "category", "flxyYxBRtu");
        setField(term543, term543.getClass(), "name", "OclPbYPkcH");
        setBooleanField(term543, term543.getClass(), "complete", false);
        term429 = new ArrayList();
        ((ArrayList) term429).add(term431);
        ((ArrayList) term429).add(term459);
        ((ArrayList) term429).add(term487);
        ((ArrayList) term429).add(term515);
        ((ArrayList) term429).add(term543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoListViewModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = term429;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



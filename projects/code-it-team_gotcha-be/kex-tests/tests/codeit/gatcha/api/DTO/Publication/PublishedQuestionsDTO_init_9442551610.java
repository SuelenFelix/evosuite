package codeit.gatcha.api.DTO.Publication;

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
import static codeit.gatcha.api.DTO.Publication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class PublishedQuestionsDTO_init_9442551610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;

    public PublishedQuestionsDTO_init_9442551610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term515 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO"));
        setField(term515, term515.getClass(), "body", "fhkbdRViHi");
        setField(term515, term515.getClass(), "answer", "uWHnvSvaPl");
        Object term541 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO"));
        setField(term541, term541.getClass(), "body", "");
        setField(term541, term541.getClass(), "answer", "");
        Object term545 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO"));
        setField(term545, term545.getClass(), "body", null);
        setField(term545, term545.getClass(), "answer", null);
        term512 = new LinkedList();
        ((LinkedList) term512).add(term515);
        ((LinkedList) term512).add(term541);
        ((LinkedList) term512).add(term545);
        ((LinkedList) term512).add((Object)null);
        ((LinkedList) term512).add((Object)null);
        ((LinkedList) term512).add((Object)null);
        ((LinkedList) term512).add((Object)null);
        ((LinkedList) term512).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionsDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term512;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



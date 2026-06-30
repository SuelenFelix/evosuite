package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class PaoCard_setPao_9940284156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4281;
     Object term4369;

    public PaoCard_setPao_9940284156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4282 = new Long(-6301101997917060727L);
        Long term4285 = new Long(8166095254618543564L);
        Class<? extends Object> term4435 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term4434 = ((Class) term4435).getDeclaredField((String) "THREE");
        ((Field) term4434).setAccessible(true);
        Object enum18 = ((Field) term4434).get((Object) null);
        Class<? extends Object> term4612 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term4611 = ((Class) term4612).getDeclaredField((String) "DIAMONDS");
        ((Field) term4611).setAccessible(true);
        Object enum19 = ((Field) term4611).get((Object) null);
        Long term4311 = new Long(-4598158870068953328L);
        Object term4310 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term4310, term4310.getClass(), "id", term4311);
        setField(term4310, term4310.getClass(), "card", null);
        setField(term4310, term4310.getClass(), "pao", null);
        Object term4313 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term4313, term4313.getClass(), "id", null);
        setField(term4313, term4313.getClass(), "card", null);
        setField(term4313, term4313.getClass(), "pao", null);
        Object term4314 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term4314, term4314.getClass(), "id", null);
        setField(term4314, term4314.getClass(), "card", null);
        setField(term4314, term4314.getClass(), "pao", null);
        Object term4315 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term4315, term4315.getClass(), "id", null);
        setField(term4315, term4315.getClass(), "card", null);
        setField(term4315, term4315.getClass(), "pao", null);
        ArrayList term4308 = new ArrayList();
        ((ArrayList) term4308).add(term4310);
        ((ArrayList) term4308).add(term4313);
        ((ArrayList) term4308).add(term4314);
        ((ArrayList) term4308).add(term4310);
        ((ArrayList) term4308).add(term4315);
        ((ArrayList) term4308).add(term4314);
        Long term4319 = new Long(4266570509071948633L);
        term4281 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term4284 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term4318 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term4281, term4281.getClass(), "id", term4282);
        setField(term4284, term4284.getClass(), "id", term4285);
        setField(term4284, term4284.getClass(), "rank", enum18);
        setField(term4284, term4284.getClass(), "suit", enum19);
        setField(term4284, term4284.getClass(), "paoCards", term4308);
        setField(term4281, term4281.getClass(), "card", term4284);
        setField(term4318, term4318.getClass(), "id", term4319);
        setField(term4318, term4318.getClass(), "imageUrl", "kNqaJKIATy");
        setField(term4318, term4318.getClass(), "person", "vKQukfbJUd");
        setField(term4318, term4318.getClass(), "action", "lFRJFUMVbx");
        setField(term4318, term4318.getClass(), "object", "sZdUNdggUW");
        setField(term4318, term4318.getClass(), "paoCard", term4314);
        setField(term4281, term4281.getClass(), "pao", term4318);
        Long term4370 = new Long(-7291742736502427077L);
        Long term4421 = new Long(-8121849829073967555L);
        Long term4424 = new Long(5219030281405653303L);
        Class<? extends Object> term4878 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term4877 = ((Class) term4878).getDeclaredField((String) "FIVE");
        ((Field) term4877).setAccessible(true);
        Object enum20 = ((Field) term4877).get((Object) null);
        ArrayList term4429 = new ArrayList();
        ((ArrayList) term4429).add((Object)null);
        ((ArrayList) term4429).add((Object)null);
        term4369 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term4420 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term4423 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term4433 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term4369, term4369.getClass(), "id", term4370);
        setField(term4369, term4369.getClass(), "imageUrl", "OqbwYQfvAe");
        setField(term4369, term4369.getClass(), "person", "tRxZafjqIx");
        setField(term4369, term4369.getClass(), "action", "DhjNLmRMCu");
        setField(term4369, term4369.getClass(), "object", "PgPzMSEjjX");
        setField(term4420, term4420.getClass(), "id", term4421);
        setField(term4423, term4423.getClass(), "id", term4424);
        setField(term4423, term4423.getClass(), "rank", enum20);
        setField(term4423, term4423.getClass(), "suit", enum19);
        setField(term4423, term4423.getClass(), "paoCards", term4429);
        setField(term4420, term4420.getClass(), "card", term4423);
        setField(term4433, term4433.getClass(), "id", null);
        setField(term4433, term4433.getClass(), "imageUrl", null);
        setField(term4433, term4433.getClass(), "person", null);
        setField(term4433, term4433.getClass(), "action", null);
        setField(term4433, term4433.getClass(), "object", null);
        setField(term4433, term4433.getClass(), "paoCard", null);
        setField(term4420, term4420.getClass(), "pao", term4433);
        setField(term4369, term4369.getClass(), "paoCard", term4420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.PaoCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.Pao");
        Object[] args = new Object[1];
        args[0] = term4369;
        callMethod(klass, "setPao", argTypes, term4281, args);
    }

};



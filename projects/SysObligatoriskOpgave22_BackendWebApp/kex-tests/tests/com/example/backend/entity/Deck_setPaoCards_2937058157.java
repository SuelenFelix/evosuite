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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.String;

public class Deck_setPaoCards_2937058157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20376;
     Object term20435;

    public Deck_setPaoCards_2937058157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20377 = new Long(-7503147844796296300L);
        Long term20406 = new Long(1099634235456795888L);
        Long term20409 = new Long(5391189846186870864L);
        Long term20412 = new Long(6135782592145916721L);
        Object term20405 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20408 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20411 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20405, term20405.getClass(), "id", term20406);
        setField(term20408, term20408.getClass(), "id", term20409);
        setField(term20408, term20408.getClass(), "rank", null);
        setField(term20408, term20408.getClass(), "suit", null);
        setField(term20408, term20408.getClass(), "paoCards", null);
        setField(term20405, term20405.getClass(), "card", term20408);
        setField(term20411, term20411.getClass(), "id", term20412);
        setField(term20411, term20411.getClass(), "imageUrl", null);
        setField(term20411, term20411.getClass(), "person", null);
        setField(term20411, term20411.getClass(), "action", null);
        setField(term20411, term20411.getClass(), "object", null);
        setField(term20411, term20411.getClass(), "paoCard", null);
        setField(term20405, term20405.getClass(), "pao", term20411);
        Long term20415 = new Long(8242382965219431687L);
        Object term20414 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20417 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20418 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20414, term20414.getClass(), "id", term20415);
        setField(term20417, term20417.getClass(), "id", null);
        setField(term20417, term20417.getClass(), "rank", null);
        setField(term20417, term20417.getClass(), "suit", null);
        setField(term20417, term20417.getClass(), "paoCards", null);
        setField(term20414, term20414.getClass(), "card", term20417);
        setField(term20418, term20418.getClass(), "id", null);
        setField(term20418, term20418.getClass(), "imageUrl", null);
        setField(term20418, term20418.getClass(), "person", null);
        setField(term20418, term20418.getClass(), "action", null);
        setField(term20418, term20418.getClass(), "object", null);
        setField(term20418, term20418.getClass(), "paoCard", null);
        setField(term20414, term20414.getClass(), "pao", term20418);
        Long term20420 = new Long(7314774835988078404L);
        Long term20423 = new Long(2777168805269959396L);
        Long term20426 = new Long(-8653467709084853156L);
        Object term20419 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20422 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20425 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20419, term20419.getClass(), "id", term20420);
        setField(term20422, term20422.getClass(), "id", term20423);
        setField(term20422, term20422.getClass(), "rank", null);
        setField(term20422, term20422.getClass(), "suit", null);
        setField(term20422, term20422.getClass(), "paoCards", null);
        setField(term20419, term20419.getClass(), "card", term20422);
        setField(term20425, term20425.getClass(), "id", term20426);
        setField(term20425, term20425.getClass(), "imageUrl", null);
        setField(term20425, term20425.getClass(), "person", null);
        setField(term20425, term20425.getClass(), "action", null);
        setField(term20425, term20425.getClass(), "object", null);
        setField(term20425, term20425.getClass(), "paoCard", null);
        setField(term20419, term20419.getClass(), "pao", term20425);
        Long term20429 = new Long(-6645699856048951433L);
        Object term20428 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20431 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20432 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20428, term20428.getClass(), "id", term20429);
        setField(term20431, term20431.getClass(), "id", null);
        setField(term20431, term20431.getClass(), "rank", null);
        setField(term20431, term20431.getClass(), "suit", null);
        setField(term20431, term20431.getClass(), "paoCards", null);
        setField(term20428, term20428.getClass(), "card", term20431);
        setField(term20432, term20432.getClass(), "id", null);
        setField(term20432, term20432.getClass(), "imageUrl", null);
        setField(term20432, term20432.getClass(), "person", null);
        setField(term20432, term20432.getClass(), "action", null);
        setField(term20432, term20432.getClass(), "object", null);
        setField(term20432, term20432.getClass(), "paoCard", null);
        setField(term20428, term20428.getClass(), "pao", term20432);
        ArrayList term20403 = new ArrayList();
        ((ArrayList) term20403).add(term20405);
        ((ArrayList) term20403).add(term20414);
        ((ArrayList) term20403).add(term20414);
        ((ArrayList) term20403).add(term20419);
        ((ArrayList) term20403).add(term20428);
        ((ArrayList) term20403).add(term20428);
        term20376 = newInstance(Class.forName("com.example.backend.entity.Deck"));
        setField(term20376, term20376.getClass(), "id", term20377);
        setField(term20376, term20376.getClass(), "name", "pLvkKHqNYX");
        setField(term20376, term20376.getClass(), "description", "PwqnuJJwjR");
        setField(term20376, term20376.getClass(), "paoCards", term20403);
        Long term20439 = new Long(7930227263182470549L);
        Long term20442 = new Long(-2571841019708046378L);
        Class<? extends Object> term20497 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term20496 = ((Class) term20497).getDeclaredField((String) "SIX");
        ((Field) term20496).setAccessible(true);
        Object enum83 = ((Field) term20496).get((Object) null);
        Class<? extends Object> term20668 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term20667 = ((Class) term20668).getDeclaredField((String) "DIAMONDS");
        ((Field) term20667).setAccessible(true);
        Object enum84 = ((Field) term20667).get((Object) null);
        ArrayList term20448 = new ArrayList();
        ((ArrayList) term20448).add((Object)null);
        ((ArrayList) term20448).add((Object)null);
        ((ArrayList) term20448).add((Object)null);
        ((ArrayList) term20448).add((Object)null);
        ((ArrayList) term20448).add((Object)null);
        ((ArrayList) term20448).add((Object)null);
        ((ArrayList) term20448).add((Object)null);
        Long term20452 = new Long(1078204819466025938L);
        Long term20459 = new Long(3853743792832767733L);
        Object term20438 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20441 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20451 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term20458 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term20438, term20438.getClass(), "id", term20439);
        setField(term20441, term20441.getClass(), "id", term20442);
        setField(term20441, term20441.getClass(), "rank", enum83);
        setField(term20441, term20441.getClass(), "suit", enum84);
        setField(term20441, term20441.getClass(), "paoCards", term20448);
        setField(term20438, term20438.getClass(), "card", term20441);
        setField(term20451, term20451.getClass(), "id", term20452);
        setField(term20451, term20451.getClass(), "imageUrl", "");
        setField(term20451, term20451.getClass(), "person", "");
        setField(term20451, term20451.getClass(), "action", "");
        setField(term20451, term20451.getClass(), "object", "");
        setField(term20458, term20458.getClass(), "id", term20459);
        setField(term20458, term20458.getClass(), "card", null);
        setField(term20458, term20458.getClass(), "pao", null);
        setField(term20451, term20451.getClass(), "paoCard", term20458);
        setField(term20438, term20438.getClass(), "pao", term20451);
        Long term20463 = new Long(-4526944004625263747L);
        Long term20466 = new Long(-8195504192950938590L);
        Long term20469 = new Long(-5681371087517724194L);
        Object term20462 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20465 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20468 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20462, term20462.getClass(), "id", term20463);
        setField(term20465, term20465.getClass(), "id", term20466);
        setField(term20465, term20465.getClass(), "rank", enum83);
        setField(term20465, term20465.getClass(), "suit", null);
        setField(term20465, term20465.getClass(), "paoCards", null);
        setField(term20462, term20462.getClass(), "card", term20465);
        setField(term20468, term20468.getClass(), "id", term20469);
        setField(term20468, term20468.getClass(), "imageUrl", null);
        setField(term20468, term20468.getClass(), "person", null);
        setField(term20468, term20468.getClass(), "action", null);
        setField(term20468, term20468.getClass(), "object", null);
        setField(term20468, term20468.getClass(), "paoCard", null);
        setField(term20462, term20462.getClass(), "pao", term20468);
        Long term20473 = new Long(-2109397517777696156L);
        Object term20472 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term20472, term20472.getClass(), "id", term20473);
        setField(term20472, term20472.getClass(), "card", null);
        setField(term20472, term20472.getClass(), "pao", null);
        term20435 = new LinkedList();
        ((LinkedList) term20435).add(term20438);
        ((LinkedList) term20435).add(term20462);
        ((LinkedList) term20435).add(term20472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Deck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term20435;
        callMethod(klass, "setPaoCards", argTypes, term20376, args);
    }

};



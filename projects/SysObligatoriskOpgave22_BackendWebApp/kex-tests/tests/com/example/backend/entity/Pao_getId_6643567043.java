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

public class Pao_getId_6643567043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6746;

    public Pao_getId_6643567043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6747 = new Long(-7406618974062419277L);
        Long term6798 = new Long(868503089567085985L);
        Long term6801 = new Long(-3277773415369003529L);
        Class<? extends Object> term6910 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term6909 = ((Class) term6910).getDeclaredField((String) "NINE");
        ((Field) term6909).setAccessible(true);
        Object enum27 = ((Field) term6909).get((Object) null);
        Class<? extends Object> term7084 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term7083 = ((Class) term7084).getDeclaredField((String) "HEARTS");
        ((Field) term7083).setAccessible(true);
        Object enum28 = ((Field) term7083).get((Object) null);
        ArrayList term6809 = new ArrayList();
        ((ArrayList) term6809).add((Object)null);
        ((ArrayList) term6809).add((Object)null);
        ((ArrayList) term6809).add((Object)null);
        ((ArrayList) term6809).add((Object)null);
        Long term6814 = new Long(-88538481937688851L);
        Long term6865 = new Long(5806367330808555223L);
        term6746 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term6797 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term6800 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term6813 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term6864 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term6867 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term6868 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term6746, term6746.getClass(), "id", term6747);
        setField(term6746, term6746.getClass(), "imageUrl", "pXdglvyrQe");
        setField(term6746, term6746.getClass(), "person", "OcfNzHYdki");
        setField(term6746, term6746.getClass(), "action", "uPuCVuZYOI");
        setField(term6746, term6746.getClass(), "object", "TweMFhxNdj");
        setField(term6797, term6797.getClass(), "id", term6798);
        setField(term6800, term6800.getClass(), "id", term6801);
        setField(term6800, term6800.getClass(), "rank", enum27);
        setField(term6800, term6800.getClass(), "suit", enum28);
        setField(term6800, term6800.getClass(), "paoCards", term6809);
        setField(term6797, term6797.getClass(), "card", term6800);
        setField(term6813, term6813.getClass(), "id", term6814);
        setField(term6813, term6813.getClass(), "imageUrl", "zNdorvdUgu");
        setField(term6813, term6813.getClass(), "person", "oPxuZbkYio");
        setField(term6813, term6813.getClass(), "action", "vKitydDVnM");
        setField(term6813, term6813.getClass(), "object", "urCiQnUFBM");
        setField(term6864, term6864.getClass(), "id", term6865);
        setField(term6867, term6867.getClass(), "id", null);
        setField(term6867, term6867.getClass(), "rank", null);
        setField(term6867, term6867.getClass(), "suit", null);
        setField(term6867, term6867.getClass(), "paoCards", null);
        setField(term6864, term6864.getClass(), "card", term6867);
        setField(term6868, term6868.getClass(), "id", null);
        setField(term6868, term6868.getClass(), "imageUrl", null);
        setField(term6868, term6868.getClass(), "person", null);
        setField(term6868, term6868.getClass(), "action", null);
        setField(term6868, term6868.getClass(), "object", null);
        setField(term6868, term6868.getClass(), "paoCard", null);
        setField(term6864, term6864.getClass(), "pao", term6868);
        setField(term6813, term6813.getClass(), "paoCard", term6864);
        setField(term6797, term6797.getClass(), "pao", term6813);
        setField(term6746, term6746.getClass(), "paoCard", term6797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6746, args);
    }

};



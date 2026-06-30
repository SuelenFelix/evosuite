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

public class Pao_setPaoCard_186154436915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12595;
     Object term12718;

    public Pao_setPaoCard_186154436915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12596 = new Long(-1365372122034008688L);
        Long term12647 = new Long(-6108006981756732593L);
        Long term12650 = new Long(-3565554762799701668L);
        Class<? extends Object> term12845 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term12844 = ((Class) term12845).getDeclaredField((String) "TWO");
        ((Field) term12844).setAccessible(true);
        Object enum49 = ((Field) term12844).get((Object) null);
        Class<? extends Object> term13016 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term13015 = ((Class) term13016).getDeclaredField((String) "CLUBS");
        ((Field) term13015).setAccessible(true);
        Object enum50 = ((Field) term13015).get((Object) null);
        ArrayList term12658 = new ArrayList();
        ((ArrayList) term12658).add((Object)null);
        ((ArrayList) term12658).add((Object)null);
        ((ArrayList) term12658).add((Object)null);
        ((ArrayList) term12658).add((Object)null);
        ((ArrayList) term12658).add((Object)null);
        ((ArrayList) term12658).add((Object)null);
        ((ArrayList) term12658).add((Object)null);
        ((ArrayList) term12658).add((Object)null);
        ((ArrayList) term12658).add((Object)null);
        Long term12663 = new Long(-9168517519350392654L);
        Long term12714 = new Long(4828755228445882127L);
        term12595 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term12646 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term12649 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term12662 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term12713 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term12716 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term12717 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term12595, term12595.getClass(), "id", term12596);
        setField(term12595, term12595.getClass(), "imageUrl", "VSaNnhMpRc");
        setField(term12595, term12595.getClass(), "person", "QNjNTLlUaV");
        setField(term12595, term12595.getClass(), "action", "hIYsRyOZxk");
        setField(term12595, term12595.getClass(), "object", "RjNoEywJbC");
        setField(term12646, term12646.getClass(), "id", term12647);
        setField(term12649, term12649.getClass(), "id", term12650);
        setField(term12649, term12649.getClass(), "rank", enum49);
        setField(term12649, term12649.getClass(), "suit", enum50);
        setField(term12649, term12649.getClass(), "paoCards", term12658);
        setField(term12646, term12646.getClass(), "card", term12649);
        setField(term12662, term12662.getClass(), "id", term12663);
        setField(term12662, term12662.getClass(), "imageUrl", "qphdrqUtNx");
        setField(term12662, term12662.getClass(), "person", "bwlLFAfNWx");
        setField(term12662, term12662.getClass(), "action", "JWodNQzjjV");
        setField(term12662, term12662.getClass(), "object", "CAgxWjhxNf");
        setField(term12713, term12713.getClass(), "id", term12714);
        setField(term12716, term12716.getClass(), "id", null);
        setField(term12716, term12716.getClass(), "rank", null);
        setField(term12716, term12716.getClass(), "suit", null);
        setField(term12716, term12716.getClass(), "paoCards", null);
        setField(term12713, term12713.getClass(), "card", term12716);
        setField(term12717, term12717.getClass(), "id", null);
        setField(term12717, term12717.getClass(), "imageUrl", null);
        setField(term12717, term12717.getClass(), "person", null);
        setField(term12717, term12717.getClass(), "action", null);
        setField(term12717, term12717.getClass(), "object", null);
        setField(term12717, term12717.getClass(), "paoCard", null);
        setField(term12713, term12713.getClass(), "pao", term12717);
        setField(term12662, term12662.getClass(), "paoCard", term12713);
        setField(term12646, term12646.getClass(), "pao", term12662);
        setField(term12595, term12595.getClass(), "paoCard", term12646);
        Long term12719 = new Long(77619432202128806L);
        Long term12722 = new Long(-1647156882669215876L);
        Class<? extends Object> term13233 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term13232 = ((Class) term13233).getDeclaredField((String) "QUEEN");
        ((Field) term13232).setAccessible(true);
        Object enum51 = ((Field) term13232).get((Object) null);
        Class<? extends Object> term13410 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term13409 = ((Class) term13410).getDeclaredField((String) "DIAMONDS");
        ((Field) term13409).setAccessible(true);
        Object enum52 = ((Field) term13409).get((Object) null);
        Long term12748 = new Long(4115148503664117517L);
        Object term12747 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term12747, term12747.getClass(), "id", term12748);
        setField(term12747, term12747.getClass(), "card", null);
        setField(term12747, term12747.getClass(), "pao", null);
        ArrayList term12745 = new ArrayList();
        ((ArrayList) term12745).add(term12747);
        Long term12753 = new Long(7464122056779140588L);
        term12718 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term12721 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term12752 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term12803 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term12718, term12718.getClass(), "id", term12719);
        setField(term12721, term12721.getClass(), "id", term12722);
        setField(term12721, term12721.getClass(), "rank", enum51);
        setField(term12721, term12721.getClass(), "suit", enum52);
        setField(term12721, term12721.getClass(), "paoCards", term12745);
        setField(term12718, term12718.getClass(), "card", term12721);
        setField(term12752, term12752.getClass(), "id", term12753);
        setField(term12752, term12752.getClass(), "imageUrl", "ktbqerIaKW");
        setField(term12752, term12752.getClass(), "person", "VoghngXfsK");
        setField(term12752, term12752.getClass(), "action", "GbahCBMvct");
        setField(term12752, term12752.getClass(), "object", "iiHBhsNFgk");
        setField(term12803, term12803.getClass(), "id", null);
        setField(term12803, term12803.getClass(), "card", null);
        setField(term12803, term12803.getClass(), "pao", null);
        setField(term12752, term12752.getClass(), "paoCard", term12803);
        setField(term12718, term12718.getClass(), "pao", term12752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.PaoCard");
        Object[] args = new Object[1];
        args[0] = term12718;
        callMethod(klass, "setPaoCard", argTypes, term12595, args);
    }

};



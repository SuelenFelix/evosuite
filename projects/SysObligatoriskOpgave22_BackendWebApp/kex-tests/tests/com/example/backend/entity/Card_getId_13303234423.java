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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Card_getId_13303234423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15741;

    public Card_getId_13303234423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15742 = new Long(3161040540173678206L);
        Class<? extends Object> term15801 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term15800 = ((Class) term15801).getDeclaredField((String) "NINE");
        ((Field) term15800).setAccessible(true);
        Object enum63 = ((Field) term15800).get((Object) null);
        Class<? extends Object> term15975 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term15974 = ((Class) term15975).getDeclaredField((String) "DIAMONDS");
        ((Field) term15974).setAccessible(true);
        Object enum64 = ((Field) term15974).get((Object) null);
        Long term15767 = new Long(8640463098965331396L);
        Long term15770 = new Long(-4136906775323730350L);
        Long term15773 = new Long(-3271370917942710167L);
        Object term15766 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term15769 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term15772 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term15766, term15766.getClass(), "id", term15767);
        setField(term15769, term15769.getClass(), "id", term15770);
        setField(term15769, term15769.getClass(), "rank", null);
        setField(term15769, term15769.getClass(), "suit", null);
        setField(term15769, term15769.getClass(), "paoCards", null);
        setField(term15766, term15766.getClass(), "card", term15769);
        setField(term15772, term15772.getClass(), "id", term15773);
        setField(term15772, term15772.getClass(), "imageUrl", null);
        setField(term15772, term15772.getClass(), "person", null);
        setField(term15772, term15772.getClass(), "action", null);
        setField(term15772, term15772.getClass(), "object", null);
        setField(term15772, term15772.getClass(), "paoCard", null);
        setField(term15766, term15766.getClass(), "pao", term15772);
        Long term15776 = new Long(6381166215871562039L);
        Long term15779 = new Long(7656211287234019484L);
        Long term15782 = new Long(4892304277320345810L);
        Object term15775 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term15778 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term15781 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term15775, term15775.getClass(), "id", term15776);
        setField(term15778, term15778.getClass(), "id", term15779);
        setField(term15778, term15778.getClass(), "rank", enum63);
        setField(term15778, term15778.getClass(), "suit", null);
        setField(term15778, term15778.getClass(), "paoCards", null);
        setField(term15775, term15775.getClass(), "card", term15778);
        setField(term15781, term15781.getClass(), "id", term15782);
        setField(term15781, term15781.getClass(), "imageUrl", null);
        setField(term15781, term15781.getClass(), "person", null);
        setField(term15781, term15781.getClass(), "action", null);
        setField(term15781, term15781.getClass(), "object", null);
        setField(term15781, term15781.getClass(), "paoCard", null);
        setField(term15775, term15775.getClass(), "pao", term15781);
        Long term15785 = new Long(-6656996002079682356L);
        Object term15784 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term15787 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term15788 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term15784, term15784.getClass(), "id", term15785);
        setField(term15787, term15787.getClass(), "id", null);
        setField(term15787, term15787.getClass(), "rank", null);
        setField(term15787, term15787.getClass(), "suit", null);
        setField(term15787, term15787.getClass(), "paoCards", null);
        setField(term15784, term15784.getClass(), "card", term15787);
        setField(term15788, term15788.getClass(), "id", null);
        setField(term15788, term15788.getClass(), "imageUrl", null);
        setField(term15788, term15788.getClass(), "person", null);
        setField(term15788, term15788.getClass(), "action", null);
        setField(term15788, term15788.getClass(), "object", null);
        setField(term15788, term15788.getClass(), "paoCard", null);
        setField(term15784, term15784.getClass(), "pao", term15788);
        Long term15790 = new Long(1964822153944985001L);
        Object term15789 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term15792 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term15793 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term15789, term15789.getClass(), "id", term15790);
        setField(term15792, term15792.getClass(), "id", null);
        setField(term15792, term15792.getClass(), "rank", null);
        setField(term15792, term15792.getClass(), "suit", null);
        setField(term15792, term15792.getClass(), "paoCards", null);
        setField(term15789, term15789.getClass(), "card", term15792);
        setField(term15793, term15793.getClass(), "id", null);
        setField(term15793, term15793.getClass(), "imageUrl", null);
        setField(term15793, term15793.getClass(), "person", null);
        setField(term15793, term15793.getClass(), "action", null);
        setField(term15793, term15793.getClass(), "object", null);
        setField(term15793, term15793.getClass(), "paoCard", null);
        setField(term15789, term15789.getClass(), "pao", term15793);
        Long term15795 = new Long(-955253666696787757L);
        Object term15794 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term15797 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term15794, term15794.getClass(), "id", term15795);
        setField(term15794, term15794.getClass(), "card", term15787);
        setField(term15797, term15797.getClass(), "id", null);
        setField(term15797, term15797.getClass(), "imageUrl", null);
        setField(term15797, term15797.getClass(), "person", null);
        setField(term15797, term15797.getClass(), "action", null);
        setField(term15797, term15797.getClass(), "object", null);
        setField(term15797, term15797.getClass(), "paoCard", null);
        setField(term15794, term15794.getClass(), "pao", term15797);
        ArrayList term15764 = new ArrayList();
        ((ArrayList) term15764).add(term15766);
        ((ArrayList) term15764).add(term15775);
        ((ArrayList) term15764).add(term15784);
        ((ArrayList) term15764).add(term15784);
        ((ArrayList) term15764).add(term15789);
        ((ArrayList) term15764).add(term15794);
        term15741 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term15741, term15741.getClass(), "id", term15742);
        setField(term15741, term15741.getClass(), "rank", enum63);
        setField(term15741, term15741.getClass(), "suit", enum64);
        setField(term15741, term15741.getClass(), "paoCards", term15764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term15741, args);
    }

};



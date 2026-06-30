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

public class Card_setRank_13292244378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17764;
     Object enum75;

    public Card_setRank_13292244378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17765 = new Long(6465539339431559532L);
        Class<? extends Object> term17839 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term17838 = ((Class) term17839).getDeclaredField((String) "SEVEN");
        ((Field) term17838).setAccessible(true);
        Object enum73 = ((Field) term17838).get((Object) null);
        Class<? extends Object> term18016 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term18015 = ((Class) term18016).getDeclaredField((String) "CLUBS");
        ((Field) term18015).setAccessible(true);
        Object enum74 = ((Field) term18015).get((Object) null);
        Long term17788 = new Long(-5304831679802174866L);
        Long term17791 = new Long(1909175111101717943L);
        Long term17794 = new Long(-1413653349314156044L);
        Object term17787 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term17790 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term17793 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term17787, term17787.getClass(), "id", term17788);
        setField(term17790, term17790.getClass(), "id", term17791);
        setField(term17790, term17790.getClass(), "rank", null);
        setField(term17790, term17790.getClass(), "suit", null);
        setField(term17790, term17790.getClass(), "paoCards", null);
        setField(term17787, term17787.getClass(), "card", term17790);
        setField(term17793, term17793.getClass(), "id", term17794);
        setField(term17793, term17793.getClass(), "imageUrl", null);
        setField(term17793, term17793.getClass(), "person", null);
        setField(term17793, term17793.getClass(), "action", null);
        setField(term17793, term17793.getClass(), "object", null);
        setField(term17793, term17793.getClass(), "paoCard", null);
        setField(term17787, term17787.getClass(), "pao", term17793);
        Long term17797 = new Long(-1211273460223868511L);
        Long term17800 = new Long(-8172564209423941839L);
        Long term17803 = new Long(7065003857377879971L);
        Object term17796 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term17799 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term17802 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term17796, term17796.getClass(), "id", term17797);
        setField(term17799, term17799.getClass(), "id", term17800);
        setField(term17799, term17799.getClass(), "rank", null);
        setField(term17799, term17799.getClass(), "suit", null);
        setField(term17799, term17799.getClass(), "paoCards", null);
        setField(term17796, term17796.getClass(), "card", term17799);
        setField(term17802, term17802.getClass(), "id", term17803);
        setField(term17802, term17802.getClass(), "imageUrl", null);
        setField(term17802, term17802.getClass(), "person", null);
        setField(term17802, term17802.getClass(), "action", null);
        setField(term17802, term17802.getClass(), "object", null);
        setField(term17802, term17802.getClass(), "paoCard", null);
        setField(term17796, term17796.getClass(), "pao", term17802);
        Long term17806 = new Long(-4561371668792438386L);
        Object term17805 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term17808 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term17809 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term17805, term17805.getClass(), "id", term17806);
        setField(term17808, term17808.getClass(), "id", null);
        setField(term17808, term17808.getClass(), "rank", null);
        setField(term17808, term17808.getClass(), "suit", null);
        setField(term17808, term17808.getClass(), "paoCards", null);
        setField(term17805, term17805.getClass(), "card", term17808);
        setField(term17809, term17809.getClass(), "id", null);
        setField(term17809, term17809.getClass(), "imageUrl", null);
        setField(term17809, term17809.getClass(), "person", null);
        setField(term17809, term17809.getClass(), "action", null);
        setField(term17809, term17809.getClass(), "object", null);
        setField(term17809, term17809.getClass(), "paoCard", null);
        setField(term17805, term17805.getClass(), "pao", term17809);
        Long term17811 = new Long(8499930868919012909L);
        Long term17814 = new Long(6252795312796363233L);
        Long term17817 = new Long(-1283563319051310751L);
        Object term17810 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term17813 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term17816 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term17810, term17810.getClass(), "id", term17811);
        setField(term17813, term17813.getClass(), "id", term17814);
        setField(term17813, term17813.getClass(), "rank", enum73);
        setField(term17813, term17813.getClass(), "suit", null);
        setField(term17813, term17813.getClass(), "paoCards", null);
        setField(term17810, term17810.getClass(), "card", term17813);
        setField(term17816, term17816.getClass(), "id", term17817);
        setField(term17816, term17816.getClass(), "imageUrl", null);
        setField(term17816, term17816.getClass(), "person", null);
        setField(term17816, term17816.getClass(), "action", null);
        setField(term17816, term17816.getClass(), "object", null);
        setField(term17816, term17816.getClass(), "paoCard", null);
        setField(term17810, term17810.getClass(), "pao", term17816);
        Long term17820 = new Long(353705949229610067L);
        Long term17823 = new Long(3288572082902580031L);
        Long term17826 = new Long(8965244485590834147L);
        Object term17819 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term17822 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term17825 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term17819, term17819.getClass(), "id", term17820);
        setField(term17822, term17822.getClass(), "id", term17823);
        setField(term17822, term17822.getClass(), "rank", null);
        setField(term17822, term17822.getClass(), "suit", null);
        setField(term17822, term17822.getClass(), "paoCards", null);
        setField(term17819, term17819.getClass(), "card", term17822);
        setField(term17825, term17825.getClass(), "id", term17826);
        setField(term17825, term17825.getClass(), "imageUrl", null);
        setField(term17825, term17825.getClass(), "person", null);
        setField(term17825, term17825.getClass(), "action", null);
        setField(term17825, term17825.getClass(), "object", null);
        setField(term17825, term17825.getClass(), "paoCard", null);
        setField(term17819, term17819.getClass(), "pao", term17825);
        ArrayList term17785 = new ArrayList();
        ((ArrayList) term17785).add(term17787);
        ((ArrayList) term17785).add(term17796);
        ((ArrayList) term17785).add(term17805);
        ((ArrayList) term17785).add(term17805);
        ((ArrayList) term17785).add(term17810);
        ((ArrayList) term17785).add(term17819);
        term17764 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term17764, term17764.getClass(), "id", term17765);
        setField(term17764, term17764.getClass(), "rank", enum73);
        setField(term17764, term17764.getClass(), "suit", enum74);
        setField(term17764, term17764.getClass(), "paoCards", term17785);
        Class<? extends Object> term18193 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term18192 = ((Class) term18193).getDeclaredField((String) "KING");
        ((Field) term18192).setAccessible(true);
        enum75 = ((Field) term18192).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.Rank");
        Object[] args = new Object[1];
        args[0] = enum75;
        callMethod(klass, "setRank", argTypes, term17764, args);
    }

};



package refactoring.app.chapter04;

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
import static refactoring.app.chapter04.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Province_demandCost_9798444927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;

    public Province_demandCost_9798444927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term484 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term488 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term484, term484.getClass(), "name", "");
        setIntField(term484, term484.getClass(), "cost", 765731371);
        setIntField(term484, term484.getClass(), "production", -1703035419);
        setField(term488, term488.getClass(), "name", null);
        setField(term488, term488.getClass(), "producers", null);
        setIntField(term488, term488.getClass(), "totalProduction", 1168633950);
        setIntField(term488, term488.getClass(), "demand", 1607082164);
        setIntField(term488, term488.getClass(), "price", 1890399366);
        setField(term484, term484.getClass(), "province", term488);
        Object term492 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term496 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term492, term492.getClass(), "name", "");
        setIntField(term492, term492.getClass(), "cost", -941356098);
        setIntField(term492, term492.getClass(), "production", -201517446);
        setField(term496, term496.getClass(), "name", null);
        setField(term496, term496.getClass(), "producers", null);
        setIntField(term496, term496.getClass(), "totalProduction", 0);
        setIntField(term496, term496.getClass(), "demand", 0);
        setIntField(term496, term496.getClass(), "price", 0);
        setField(term492, term492.getClass(), "province", term496);
        Object term500 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term504 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term500, term500.getClass(), "name", "");
        setIntField(term500, term500.getClass(), "cost", 1496340209);
        setIntField(term500, term500.getClass(), "production", -1748391876);
        setField(term504, term504.getClass(), "name", null);
        setField(term504, term504.getClass(), "producers", null);
        setIntField(term504, term504.getClass(), "totalProduction", -1792504217);
        setIntField(term504, term504.getClass(), "demand", 1824538861);
        setIntField(term504, term504.getClass(), "price", 499519708);
        setField(term500, term500.getClass(), "province", term504);
        Object term508 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term512 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term508, term508.getClass(), "name", "");
        setIntField(term508, term508.getClass(), "cost", 43258317);
        setIntField(term508, term508.getClass(), "production", 1707220033);
        setField(term512, term512.getClass(), "name", null);
        setField(term512, term512.getClass(), "producers", null);
        setIntField(term512, term512.getClass(), "totalProduction", 0);
        setIntField(term512, term512.getClass(), "demand", 0);
        setIntField(term512, term512.getClass(), "price", 0);
        setField(term508, term508.getClass(), "province", term512);
        Object term516 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term520 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term516, term516.getClass(), "name", "");
        setIntField(term516, term516.getClass(), "cost", 765766290);
        setIntField(term516, term516.getClass(), "production", -1284825282);
        setField(term520, term520.getClass(), "name", null);
        setField(term520, term520.getClass(), "producers", null);
        setIntField(term520, term520.getClass(), "totalProduction", 754055848);
        setIntField(term520, term520.getClass(), "demand", -19246901);
        setIntField(term520, term520.getClass(), "price", -370828664);
        setField(term516, term516.getClass(), "province", term520);
        Object term524 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term524, term524.getClass(), "name", "");
        setIntField(term524, term524.getClass(), "cost", 888506903);
        setIntField(term524, term524.getClass(), "production", 200252898);
        setField(term524, term524.getClass(), "province", term496);
        ArrayList term482 = new ArrayList();
        ((ArrayList) term482).add(term484);
        ((ArrayList) term482).add(term492);
        ((ArrayList) term482).add(term492);
        ((ArrayList) term482).add(term500);
        ((ArrayList) term482).add(term508);
        ((ArrayList) term482).add(term508);
        ((ArrayList) term482).add(term516);
        ((ArrayList) term482).add(term524);
        term469 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term469, term469.getClass(), "name", "DSNsTGYXDF");
        setField(term469, term469.getClass(), "producers", term482);
        setIntField(term469, term469.getClass(), "totalProduction", -1867239125);
        setIntField(term469, term469.getClass(), "demand", 952869601);
        setIntField(term469, term469.getClass(), "price", 91958879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "demandCost", argTypes, term469, args);
    }

};



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

public class Province_getProducers_5599145910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;

    public Province_getProducers_5599145910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term732 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term736 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term732, term732.getClass(), "name", "");
        setIntField(term732, term732.getClass(), "cost", 514511037);
        setIntField(term732, term732.getClass(), "production", 1713573821);
        setField(term736, term736.getClass(), "name", null);
        setField(term736, term736.getClass(), "producers", null);
        setIntField(term736, term736.getClass(), "totalProduction", -138239905);
        setIntField(term736, term736.getClass(), "demand", 1709474063);
        setIntField(term736, term736.getClass(), "price", 1406617209);
        setField(term732, term732.getClass(), "province", term736);
        Object term740 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term744 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term740, term740.getClass(), "name", "");
        setIntField(term740, term740.getClass(), "cost", 1692937831);
        setIntField(term740, term740.getClass(), "production", -1539747985);
        setField(term744, term744.getClass(), "name", null);
        setField(term744, term744.getClass(), "producers", null);
        setIntField(term744, term744.getClass(), "totalProduction", -1317044799);
        setIntField(term744, term744.getClass(), "demand", -1428063820);
        setIntField(term744, term744.getClass(), "price", -1271375703);
        setField(term740, term740.getClass(), "province", term744);
        Object term748 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term752 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term748, term748.getClass(), "name", "");
        setIntField(term748, term748.getClass(), "cost", -1982489643);
        setIntField(term748, term748.getClass(), "production", 550892835);
        setField(term752, term752.getClass(), "name", null);
        setField(term752, term752.getClass(), "producers", null);
        setIntField(term752, term752.getClass(), "totalProduction", 0);
        setIntField(term752, term752.getClass(), "demand", 0);
        setIntField(term752, term752.getClass(), "price", 0);
        setField(term748, term748.getClass(), "province", term752);
        Object term756 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term760 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term756, term756.getClass(), "name", "");
        setIntField(term756, term756.getClass(), "cost", 1956590498);
        setIntField(term756, term756.getClass(), "production", 1467356494);
        setField(term760, term760.getClass(), "name", null);
        setField(term760, term760.getClass(), "producers", null);
        setIntField(term760, term760.getClass(), "totalProduction", -781832877);
        setIntField(term760, term760.getClass(), "demand", 797203987);
        setIntField(term760, term760.getClass(), "price", 1973060703);
        setField(term756, term756.getClass(), "province", term760);
        Object term764 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term768 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term764, term764.getClass(), "name", "");
        setIntField(term764, term764.getClass(), "cost", -1622760744);
        setIntField(term764, term764.getClass(), "production", 2068435279);
        setField(term768, term768.getClass(), "name", null);
        setField(term768, term768.getClass(), "producers", null);
        setIntField(term768, term768.getClass(), "totalProduction", 0);
        setIntField(term768, term768.getClass(), "demand", 0);
        setIntField(term768, term768.getClass(), "price", 0);
        setField(term764, term764.getClass(), "province", term768);
        Object term772 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term776 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term772, term772.getClass(), "name", "");
        setIntField(term772, term772.getClass(), "cost", 1136208236);
        setIntField(term772, term772.getClass(), "production", -1220630391);
        setField(term776, term776.getClass(), "name", null);
        setField(term776, term776.getClass(), "producers", null);
        setIntField(term776, term776.getClass(), "totalProduction", 1200440315);
        setIntField(term776, term776.getClass(), "demand", 40571662);
        setIntField(term776, term776.getClass(), "price", 1863910269);
        setField(term772, term772.getClass(), "province", term776);
        ArrayList term730 = new ArrayList();
        ((ArrayList) term730).add(term732);
        ((ArrayList) term730).add(term740);
        ((ArrayList) term730).add(term748);
        ((ArrayList) term730).add(term748);
        ((ArrayList) term730).add(term756);
        ((ArrayList) term730).add(term764);
        ((ArrayList) term730).add(term764);
        ((ArrayList) term730).add(term772);
        term717 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term717, term717.getClass(), "name", "CFyoseFGLF");
        setField(term717, term717.getClass(), "producers", term730);
        setIntField(term717, term717.getClass(), "totalProduction", 1706047059);
        setIntField(term717, term717.getClass(), "demand", 590451710);
        setIntField(term717, term717.getClass(), "price", -1999787419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProducers", argTypes, term717, args);
    }

};



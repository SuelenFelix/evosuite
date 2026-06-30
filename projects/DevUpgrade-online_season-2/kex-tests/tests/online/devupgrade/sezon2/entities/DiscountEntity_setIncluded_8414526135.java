package online.devupgrade.sezon2.entities;

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
import static online.devupgrade.sezon2.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class DiscountEntity_setIncluded_8414526135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1493;
     Object term1582;

    public DiscountEntity_setIncluded_8414526135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1494 = new Integer(538259104);
        Long term1496 = new Long(6855071767938501807L);
        ArrayList term1498 = new ArrayList();
        ((ArrayList) term1498).add("VMeAzAHwZj");
        ((ArrayList) term1498).add("PznxWXsZME");
        ((ArrayList) term1498).add("ZzIujlwVsw");
        ((ArrayList) term1498).add("LWyEaeIyAo");
        Integer term1553 = new Integer(96566506);
        Object term1552 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1552, term1552.getClass(), "id", term1553);
        setFloatField(term1552, term1552.getClass(), "price", 0.55778444F);
        setFloatField(term1552, term1552.getClass(), "pricePoPrzecinku", 0.5617009F);
        setBooleanField(term1552, term1552.getClass(), "isPriceGetOnce", true);
        Integer term1559 = new Integer(-343325701);
        Object term1558 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1558, term1558.getClass(), "id", term1559);
        setFloatField(term1558, term1558.getClass(), "price", 0.6716574F);
        setFloatField(term1558, term1558.getClass(), "pricePoPrzecinku", 0.090670586F);
        setBooleanField(term1558, term1558.getClass(), "isPriceGetOnce", true);
        ArrayList term1550 = new ArrayList();
        ((ArrayList) term1550).add(term1552);
        ((ArrayList) term1550).add(term1558);
        Integer term1569 = new Integer(107945604);
        Object term1568 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1568, term1568.getClass(), "id", term1569);
        setFloatField(term1568, term1568.getClass(), "price", 0.54697996F);
        setFloatField(term1568, term1568.getClass(), "pricePoPrzecinku", 0.268304F);
        setBooleanField(term1568, term1568.getClass(), "isPriceGetOnce", true);
        Integer term1575 = new Integer(-1963464809);
        Object term1574 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1574, term1574.getClass(), "id", term1575);
        setFloatField(term1574, term1574.getClass(), "price", 0.6116407F);
        setFloatField(term1574, term1574.getClass(), "pricePoPrzecinku", 0.71719724F);
        setBooleanField(term1574, term1574.getClass(), "isPriceGetOnce", false);
        ArrayList term1566 = new ArrayList();
        ((ArrayList) term1566).add(term1568);
        ((ArrayList) term1566).add(term1574);
        term1493 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term1493, term1493.getClass(), "id", term1494);
        setField(term1493, term1493.getClass(), "value", term1496);
        setField(term1493, term1493.getClass(), "roles", term1498);
        setField(term1493, term1493.getClass(), "included", term1550);
        setField(term1493, term1493.getClass(), "excluded", term1566);
        term1582 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.DiscountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1582;
        callMethod(klass, "setIncluded", argTypes, term1493, args);
    }

};



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

public class DiscountEntity_setExcluded_9500740396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1625;
     Object term1672;

    public DiscountEntity_setExcluded_9500740396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1626 = new Integer(71190297);
        Long term1628 = new Long(-5892135042702373494L);
        ArrayList term1630 = new ArrayList();
        Integer term1637 = new Integer(1202361360);
        Object term1636 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1636, term1636.getClass(), "id", term1637);
        setFloatField(term1636, term1636.getClass(), "price", 0.25674725F);
        setFloatField(term1636, term1636.getClass(), "pricePoPrzecinku", 0.9006361F);
        setBooleanField(term1636, term1636.getClass(), "isPriceGetOnce", true);
        Integer term1643 = new Integer(-2015048153);
        Object term1642 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1642, term1642.getClass(), "id", term1643);
        setFloatField(term1642, term1642.getClass(), "price", 0.71533775F);
        setFloatField(term1642, term1642.getClass(), "pricePoPrzecinku", 0.5644914F);
        setBooleanField(term1642, term1642.getClass(), "isPriceGetOnce", true);
        Integer term1649 = new Integer(-2063457669);
        Object term1648 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1648, term1648.getClass(), "id", term1649);
        setFloatField(term1648, term1648.getClass(), "price", 0.6949883F);
        setFloatField(term1648, term1648.getClass(), "pricePoPrzecinku", 0.5098958F);
        setBooleanField(term1648, term1648.getClass(), "isPriceGetOnce", false);
        Integer term1655 = new Integer(-1222006000);
        Object term1654 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1654, term1654.getClass(), "id", term1655);
        setFloatField(term1654, term1654.getClass(), "price", 0.86701417F);
        setFloatField(term1654, term1654.getClass(), "pricePoPrzecinku", 0.07417786F);
        setBooleanField(term1654, term1654.getClass(), "isPriceGetOnce", false);
        ArrayList term1634 = new ArrayList();
        ((ArrayList) term1634).add(term1636);
        ((ArrayList) term1634).add(term1642);
        ((ArrayList) term1634).add(term1648);
        ((ArrayList) term1634).add(term1654);
        Integer term1665 = new Integer(2095798786);
        Object term1664 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1664, term1664.getClass(), "id", term1665);
        setFloatField(term1664, term1664.getClass(), "price", 0.96144617F);
        setFloatField(term1664, term1664.getClass(), "pricePoPrzecinku", 0.6862936F);
        setBooleanField(term1664, term1664.getClass(), "isPriceGetOnce", true);
        ArrayList term1662 = new ArrayList();
        ((ArrayList) term1662).add(term1664);
        term1625 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term1625, term1625.getClass(), "id", term1626);
        setField(term1625, term1625.getClass(), "value", term1628);
        setField(term1625, term1625.getClass(), "roles", term1630);
        setField(term1625, term1625.getClass(), "included", term1634);
        setField(term1625, term1625.getClass(), "excluded", term1662);
        term1672 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.DiscountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1672;
        callMethod(klass, "setExcluded", argTypes, term1625, args);
    }

};



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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class Order_getProducts_18926952311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;

    public Order_getProducts_18926952311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term146 = new Integer(-1275173084);
        Integer term109 = new Integer(-1456670397);
        Object term108 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term108, term108.getClass(), "id", term109);
        setFloatField(term108, term108.getClass(), "price", 0.51832694F);
        setFloatField(term108, term108.getClass(), "pricePoPrzecinku", 0.97262454F);
        setBooleanField(term108, term108.getClass(), "isPriceGetOnce", true);
        Integer term115 = new Integer(1622346318);
        Object term114 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term114, term114.getClass(), "id", term115);
        setFloatField(term114, term114.getClass(), "price", 0.76550204F);
        setFloatField(term114, term114.getClass(), "pricePoPrzecinku", 0.26441735F);
        setBooleanField(term114, term114.getClass(), "isPriceGetOnce", false);
        Integer term121 = new Integer(1048535127);
        Object term120 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term120, term120.getClass(), "id", term121);
        setFloatField(term120, term120.getClass(), "price", 0.13745493F);
        setFloatField(term120, term120.getClass(), "pricePoPrzecinku", 0.20144695F);
        setBooleanField(term120, term120.getClass(), "isPriceGetOnce", true);
        ArrayList term106 = new ArrayList();
        ((ArrayList) term106).add(term108);
        ((ArrayList) term106).add(term114);
        ((ArrayList) term106).add(term120);
        Integer term131 = new Integer(-655067527);
        Long term133 = new Long(5270370404989704783L);
        ArrayList term135 = new ArrayList();
        ArrayList term138 = new ArrayList();
        ((ArrayList) term138).add((Object)null);
        ((ArrayList) term138).add((Object)null);
        ArrayList term141 = new ArrayList();
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        Object term130 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term130, term130.getClass(), "id", term131);
        setField(term130, term130.getClass(), "value", term133);
        setField(term130, term130.getClass(), "roles", term135);
        setField(term130, term130.getClass(), "included", term138);
        setField(term130, term130.getClass(), "excluded", term141);
        ArrayList term128 = new ArrayList();
        ((ArrayList) term128).add(term130);
        term103 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Order"));
        setField(term103, term103.getClass(), "status", null);
        setField(term103, term103.getClass(), "id", term146);
        setField(term103, term103.getClass(), "products", term106);
        setField(term103, term103.getClass(), "discountEntities", term128);
        setFloatField(term103, term103.getClass(), "price", 0.8598297F);
        setFloatField(term103, term103.getClass(), "pricePoPrzecinku", 0.96323884F);
        setBooleanField(term103, term103.getClass(), "isPriceGetOnce", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProducts", argTypes, term103, args);
    }

};



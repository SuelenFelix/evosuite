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
import java.util.LinkedList;

public class Order_setDiscountEntities_15405021612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term231;

    public Order_setDiscountEntities_15405021612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term226 = new Integer(-602026508);
        Integer term157 = new Integer(-203030934);
        Object term156 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term156, term156.getClass(), "id", term157);
        setFloatField(term156, term156.getClass(), "price", 0.43692183F);
        setFloatField(term156, term156.getClass(), "pricePoPrzecinku", 0.80973893F);
        setBooleanField(term156, term156.getClass(), "isPriceGetOnce", true);
        Integer term163 = new Integer(-1179120542);
        Object term162 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term162, term162.getClass(), "id", term163);
        setFloatField(term162, term162.getClass(), "price", 0.7633268F);
        setFloatField(term162, term162.getClass(), "pricePoPrzecinku", 0.541592F);
        setBooleanField(term162, term162.getClass(), "isPriceGetOnce", true);
        Integer term169 = new Integer(-73683645);
        Object term168 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term168, term168.getClass(), "id", term169);
        setFloatField(term168, term168.getClass(), "price", 0.13481021F);
        setFloatField(term168, term168.getClass(), "pricePoPrzecinku", 0.996533F);
        setBooleanField(term168, term168.getClass(), "isPriceGetOnce", true);
        Integer term175 = new Integer(-226514366);
        Object term174 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term174, term174.getClass(), "id", term175);
        setFloatField(term174, term174.getClass(), "price", 0.38000882F);
        setFloatField(term174, term174.getClass(), "pricePoPrzecinku", 0.10577053F);
        setBooleanField(term174, term174.getClass(), "isPriceGetOnce", false);
        Integer term181 = new Integer(1193880199);
        Object term180 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term180, term180.getClass(), "id", term181);
        setFloatField(term180, term180.getClass(), "price", 0.5840714F);
        setFloatField(term180, term180.getClass(), "pricePoPrzecinku", 0.478669F);
        setBooleanField(term180, term180.getClass(), "isPriceGetOnce", false);
        Integer term187 = new Integer(-1087774327);
        Object term186 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term186, term186.getClass(), "id", term187);
        setFloatField(term186, term186.getClass(), "price", 0.75592405F);
        setFloatField(term186, term186.getClass(), "pricePoPrzecinku", 0.068145275F);
        setBooleanField(term186, term186.getClass(), "isPriceGetOnce", false);
        ArrayList term154 = new ArrayList();
        ((ArrayList) term154).add(term156);
        ((ArrayList) term154).add(term162);
        ((ArrayList) term154).add(term168);
        ((ArrayList) term154).add(term174);
        ((ArrayList) term154).add(term180);
        ((ArrayList) term154).add(term186);
        Integer term197 = new Integer(-1530420153);
        Long term199 = new Long(7411271909051562686L);
        ArrayList term201 = new ArrayList();
        ((ArrayList) term201).add((Object)null);
        ArrayList term204 = new ArrayList();
        ((ArrayList) term204).add((Object)null);
        ((ArrayList) term204).add((Object)null);
        ((ArrayList) term204).add((Object)null);
        ((ArrayList) term204).add((Object)null);
        ((ArrayList) term204).add((Object)null);
        ((ArrayList) term204).add((Object)null);
        ((ArrayList) term204).add((Object)null);
        ((ArrayList) term204).add((Object)null);
        ((ArrayList) term204).add((Object)null);
        ArrayList term207 = new ArrayList();
        ((ArrayList) term207).add((Object)null);
        ((ArrayList) term207).add((Object)null);
        ((ArrayList) term207).add((Object)null);
        Object term196 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term196, term196.getClass(), "id", term197);
        setField(term196, term196.getClass(), "value", term199);
        setField(term196, term196.getClass(), "roles", term201);
        setField(term196, term196.getClass(), "included", term204);
        setField(term196, term196.getClass(), "excluded", term207);
        Integer term211 = new Integer(767834723);
        Long term213 = new Long(4872422362414183754L);
        ArrayList term215 = new ArrayList();
        ((ArrayList) term215).add((Object)null);
        ((ArrayList) term215).add((Object)null);
        ((ArrayList) term215).add((Object)null);
        ((ArrayList) term215).add((Object)null);
        ((ArrayList) term215).add((Object)null);
        ArrayList term218 = new ArrayList();
        ((ArrayList) term218).add((Object)null);
        ((ArrayList) term218).add((Object)null);
        ((ArrayList) term218).add((Object)null);
        ((ArrayList) term218).add((Object)null);
        ((ArrayList) term218).add((Object)null);
        ((ArrayList) term218).add((Object)null);
        ArrayList term221 = new ArrayList();
        ((ArrayList) term221).add((Object)null);
        ((ArrayList) term221).add((Object)null);
        ((ArrayList) term221).add((Object)null);
        ((ArrayList) term221).add((Object)null);
        ((ArrayList) term221).add((Object)null);
        Object term210 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term210, term210.getClass(), "id", term211);
        setField(term210, term210.getClass(), "value", term213);
        setField(term210, term210.getClass(), "roles", term215);
        setField(term210, term210.getClass(), "included", term218);
        setField(term210, term210.getClass(), "excluded", term221);
        ArrayList term194 = new ArrayList();
        ((ArrayList) term194).add(term196);
        ((ArrayList) term194).add(term210);
        term151 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Order"));
        setField(term151, term151.getClass(), "status", null);
        setField(term151, term151.getClass(), "id", term226);
        setField(term151, term151.getClass(), "products", term154);
        setField(term151, term151.getClass(), "discountEntities", term194);
        setFloatField(term151, term151.getClass(), "price", 0.28528106F);
        setFloatField(term151, term151.getClass(), "pricePoPrzecinku", 0.30827713F);
        setBooleanField(term151, term151.getClass(), "isPriceGetOnce", true);
        term231 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term231;
        callMethod(klass, "setDiscountEntities", argTypes, term151, args);
    }

};



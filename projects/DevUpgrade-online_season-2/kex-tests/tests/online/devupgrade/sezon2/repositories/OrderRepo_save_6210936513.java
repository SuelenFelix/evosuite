package online.devupgrade.sezon2.repositories;

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
import static online.devupgrade.sezon2.repositories.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class OrderRepo_save_6210936513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public OrderRepo_save_6210936513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term100 = new Integer(-1685132342);
        Integer term9 = new Integer(1484323161);
        Object term8 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term8, term8.getClass(), "id", term9);
        setFloatField(term8, term8.getClass(), "price", 0.13238746F);
        setFloatField(term8, term8.getClass(), "pricePoPrzecinku", 0.2707036F);
        setBooleanField(term8, term8.getClass(), "isPriceGetOnce", false);
        Integer term15 = new Integer(391863371);
        Object term14 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term14, term14.getClass(), "id", term15);
        setFloatField(term14, term14.getClass(), "price", 0.3455959F);
        setFloatField(term14, term14.getClass(), "pricePoPrzecinku", 0.09123778F);
        setBooleanField(term14, term14.getClass(), "isPriceGetOnce", false);
        Integer term21 = new Integer(-1922583790);
        Object term20 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term20, term20.getClass(), "id", term21);
        setFloatField(term20, term20.getClass(), "price", 0.5523636F);
        setFloatField(term20, term20.getClass(), "pricePoPrzecinku", 0.8564069F);
        setBooleanField(term20, term20.getClass(), "isPriceGetOnce", false);
        Integer term27 = new Integer(-616727354);
        Object term26 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term26, term26.getClass(), "id", term27);
        setFloatField(term26, term26.getClass(), "price", 0.5446086F);
        setFloatField(term26, term26.getClass(), "pricePoPrzecinku", 0.5254275F);
        setBooleanField(term26, term26.getClass(), "isPriceGetOnce", false);
        Integer term33 = new Integer(-1955890973);
        Object term32 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term32, term32.getClass(), "id", term33);
        setFloatField(term32, term32.getClass(), "price", 0.2857073F);
        setFloatField(term32, term32.getClass(), "pricePoPrzecinku", 0.6880585F);
        setBooleanField(term32, term32.getClass(), "isPriceGetOnce", true);
        ArrayList term6 = new ArrayList();
        ((ArrayList) term6).add(term8);
        ((ArrayList) term6).add(term14);
        ((ArrayList) term6).add(term20);
        ((ArrayList) term6).add(term26);
        ((ArrayList) term6).add(term32);
        Integer term43 = new Integer(-2038273078);
        Long term45 = new Long(2442117782898005296L);
        ArrayList term47 = new ArrayList();
        ((ArrayList) term47).add((Object)null);
        ((ArrayList) term47).add((Object)null);
        ((ArrayList) term47).add((Object)null);
        ArrayList term50 = new ArrayList();
        ((ArrayList) term50).add((Object)null);
        ((ArrayList) term50).add((Object)null);
        ((ArrayList) term50).add((Object)null);
        ((ArrayList) term50).add((Object)null);
        ArrayList term53 = new ArrayList();
        ((ArrayList) term53).add((Object)null);
        Object term42 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term42, term42.getClass(), "id", term43);
        setField(term42, term42.getClass(), "value", term45);
        setField(term42, term42.getClass(), "roles", term47);
        setField(term42, term42.getClass(), "included", term50);
        setField(term42, term42.getClass(), "excluded", term53);
        Integer term57 = new Integer(-883034806);
        Long term59 = new Long(6375119433582206027L);
        ArrayList term61 = new ArrayList();
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        ((ArrayList) term61).add((Object)null);
        ArrayList term64 = new ArrayList();
        ((ArrayList) term64).add((Object)null);
        ((ArrayList) term64).add((Object)null);
        ArrayList term67 = new ArrayList();
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        Object term56 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term56, term56.getClass(), "id", term57);
        setField(term56, term56.getClass(), "value", term59);
        setField(term56, term56.getClass(), "roles", term61);
        setField(term56, term56.getClass(), "included", term64);
        setField(term56, term56.getClass(), "excluded", term67);
        Integer term71 = new Integer(1585847225);
        Long term73 = new Long(-8257434502486459194L);
        ArrayList term75 = new ArrayList();
        ((ArrayList) term75).add((Object)null);
        ((ArrayList) term75).add((Object)null);
        ((ArrayList) term75).add((Object)null);
        ((ArrayList) term75).add((Object)null);
        ((ArrayList) term75).add((Object)null);
        ((ArrayList) term75).add((Object)null);
        ((ArrayList) term75).add((Object)null);
        ArrayList term78 = new ArrayList();
        ((ArrayList) term78).add((Object)null);
        ArrayList term81 = new ArrayList();
        ((ArrayList) term81).add((Object)null);
        ((ArrayList) term81).add((Object)null);
        ((ArrayList) term81).add((Object)null);
        ((ArrayList) term81).add((Object)null);
        ((ArrayList) term81).add((Object)null);
        ((ArrayList) term81).add((Object)null);
        Object term70 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term70, term70.getClass(), "id", term71);
        setField(term70, term70.getClass(), "value", term73);
        setField(term70, term70.getClass(), "roles", term75);
        setField(term70, term70.getClass(), "included", term78);
        setField(term70, term70.getClass(), "excluded", term81);
        Integer term85 = new Integer(597278769);
        Long term87 = new Long(-8400487765614892086L);
        ArrayList term89 = new ArrayList();
        ((ArrayList) term89).add((Object)null);
        ((ArrayList) term89).add((Object)null);
        ((ArrayList) term89).add((Object)null);
        ((ArrayList) term89).add((Object)null);
        ((ArrayList) term89).add((Object)null);
        ArrayList term92 = new ArrayList();
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ((ArrayList) term92).add((Object)null);
        ArrayList term95 = new ArrayList();
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        Object term84 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term84, term84.getClass(), "id", term85);
        setField(term84, term84.getClass(), "value", term87);
        setField(term84, term84.getClass(), "roles", term89);
        setField(term84, term84.getClass(), "included", term92);
        setField(term84, term84.getClass(), "excluded", term95);
        ArrayList term40 = new ArrayList();
        ((ArrayList) term40).add(term42);
        ((ArrayList) term40).add(term56);
        ((ArrayList) term40).add(term70);
        ((ArrayList) term40).add(term84);
        term3 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Order"));
        setField(term3, term3.getClass(), "status", null);
        setField(term3, term3.getClass(), "id", term100);
        setField(term3, term3.getClass(), "products", term6);
        setField(term3, term3.getClass(), "discountEntities", term40);
        setFloatField(term3, term3.getClass(), "price", 0.8474802F);
        setFloatField(term3, term3.getClass(), "pricePoPrzecinku", 0.9985961F);
        setBooleanField(term3, term3.getClass(), "isPriceGetOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.repositories.OrderRepo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("online.devupgrade.sezon2.entities.Order");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "save", argTypes, null, args);
    }

};



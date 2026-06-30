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

public class DiscountEntity_setRoles_21024090323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1168;
     Object term1245;

    public DiscountEntity_setRoles_21024090323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1169 = new Integer(1532716628);
        Long term1171 = new Long(-4502405999831680926L);
        ArrayList term1173 = new ArrayList();
        ((ArrayList) term1173).add("SdCKLMIYnX");
        Integer term1192 = new Integer(-1801760683);
        Object term1191 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1191, term1191.getClass(), "id", term1192);
        setFloatField(term1191, term1191.getClass(), "price", 0.94706243F);
        setFloatField(term1191, term1191.getClass(), "pricePoPrzecinku", 0.0027298927F);
        setBooleanField(term1191, term1191.getClass(), "isPriceGetOnce", false);
        Integer term1198 = new Integer(1141317871);
        Object term1197 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1197, term1197.getClass(), "id", term1198);
        setFloatField(term1197, term1197.getClass(), "price", 0.45478272F);
        setFloatField(term1197, term1197.getClass(), "pricePoPrzecinku", 0.29874015F);
        setBooleanField(term1197, term1197.getClass(), "isPriceGetOnce", true);
        Integer term1204 = new Integer(890669485);
        Object term1203 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1203, term1203.getClass(), "id", term1204);
        setFloatField(term1203, term1203.getClass(), "price", 0.8780084F);
        setFloatField(term1203, term1203.getClass(), "pricePoPrzecinku", 0.32554477F);
        setBooleanField(term1203, term1203.getClass(), "isPriceGetOnce", false);
        Integer term1210 = new Integer(691577392);
        Object term1209 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1209, term1209.getClass(), "id", term1210);
        setFloatField(term1209, term1209.getClass(), "price", 0.053365767F);
        setFloatField(term1209, term1209.getClass(), "pricePoPrzecinku", 0.8924855F);
        setBooleanField(term1209, term1209.getClass(), "isPriceGetOnce", false);
        Integer term1216 = new Integer(-893623680);
        Object term1215 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1215, term1215.getClass(), "id", term1216);
        setFloatField(term1215, term1215.getClass(), "price", 0.94332385F);
        setFloatField(term1215, term1215.getClass(), "pricePoPrzecinku", 0.32237554F);
        setBooleanField(term1215, term1215.getClass(), "isPriceGetOnce", true);
        ArrayList term1189 = new ArrayList();
        ((ArrayList) term1189).add(term1191);
        ((ArrayList) term1189).add(term1197);
        ((ArrayList) term1189).add(term1203);
        ((ArrayList) term1189).add(term1209);
        ((ArrayList) term1189).add(term1215);
        Integer term1226 = new Integer(-1963434938);
        Object term1225 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1225, term1225.getClass(), "id", term1226);
        setFloatField(term1225, term1225.getClass(), "price", 0.7666174F);
        setFloatField(term1225, term1225.getClass(), "pricePoPrzecinku", 0.53094494F);
        setBooleanField(term1225, term1225.getClass(), "isPriceGetOnce", false);
        Integer term1232 = new Integer(906181092);
        Object term1231 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1231, term1231.getClass(), "id", term1232);
        setFloatField(term1231, term1231.getClass(), "price", 0.301957F);
        setFloatField(term1231, term1231.getClass(), "pricePoPrzecinku", 0.14643145F);
        setBooleanField(term1231, term1231.getClass(), "isPriceGetOnce", true);
        Integer term1238 = new Integer(1045657203);
        Object term1237 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1237, term1237.getClass(), "id", term1238);
        setFloatField(term1237, term1237.getClass(), "price", 0.7032675F);
        setFloatField(term1237, term1237.getClass(), "pricePoPrzecinku", 0.24259013F);
        setBooleanField(term1237, term1237.getClass(), "isPriceGetOnce", false);
        ArrayList term1223 = new ArrayList();
        ((ArrayList) term1223).add(term1225);
        ((ArrayList) term1223).add(term1231);
        ((ArrayList) term1223).add(term1237);
        term1168 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term1168, term1168.getClass(), "id", term1169);
        setField(term1168, term1168.getClass(), "value", term1171);
        setField(term1168, term1168.getClass(), "roles", term1173);
        setField(term1168, term1168.getClass(), "included", term1189);
        setField(term1168, term1168.getClass(), "excluded", term1223);
        term1245 = new LinkedList();
        ((LinkedList) term1245).add("OJJtVNPyKZ");
        ((LinkedList) term1245).add("AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.DiscountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1245;
        callMethod(klass, "setRoles", argTypes, term1168, args);
    }

};



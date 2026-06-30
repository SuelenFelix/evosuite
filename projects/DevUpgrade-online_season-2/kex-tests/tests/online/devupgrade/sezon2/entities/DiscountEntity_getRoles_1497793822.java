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

public class DiscountEntity_getRoles_1497793822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;

    public DiscountEntity_getRoles_1497793822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term928 = new Integer(683666002);
        Long term930 = new Long(-7672528020740371001L);
        ArrayList term932 = new ArrayList();
        ((ArrayList) term932).add("hCWPJQKpdc");
        ((ArrayList) term932).add("WzMEhMXkKx");
        ((ArrayList) term932).add("XOiDvlDhdc");
        ((ArrayList) term932).add("AdxvLJhNLe");
        ((ArrayList) term932).add("lHfTrWKMPk");
        ((ArrayList) term932).add("JDaAnsVTGV");
        ((ArrayList) term932).add("mLUZFTfjle");
        ((ArrayList) term932).add("xIeFjkHkOe");
        Integer term1035 = new Integer(1596213415);
        Object term1034 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1034, term1034.getClass(), "id", term1035);
        setFloatField(term1034, term1034.getClass(), "price", 0.48796618F);
        setFloatField(term1034, term1034.getClass(), "pricePoPrzecinku", 0.63550293F);
        setBooleanField(term1034, term1034.getClass(), "isPriceGetOnce", false);
        Integer term1041 = new Integer(-268815336);
        Object term1040 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1040, term1040.getClass(), "id", term1041);
        setFloatField(term1040, term1040.getClass(), "price", 0.08016902F);
        setFloatField(term1040, term1040.getClass(), "pricePoPrzecinku", 0.0022646189F);
        setBooleanField(term1040, term1040.getClass(), "isPriceGetOnce", false);
        Integer term1047 = new Integer(-1210583429);
        Object term1046 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1046, term1046.getClass(), "id", term1047);
        setFloatField(term1046, term1046.getClass(), "price", 0.99403065F);
        setFloatField(term1046, term1046.getClass(), "pricePoPrzecinku", 0.36226058F);
        setBooleanField(term1046, term1046.getClass(), "isPriceGetOnce", false);
        Integer term1053 = new Integer(-663691365);
        Object term1052 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1052, term1052.getClass(), "id", term1053);
        setFloatField(term1052, term1052.getClass(), "price", 0.04703206F);
        setFloatField(term1052, term1052.getClass(), "pricePoPrzecinku", 0.036990583F);
        setBooleanField(term1052, term1052.getClass(), "isPriceGetOnce", false);
        Integer term1059 = new Integer(339854490);
        Object term1058 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1058, term1058.getClass(), "id", term1059);
        setFloatField(term1058, term1058.getClass(), "price", 0.8998475F);
        setFloatField(term1058, term1058.getClass(), "pricePoPrzecinku", 0.60471374F);
        setBooleanField(term1058, term1058.getClass(), "isPriceGetOnce", false);
        Integer term1065 = new Integer(-615654495);
        Object term1064 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1064, term1064.getClass(), "id", term1065);
        setFloatField(term1064, term1064.getClass(), "price", 0.023032188F);
        setFloatField(term1064, term1064.getClass(), "pricePoPrzecinku", 0.6767213F);
        setBooleanField(term1064, term1064.getClass(), "isPriceGetOnce", false);
        ArrayList term1032 = new ArrayList();
        ((ArrayList) term1032).add(term1034);
        ((ArrayList) term1032).add(term1040);
        ((ArrayList) term1032).add(term1046);
        ((ArrayList) term1032).add(term1052);
        ((ArrayList) term1032).add(term1058);
        ((ArrayList) term1032).add(term1064);
        Integer term1075 = new Integer(-1476117762);
        Object term1074 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1074, term1074.getClass(), "id", term1075);
        setFloatField(term1074, term1074.getClass(), "price", 0.65115076F);
        setFloatField(term1074, term1074.getClass(), "pricePoPrzecinku", 0.48862952F);
        setBooleanField(term1074, term1074.getClass(), "isPriceGetOnce", true);
        Integer term1081 = new Integer(-341962980);
        Object term1080 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1080, term1080.getClass(), "id", term1081);
        setFloatField(term1080, term1080.getClass(), "price", 0.37227178F);
        setFloatField(term1080, term1080.getClass(), "pricePoPrzecinku", 0.42623103F);
        setBooleanField(term1080, term1080.getClass(), "isPriceGetOnce", false);
        ArrayList term1072 = new ArrayList();
        ((ArrayList) term1072).add(term1074);
        ((ArrayList) term1072).add(term1080);
        term927 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term927, term927.getClass(), "id", term928);
        setField(term927, term927.getClass(), "value", term930);
        setField(term927, term927.getClass(), "roles", term932);
        setField(term927, term927.getClass(), "included", term1032);
        setField(term927, term927.getClass(), "excluded", term1072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.DiscountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term927, args);
    }

};



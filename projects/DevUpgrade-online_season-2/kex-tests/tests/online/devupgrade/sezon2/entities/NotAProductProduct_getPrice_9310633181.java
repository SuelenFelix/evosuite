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

public class NotAProductProduct_getPrice_9310633181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806;

    public NotAProductProduct_getPrice_9310633181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term807 = new Integer(1114000454);
        term806 = newInstance(Class.forName("online.devupgrade.sezon2.entities.NotAProductProduct"));
        setField(term806, term806.getClass(), "id", term807);
        setFloatField(term806, term806.getClass(), "price", 0.54285216F);
        setFloatField(term806, term806.getClass(), "pricePoPrzecinku", 0.21098667F);
        setBooleanField(term806, term806.getClass(), "isPriceGetOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.NotAProductProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term806, args);
    }

};



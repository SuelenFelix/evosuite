package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ForexPricing_hashCode_39043281813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;

    public ForexPricing_hashCode_39043281813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1208 = new Integer(590364439);
        Integer term1210 = new Integer(865208305);
        term1183 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing"));
        setField(term1183, term1183.getClass(), "baseCurrency", "OclPbYPkcH");
        setField(term1183, term1183.getClass(), "counterCurrency", "IoAlmYsBwc");
        setField(term1183, term1183.getClass(), "buyPip", term1208);
        setField(term1183, term1183.getClass(), "sellPip", term1210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1183, args);
    }

};



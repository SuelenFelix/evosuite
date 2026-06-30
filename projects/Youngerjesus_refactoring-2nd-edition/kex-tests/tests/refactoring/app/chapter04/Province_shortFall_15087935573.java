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

public class Province_shortFall_15087935573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;

    public Province_shortFall_15087935573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term256 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term260 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term256, term256.getClass(), "name", "");
        setIntField(term256, term256.getClass(), "cost", -420030135);
        setIntField(term256, term256.getClass(), "production", 267763294);
        setField(term260, term260.getClass(), "name", null);
        setField(term260, term260.getClass(), "producers", null);
        setIntField(term260, term260.getClass(), "totalProduction", -916335264);
        setIntField(term260, term260.getClass(), "demand", -919416536);
        setIntField(term260, term260.getClass(), "price", -43417861);
        setField(term256, term256.getClass(), "province", term260);
        ArrayList term254 = new ArrayList();
        ((ArrayList) term254).add(term256);
        term241 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term241, term241.getClass(), "name", "vjxIhXHxGR");
        setField(term241, term241.getClass(), "producers", term254);
        setIntField(term241, term241.getClass(), "totalProduction", -1533843432);
        setIntField(term241, term241.getClass(), "demand", -123338791);
        setIntField(term241, term241.getClass(), "price", -1467089634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shortFall", argTypes, term241, args);
    }

};



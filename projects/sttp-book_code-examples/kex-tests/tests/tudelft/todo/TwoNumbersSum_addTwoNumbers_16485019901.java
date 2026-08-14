package tudelft.todo;

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
import static tudelft.todo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class TwoNumbersSum_addTwoNumbers_16485019901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term54;
     Object term68;

    public TwoNumbersSum_addTwoNumbers_16485019901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("tudelft.todo.TwoNumbersSum"));
        Integer term56 = new Integer(568599855);
        Integer term58 = new Integer(1162663216);
        Integer term60 = new Integer(1484323161);
        Integer term62 = new Integer(391863371);
        Integer term64 = new Integer(-1922583790);
        term54 = new ArrayList();
        ((ArrayList) term54).add(term56);
        ((ArrayList) term54).add(term58);
        ((ArrayList) term54).add(term60);
        ((ArrayList) term54).add(term62);
        ((ArrayList) term54).add(term64);
        Integer term70 = new Integer(-616727354);
        Integer term72 = new Integer(-1955890973);
        Integer term74 = new Integer(-2038273078);
        Integer term76 = new Integer(1227103734);
        Integer term78 = new Integer(-1339778481);
        Integer term80 = new Integer(1725571209);
        term68 = new ArrayList();
        ((ArrayList) term68).add(term70);
        ((ArrayList) term68).add(term72);
        ((ArrayList) term68).add(term74);
        ((ArrayList) term68).add(term76);
        ((ArrayList) term68).add(term78);
        ((ArrayList) term68).add(term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.todo.TwoNumbersSum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[2];
        args[0] = term54;
        args[1] = term68;
        callMethod(klass, "addTwoNumbers", argTypes, term53, args);
    }

};



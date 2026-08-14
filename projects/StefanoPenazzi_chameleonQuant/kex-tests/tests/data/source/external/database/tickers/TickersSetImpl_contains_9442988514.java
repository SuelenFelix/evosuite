package data.source.external.database.tickers;

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
import static data.source.external.database.tickers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class TickersSetImpl_contains_9442988514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537;

    public TickersSetImpl_contains_9442988514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term538 = new ArrayList();
        ((ArrayList) term538).add("vrQLuWIDJX");
        ((ArrayList) term538).add("flxyYxBRtu");
        ((ArrayList) term538).add("OclPbYPkcH");
        ((ArrayList) term538).add("IoAlmYsBwc");
        ((ArrayList) term538).add("TEParAifyi");
        term537 = newInstance(Class.forName("data.source.external.database.tickers.TickersSetImpl"));
        setField(term537, term537.getClass(), "tickersSet", term538);
        setField(term537, term537.getClass(), "name", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.tickers.TickersSetImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        callMethod(klass, "contains", argTypes, term537, args);
    }

};



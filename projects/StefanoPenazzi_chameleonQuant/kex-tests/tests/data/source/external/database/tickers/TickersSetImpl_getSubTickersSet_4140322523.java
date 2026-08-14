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
import java.lang.Character;

public class TickersSetImpl_getSubTickersSet_4140322523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;
     Object term485;

    public TickersSetImpl_getSubTickersSet_4140322523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term421 = new ArrayList();
        ((ArrayList) term421).add("hNxWaHcfhY");
        ((ArrayList) term421).add("RkybSrpybU");
        ((ArrayList) term421).add("xOEqzGAmDU");
        ((ArrayList) term421).add("eZFUvlxvGV");
        term420 = newInstance(Class.forName("data.source.external.database.tickers.TickersSetImpl"));
        setField(term420, term420.getClass(), "tickersSet", term421);
        setField(term420, term420.getClass(), "name", "BYqFIqCKAV");
        term485 = new Character('E');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.tickers.TickersSetImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term485;
        callMethod(klass, "getSubTickersSet", argTypes, term420, args);
    }

};



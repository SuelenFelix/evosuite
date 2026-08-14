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

public class TickersSetImpl_getTickersSet_19462495181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;

    public TickersSetImpl_getTickersSet_19462495181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term169 = new ArrayList();
        ((ArrayList) term169).add("RMFIsYGgne");
        ((ArrayList) term169).add("NRdvgJlhkX");
        ((ArrayList) term169).add("uuaPigETmJ");
        ((ArrayList) term169).add("MxlszYVzRf");
        ((ArrayList) term169).add("LQFpaHEwXR");
        ((ArrayList) term169).add("oVcInYnLWB");
        ((ArrayList) term169).add("aJlieCFVtF");
        ((ArrayList) term169).add("ZiaGIbnzTs");
        ((ArrayList) term169).add("tbcdzjIfER");
        term168 = newInstance(Class.forName("data.source.external.database.tickers.TickersSetImpl"));
        setField(term168, term168.getClass(), "tickersSet", term169);
        setField(term168, term168.getClass(), "name", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.tickers.TickersSetImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTickersSet", argTypes, term168, args);
    }

};



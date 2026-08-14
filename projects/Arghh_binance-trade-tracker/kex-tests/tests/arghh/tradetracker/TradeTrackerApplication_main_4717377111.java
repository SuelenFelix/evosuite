package arghh.tradetracker;

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
import static arghh.tradetracker.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TradeTrackerApplication_main_4717377111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21798;

    public TradeTrackerApplication_main_4717377111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21798 = (Object[]) newArray("java.lang.String", 6);
        setElement(term21798, 0, "ZfBIVGBQOE");
        setElement(term21798, 1, "QSrDQfEsTR");
        setElement(term21798, 2, "PsqusYmejD");
        setElement(term21798, 3, "NTWMiBEaDF");
        setElement(term21798, 4, "SPBstwKFVr");
        setElement(term21798, 5, "WxYUTuqmIq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.TradeTrackerApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term21798;
        callMethod(klass, "main", argTypes, null, args);
    }

};



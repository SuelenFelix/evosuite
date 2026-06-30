package refactoring.app.chapter11.returnModifiedValue;

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
import static refactoring.app.chapter11.returnModifiedValue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class GPS_calculateDistance_2948189704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public GPS_calculateDistance_2948189704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26 = new ArrayList();
        term25 = newInstance(Class.forName("refactoring.app.chapter11.returnModifiedValue.GPS"));
        setField(term25, term25.getClass(), "points", term26);
        setIntField(term25, term25.getClass(), "totalAscent", -1339778481);
        setIntField(term25, term25.getClass(), "totalTime", 1725571209);
        setIntField(term25, term25.getClass(), "totalDistance", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.returnModifiedValue.GPS");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateDistance", argTypes, term25, args);
    }

};



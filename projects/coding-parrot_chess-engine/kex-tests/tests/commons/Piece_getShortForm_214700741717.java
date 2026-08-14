package commons;

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
import static commons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Piece_getShortForm_214700741717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3035;

    public Piece_getShortForm_214700741717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3035 = newInstance(Class.forName("commons.Piece"));
        setField(term3035, term3035.getClass(), "color", null);
        setField(term3035, term3035.getClass(), "position", null);
        setField(term3035, term3035.getClass(), "pieceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShortForm", argTypes, term3035, args);
    }

};



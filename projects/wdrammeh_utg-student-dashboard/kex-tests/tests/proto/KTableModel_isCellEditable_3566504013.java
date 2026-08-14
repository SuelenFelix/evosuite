package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class KTableModel_isCellEditable_3566504013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71490;
     Object term71491;
     Object term71493;

    public KTableModel_isCellEditable_3566504013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71490 = newInstance(Class.forName("proto.KTableModel"));
        setField(term71490, term71490.getClass(), "table", null);
        setField(term71490, term71490.getClass(), "dataVector", null);
        setField(term71490, term71490.getClass(), "columnIdentifiers", null);
        setField(term71490, term71490.getClass(), "listenerList", null);
        term71491 = new Integer(0);
        term71493 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term71491;
        args[1] = term71493;
        callMethod(klass, "isCellEditable", argTypes, term71490, args);
    }

};



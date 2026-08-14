package mil.nga.geopackage.attributes;

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
import static mil.nga.geopackage.attributes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTable_getUserColumns_4956685665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5066;

    public AttributesTable_getUserColumns_4956685665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5068 = new ArrayList();
        HashMap term5072 = new HashMap();
        term5066 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term5067 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5066, term5066.getClass(), "columns", null);
        setField(term5067, term5067.getClass(), "constraints", term5068);
        setField(term5067, term5067.getClass(), "typedContraints", term5072);
        setField(term5066, term5066.getClass(), "constraints", term5067);
        setField(term5066, term5066.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserColumns", argTypes, term5066, args);
    }

};



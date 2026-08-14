package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAttributesTable_validateColumns_132686123819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426;

    public SimpleAttributesTable_validateColumns_132686123819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term452 = new ArrayList();
        HashMap term456 = new HashMap();
        term426 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        Object term451 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term426, term426.getClass(), "relationName", "tbcdzjIfER");
        setField(term426, term426.getClass(), "dataType", "HyxfbSQYBe");
        setField(term426, term426.getClass(), "columns", null);
        setField(term451, term451.getClass(), "constraints", term452);
        setField(term451, term451.getClass(), "typedContraints", term456);
        setField(term426, term426.getClass(), "constraints", term451);
        setField(term426, term426.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validateColumns", argTypes, term426, args);
    }

};



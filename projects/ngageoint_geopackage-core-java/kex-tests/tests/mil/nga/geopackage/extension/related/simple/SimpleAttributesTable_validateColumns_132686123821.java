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

public class SimpleAttributesTable_validateColumns_132686123821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13167;

    public SimpleAttributesTable_validateColumns_132686123821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13193 = new ArrayList();
        HashMap term13197 = new HashMap();
        term13167 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        Object term13192 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term13167, term13167.getClass(), "relationName", "PaCpFXGzdX");
        setField(term13167, term13167.getClass(), "dataType", "FftYCNbnks");
        setField(term13167, term13167.getClass(), "columns", null);
        setField(term13192, term13192.getClass(), "constraints", term13193);
        setField(term13192, term13192.getClass(), "typedContraints", term13197);
        setField(term13167, term13167.getClass(), "constraints", term13192);
        setField(term13167, term13167.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validateColumns", argTypes, term13167, args);
    }

};



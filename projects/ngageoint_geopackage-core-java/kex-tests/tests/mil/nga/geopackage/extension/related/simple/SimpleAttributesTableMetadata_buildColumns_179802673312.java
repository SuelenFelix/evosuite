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
import java.util.ArrayList;

public class SimpleAttributesTableMetadata_buildColumns_179802673312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13957;

    public SimpleAttributesTableMetadata_buildColumns_179802673312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14019 = new ArrayList();
        ArrayList term14023 = new ArrayList();
        term13957 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term13957, term13957.getClass(), "tableName", "epPTwvcoyb");
        setField(term13957, term13957.getClass(), "dataType", "UBPHmOICBs");
        setField(term13957, term13957.getClass(), "identifier", "IDJUVPgUJf");
        setField(term13957, term13957.getClass(), "description", "JmnWRJUxGr");
        setField(term13957, term13957.getClass(), "idColumnName", "wgRGBNrTGP");
        setBooleanField(term13957, term13957.getClass(), "autoincrement", true);
        setField(term13957, term13957.getClass(), "additionalColumns", term14019);
        setField(term13957, term13957.getClass(), "columns", term14023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term13957, args);
    }

};



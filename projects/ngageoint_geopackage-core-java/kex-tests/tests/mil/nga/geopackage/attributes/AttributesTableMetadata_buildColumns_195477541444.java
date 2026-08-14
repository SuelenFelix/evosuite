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

public class AttributesTableMetadata_buildColumns_195477541444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138207;

    public AttributesTableMetadata_buildColumns_195477541444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term138209 = new ArrayList();
        HashMap term138213 = new HashMap();
        ArrayList term138279 = new ArrayList();
        ArrayList term138283 = new ArrayList();
        term138207 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        Object term138208 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term138208, term138208.getClass(), "constraints", term138209);
        setField(term138208, term138208.getClass(), "typedContraints", term138213);
        setField(term138207, term138207.getClass(), "constraints", term138208);
        setField(term138207, term138207.getClass(), "tableName", "cFNqeNRwhB");
        setField(term138207, term138207.getClass(), "dataType", "TQJASDuFUN");
        setField(term138207, term138207.getClass(), "identifier", "mOILNTkENv");
        setField(term138207, term138207.getClass(), "description", "xgjvpKAqFv");
        setField(term138207, term138207.getClass(), "idColumnName", "RspkCWCAFM");
        setBooleanField(term138207, term138207.getClass(), "autoincrement", true);
        setField(term138207, term138207.getClass(), "additionalColumns", term138279);
        setField(term138207, term138207.getClass(), "columns", term138283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term138207, args);
    }

};



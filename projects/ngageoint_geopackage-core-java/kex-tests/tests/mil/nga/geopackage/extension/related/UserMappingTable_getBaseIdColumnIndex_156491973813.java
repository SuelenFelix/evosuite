package mil.nga.geopackage.extension.related;

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
import static mil.nga.geopackage.extension.related.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class UserMappingTable_getBaseIdColumnIndex_156491973813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31135;

    public UserMappingTable_getBaseIdColumnIndex_156491973813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31137 = new ArrayList();
        HashMap term31141 = new HashMap();
        term31135 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserMappingTable"));
        Object term31136 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term31135, term31135.getClass(), "columns", null);
        setField(term31136, term31136.getClass(), "constraints", term31137);
        setField(term31136, term31136.getClass(), "typedContraints", term31141);
        setField(term31135, term31135.getClass(), "constraints", term31136);
        setField(term31135, term31135.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserMappingTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseIdColumnIndex", argTypes, term31135, args);
    }

};



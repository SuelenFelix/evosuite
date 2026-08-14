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

public class UserRelatedTable_init_21237235652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2828;

    public UserRelatedTable_init_21237235652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2830 = new ArrayList();
        HashMap term2834 = new HashMap();
        term2828 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term2829 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2828, term2828.getClass(), "columns", null);
        setField(term2829, term2829.getClass(), "constraints", term2830);
        setField(term2829, term2829.getClass(), "typedContraints", term2834);
        setField(term2828, term2828.getClass(), "constraints", term2829);
        setField(term2828, term2828.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserRelatedTable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Object[] args = new Object[3];
        args[0] = "nGKItKLYNC";
        args[1] = "UiUYnPrcCi";
        args[2] = term2828;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



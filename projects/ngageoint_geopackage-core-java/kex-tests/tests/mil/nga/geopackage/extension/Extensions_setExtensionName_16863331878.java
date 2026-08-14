package mil.nga.geopackage.extension;

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
import static mil.nga.geopackage.extension.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Extensions_setExtensionName_16863331878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15605;

    public Extensions_setExtensionName_16863331878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15605 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term15605, term15605.getClass(), "tableName", "vOuMEpOQAg");
        setField(term15605, term15605.getClass(), "columnName", "SIODFGaQhr");
        setField(term15605, term15605.getClass(), "extensionName", "qYzsiuXOgS");
        setField(term15605, term15605.getClass(), "definition", "bxrCBbrrct");
        setField(term15605, term15605.getClass(), "scope", "CKWpJaaaxX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "UBRmXJmfrt";
        args[1] = "WZzvmIHhzZ";
        callMethod(klass, "setExtensionName", argTypes, term15605, args);
    }

};



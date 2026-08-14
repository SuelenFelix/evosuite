package mil.nga.geopackage.extension.im.portrayal;

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
import static mil.nga.geopackage.extension.im.portrayal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Stylesheets_setStylesheet_9913938610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1785;
     Object term1809;

    public Stylesheets_setStylesheet_9913938610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1785 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets"));
        byte[] term1800 = (byte[]) newByteArray(8);
        setLongField(term1785, term1785.getClass(), "id", 5973526439563541711L);
        setLongField(term1785, term1785.getClass(), "style_id", 5246058710498845622L);
        setField(term1785, term1785.getClass(), "format", "UoYtihxVaS");
        setByteElement(term1800, 0, (byte) -118);
        setByteElement(term1800, 1, (byte) -126);
        setByteElement(term1800, 2, (byte) -91);
        setByteElement(term1800, 3, (byte) -104);
        setByteElement(term1800, 4, (byte) -89);
        setByteElement(term1800, 5, (byte) 13);
        setByteElement(term1800, 6, (byte) 44);
        setByteElement(term1800, 7, (byte) -63);
        setField(term1785, term1785.getClass(), "stylesheet", term1800);
        term1809 = (byte[]) newByteArray(6);
        setByteElement(term1809, 0, (byte) 15);
        setByteElement(term1809, 1, (byte) 45);
        setByteElement(term1809, 2, (byte) -39);
        setByteElement(term1809, 3, (byte) -20);
        setByteElement(term1809, 4, (byte) 10);
        setByteElement(term1809, 5, (byte) 77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1809;
        callMethod(klass, "setStylesheet", argTypes, term1785, args);
    }

};



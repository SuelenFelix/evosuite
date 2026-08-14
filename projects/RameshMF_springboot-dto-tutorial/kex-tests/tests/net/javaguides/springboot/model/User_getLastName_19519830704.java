package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_getLastName_19519830704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;

    public User_getLastName_19519830704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term467 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term417, term417.getClass(), "id", 4872422362414183754L);
        setField(term417, term417.getClass(), "email", "HyxfbSQYBe");
        setField(term417, term417.getClass(), "firstName", "pCTimMblYc");
        setField(term417, term417.getClass(), "lastName", "hNxWaHcfhY");
        setField(term417, term417.getClass(), "password", "RkybSrpybU");
        setLongField(term467, term467.getClass(), "id", 6811161968424632369L);
        setField(term467, term467.getClass(), "place", "xOEqzGAmDU");
        setField(term467, term467.getClass(), "description", "eZFUvlxvGV");
        setDoubleField(term467, term467.getClass(), "longitude", 0.2641345529914265);
        setDoubleField(term467, term467.getClass(), "latitude", 0.36923381893433327);
        setField(term417, term417.getClass(), "location", term467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term417, args);
    }

};



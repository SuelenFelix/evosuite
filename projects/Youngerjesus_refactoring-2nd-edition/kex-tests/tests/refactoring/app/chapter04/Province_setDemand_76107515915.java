package refactoring.app.chapter04;

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
import static refactoring.app.chapter04.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class Province_setDemand_76107515915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008;
     Object term1068;

    public Province_setDemand_76107515915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1023 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1027 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1023, term1023.getClass(), "name", "");
        setIntField(term1023, term1023.getClass(), "cost", -814977075);
        setIntField(term1023, term1023.getClass(), "production", 808614267);
        setField(term1027, term1027.getClass(), "name", null);
        setField(term1027, term1027.getClass(), "producers", null);
        setIntField(term1027, term1027.getClass(), "totalProduction", -1651110911);
        setIntField(term1027, term1027.getClass(), "demand", -1934033808);
        setIntField(term1027, term1027.getClass(), "price", 950322609);
        setField(term1023, term1023.getClass(), "province", term1027);
        Object term1031 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1035 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1031, term1031.getClass(), "name", "");
        setIntField(term1031, term1031.getClass(), "cost", -1300947782);
        setIntField(term1031, term1031.getClass(), "production", 188512644);
        setField(term1035, term1035.getClass(), "name", null);
        setField(term1035, term1035.getClass(), "producers", null);
        setIntField(term1035, term1035.getClass(), "totalProduction", 0);
        setIntField(term1035, term1035.getClass(), "demand", 0);
        setIntField(term1035, term1035.getClass(), "price", 0);
        setField(term1031, term1031.getClass(), "province", term1035);
        Object term1039 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1043 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1039, term1039.getClass(), "name", "");
        setIntField(term1039, term1039.getClass(), "cost", -146564963);
        setIntField(term1039, term1039.getClass(), "production", -83178716);
        setField(term1043, term1043.getClass(), "name", null);
        setField(term1043, term1043.getClass(), "producers", null);
        setIntField(term1043, term1043.getClass(), "totalProduction", 0);
        setIntField(term1043, term1043.getClass(), "demand", 0);
        setIntField(term1043, term1043.getClass(), "price", 0);
        setField(term1039, term1039.getClass(), "province", term1043);
        Object term1047 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1051 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1047, term1047.getClass(), "name", "");
        setIntField(term1047, term1047.getClass(), "cost", 1789351397);
        setIntField(term1047, term1047.getClass(), "production", 2145528170);
        setField(term1051, term1051.getClass(), "name", null);
        setField(term1051, term1051.getClass(), "producers", null);
        setIntField(term1051, term1051.getClass(), "totalProduction", -585773976);
        setIntField(term1051, term1051.getClass(), "demand", 852806940);
        setIntField(term1051, term1051.getClass(), "price", 698551724);
        setField(term1047, term1047.getClass(), "province", term1051);
        Object term1055 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1059 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1055, term1055.getClass(), "name", "");
        setIntField(term1055, term1055.getClass(), "cost", -64893740);
        setIntField(term1055, term1055.getClass(), "production", -222012928);
        setField(term1059, term1059.getClass(), "name", null);
        setField(term1059, term1059.getClass(), "producers", null);
        setIntField(term1059, term1059.getClass(), "totalProduction", -365784998);
        setIntField(term1059, term1059.getClass(), "demand", -1893236300);
        setIntField(term1059, term1059.getClass(), "price", -1858909368);
        setField(term1055, term1055.getClass(), "province", term1059);
        ArrayList term1021 = new ArrayList();
        ((ArrayList) term1021).add(term1023);
        ((ArrayList) term1021).add(term1031);
        ((ArrayList) term1021).add(term1039);
        ((ArrayList) term1021).add(term1047);
        ((ArrayList) term1021).add(term1055);
        term1008 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1008, term1008.getClass(), "name", "yUGCjlqgJE");
        setField(term1008, term1008.getClass(), "producers", term1021);
        setIntField(term1008, term1008.getClass(), "totalProduction", -2023791789);
        setIntField(term1008, term1008.getClass(), "demand", 353974456);
        setIntField(term1008, term1008.getClass(), "price", -485108462);
        term1068 = new Integer(1418551216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1068;
        callMethod(klass, "setDemand", argTypes, term1008, args);
    }

};



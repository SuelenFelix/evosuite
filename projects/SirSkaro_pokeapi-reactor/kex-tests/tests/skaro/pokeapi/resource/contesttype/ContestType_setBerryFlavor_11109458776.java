package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class ContestType_setBerryFlavor_11109458776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1098;
     Object term1166;

    public ContestType_setBerryFlavor_11109458776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1099 = new Integer(-1955890973);
        Object term1140 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1143 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1140, term1140.getClass(), "name", "");
        setField(term1140, term1140.getClass(), "color", "");
        setField(term1143, term1143.getClass(), "name", null);
        setField(term1143, term1143.getClass(), "url", null);
        setField(term1140, term1140.getClass(), "language", term1143);
        Object term1144 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1147 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1144, term1144.getClass(), "name", "");
        setField(term1144, term1144.getClass(), "color", "");
        setField(term1147, term1147.getClass(), "name", null);
        setField(term1147, term1147.getClass(), "url", null);
        setField(term1144, term1144.getClass(), "language", term1147);
        Object term1148 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1148, term1148.getClass(), "name", "");
        setField(term1148, term1148.getClass(), "color", "");
        setField(term1151, term1151.getClass(), "name", null);
        setField(term1151, term1151.getClass(), "url", null);
        setField(term1148, term1148.getClass(), "language", term1151);
        Object term1152 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1155 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1152, term1152.getClass(), "name", "");
        setField(term1152, term1152.getClass(), "color", "");
        setField(term1155, term1155.getClass(), "name", null);
        setField(term1155, term1155.getClass(), "url", null);
        setField(term1152, term1152.getClass(), "language", term1155);
        Object term1156 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1159 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1156, term1156.getClass(), "name", "");
        setField(term1156, term1156.getClass(), "color", "");
        setField(term1159, term1159.getClass(), "name", null);
        setField(term1159, term1159.getClass(), "url", null);
        setField(term1156, term1156.getClass(), "language", term1159);
        Object term1160 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1163 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1160, term1160.getClass(), "name", "");
        setField(term1160, term1160.getClass(), "color", "");
        setField(term1163, term1163.getClass(), "name", null);
        setField(term1163, term1163.getClass(), "url", null);
        setField(term1160, term1160.getClass(), "language", term1163);
        ArrayList term1138 = new ArrayList();
        ((ArrayList) term1138).add(term1140);
        ((ArrayList) term1138).add(term1144);
        ((ArrayList) term1138).add(term1148);
        ((ArrayList) term1138).add(term1152);
        ((ArrayList) term1138).add(term1156);
        ((ArrayList) term1138).add(term1160);
        term1098 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        Object term1113 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1098, term1098.getClass(), "id", term1099);
        setField(term1098, term1098.getClass(), "name", "yGtHPyvYiQ");
        setField(term1113, term1113.getClass(), "name", "MvRIxilFMJ");
        setField(term1113, term1113.getClass(), "url", "iNwOJRBEjp");
        setField(term1098, term1098.getClass(), "berryFlavor", term1113);
        setField(term1098, term1098.getClass(), "names", term1138);
        term1166 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1166, term1166.getClass(), "name", "pXOkjyeIRb");
        setField(term1166, term1166.getClass(), "url", "GgZWSjxjyE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1166;
        callMethod(klass, "setBerryFlavor", argTypes, term1098, args);
    }

};



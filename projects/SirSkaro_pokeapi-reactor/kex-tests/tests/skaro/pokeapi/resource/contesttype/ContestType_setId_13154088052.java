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

public class ContestType_setId_13154088052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730;
     Object term790;

    public ContestType_setId_13154088052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term731 = new Integer(1162663216);
        Object term772 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term775 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term772, term772.getClass(), "name", "");
        setField(term772, term772.getClass(), "color", "");
        setField(term775, term775.getClass(), "name", null);
        setField(term775, term775.getClass(), "url", null);
        setField(term772, term772.getClass(), "language", term775);
        Object term776 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term779 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term776, term776.getClass(), "name", "");
        setField(term776, term776.getClass(), "color", "");
        setField(term779, term779.getClass(), "name", null);
        setField(term779, term779.getClass(), "url", null);
        setField(term776, term776.getClass(), "language", term779);
        Object term780 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term783 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term780, term780.getClass(), "name", "");
        setField(term780, term780.getClass(), "color", "");
        setField(term783, term783.getClass(), "name", null);
        setField(term783, term783.getClass(), "url", null);
        setField(term780, term780.getClass(), "language", term783);
        Object term784 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term787 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term784, term784.getClass(), "name", "");
        setField(term784, term784.getClass(), "color", "");
        setField(term787, term787.getClass(), "name", null);
        setField(term787, term787.getClass(), "url", null);
        setField(term784, term784.getClass(), "language", term787);
        ArrayList term770 = new ArrayList();
        ((ArrayList) term770).add(term772);
        ((ArrayList) term770).add(term776);
        ((ArrayList) term770).add(term780);
        ((ArrayList) term770).add(term784);
        term730 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        Object term745 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term730, term730.getClass(), "id", term731);
        setField(term730, term730.getClass(), "name", "JDswTTCZHV");
        setField(term745, term745.getClass(), "name", "onpbIeEKoi");
        setField(term745, term745.getClass(), "url", "YRHGsAkhxb");
        setField(term730, term730.getClass(), "berryFlavor", term745);
        setField(term730, term730.getClass(), "names", term770);
        term790 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term790;
        callMethod(klass, "setId", argTypes, term730, args);
    }

};



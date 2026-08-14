package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MoveFlavorText_setVersionGroup_6630444376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5563;
     Object term5626;

    public MoveFlavorText_setVersionGroup_6630444376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5563 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveFlavorText"));
        Object term5576 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5601 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5563, term5563.getClass(), "flavorText", "sOdkipUKRu");
        setField(term5576, term5576.getClass(), "name", "oKwCDqywym");
        setField(term5576, term5576.getClass(), "url", "zjZYTddemL");
        setField(term5563, term5563.getClass(), "language", term5576);
        setField(term5601, term5601.getClass(), "name", "QtrylgCLiF");
        setField(term5601, term5601.getClass(), "url", "orEuhCStGM");
        setField(term5563, term5563.getClass(), "versionGroup", term5601);
        term5626 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5626, term5626.getClass(), "name", "vSeruUyNWX");
        setField(term5626, term5626.getClass(), "url", "UkKvaeJfEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term5626;
        callMethod(klass, "setVersionGroup", argTypes, term5563, args);
    }

};



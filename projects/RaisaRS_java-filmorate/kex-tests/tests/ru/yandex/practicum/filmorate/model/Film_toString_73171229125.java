package ru.yandex.practicum.filmorate.model;

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
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_toString_73171229125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8007;

    public Film_toString_73171229125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8065 = new HashMap();
        Set<Object> term8154 =  ((Map) term8065).keySet();
        HashSet term8064 = new HashSet((Collection<? extends Object>) term8154);
        HashMap term8084 = new HashMap();
        Set<Object> term8155 =  ((Map) term8084).keySet();
        HashSet term8083 = new HashSet((Collection<? extends Object>) term8155);
        term8007 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term8033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8038 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term8007, term8007.getClass(), "id", 1672578078364590450L);
        setField(term8007, term8007.getClass(), "name", "cSHGbqKqlN");
        setField(term8007, term8007.getClass(), "description", "pFAfANnxup");
        setIntField(term8033, term8033.getClass(), "year", 2018);
        setShortField(term8033, term8033.getClass(), "month", (short) 9);
        setShortField(term8033, term8033.getClass(), "day", (short) 1);
        setField(term8007, term8007.getClass(), "releaseDate", term8033);
        setIntField(term8007, term8007.getClass(), "duration", -426764678);
        setIntField(term8038, term8038.getClass(), "id", -1222614956);
        setField(term8038, term8038.getClass(), "name", "FbSIUZyBXZ");
        setField(term8038, term8038.getClass(), "description", "mhQDwIyrRi");
        setField(term8007, term8007.getClass(), "mpa", term8038);
        setField(term8007, term8007.getClass(), "genres", term8064);
        setField(term8007, term8007.getClass(), "likes", term8083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8007, args);
    }

};



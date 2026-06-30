package ru.yandex.practicum.filmorate.storage;

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
import static ru.yandex.practicum.filmorate.storage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class InMemoryFilmStorage_deleteLike_6689415161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term16;
     Object term61;

    public InMemoryFilmStorage_deleteLike_6689415161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10 = new HashMap();
        term9 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage"));
        setField(term9, term9.getClass(), "storagedData", term10);
        setIntField(term9, term9.getClass(), "id", 1484323161);
        HashMap term49 = new HashMap();
        Set<Object> term144 =  ((Map) term49).keySet();
        HashSet term48 = new HashSet((Collection<? extends Object>) term144);
        HashMap term55 = new HashMap();
        Set<Object> term145 =  ((Map) term55).keySet();
        HashSet term54 = new HashSet((Collection<? extends Object>) term145);
        term16 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term41 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term16, term16.getClass(), "name", "PAEBtnZtTD");
        setField(term16, term16.getClass(), "description", "sjlJAEtRrb");
        setIntField(term41, term41.getClass(), "year", 2012);
        setShortField(term41, term41.getClass(), "month", (short) 8);
        setShortField(term41, term41.getClass(), "day", (short) 25);
        setField(term16, term16.getClass(), "releaseDate", term41);
        setLongField(term16, term16.getClass(), "duration", 2442117782898005296L);
        setField(term46, term46.getClass(), "name", null);
        setIntField(term46, term46.getClass(), "id", 0);
        setField(term16, term16.getClass(), "mpa", term46);
        setField(term16, term16.getClass(), "genres", term48);
        setField(term16, term16.getClass(), "likedUsers", term54);
        setIntField(term16, term16.getClass(), "id", 391863371);
        HashMap term103 = new HashMap();
        Set<Object> term176 =  ((Map) term103).keySet();
        HashSet term102 = new HashSet((Collection<? extends Object>) term176);
        HashMap term109 = new HashMap();
        Set<Object> term177 =  ((Map) term109).keySet();
        HashSet term108 = new HashSet((Collection<? extends Object>) term177);
        term61 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term98 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term61, term61.getClass(), "login", "MuLcgQHgqz");
        setField(term61, term61.getClass(), "email", "xxtlPwDYFs");
        setField(term61, term61.getClass(), "name", "jJCZpVmanW");
        setIntField(term98, term98.getClass(), "year", 2016);
        setShortField(term98, term98.getClass(), "month", (short) 11);
        setShortField(term98, term98.getClass(), "day", (short) 29);
        setField(term61, term61.getClass(), "birthday", term98);
        setField(term61, term61.getClass(), "friends", term102);
        setField(term61, term61.getClass(), "likedFilms", term108);
        setIntField(term61, term61.getClass(), "id", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = term16;
        args[1] = term61;
        callMethod(klass, "deleteLike", argTypes, term9, args);
    }

};



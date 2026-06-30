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

public class InMemoryFilmStorage_addLike_919566502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;
     Object term185;
     Object term230;

    public InMemoryFilmStorage_addLike_919566502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term179 = new HashMap();
        term178 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage"));
        setField(term178, term178.getClass(), "storagedData", term179);
        setIntField(term178, term178.getClass(), "id", 1725571209);
        HashMap term218 = new HashMap();
        Set<Object> term313 =  ((Map) term218).keySet();
        HashSet term217 = new HashSet((Collection<? extends Object>) term313);
        HashMap term224 = new HashMap();
        Set<Object> term314 =  ((Map) term224).keySet();
        HashSet term223 = new HashSet((Collection<? extends Object>) term314);
        term185 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term185, term185.getClass(), "name", "aJlieCFVtF");
        setField(term185, term185.getClass(), "description", "ZiaGIbnzTs");
        setIntField(term210, term210.getClass(), "year", 2017);
        setShortField(term210, term210.getClass(), "month", (short) 5);
        setShortField(term210, term210.getClass(), "day", (short) 21);
        setField(term185, term185.getClass(), "releaseDate", term210);
        setLongField(term185, term185.getClass(), "duration", 4872422362414183754L);
        setField(term215, term215.getClass(), "name", null);
        setIntField(term215, term215.getClass(), "id", 0);
        setField(term185, term185.getClass(), "mpa", term215);
        setField(term185, term185.getClass(), "genres", term217);
        setField(term185, term185.getClass(), "likedUsers", term223);
        setIntField(term185, term185.getClass(), "id", -522618178);
        HashMap term272 = new HashMap();
        Set<Object> term345 =  ((Map) term272).keySet();
        HashSet term271 = new HashSet((Collection<? extends Object>) term345);
        HashMap term278 = new HashMap();
        Set<Object> term346 =  ((Map) term278).keySet();
        HashSet term277 = new HashSet((Collection<? extends Object>) term346);
        term230 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term267 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term230, term230.getClass(), "login", "tbcdzjIfER");
        setField(term230, term230.getClass(), "email", "HyxfbSQYBe");
        setField(term230, term230.getClass(), "name", "pCTimMblYc");
        setIntField(term267, term267.getClass(), "year", 2022);
        setShortField(term267, term267.getClass(), "month", (short) 2);
        setShortField(term267, term267.getClass(), "day", (short) 25);
        setField(term230, term230.getClass(), "birthday", term267);
        setField(term230, term230.getClass(), "friends", term271);
        setField(term230, term230.getClass(), "likedFilms", term277);
        setIntField(term230, term230.getClass(), "id", -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = term185;
        args[1] = term230;
        callMethod(klass, "addLike", argTypes, term178, args);
    }

};



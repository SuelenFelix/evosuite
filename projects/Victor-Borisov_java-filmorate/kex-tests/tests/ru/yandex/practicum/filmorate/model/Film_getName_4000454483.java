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
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Film_getName_4000454483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4119;

    public Film_getName_4000454483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4120 = new Integer(497269071);
        Integer term4152 = new Integer(-1899301124);
        Integer term4169 = new Integer(-1882480155);
        Object term4168 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4168, term4168.getClass(), "id", term4169);
        setField(term4168, term4168.getClass(), "name", "");
        Integer term4173 = new Integer(-1410220680);
        Object term4172 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4172, term4172.getClass(), "id", term4173);
        setField(term4172, term4172.getClass(), "name", "");
        Integer term4177 = new Integer(389427431);
        Object term4176 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4176, term4176.getClass(), "id", term4177);
        setField(term4176, term4176.getClass(), "name", "");
        Integer term4181 = new Integer(-1945706126);
        Object term4180 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4180, term4180.getClass(), "id", term4181);
        setField(term4180, term4180.getClass(), "name", "");
        Integer term4185 = new Integer(1152356969);
        Object term4184 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4184, term4184.getClass(), "id", term4185);
        setField(term4184, term4184.getClass(), "name", "");
        ArrayList term4166 = new ArrayList();
        ((ArrayList) term4166).add(term4168);
        ((ArrayList) term4166).add(term4172);
        ((ArrayList) term4166).add(term4176);
        ((ArrayList) term4166).add(term4180);
        ((ArrayList) term4166).add(term4184);
        term4119 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4151 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4119, term4119.getClass(), "id", term4120);
        setField(term4119, term4119.getClass(), "name", "OqbwYQfvAe");
        setField(term4119, term4119.getClass(), "description", "tRxZafjqIx");
        setIntField(term4146, term4146.getClass(), "year", 2011);
        setShortField(term4146, term4146.getClass(), "month", (short) 7);
        setShortField(term4146, term4146.getClass(), "day", (short) 24);
        setField(term4119, term4119.getClass(), "releaseDate", term4146);
        setIntField(term4119, term4119.getClass(), "duration", -556405712);
        setField(term4151, term4151.getClass(), "id", term4152);
        setField(term4151, term4151.getClass(), "name", "DhjNLmRMCu");
        setField(term4119, term4119.getClass(), "mpa", term4151);
        setField(term4119, term4119.getClass(), "genres", term4166);
        setIntField(term4119, term4119.getClass(), "rate", -1772434990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4119, args);
    }

};



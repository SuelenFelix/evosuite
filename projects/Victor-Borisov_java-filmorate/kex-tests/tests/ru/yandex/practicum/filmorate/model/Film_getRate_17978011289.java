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

public class Film_getRate_17978011289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4663;

    public Film_getRate_17978011289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4664 = new Integer(-2131181468);
        Integer term4696 = new Integer(282916351);
        Integer term4713 = new Integer(880977281);
        Object term4712 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4712, term4712.getClass(), "id", term4713);
        setField(term4712, term4712.getClass(), "name", "");
        Integer term4717 = new Integer(371943306);
        Object term4716 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4716, term4716.getClass(), "id", term4717);
        setField(term4716, term4716.getClass(), "name", "");
        Integer term4721 = new Integer(982388293);
        Object term4720 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4720, term4720.getClass(), "id", term4721);
        setField(term4720, term4720.getClass(), "name", "");
        Integer term4725 = new Integer(-159494544);
        Object term4724 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4724, term4724.getClass(), "id", term4725);
        setField(term4724, term4724.getClass(), "name", "");
        Integer term4729 = new Integer(-75206835);
        Object term4728 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4728, term4728.getClass(), "id", term4729);
        setField(term4728, term4728.getClass(), "name", "");
        Integer term4733 = new Integer(-1618206977);
        Object term4732 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4732, term4732.getClass(), "id", term4733);
        setField(term4732, term4732.getClass(), "name", "");
        Integer term4737 = new Integer(-1747406163);
        Object term4736 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4736, term4736.getClass(), "id", term4737);
        setField(term4736, term4736.getClass(), "name", "");
        Integer term4741 = new Integer(388157121);
        Object term4740 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4740, term4740.getClass(), "id", term4741);
        setField(term4740, term4740.getClass(), "name", "");
        ArrayList term4710 = new ArrayList();
        ((ArrayList) term4710).add(term4712);
        ((ArrayList) term4710).add(term4716);
        ((ArrayList) term4710).add(term4720);
        ((ArrayList) term4710).add(term4724);
        ((ArrayList) term4710).add(term4728);
        ((ArrayList) term4710).add(term4732);
        ((ArrayList) term4710).add(term4736);
        ((ArrayList) term4710).add(term4740);
        term4663 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4695 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4663, term4663.getClass(), "id", term4664);
        setField(term4663, term4663.getClass(), "name", "wKWbJssZuG");
        setField(term4663, term4663.getClass(), "description", "NzBMMhkhpT");
        setIntField(term4690, term4690.getClass(), "year", 2022);
        setShortField(term4690, term4690.getClass(), "month", (short) 10);
        setShortField(term4690, term4690.getClass(), "day", (short) 18);
        setField(term4663, term4663.getClass(), "releaseDate", term4690);
        setIntField(term4663, term4663.getClass(), "duration", -1888585309);
        setField(term4695, term4695.getClass(), "id", term4696);
        setField(term4695, term4695.getClass(), "name", "qCpEbQDHdF");
        setField(term4663, term4663.getClass(), "mpa", term4695);
        setField(term4663, term4663.getClass(), "genres", term4710);
        setIntField(term4663, term4663.getClass(), "rate", 683666002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term4663, args);
    }

};



package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RatingItem_setLevel_113703920310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5717;
     Object term5747;

    public RatingItem_setLevel_113703920310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5717 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5717, term5717.getClass(), "musicId", 1895143076);
        setField(term5717, term5717.getClass(), "musicName", "WzMEhMXkKx");
        setField(term5717, term5717.getClass(), "artistName", "XOiDvlDhdc");
        setIntField(term5717, term5717.getClass(), "level", 1981860404);
        setIntField(term5717, term5717.getClass(), "score", 732174235);
        setIntField(term5717, term5717.getClass(), "ratingBase", 470895808);
        setIntField(term5717, term5717.getClass(), "rating", 1787325291);
        term5747 = new Integer(1470349147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5747;
        callMethod(klass, "setLevel", argTypes, term5717, args);
    }

};



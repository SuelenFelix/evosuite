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

public class RatingItem_getRatingBase_5742164255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5421;

    public RatingItem_getRatingBase_5742164255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5421 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5421, term5421.getClass(), "musicId", 1292332296);
        setField(term5421, term5421.getClass(), "musicName", "eVpkWxjuki");
        setField(term5421, term5421.getClass(), "artistName", "SJiQaLvSKv");
        setIntField(term5421, term5421.getClass(), "level", -1415256843);
        setIntField(term5421, term5421.getClass(), "score", 612177768);
        setIntField(term5421, term5421.getClass(), "ratingBase", -1626451656);
        setIntField(term5421, term5421.getClass(), "rating", 173952451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRatingBase", argTypes, term5421, args);
    }

};



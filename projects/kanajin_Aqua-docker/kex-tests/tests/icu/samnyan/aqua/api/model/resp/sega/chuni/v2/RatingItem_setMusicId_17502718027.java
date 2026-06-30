package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RatingItem_setMusicId_17502718027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45397;
     Object term45427;

    public RatingItem_setMusicId_17502718027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45397 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45397, term45397.getClass(), "musicId", 664155196);
        setField(term45397, term45397.getClass(), "musicName", "HCvSsQWjLn");
        setField(term45397, term45397.getClass(), "artistName", "FTuOcSieav");
        setIntField(term45397, term45397.getClass(), "level", -1103257588);
        setIntField(term45397, term45397.getClass(), "score", 1463219831);
        setIntField(term45397, term45397.getClass(), "ratingBase", -1516863216);
        setIntField(term45397, term45397.getClass(), "rating", 1392468004);
        term45427 = new Integer(-1568339070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45427;
        callMethod(klass, "setMusicId", argTypes, term45397, args);
    }

};



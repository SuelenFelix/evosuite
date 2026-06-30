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

public class RatingItem_setRatingBase_148859620312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5821;
     Object term5851;

    public RatingItem_setRatingBase_148859620312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5821 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5821, term5821.getClass(), "musicId", -885788574);
        setField(term5821, term5821.getClass(), "musicName", "JDaAnsVTGV");
        setField(term5821, term5821.getClass(), "artistName", "mLUZFTfjle");
        setIntField(term5821, term5821.getClass(), "level", -865722613);
        setIntField(term5821, term5821.getClass(), "score", -1551355284);
        setIntField(term5821, term5821.getClass(), "ratingBase", -1381970335);
        setIntField(term5821, term5821.getClass(), "rating", 1213549815);
        term5851 = new Integer(-1518419301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5851;
        callMethod(klass, "setRatingBase", argTypes, term5821, args);
    }

};



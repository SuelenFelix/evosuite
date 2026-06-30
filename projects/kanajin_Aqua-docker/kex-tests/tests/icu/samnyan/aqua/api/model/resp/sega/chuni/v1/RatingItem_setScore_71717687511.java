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

public class RatingItem_setScore_71717687511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5769;
     Object term5799;

    public RatingItem_setScore_71717687511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5769 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5769, term5769.getClass(), "musicId", -255317272);
        setField(term5769, term5769.getClass(), "musicName", "AdxvLJhNLe");
        setField(term5769, term5769.getClass(), "artistName", "lHfTrWKMPk");
        setIntField(term5769, term5769.getClass(), "level", -706253892);
        setIntField(term5769, term5769.getClass(), "score", -1341439819);
        setIntField(term5769, term5769.getClass(), "ratingBase", -728760750);
        setIntField(term5769, term5769.getClass(), "rating", -1617383807);
        term5799 = new Integer(-1244386281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5799;
        callMethod(klass, "setScore", argTypes, term5769, args);
    }

};



package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NewsCorpView_init_5288372690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376771;

    public NewsCorpView_init_5288372690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376771 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.NewsData", 7);
        Object term376772 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        Object term376777 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        Object term376782 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        Object term376787 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        Object term376792 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        Object term376797 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        Object term376802 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"));
        setField(term376772, term376772.getClass(), "newsText", "");
        setField(term376772, term376772.getClass(), "imageInstructions", "");
        setElement(term376771, 0, term376772);
        setField(term376777, term376777.getClass(), "newsText", "");
        setField(term376777, term376777.getClass(), "imageInstructions", "");
        setElement(term376771, 1, term376777);
        setField(term376782, term376782.getClass(), "newsText", "");
        setField(term376782, term376782.getClass(), "imageInstructions", "");
        setElement(term376771, 2, term376782);
        setField(term376787, term376787.getClass(), "newsText", "");
        setField(term376787, term376787.getClass(), "imageInstructions", "");
        setElement(term376771, 3, term376787);
        setField(term376792, term376792.getClass(), "newsText", "");
        setField(term376792, term376792.getClass(), "imageInstructions", "");
        setElement(term376771, 4, term376792);
        setField(term376797, term376797.getClass(), "newsText", "");
        setField(term376797, term376797.getClass(), "imageInstructions", "");
        setElement(term376771, 5, term376797);
        setField(term376802, term376802.getClass(), "newsText", "");
        setField(term376802, term376802.getClass(), "imageInstructions", "");
        setElement(term376771, 6, term376802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.NewsCorpView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData"), 0).getClass();
        argTypes[1] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[2];
        args[0] = term376771;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



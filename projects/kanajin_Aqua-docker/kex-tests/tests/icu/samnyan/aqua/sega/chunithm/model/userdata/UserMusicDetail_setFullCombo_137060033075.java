package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserMusicDetail_setFullCombo_137060033075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107799;
     Object term107817;

    public UserMusicDetail_setFullCombo_137060033075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107799 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107799, term107799.getClass(), "id", 0L);
        setField(term107799, term107799.getClass(), "user", null);
        setIntField(term107799, term107799.getClass(), "musicId", 0);
        setIntField(term107799, term107799.getClass(), "level", 0);
        setIntField(term107799, term107799.getClass(), "playCount", 0);
        setIntField(term107799, term107799.getClass(), "scoreMax", 0);
        setIntField(term107799, term107799.getClass(), "resRequestCount", 0);
        setIntField(term107799, term107799.getClass(), "resAcceptCount", 0);
        setIntField(term107799, term107799.getClass(), "resSuccessCount", 0);
        setIntField(term107799, term107799.getClass(), "missCount", 0);
        setIntField(term107799, term107799.getClass(), "maxComboCount", 0);
        setBooleanField(term107799, term107799.getClass(), "isFullCombo", false);
        setBooleanField(term107799, term107799.getClass(), "isAllJustice", false);
        setBooleanField(term107799, term107799.getClass(), "isSuccess", false);
        setIntField(term107799, term107799.getClass(), "fullChain", 0);
        setIntField(term107799, term107799.getClass(), "maxChain", 0);
        setIntField(term107799, term107799.getClass(), "scoreRank", 0);
        setBooleanField(term107799, term107799.getClass(), "isLock", false);
        term107817 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term107817;
        callMethod(klass, "setFullCombo", argTypes, term107799, args);
    }

};



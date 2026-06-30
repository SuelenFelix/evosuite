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
import java.lang.Boolean;

public class ScoreResp_setAllJustice_156323174825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52775;
     Object term52791;

    public ScoreResp_setAllJustice_156323174825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52775 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52775, term52775.getClass(), "musicId", -1360145510);
        setIntField(term52775, term52775.getClass(), "level", -1122695171);
        setIntField(term52775, term52775.getClass(), "playCount", -1304945951);
        setIntField(term52775, term52775.getClass(), "scoreMax", 1324880713);
        setIntField(term52775, term52775.getClass(), "resRequestCount", -331841554);
        setIntField(term52775, term52775.getClass(), "resAcceptCount", 913848623);
        setIntField(term52775, term52775.getClass(), "resSuccessCount", 1449221084);
        setIntField(term52775, term52775.getClass(), "missCount", -217809217);
        setIntField(term52775, term52775.getClass(), "maxComboCount", -473949548);
        setBooleanField(term52775, term52775.getClass(), "isFullCombo", true);
        setBooleanField(term52775, term52775.getClass(), "isAllJustice", false);
        setBooleanField(term52775, term52775.getClass(), "isSuccess", false);
        setIntField(term52775, term52775.getClass(), "fullChain", 1898831696);
        setIntField(term52775, term52775.getClass(), "maxChain", 1811064455);
        setIntField(term52775, term52775.getClass(), "scoreRank", 1183674366);
        term52791 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term52791;
        callMethod(klass, "setAllJustice", argTypes, term52775, args);
    }

};



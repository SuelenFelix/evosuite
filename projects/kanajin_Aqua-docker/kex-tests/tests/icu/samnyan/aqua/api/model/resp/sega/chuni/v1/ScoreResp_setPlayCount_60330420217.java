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

public class ScoreResp_setPlayCount_60330420217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57801;
     Object term57817;

    public ScoreResp_setPlayCount_60330420217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57801 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57801, term57801.getClass(), "musicId", 2011572896);
        setIntField(term57801, term57801.getClass(), "level", 1517650676);
        setIntField(term57801, term57801.getClass(), "playCount", -1559743160);
        setIntField(term57801, term57801.getClass(), "scoreMax", -2067828357);
        setIntField(term57801, term57801.getClass(), "resRequestCount", -2049221981);
        setIntField(term57801, term57801.getClass(), "resAcceptCount", 2046964718);
        setIntField(term57801, term57801.getClass(), "resSuccessCount", 1610353449);
        setIntField(term57801, term57801.getClass(), "missCount", -1431201540);
        setIntField(term57801, term57801.getClass(), "maxComboCount", 921611666);
        setBooleanField(term57801, term57801.getClass(), "isFullCombo", false);
        setBooleanField(term57801, term57801.getClass(), "isAllJustice", true);
        setBooleanField(term57801, term57801.getClass(), "isSuccess", true);
        setIntField(term57801, term57801.getClass(), "fullChain", 505159138);
        setIntField(term57801, term57801.getClass(), "maxChain", 816436710);
        setIntField(term57801, term57801.getClass(), "scoreRank", 1372386941);
        term57817 = new Integer(-558285340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57817;
        callMethod(klass, "setPlayCount", argTypes, term57801, args);
    }

};



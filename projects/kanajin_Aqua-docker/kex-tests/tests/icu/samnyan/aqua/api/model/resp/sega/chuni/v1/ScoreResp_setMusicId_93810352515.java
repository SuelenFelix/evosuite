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

public class ScoreResp_setMusicId_93810352515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57765;
     Object term57781;

    public ScoreResp_setMusicId_93810352515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57765 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57765, term57765.getClass(), "musicId", 142204732);
        setIntField(term57765, term57765.getClass(), "level", 1428877162);
        setIntField(term57765, term57765.getClass(), "playCount", -1464784083);
        setIntField(term57765, term57765.getClass(), "scoreMax", -1564128892);
        setIntField(term57765, term57765.getClass(), "resRequestCount", -638268686);
        setIntField(term57765, term57765.getClass(), "resAcceptCount", 213892075);
        setIntField(term57765, term57765.getClass(), "resSuccessCount", 1635792054);
        setIntField(term57765, term57765.getClass(), "missCount", -2087784193);
        setIntField(term57765, term57765.getClass(), "maxComboCount", -112933890);
        setBooleanField(term57765, term57765.getClass(), "isFullCombo", false);
        setBooleanField(term57765, term57765.getClass(), "isAllJustice", true);
        setBooleanField(term57765, term57765.getClass(), "isSuccess", false);
        setIntField(term57765, term57765.getClass(), "fullChain", -1810303698);
        setIntField(term57765, term57765.getClass(), "maxChain", 3658317);
        setIntField(term57765, term57765.getClass(), "scoreRank", -1463342660);
        term57781 = new Integer(20803526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57781;
        callMethod(klass, "setMusicId", argTypes, term57765, args);
    }

};



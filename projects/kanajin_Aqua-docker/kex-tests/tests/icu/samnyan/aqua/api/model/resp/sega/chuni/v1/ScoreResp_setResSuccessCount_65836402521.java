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

public class ScoreResp_setResSuccessCount_65836402521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57873;
     Object term57889;

    public ScoreResp_setResSuccessCount_65836402521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57873 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57873, term57873.getClass(), "musicId", -1078778523);
        setIntField(term57873, term57873.getClass(), "level", -1573140874);
        setIntField(term57873, term57873.getClass(), "playCount", 1252740231);
        setIntField(term57873, term57873.getClass(), "scoreMax", -1494498996);
        setIntField(term57873, term57873.getClass(), "resRequestCount", -1230782196);
        setIntField(term57873, term57873.getClass(), "resAcceptCount", 1988646780);
        setIntField(term57873, term57873.getClass(), "resSuccessCount", -1505639058);
        setIntField(term57873, term57873.getClass(), "missCount", -1198622469);
        setIntField(term57873, term57873.getClass(), "maxComboCount", 254477121);
        setBooleanField(term57873, term57873.getClass(), "isFullCombo", false);
        setBooleanField(term57873, term57873.getClass(), "isAllJustice", true);
        setBooleanField(term57873, term57873.getClass(), "isSuccess", false);
        setIntField(term57873, term57873.getClass(), "fullChain", -2097473055);
        setIntField(term57873, term57873.getClass(), "maxChain", 956173467);
        setIntField(term57873, term57873.getClass(), "scoreRank", -362299700);
        term57889 = new Integer(-229025947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57889;
        callMethod(klass, "setResSuccessCount", argTypes, term57873, args);
    }

};



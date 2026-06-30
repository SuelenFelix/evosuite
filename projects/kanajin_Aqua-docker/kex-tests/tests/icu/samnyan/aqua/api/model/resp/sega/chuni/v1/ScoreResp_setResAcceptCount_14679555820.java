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

public class ScoreResp_setResAcceptCount_14679555820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57855;
     Object term57871;

    public ScoreResp_setResAcceptCount_14679555820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57855 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57855, term57855.getClass(), "musicId", -1280690194);
        setIntField(term57855, term57855.getClass(), "level", -1825481062);
        setIntField(term57855, term57855.getClass(), "playCount", 662456234);
        setIntField(term57855, term57855.getClass(), "scoreMax", -1932565769);
        setIntField(term57855, term57855.getClass(), "resRequestCount", 480924614);
        setIntField(term57855, term57855.getClass(), "resAcceptCount", 1423620762);
        setIntField(term57855, term57855.getClass(), "resSuccessCount", -182687795);
        setIntField(term57855, term57855.getClass(), "missCount", -1965076703);
        setIntField(term57855, term57855.getClass(), "maxComboCount", -1715006566);
        setBooleanField(term57855, term57855.getClass(), "isFullCombo", false);
        setBooleanField(term57855, term57855.getClass(), "isAllJustice", true);
        setBooleanField(term57855, term57855.getClass(), "isSuccess", false);
        setIntField(term57855, term57855.getClass(), "fullChain", 1190377243);
        setIntField(term57855, term57855.getClass(), "maxChain", -1013321277);
        setIntField(term57855, term57855.getClass(), "scoreRank", -38762037);
        term57871 = new Integer(-200236986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57871;
        callMethod(klass, "setResAcceptCount", argTypes, term57855, args);
    }

};



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

public class ScoreResp_setMissCount_104075371022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57891;
     Object term57907;

    public ScoreResp_setMissCount_104075371022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57891 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57891, term57891.getClass(), "musicId", -2074615511);
        setIntField(term57891, term57891.getClass(), "level", -545948451);
        setIntField(term57891, term57891.getClass(), "playCount", -211944434);
        setIntField(term57891, term57891.getClass(), "scoreMax", -558856994);
        setIntField(term57891, term57891.getClass(), "resRequestCount", 329934484);
        setIntField(term57891, term57891.getClass(), "resAcceptCount", 575431591);
        setIntField(term57891, term57891.getClass(), "resSuccessCount", 912666310);
        setIntField(term57891, term57891.getClass(), "missCount", 302408238);
        setIntField(term57891, term57891.getClass(), "maxComboCount", -685735773);
        setBooleanField(term57891, term57891.getClass(), "isFullCombo", false);
        setBooleanField(term57891, term57891.getClass(), "isAllJustice", false);
        setBooleanField(term57891, term57891.getClass(), "isSuccess", false);
        setIntField(term57891, term57891.getClass(), "fullChain", -1229964213);
        setIntField(term57891, term57891.getClass(), "maxChain", -206580016);
        setIntField(term57891, term57891.getClass(), "scoreRank", -982047423);
        term57907 = new Integer(-1580085541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57907;
        callMethod(klass, "setMissCount", argTypes, term57891, args);
    }

};



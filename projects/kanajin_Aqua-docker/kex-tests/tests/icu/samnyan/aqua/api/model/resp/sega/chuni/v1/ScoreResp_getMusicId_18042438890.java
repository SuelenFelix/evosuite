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

public class ScoreResp_getMusicId_18042438890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57525;

    public ScoreResp_getMusicId_18042438890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57525 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57525, term57525.getClass(), "musicId", -513227903);
        setIntField(term57525, term57525.getClass(), "level", -1834509557);
        setIntField(term57525, term57525.getClass(), "playCount", -1095760799);
        setIntField(term57525, term57525.getClass(), "scoreMax", 964556409);
        setIntField(term57525, term57525.getClass(), "resRequestCount", 1651622020);
        setIntField(term57525, term57525.getClass(), "resAcceptCount", -1935395656);
        setIntField(term57525, term57525.getClass(), "resSuccessCount", -530623408);
        setIntField(term57525, term57525.getClass(), "missCount", 1949662959);
        setIntField(term57525, term57525.getClass(), "maxComboCount", 1639772797);
        setBooleanField(term57525, term57525.getClass(), "isFullCombo", false);
        setBooleanField(term57525, term57525.getClass(), "isAllJustice", true);
        setBooleanField(term57525, term57525.getClass(), "isSuccess", false);
        setIntField(term57525, term57525.getClass(), "fullChain", -228932741);
        setIntField(term57525, term57525.getClass(), "maxChain", -134006257);
        setIntField(term57525, term57525.getClass(), "scoreRank", 600590922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term57525, args);
    }

};



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

public class ScoreResp_getScoreMax_16019719213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57573;

    public ScoreResp_getScoreMax_16019719213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57573 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57573, term57573.getClass(), "musicId", 1214417682);
        setIntField(term57573, term57573.getClass(), "level", -492639935);
        setIntField(term57573, term57573.getClass(), "playCount", 1013003846);
        setIntField(term57573, term57573.getClass(), "scoreMax", -1997703261);
        setIntField(term57573, term57573.getClass(), "resRequestCount", 1822676900);
        setIntField(term57573, term57573.getClass(), "resAcceptCount", 1807366282);
        setIntField(term57573, term57573.getClass(), "resSuccessCount", 1352119826);
        setIntField(term57573, term57573.getClass(), "missCount", 399848636);
        setIntField(term57573, term57573.getClass(), "maxComboCount", -1577579504);
        setBooleanField(term57573, term57573.getClass(), "isFullCombo", true);
        setBooleanField(term57573, term57573.getClass(), "isAllJustice", true);
        setBooleanField(term57573, term57573.getClass(), "isSuccess", true);
        setIntField(term57573, term57573.getClass(), "fullChain", -1664214126);
        setIntField(term57573, term57573.getClass(), "maxChain", -124745318);
        setIntField(term57573, term57573.getClass(), "scoreRank", 885215896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term57573, args);
    }

};



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

public class ScoreResp_getPlayCount_11648047482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57557;

    public ScoreResp_getPlayCount_11648047482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57557 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57557, term57557.getClass(), "musicId", -595867565);
        setIntField(term57557, term57557.getClass(), "level", -1428615750);
        setIntField(term57557, term57557.getClass(), "playCount", -247199850);
        setIntField(term57557, term57557.getClass(), "scoreMax", 1369708580);
        setIntField(term57557, term57557.getClass(), "resRequestCount", -1943851319);
        setIntField(term57557, term57557.getClass(), "resAcceptCount", 1613470339);
        setIntField(term57557, term57557.getClass(), "resSuccessCount", 764077315);
        setIntField(term57557, term57557.getClass(), "missCount", -127465158);
        setIntField(term57557, term57557.getClass(), "maxComboCount", -727010746);
        setBooleanField(term57557, term57557.getClass(), "isFullCombo", true);
        setBooleanField(term57557, term57557.getClass(), "isAllJustice", false);
        setBooleanField(term57557, term57557.getClass(), "isSuccess", false);
        setIntField(term57557, term57557.getClass(), "fullChain", 1698984137);
        setIntField(term57557, term57557.getClass(), "maxChain", 1539842378);
        setIntField(term57557, term57557.getClass(), "scoreRank", -2020812793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term57557, args);
    }

};



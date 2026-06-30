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

public class ScoreResp_getFullChain_37793792312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57717;

    public ScoreResp_getFullChain_37793792312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57717 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57717, term57717.getClass(), "musicId", 742969465);
        setIntField(term57717, term57717.getClass(), "level", -1810335427);
        setIntField(term57717, term57717.getClass(), "playCount", 803994786);
        setIntField(term57717, term57717.getClass(), "scoreMax", -1141611223);
        setIntField(term57717, term57717.getClass(), "resRequestCount", -1637961050);
        setIntField(term57717, term57717.getClass(), "resAcceptCount", 1515109550);
        setIntField(term57717, term57717.getClass(), "resSuccessCount", 1249494915);
        setIntField(term57717, term57717.getClass(), "missCount", 1840485574);
        setIntField(term57717, term57717.getClass(), "maxComboCount", -1384928271);
        setBooleanField(term57717, term57717.getClass(), "isFullCombo", true);
        setBooleanField(term57717, term57717.getClass(), "isAllJustice", false);
        setBooleanField(term57717, term57717.getClass(), "isSuccess", false);
        setIntField(term57717, term57717.getClass(), "fullChain", 1760478472);
        setIntField(term57717, term57717.getClass(), "maxChain", 611874985);
        setIntField(term57717, term57717.getClass(), "scoreRank", -1490909009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullChain", argTypes, term57717, args);
    }

};



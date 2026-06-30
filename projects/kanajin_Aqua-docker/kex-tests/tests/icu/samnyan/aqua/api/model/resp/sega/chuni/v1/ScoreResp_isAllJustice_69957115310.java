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

public class ScoreResp_isAllJustice_69957115310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57685;

    public ScoreResp_isAllJustice_69957115310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57685 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57685, term57685.getClass(), "musicId", 1389237948);
        setIntField(term57685, term57685.getClass(), "level", 866670285);
        setIntField(term57685, term57685.getClass(), "playCount", -2004076717);
        setIntField(term57685, term57685.getClass(), "scoreMax", -1695237959);
        setIntField(term57685, term57685.getClass(), "resRequestCount", 1317356126);
        setIntField(term57685, term57685.getClass(), "resAcceptCount", 2058932005);
        setIntField(term57685, term57685.getClass(), "resSuccessCount", -773196588);
        setIntField(term57685, term57685.getClass(), "missCount", -1082451840);
        setIntField(term57685, term57685.getClass(), "maxComboCount", 120368183);
        setBooleanField(term57685, term57685.getClass(), "isFullCombo", false);
        setBooleanField(term57685, term57685.getClass(), "isAllJustice", true);
        setBooleanField(term57685, term57685.getClass(), "isSuccess", false);
        setIntField(term57685, term57685.getClass(), "fullChain", 1721841052);
        setIntField(term57685, term57685.getClass(), "maxChain", -1801745263);
        setIntField(term57685, term57685.getClass(), "scoreRank", 1232286807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllJustice", argTypes, term57685, args);
    }

};



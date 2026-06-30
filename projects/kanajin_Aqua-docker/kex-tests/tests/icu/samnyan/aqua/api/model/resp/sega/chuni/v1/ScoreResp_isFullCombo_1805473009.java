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

public class ScoreResp_isFullCombo_1805473009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57669;

    public ScoreResp_isFullCombo_1805473009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57669 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57669, term57669.getClass(), "musicId", -150763986);
        setIntField(term57669, term57669.getClass(), "level", 1946252506);
        setIntField(term57669, term57669.getClass(), "playCount", -1279902182);
        setIntField(term57669, term57669.getClass(), "scoreMax", -551427938);
        setIntField(term57669, term57669.getClass(), "resRequestCount", 1334551737);
        setIntField(term57669, term57669.getClass(), "resAcceptCount", -1187792021);
        setIntField(term57669, term57669.getClass(), "resSuccessCount", 1724189490);
        setIntField(term57669, term57669.getClass(), "missCount", -850819450);
        setIntField(term57669, term57669.getClass(), "maxComboCount", 1652716990);
        setBooleanField(term57669, term57669.getClass(), "isFullCombo", false);
        setBooleanField(term57669, term57669.getClass(), "isAllJustice", false);
        setBooleanField(term57669, term57669.getClass(), "isSuccess", false);
        setIntField(term57669, term57669.getClass(), "fullChain", 958228032);
        setIntField(term57669, term57669.getClass(), "maxChain", 624789164);
        setIntField(term57669, term57669.getClass(), "scoreRank", 117919201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term57669, args);
    }

};



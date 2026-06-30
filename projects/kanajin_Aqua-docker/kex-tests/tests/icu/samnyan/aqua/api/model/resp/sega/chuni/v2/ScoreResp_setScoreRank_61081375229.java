package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ScoreResp_setScoreRank_61081375229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52847;
     Object term52863;

    public ScoreResp_setScoreRank_61081375229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52847 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52847, term52847.getClass(), "musicId", 1141630209);
        setIntField(term52847, term52847.getClass(), "level", -1809659280);
        setIntField(term52847, term52847.getClass(), "playCount", 2076646471);
        setIntField(term52847, term52847.getClass(), "scoreMax", -63936889);
        setIntField(term52847, term52847.getClass(), "resRequestCount", 1893773732);
        setIntField(term52847, term52847.getClass(), "resAcceptCount", -1854658170);
        setIntField(term52847, term52847.getClass(), "resSuccessCount", -383472550);
        setIntField(term52847, term52847.getClass(), "missCount", 1184946577);
        setIntField(term52847, term52847.getClass(), "maxComboCount", 1076103120);
        setBooleanField(term52847, term52847.getClass(), "isFullCombo", false);
        setBooleanField(term52847, term52847.getClass(), "isAllJustice", false);
        setBooleanField(term52847, term52847.getClass(), "isSuccess", true);
        setIntField(term52847, term52847.getClass(), "fullChain", 414965503);
        setIntField(term52847, term52847.getClass(), "maxChain", -42540264);
        setIntField(term52847, term52847.getClass(), "scoreRank", -179532327);
        term52863 = new Integer(1282999015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52863;
        callMethod(klass, "setScoreRank", argTypes, term52847, args);
    }

};



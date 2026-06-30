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
import java.lang.Boolean;

public class ScoreResp_setFullCombo_104981056724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52757;
     Object term52773;

    public ScoreResp_setFullCombo_104981056724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52757 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52757, term52757.getClass(), "musicId", 548941697);
        setIntField(term52757, term52757.getClass(), "level", 647865140);
        setIntField(term52757, term52757.getClass(), "playCount", 552764103);
        setIntField(term52757, term52757.getClass(), "scoreMax", -913811608);
        setIntField(term52757, term52757.getClass(), "resRequestCount", 895728550);
        setIntField(term52757, term52757.getClass(), "resAcceptCount", -419871359);
        setIntField(term52757, term52757.getClass(), "resSuccessCount", 812478175);
        setIntField(term52757, term52757.getClass(), "missCount", -133199375);
        setIntField(term52757, term52757.getClass(), "maxComboCount", -356245449);
        setBooleanField(term52757, term52757.getClass(), "isFullCombo", false);
        setBooleanField(term52757, term52757.getClass(), "isAllJustice", true);
        setBooleanField(term52757, term52757.getClass(), "isSuccess", true);
        setIntField(term52757, term52757.getClass(), "fullChain", -1305056502);
        setIntField(term52757, term52757.getClass(), "maxChain", 1382545880);
        setIntField(term52757, term52757.getClass(), "scoreRank", -1299406001);
        term52773 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term52773;
        callMethod(klass, "setFullCombo", argTypes, term52757, args);
    }

};



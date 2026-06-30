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

public class ScoreResp_getMaxChain_112685616713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52563;

    public ScoreResp_getMaxChain_112685616713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52563 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52563, term52563.getClass(), "musicId", -457189882);
        setIntField(term52563, term52563.getClass(), "level", -1227023001);
        setIntField(term52563, term52563.getClass(), "playCount", -622827471);
        setIntField(term52563, term52563.getClass(), "scoreMax", -1759579486);
        setIntField(term52563, term52563.getClass(), "resRequestCount", 147748970);
        setIntField(term52563, term52563.getClass(), "resAcceptCount", -459525196);
        setIntField(term52563, term52563.getClass(), "resSuccessCount", 2129073623);
        setIntField(term52563, term52563.getClass(), "missCount", -1623896406);
        setIntField(term52563, term52563.getClass(), "maxComboCount", -1767855347);
        setBooleanField(term52563, term52563.getClass(), "isFullCombo", true);
        setBooleanField(term52563, term52563.getClass(), "isAllJustice", true);
        setBooleanField(term52563, term52563.getClass(), "isSuccess", false);
        setIntField(term52563, term52563.getClass(), "fullChain", 2061882718);
        setIntField(term52563, term52563.getClass(), "maxChain", -263593334);
        setIntField(term52563, term52563.getClass(), "scoreRank", 257595375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term52563, args);
    }

};



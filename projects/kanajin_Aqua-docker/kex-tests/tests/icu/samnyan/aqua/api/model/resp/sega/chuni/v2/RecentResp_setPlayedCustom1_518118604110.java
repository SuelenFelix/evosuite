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

public class RecentResp_setPlayedCustom1_518118604110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51213;
     Object term51245;

    public RecentResp_setPlayedCustom1_518118604110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51213 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term51213, term51213.getClass(), "playDate", null);
        setField(term51213, term51213.getClass(), "userPlayDate", null);
        setIntField(term51213, term51213.getClass(), "musicId", 0);
        setIntField(term51213, term51213.getClass(), "level", 0);
        setIntField(term51213, term51213.getClass(), "customId", 0);
        setIntField(term51213, term51213.getClass(), "playedCustom1", 0);
        setIntField(term51213, term51213.getClass(), "playedCustom2", 0);
        setIntField(term51213, term51213.getClass(), "playedCustom3", 0);
        setIntField(term51213, term51213.getClass(), "track", 0);
        setIntField(term51213, term51213.getClass(), "score", 0);
        setIntField(term51213, term51213.getClass(), "rank", 0);
        setIntField(term51213, term51213.getClass(), "maxCombo", 0);
        setIntField(term51213, term51213.getClass(), "maxChain", 0);
        setIntField(term51213, term51213.getClass(), "rateTap", 0);
        setIntField(term51213, term51213.getClass(), "rateHold", 0);
        setIntField(term51213, term51213.getClass(), "rateSlide", 0);
        setIntField(term51213, term51213.getClass(), "rateAir", 0);
        setIntField(term51213, term51213.getClass(), "rateFlick", 0);
        setIntField(term51213, term51213.getClass(), "judgeGuilty", 0);
        setIntField(term51213, term51213.getClass(), "judgeAttack", 0);
        setIntField(term51213, term51213.getClass(), "judgeJustice", 0);
        setIntField(term51213, term51213.getClass(), "judgeCritical", 0);
        setIntField(term51213, term51213.getClass(), "playerRating", 0);
        setBooleanField(term51213, term51213.getClass(), "isNewRecord", false);
        setBooleanField(term51213, term51213.getClass(), "isFullCombo", false);
        setIntField(term51213, term51213.getClass(), "fullChainKind", 0);
        setBooleanField(term51213, term51213.getClass(), "isAllJustice", false);
        setIntField(term51213, term51213.getClass(), "characterId", 0);
        setIntField(term51213, term51213.getClass(), "skillId", 0);
        setIntField(term51213, term51213.getClass(), "playKind", 0);
        setBooleanField(term51213, term51213.getClass(), "isClear", false);
        setIntField(term51213, term51213.getClass(), "skillLevel", 0);
        setIntField(term51213, term51213.getClass(), "skillEffect", 0);
        term51245 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term51245;
        callMethod(klass, "setPlayedCustom1", argTypes, term51213, args);
    }

};



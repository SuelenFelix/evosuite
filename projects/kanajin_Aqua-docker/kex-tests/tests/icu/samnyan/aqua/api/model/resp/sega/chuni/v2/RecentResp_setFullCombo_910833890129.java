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

public class RecentResp_setFullCombo_910833890129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51859;
     Object term51891;

    public RecentResp_setFullCombo_910833890129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51859 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term51859, term51859.getClass(), "playDate", null);
        setField(term51859, term51859.getClass(), "userPlayDate", null);
        setIntField(term51859, term51859.getClass(), "musicId", 0);
        setIntField(term51859, term51859.getClass(), "level", 0);
        setIntField(term51859, term51859.getClass(), "customId", 0);
        setIntField(term51859, term51859.getClass(), "playedCustom1", 0);
        setIntField(term51859, term51859.getClass(), "playedCustom2", 0);
        setIntField(term51859, term51859.getClass(), "playedCustom3", 0);
        setIntField(term51859, term51859.getClass(), "track", 0);
        setIntField(term51859, term51859.getClass(), "score", 0);
        setIntField(term51859, term51859.getClass(), "rank", 0);
        setIntField(term51859, term51859.getClass(), "maxCombo", 0);
        setIntField(term51859, term51859.getClass(), "maxChain", 0);
        setIntField(term51859, term51859.getClass(), "rateTap", 0);
        setIntField(term51859, term51859.getClass(), "rateHold", 0);
        setIntField(term51859, term51859.getClass(), "rateSlide", 0);
        setIntField(term51859, term51859.getClass(), "rateAir", 0);
        setIntField(term51859, term51859.getClass(), "rateFlick", 0);
        setIntField(term51859, term51859.getClass(), "judgeGuilty", 0);
        setIntField(term51859, term51859.getClass(), "judgeAttack", 0);
        setIntField(term51859, term51859.getClass(), "judgeJustice", 0);
        setIntField(term51859, term51859.getClass(), "judgeCritical", 0);
        setIntField(term51859, term51859.getClass(), "playerRating", 0);
        setBooleanField(term51859, term51859.getClass(), "isNewRecord", false);
        setBooleanField(term51859, term51859.getClass(), "isFullCombo", false);
        setIntField(term51859, term51859.getClass(), "fullChainKind", 0);
        setBooleanField(term51859, term51859.getClass(), "isAllJustice", false);
        setIntField(term51859, term51859.getClass(), "characterId", 0);
        setIntField(term51859, term51859.getClass(), "skillId", 0);
        setIntField(term51859, term51859.getClass(), "playKind", 0);
        setBooleanField(term51859, term51859.getClass(), "isClear", false);
        setIntField(term51859, term51859.getClass(), "skillLevel", 0);
        setIntField(term51859, term51859.getClass(), "skillEffect", 0);
        term51891 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term51891;
        callMethod(klass, "setFullCombo", argTypes, term51859, args);
    }

};



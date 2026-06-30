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

public class RecentResp_setMaxChain_210121024117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51451;
     Object term51483;

    public RecentResp_setMaxChain_210121024117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51451 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term51451, term51451.getClass(), "playDate", null);
        setField(term51451, term51451.getClass(), "userPlayDate", null);
        setIntField(term51451, term51451.getClass(), "musicId", 0);
        setIntField(term51451, term51451.getClass(), "level", 0);
        setIntField(term51451, term51451.getClass(), "customId", 0);
        setIntField(term51451, term51451.getClass(), "playedCustom1", 0);
        setIntField(term51451, term51451.getClass(), "playedCustom2", 0);
        setIntField(term51451, term51451.getClass(), "playedCustom3", 0);
        setIntField(term51451, term51451.getClass(), "track", 0);
        setIntField(term51451, term51451.getClass(), "score", 0);
        setIntField(term51451, term51451.getClass(), "rank", 0);
        setIntField(term51451, term51451.getClass(), "maxCombo", 0);
        setIntField(term51451, term51451.getClass(), "maxChain", 0);
        setIntField(term51451, term51451.getClass(), "rateTap", 0);
        setIntField(term51451, term51451.getClass(), "rateHold", 0);
        setIntField(term51451, term51451.getClass(), "rateSlide", 0);
        setIntField(term51451, term51451.getClass(), "rateAir", 0);
        setIntField(term51451, term51451.getClass(), "rateFlick", 0);
        setIntField(term51451, term51451.getClass(), "judgeGuilty", 0);
        setIntField(term51451, term51451.getClass(), "judgeAttack", 0);
        setIntField(term51451, term51451.getClass(), "judgeJustice", 0);
        setIntField(term51451, term51451.getClass(), "judgeCritical", 0);
        setIntField(term51451, term51451.getClass(), "playerRating", 0);
        setBooleanField(term51451, term51451.getClass(), "isNewRecord", false);
        setBooleanField(term51451, term51451.getClass(), "isFullCombo", false);
        setIntField(term51451, term51451.getClass(), "fullChainKind", 0);
        setBooleanField(term51451, term51451.getClass(), "isAllJustice", false);
        setIntField(term51451, term51451.getClass(), "characterId", 0);
        setIntField(term51451, term51451.getClass(), "skillId", 0);
        setIntField(term51451, term51451.getClass(), "playKind", 0);
        setBooleanField(term51451, term51451.getClass(), "isClear", false);
        setIntField(term51451, term51451.getClass(), "skillLevel", 0);
        setIntField(term51451, term51451.getClass(), "skillEffect", 0);
        term51483 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term51483;
        callMethod(klass, "setMaxChain", argTypes, term51451, args);
    }

};



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

public class RecentResp_setNewRecord_258767760128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51825;
     Object term51857;

    public RecentResp_setNewRecord_258767760128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51825 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term51825, term51825.getClass(), "playDate", null);
        setField(term51825, term51825.getClass(), "userPlayDate", null);
        setIntField(term51825, term51825.getClass(), "musicId", 0);
        setIntField(term51825, term51825.getClass(), "level", 0);
        setIntField(term51825, term51825.getClass(), "customId", 0);
        setIntField(term51825, term51825.getClass(), "playedCustom1", 0);
        setIntField(term51825, term51825.getClass(), "playedCustom2", 0);
        setIntField(term51825, term51825.getClass(), "playedCustom3", 0);
        setIntField(term51825, term51825.getClass(), "track", 0);
        setIntField(term51825, term51825.getClass(), "score", 0);
        setIntField(term51825, term51825.getClass(), "rank", 0);
        setIntField(term51825, term51825.getClass(), "maxCombo", 0);
        setIntField(term51825, term51825.getClass(), "maxChain", 0);
        setIntField(term51825, term51825.getClass(), "rateTap", 0);
        setIntField(term51825, term51825.getClass(), "rateHold", 0);
        setIntField(term51825, term51825.getClass(), "rateSlide", 0);
        setIntField(term51825, term51825.getClass(), "rateAir", 0);
        setIntField(term51825, term51825.getClass(), "rateFlick", 0);
        setIntField(term51825, term51825.getClass(), "judgeGuilty", 0);
        setIntField(term51825, term51825.getClass(), "judgeAttack", 0);
        setIntField(term51825, term51825.getClass(), "judgeJustice", 0);
        setIntField(term51825, term51825.getClass(), "judgeCritical", 0);
        setIntField(term51825, term51825.getClass(), "playerRating", 0);
        setBooleanField(term51825, term51825.getClass(), "isNewRecord", false);
        setBooleanField(term51825, term51825.getClass(), "isFullCombo", false);
        setIntField(term51825, term51825.getClass(), "fullChainKind", 0);
        setBooleanField(term51825, term51825.getClass(), "isAllJustice", false);
        setIntField(term51825, term51825.getClass(), "characterId", 0);
        setIntField(term51825, term51825.getClass(), "skillId", 0);
        setIntField(term51825, term51825.getClass(), "playKind", 0);
        setBooleanField(term51825, term51825.getClass(), "isClear", false);
        setIntField(term51825, term51825.getClass(), "skillLevel", 0);
        setIntField(term51825, term51825.getClass(), "skillEffect", 0);
        term51857 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term51857;
        callMethod(klass, "setNewRecord", argTypes, term51825, args);
    }

};



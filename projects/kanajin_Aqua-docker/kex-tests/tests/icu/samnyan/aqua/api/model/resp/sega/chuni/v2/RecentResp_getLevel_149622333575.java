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

public class RecentResp_getLevel_149622333575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50087;

    public RecentResp_getLevel_149622333575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50087 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term50087, term50087.getClass(), "playDate", null);
        setField(term50087, term50087.getClass(), "userPlayDate", null);
        setIntField(term50087, term50087.getClass(), "musicId", 0);
        setIntField(term50087, term50087.getClass(), "level", 0);
        setIntField(term50087, term50087.getClass(), "customId", 0);
        setIntField(term50087, term50087.getClass(), "playedCustom1", 0);
        setIntField(term50087, term50087.getClass(), "playedCustom2", 0);
        setIntField(term50087, term50087.getClass(), "playedCustom3", 0);
        setIntField(term50087, term50087.getClass(), "track", 0);
        setIntField(term50087, term50087.getClass(), "score", 0);
        setIntField(term50087, term50087.getClass(), "rank", 0);
        setIntField(term50087, term50087.getClass(), "maxCombo", 0);
        setIntField(term50087, term50087.getClass(), "maxChain", 0);
        setIntField(term50087, term50087.getClass(), "rateTap", 0);
        setIntField(term50087, term50087.getClass(), "rateHold", 0);
        setIntField(term50087, term50087.getClass(), "rateSlide", 0);
        setIntField(term50087, term50087.getClass(), "rateAir", 0);
        setIntField(term50087, term50087.getClass(), "rateFlick", 0);
        setIntField(term50087, term50087.getClass(), "judgeGuilty", 0);
        setIntField(term50087, term50087.getClass(), "judgeAttack", 0);
        setIntField(term50087, term50087.getClass(), "judgeJustice", 0);
        setIntField(term50087, term50087.getClass(), "judgeCritical", 0);
        setIntField(term50087, term50087.getClass(), "playerRating", 0);
        setBooleanField(term50087, term50087.getClass(), "isNewRecord", false);
        setBooleanField(term50087, term50087.getClass(), "isFullCombo", false);
        setIntField(term50087, term50087.getClass(), "fullChainKind", 0);
        setBooleanField(term50087, term50087.getClass(), "isAllJustice", false);
        setIntField(term50087, term50087.getClass(), "characterId", 0);
        setIntField(term50087, term50087.getClass(), "skillId", 0);
        setIntField(term50087, term50087.getClass(), "playKind", 0);
        setBooleanField(term50087, term50087.getClass(), "isClear", false);
        setIntField(term50087, term50087.getClass(), "skillLevel", 0);
        setIntField(term50087, term50087.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term50087, args);
    }

};



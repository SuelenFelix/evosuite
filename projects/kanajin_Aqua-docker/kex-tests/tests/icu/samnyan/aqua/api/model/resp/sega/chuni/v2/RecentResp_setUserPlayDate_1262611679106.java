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

public class RecentResp_setUserPlayDate_1262611679106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51079;

    public RecentResp_setUserPlayDate_1262611679106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51079 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term51079, term51079.getClass(), "playDate", null);
        setField(term51079, term51079.getClass(), "userPlayDate", null);
        setIntField(term51079, term51079.getClass(), "musicId", 0);
        setIntField(term51079, term51079.getClass(), "level", 0);
        setIntField(term51079, term51079.getClass(), "customId", 0);
        setIntField(term51079, term51079.getClass(), "playedCustom1", 0);
        setIntField(term51079, term51079.getClass(), "playedCustom2", 0);
        setIntField(term51079, term51079.getClass(), "playedCustom3", 0);
        setIntField(term51079, term51079.getClass(), "track", 0);
        setIntField(term51079, term51079.getClass(), "score", 0);
        setIntField(term51079, term51079.getClass(), "rank", 0);
        setIntField(term51079, term51079.getClass(), "maxCombo", 0);
        setIntField(term51079, term51079.getClass(), "maxChain", 0);
        setIntField(term51079, term51079.getClass(), "rateTap", 0);
        setIntField(term51079, term51079.getClass(), "rateHold", 0);
        setIntField(term51079, term51079.getClass(), "rateSlide", 0);
        setIntField(term51079, term51079.getClass(), "rateAir", 0);
        setIntField(term51079, term51079.getClass(), "rateFlick", 0);
        setIntField(term51079, term51079.getClass(), "judgeGuilty", 0);
        setIntField(term51079, term51079.getClass(), "judgeAttack", 0);
        setIntField(term51079, term51079.getClass(), "judgeJustice", 0);
        setIntField(term51079, term51079.getClass(), "judgeCritical", 0);
        setIntField(term51079, term51079.getClass(), "playerRating", 0);
        setBooleanField(term51079, term51079.getClass(), "isNewRecord", false);
        setBooleanField(term51079, term51079.getClass(), "isFullCombo", false);
        setIntField(term51079, term51079.getClass(), "fullChainKind", 0);
        setBooleanField(term51079, term51079.getClass(), "isAllJustice", false);
        setIntField(term51079, term51079.getClass(), "characterId", 0);
        setIntField(term51079, term51079.getClass(), "skillId", 0);
        setIntField(term51079, term51079.getClass(), "playKind", 0);
        setBooleanField(term51079, term51079.getClass(), "isClear", false);
        setIntField(term51079, term51079.getClass(), "skillLevel", 0);
        setIntField(term51079, term51079.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserPlayDate", argTypes, term51079, args);
    }

};



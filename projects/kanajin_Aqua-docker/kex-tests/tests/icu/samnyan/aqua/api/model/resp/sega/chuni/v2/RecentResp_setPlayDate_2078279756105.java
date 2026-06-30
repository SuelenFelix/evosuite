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

public class RecentResp_setPlayDate_2078279756105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51047;

    public RecentResp_setPlayDate_2078279756105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51047 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term51047, term51047.getClass(), "playDate", null);
        setField(term51047, term51047.getClass(), "userPlayDate", null);
        setIntField(term51047, term51047.getClass(), "musicId", 0);
        setIntField(term51047, term51047.getClass(), "level", 0);
        setIntField(term51047, term51047.getClass(), "customId", 0);
        setIntField(term51047, term51047.getClass(), "playedCustom1", 0);
        setIntField(term51047, term51047.getClass(), "playedCustom2", 0);
        setIntField(term51047, term51047.getClass(), "playedCustom3", 0);
        setIntField(term51047, term51047.getClass(), "track", 0);
        setIntField(term51047, term51047.getClass(), "score", 0);
        setIntField(term51047, term51047.getClass(), "rank", 0);
        setIntField(term51047, term51047.getClass(), "maxCombo", 0);
        setIntField(term51047, term51047.getClass(), "maxChain", 0);
        setIntField(term51047, term51047.getClass(), "rateTap", 0);
        setIntField(term51047, term51047.getClass(), "rateHold", 0);
        setIntField(term51047, term51047.getClass(), "rateSlide", 0);
        setIntField(term51047, term51047.getClass(), "rateAir", 0);
        setIntField(term51047, term51047.getClass(), "rateFlick", 0);
        setIntField(term51047, term51047.getClass(), "judgeGuilty", 0);
        setIntField(term51047, term51047.getClass(), "judgeAttack", 0);
        setIntField(term51047, term51047.getClass(), "judgeJustice", 0);
        setIntField(term51047, term51047.getClass(), "judgeCritical", 0);
        setIntField(term51047, term51047.getClass(), "playerRating", 0);
        setBooleanField(term51047, term51047.getClass(), "isNewRecord", false);
        setBooleanField(term51047, term51047.getClass(), "isFullCombo", false);
        setIntField(term51047, term51047.getClass(), "fullChainKind", 0);
        setBooleanField(term51047, term51047.getClass(), "isAllJustice", false);
        setIntField(term51047, term51047.getClass(), "characterId", 0);
        setIntField(term51047, term51047.getClass(), "skillId", 0);
        setIntField(term51047, term51047.getClass(), "playKind", 0);
        setBooleanField(term51047, term51047.getClass(), "isClear", false);
        setIntField(term51047, term51047.getClass(), "skillLevel", 0);
        setIntField(term51047, term51047.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayDate", argTypes, term51047, args);
    }

};



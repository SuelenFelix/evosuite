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

public class RecentResp_getRateTap_188835800885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50407;

    public RecentResp_getRateTap_188835800885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50407 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term50407, term50407.getClass(), "playDate", null);
        setField(term50407, term50407.getClass(), "userPlayDate", null);
        setIntField(term50407, term50407.getClass(), "musicId", 0);
        setIntField(term50407, term50407.getClass(), "level", 0);
        setIntField(term50407, term50407.getClass(), "customId", 0);
        setIntField(term50407, term50407.getClass(), "playedCustom1", 0);
        setIntField(term50407, term50407.getClass(), "playedCustom2", 0);
        setIntField(term50407, term50407.getClass(), "playedCustom3", 0);
        setIntField(term50407, term50407.getClass(), "track", 0);
        setIntField(term50407, term50407.getClass(), "score", 0);
        setIntField(term50407, term50407.getClass(), "rank", 0);
        setIntField(term50407, term50407.getClass(), "maxCombo", 0);
        setIntField(term50407, term50407.getClass(), "maxChain", 0);
        setIntField(term50407, term50407.getClass(), "rateTap", 0);
        setIntField(term50407, term50407.getClass(), "rateHold", 0);
        setIntField(term50407, term50407.getClass(), "rateSlide", 0);
        setIntField(term50407, term50407.getClass(), "rateAir", 0);
        setIntField(term50407, term50407.getClass(), "rateFlick", 0);
        setIntField(term50407, term50407.getClass(), "judgeGuilty", 0);
        setIntField(term50407, term50407.getClass(), "judgeAttack", 0);
        setIntField(term50407, term50407.getClass(), "judgeJustice", 0);
        setIntField(term50407, term50407.getClass(), "judgeCritical", 0);
        setIntField(term50407, term50407.getClass(), "playerRating", 0);
        setBooleanField(term50407, term50407.getClass(), "isNewRecord", false);
        setBooleanField(term50407, term50407.getClass(), "isFullCombo", false);
        setIntField(term50407, term50407.getClass(), "fullChainKind", 0);
        setBooleanField(term50407, term50407.getClass(), "isAllJustice", false);
        setIntField(term50407, term50407.getClass(), "characterId", 0);
        setIntField(term50407, term50407.getClass(), "skillId", 0);
        setIntField(term50407, term50407.getClass(), "playKind", 0);
        setBooleanField(term50407, term50407.getClass(), "isClear", false);
        setIntField(term50407, term50407.getClass(), "skillLevel", 0);
        setIntField(term50407, term50407.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateTap", argTypes, term50407, args);
    }

};



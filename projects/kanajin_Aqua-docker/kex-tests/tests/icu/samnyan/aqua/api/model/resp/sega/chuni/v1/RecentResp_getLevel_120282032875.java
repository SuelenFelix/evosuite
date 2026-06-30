package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RecentResp_getLevel_120282032875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55257;

    public RecentResp_getLevel_120282032875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55257 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term55257, term55257.getClass(), "playDate", null);
        setField(term55257, term55257.getClass(), "userPlayDate", null);
        setIntField(term55257, term55257.getClass(), "musicId", 0);
        setIntField(term55257, term55257.getClass(), "level", 0);
        setIntField(term55257, term55257.getClass(), "customId", 0);
        setIntField(term55257, term55257.getClass(), "playedCustom1", 0);
        setIntField(term55257, term55257.getClass(), "playedCustom2", 0);
        setIntField(term55257, term55257.getClass(), "playedCustom3", 0);
        setIntField(term55257, term55257.getClass(), "track", 0);
        setIntField(term55257, term55257.getClass(), "score", 0);
        setIntField(term55257, term55257.getClass(), "rank", 0);
        setIntField(term55257, term55257.getClass(), "maxCombo", 0);
        setIntField(term55257, term55257.getClass(), "maxChain", 0);
        setIntField(term55257, term55257.getClass(), "rateTap", 0);
        setIntField(term55257, term55257.getClass(), "rateHold", 0);
        setIntField(term55257, term55257.getClass(), "rateSlide", 0);
        setIntField(term55257, term55257.getClass(), "rateAir", 0);
        setIntField(term55257, term55257.getClass(), "rateFlick", 0);
        setIntField(term55257, term55257.getClass(), "judgeGuilty", 0);
        setIntField(term55257, term55257.getClass(), "judgeAttack", 0);
        setIntField(term55257, term55257.getClass(), "judgeJustice", 0);
        setIntField(term55257, term55257.getClass(), "judgeCritical", 0);
        setIntField(term55257, term55257.getClass(), "playerRating", 0);
        setBooleanField(term55257, term55257.getClass(), "isNewRecord", false);
        setBooleanField(term55257, term55257.getClass(), "isFullCombo", false);
        setIntField(term55257, term55257.getClass(), "fullChainKind", 0);
        setBooleanField(term55257, term55257.getClass(), "isAllJustice", false);
        setIntField(term55257, term55257.getClass(), "characterId", 0);
        setIntField(term55257, term55257.getClass(), "skillId", 0);
        setIntField(term55257, term55257.getClass(), "playKind", 0);
        setBooleanField(term55257, term55257.getClass(), "isClear", false);
        setIntField(term55257, term55257.getClass(), "skillLevel", 0);
        setIntField(term55257, term55257.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term55257, args);
    }

};



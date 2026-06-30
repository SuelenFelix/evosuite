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

public class RecentResp_getRateHold_114452345686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50439;

    public RecentResp_getRateHold_114452345686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50439 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term50439, term50439.getClass(), "playDate", null);
        setField(term50439, term50439.getClass(), "userPlayDate", null);
        setIntField(term50439, term50439.getClass(), "musicId", 0);
        setIntField(term50439, term50439.getClass(), "level", 0);
        setIntField(term50439, term50439.getClass(), "customId", 0);
        setIntField(term50439, term50439.getClass(), "playedCustom1", 0);
        setIntField(term50439, term50439.getClass(), "playedCustom2", 0);
        setIntField(term50439, term50439.getClass(), "playedCustom3", 0);
        setIntField(term50439, term50439.getClass(), "track", 0);
        setIntField(term50439, term50439.getClass(), "score", 0);
        setIntField(term50439, term50439.getClass(), "rank", 0);
        setIntField(term50439, term50439.getClass(), "maxCombo", 0);
        setIntField(term50439, term50439.getClass(), "maxChain", 0);
        setIntField(term50439, term50439.getClass(), "rateTap", 0);
        setIntField(term50439, term50439.getClass(), "rateHold", 0);
        setIntField(term50439, term50439.getClass(), "rateSlide", 0);
        setIntField(term50439, term50439.getClass(), "rateAir", 0);
        setIntField(term50439, term50439.getClass(), "rateFlick", 0);
        setIntField(term50439, term50439.getClass(), "judgeGuilty", 0);
        setIntField(term50439, term50439.getClass(), "judgeAttack", 0);
        setIntField(term50439, term50439.getClass(), "judgeJustice", 0);
        setIntField(term50439, term50439.getClass(), "judgeCritical", 0);
        setIntField(term50439, term50439.getClass(), "playerRating", 0);
        setBooleanField(term50439, term50439.getClass(), "isNewRecord", false);
        setBooleanField(term50439, term50439.getClass(), "isFullCombo", false);
        setIntField(term50439, term50439.getClass(), "fullChainKind", 0);
        setBooleanField(term50439, term50439.getClass(), "isAllJustice", false);
        setIntField(term50439, term50439.getClass(), "characterId", 0);
        setIntField(term50439, term50439.getClass(), "skillId", 0);
        setIntField(term50439, term50439.getClass(), "playKind", 0);
        setBooleanField(term50439, term50439.getClass(), "isClear", false);
        setIntField(term50439, term50439.getClass(), "skillLevel", 0);
        setIntField(term50439, term50439.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateHold", argTypes, term50439, args);
    }

};



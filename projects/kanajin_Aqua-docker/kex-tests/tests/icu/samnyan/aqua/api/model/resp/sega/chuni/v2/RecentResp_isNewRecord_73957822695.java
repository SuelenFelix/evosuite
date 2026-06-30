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

public class RecentResp_isNewRecord_73957822695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50727;

    public RecentResp_isNewRecord_73957822695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50727 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term50727, term50727.getClass(), "playDate", null);
        setField(term50727, term50727.getClass(), "userPlayDate", null);
        setIntField(term50727, term50727.getClass(), "musicId", 0);
        setIntField(term50727, term50727.getClass(), "level", 0);
        setIntField(term50727, term50727.getClass(), "customId", 0);
        setIntField(term50727, term50727.getClass(), "playedCustom1", 0);
        setIntField(term50727, term50727.getClass(), "playedCustom2", 0);
        setIntField(term50727, term50727.getClass(), "playedCustom3", 0);
        setIntField(term50727, term50727.getClass(), "track", 0);
        setIntField(term50727, term50727.getClass(), "score", 0);
        setIntField(term50727, term50727.getClass(), "rank", 0);
        setIntField(term50727, term50727.getClass(), "maxCombo", 0);
        setIntField(term50727, term50727.getClass(), "maxChain", 0);
        setIntField(term50727, term50727.getClass(), "rateTap", 0);
        setIntField(term50727, term50727.getClass(), "rateHold", 0);
        setIntField(term50727, term50727.getClass(), "rateSlide", 0);
        setIntField(term50727, term50727.getClass(), "rateAir", 0);
        setIntField(term50727, term50727.getClass(), "rateFlick", 0);
        setIntField(term50727, term50727.getClass(), "judgeGuilty", 0);
        setIntField(term50727, term50727.getClass(), "judgeAttack", 0);
        setIntField(term50727, term50727.getClass(), "judgeJustice", 0);
        setIntField(term50727, term50727.getClass(), "judgeCritical", 0);
        setIntField(term50727, term50727.getClass(), "playerRating", 0);
        setBooleanField(term50727, term50727.getClass(), "isNewRecord", false);
        setBooleanField(term50727, term50727.getClass(), "isFullCombo", false);
        setIntField(term50727, term50727.getClass(), "fullChainKind", 0);
        setBooleanField(term50727, term50727.getClass(), "isAllJustice", false);
        setIntField(term50727, term50727.getClass(), "characterId", 0);
        setIntField(term50727, term50727.getClass(), "skillId", 0);
        setIntField(term50727, term50727.getClass(), "playKind", 0);
        setBooleanField(term50727, term50727.getClass(), "isClear", false);
        setIntField(term50727, term50727.getClass(), "skillLevel", 0);
        setIntField(term50727, term50727.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewRecord", argTypes, term50727, args);
    }

};



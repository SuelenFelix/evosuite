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

public class RecentResp_getCharacterId_121596807199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50855;

    public RecentResp_getCharacterId_121596807199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50855 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term50855, term50855.getClass(), "playDate", null);
        setField(term50855, term50855.getClass(), "userPlayDate", null);
        setIntField(term50855, term50855.getClass(), "musicId", 0);
        setIntField(term50855, term50855.getClass(), "level", 0);
        setIntField(term50855, term50855.getClass(), "customId", 0);
        setIntField(term50855, term50855.getClass(), "playedCustom1", 0);
        setIntField(term50855, term50855.getClass(), "playedCustom2", 0);
        setIntField(term50855, term50855.getClass(), "playedCustom3", 0);
        setIntField(term50855, term50855.getClass(), "track", 0);
        setIntField(term50855, term50855.getClass(), "score", 0);
        setIntField(term50855, term50855.getClass(), "rank", 0);
        setIntField(term50855, term50855.getClass(), "maxCombo", 0);
        setIntField(term50855, term50855.getClass(), "maxChain", 0);
        setIntField(term50855, term50855.getClass(), "rateTap", 0);
        setIntField(term50855, term50855.getClass(), "rateHold", 0);
        setIntField(term50855, term50855.getClass(), "rateSlide", 0);
        setIntField(term50855, term50855.getClass(), "rateAir", 0);
        setIntField(term50855, term50855.getClass(), "rateFlick", 0);
        setIntField(term50855, term50855.getClass(), "judgeGuilty", 0);
        setIntField(term50855, term50855.getClass(), "judgeAttack", 0);
        setIntField(term50855, term50855.getClass(), "judgeJustice", 0);
        setIntField(term50855, term50855.getClass(), "judgeCritical", 0);
        setIntField(term50855, term50855.getClass(), "playerRating", 0);
        setBooleanField(term50855, term50855.getClass(), "isNewRecord", false);
        setBooleanField(term50855, term50855.getClass(), "isFullCombo", false);
        setIntField(term50855, term50855.getClass(), "fullChainKind", 0);
        setBooleanField(term50855, term50855.getClass(), "isAllJustice", false);
        setIntField(term50855, term50855.getClass(), "characterId", 0);
        setIntField(term50855, term50855.getClass(), "skillId", 0);
        setIntField(term50855, term50855.getClass(), "playKind", 0);
        setBooleanField(term50855, term50855.getClass(), "isClear", false);
        setIntField(term50855, term50855.getClass(), "skillLevel", 0);
        setIntField(term50855, term50855.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term50855, args);
    }

};



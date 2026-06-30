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

public class RecentResp_setCharacterId_1251183651132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51961;
     Object term51993;

    public RecentResp_setCharacterId_1251183651132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51961 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term51961, term51961.getClass(), "playDate", null);
        setField(term51961, term51961.getClass(), "userPlayDate", null);
        setIntField(term51961, term51961.getClass(), "musicId", 0);
        setIntField(term51961, term51961.getClass(), "level", 0);
        setIntField(term51961, term51961.getClass(), "customId", 0);
        setIntField(term51961, term51961.getClass(), "playedCustom1", 0);
        setIntField(term51961, term51961.getClass(), "playedCustom2", 0);
        setIntField(term51961, term51961.getClass(), "playedCustom3", 0);
        setIntField(term51961, term51961.getClass(), "track", 0);
        setIntField(term51961, term51961.getClass(), "score", 0);
        setIntField(term51961, term51961.getClass(), "rank", 0);
        setIntField(term51961, term51961.getClass(), "maxCombo", 0);
        setIntField(term51961, term51961.getClass(), "maxChain", 0);
        setIntField(term51961, term51961.getClass(), "rateTap", 0);
        setIntField(term51961, term51961.getClass(), "rateHold", 0);
        setIntField(term51961, term51961.getClass(), "rateSlide", 0);
        setIntField(term51961, term51961.getClass(), "rateAir", 0);
        setIntField(term51961, term51961.getClass(), "rateFlick", 0);
        setIntField(term51961, term51961.getClass(), "judgeGuilty", 0);
        setIntField(term51961, term51961.getClass(), "judgeAttack", 0);
        setIntField(term51961, term51961.getClass(), "judgeJustice", 0);
        setIntField(term51961, term51961.getClass(), "judgeCritical", 0);
        setIntField(term51961, term51961.getClass(), "playerRating", 0);
        setBooleanField(term51961, term51961.getClass(), "isNewRecord", false);
        setBooleanField(term51961, term51961.getClass(), "isFullCombo", false);
        setIntField(term51961, term51961.getClass(), "fullChainKind", 0);
        setBooleanField(term51961, term51961.getClass(), "isAllJustice", false);
        setIntField(term51961, term51961.getClass(), "characterId", 0);
        setIntField(term51961, term51961.getClass(), "skillId", 0);
        setIntField(term51961, term51961.getClass(), "playKind", 0);
        setBooleanField(term51961, term51961.getClass(), "isClear", false);
        setIntField(term51961, term51961.getClass(), "skillLevel", 0);
        setIntField(term51961, term51961.getClass(), "skillEffect", 0);
        term51993 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term51993;
        callMethod(klass, "setCharacterId", argTypes, term51961, args);
    }

};



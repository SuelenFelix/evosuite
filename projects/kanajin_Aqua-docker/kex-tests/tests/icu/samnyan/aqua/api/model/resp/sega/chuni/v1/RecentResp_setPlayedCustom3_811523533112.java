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
import java.lang.Integer;

public class RecentResp_setPlayedCustom3_811523533112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56451;
     Object term56483;

    public RecentResp_setPlayedCustom3_811523533112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56451 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56451, term56451.getClass(), "playDate", null);
        setField(term56451, term56451.getClass(), "userPlayDate", null);
        setIntField(term56451, term56451.getClass(), "musicId", 0);
        setIntField(term56451, term56451.getClass(), "level", 0);
        setIntField(term56451, term56451.getClass(), "customId", 0);
        setIntField(term56451, term56451.getClass(), "playedCustom1", 0);
        setIntField(term56451, term56451.getClass(), "playedCustom2", 0);
        setIntField(term56451, term56451.getClass(), "playedCustom3", 0);
        setIntField(term56451, term56451.getClass(), "track", 0);
        setIntField(term56451, term56451.getClass(), "score", 0);
        setIntField(term56451, term56451.getClass(), "rank", 0);
        setIntField(term56451, term56451.getClass(), "maxCombo", 0);
        setIntField(term56451, term56451.getClass(), "maxChain", 0);
        setIntField(term56451, term56451.getClass(), "rateTap", 0);
        setIntField(term56451, term56451.getClass(), "rateHold", 0);
        setIntField(term56451, term56451.getClass(), "rateSlide", 0);
        setIntField(term56451, term56451.getClass(), "rateAir", 0);
        setIntField(term56451, term56451.getClass(), "rateFlick", 0);
        setIntField(term56451, term56451.getClass(), "judgeGuilty", 0);
        setIntField(term56451, term56451.getClass(), "judgeAttack", 0);
        setIntField(term56451, term56451.getClass(), "judgeJustice", 0);
        setIntField(term56451, term56451.getClass(), "judgeCritical", 0);
        setIntField(term56451, term56451.getClass(), "playerRating", 0);
        setBooleanField(term56451, term56451.getClass(), "isNewRecord", false);
        setBooleanField(term56451, term56451.getClass(), "isFullCombo", false);
        setIntField(term56451, term56451.getClass(), "fullChainKind", 0);
        setBooleanField(term56451, term56451.getClass(), "isAllJustice", false);
        setIntField(term56451, term56451.getClass(), "characterId", 0);
        setIntField(term56451, term56451.getClass(), "skillId", 0);
        setIntField(term56451, term56451.getClass(), "playKind", 0);
        setBooleanField(term56451, term56451.getClass(), "isClear", false);
        setIntField(term56451, term56451.getClass(), "skillLevel", 0);
        setIntField(term56451, term56451.getClass(), "skillEffect", 0);
        term56483 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56483;
        callMethod(klass, "setPlayedCustom3", argTypes, term56451, args);
    }

};



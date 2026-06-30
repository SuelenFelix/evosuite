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

public class RecentResp_hashCode_2106886619140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57399;

    public RecentResp_hashCode_2106886619140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57399 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57399, term57399.getClass(), "playDate", null);
        setField(term57399, term57399.getClass(), "userPlayDate", null);
        setIntField(term57399, term57399.getClass(), "musicId", 0);
        setIntField(term57399, term57399.getClass(), "level", 0);
        setIntField(term57399, term57399.getClass(), "customId", 0);
        setIntField(term57399, term57399.getClass(), "playedCustom1", 0);
        setIntField(term57399, term57399.getClass(), "playedCustom2", 0);
        setIntField(term57399, term57399.getClass(), "playedCustom3", 0);
        setIntField(term57399, term57399.getClass(), "track", 0);
        setIntField(term57399, term57399.getClass(), "score", 0);
        setIntField(term57399, term57399.getClass(), "rank", 0);
        setIntField(term57399, term57399.getClass(), "maxCombo", 0);
        setIntField(term57399, term57399.getClass(), "maxChain", 0);
        setIntField(term57399, term57399.getClass(), "rateTap", 0);
        setIntField(term57399, term57399.getClass(), "rateHold", 0);
        setIntField(term57399, term57399.getClass(), "rateSlide", 0);
        setIntField(term57399, term57399.getClass(), "rateAir", 0);
        setIntField(term57399, term57399.getClass(), "rateFlick", 0);
        setIntField(term57399, term57399.getClass(), "judgeGuilty", 0);
        setIntField(term57399, term57399.getClass(), "judgeAttack", 0);
        setIntField(term57399, term57399.getClass(), "judgeJustice", 0);
        setIntField(term57399, term57399.getClass(), "judgeCritical", 0);
        setIntField(term57399, term57399.getClass(), "playerRating", 0);
        setBooleanField(term57399, term57399.getClass(), "isNewRecord", false);
        setBooleanField(term57399, term57399.getClass(), "isFullCombo", false);
        setIntField(term57399, term57399.getClass(), "fullChainKind", 0);
        setBooleanField(term57399, term57399.getClass(), "isAllJustice", false);
        setIntField(term57399, term57399.getClass(), "characterId", 0);
        setIntField(term57399, term57399.getClass(), "skillId", 0);
        setIntField(term57399, term57399.getClass(), "playKind", 0);
        setBooleanField(term57399, term57399.getClass(), "isClear", false);
        setIntField(term57399, term57399.getClass(), "skillLevel", 0);
        setIntField(term57399, term57399.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term57399, args);
    }

};



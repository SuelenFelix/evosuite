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
import java.lang.Boolean;

public class RecentResp_setFullCombo_617430883129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57029;
     Object term57061;

    public RecentResp_setFullCombo_617430883129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57029 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57029, term57029.getClass(), "playDate", null);
        setField(term57029, term57029.getClass(), "userPlayDate", null);
        setIntField(term57029, term57029.getClass(), "musicId", 0);
        setIntField(term57029, term57029.getClass(), "level", 0);
        setIntField(term57029, term57029.getClass(), "customId", 0);
        setIntField(term57029, term57029.getClass(), "playedCustom1", 0);
        setIntField(term57029, term57029.getClass(), "playedCustom2", 0);
        setIntField(term57029, term57029.getClass(), "playedCustom3", 0);
        setIntField(term57029, term57029.getClass(), "track", 0);
        setIntField(term57029, term57029.getClass(), "score", 0);
        setIntField(term57029, term57029.getClass(), "rank", 0);
        setIntField(term57029, term57029.getClass(), "maxCombo", 0);
        setIntField(term57029, term57029.getClass(), "maxChain", 0);
        setIntField(term57029, term57029.getClass(), "rateTap", 0);
        setIntField(term57029, term57029.getClass(), "rateHold", 0);
        setIntField(term57029, term57029.getClass(), "rateSlide", 0);
        setIntField(term57029, term57029.getClass(), "rateAir", 0);
        setIntField(term57029, term57029.getClass(), "rateFlick", 0);
        setIntField(term57029, term57029.getClass(), "judgeGuilty", 0);
        setIntField(term57029, term57029.getClass(), "judgeAttack", 0);
        setIntField(term57029, term57029.getClass(), "judgeJustice", 0);
        setIntField(term57029, term57029.getClass(), "judgeCritical", 0);
        setIntField(term57029, term57029.getClass(), "playerRating", 0);
        setBooleanField(term57029, term57029.getClass(), "isNewRecord", false);
        setBooleanField(term57029, term57029.getClass(), "isFullCombo", false);
        setIntField(term57029, term57029.getClass(), "fullChainKind", 0);
        setBooleanField(term57029, term57029.getClass(), "isAllJustice", false);
        setIntField(term57029, term57029.getClass(), "characterId", 0);
        setIntField(term57029, term57029.getClass(), "skillId", 0);
        setIntField(term57029, term57029.getClass(), "playKind", 0);
        setBooleanField(term57029, term57029.getClass(), "isClear", false);
        setIntField(term57029, term57029.getClass(), "skillLevel", 0);
        setIntField(term57029, term57029.getClass(), "skillEffect", 0);
        term57061 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term57061;
        callMethod(klass, "setFullCombo", argTypes, term57029, args);
    }

};



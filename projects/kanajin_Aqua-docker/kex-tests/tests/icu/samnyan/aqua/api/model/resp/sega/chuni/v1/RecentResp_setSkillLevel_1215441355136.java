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

public class RecentResp_setSkillLevel_1215441355136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57267;
     Object term57299;

    public RecentResp_setSkillLevel_1215441355136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57267 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57267, term57267.getClass(), "playDate", null);
        setField(term57267, term57267.getClass(), "userPlayDate", null);
        setIntField(term57267, term57267.getClass(), "musicId", 0);
        setIntField(term57267, term57267.getClass(), "level", 0);
        setIntField(term57267, term57267.getClass(), "customId", 0);
        setIntField(term57267, term57267.getClass(), "playedCustom1", 0);
        setIntField(term57267, term57267.getClass(), "playedCustom2", 0);
        setIntField(term57267, term57267.getClass(), "playedCustom3", 0);
        setIntField(term57267, term57267.getClass(), "track", 0);
        setIntField(term57267, term57267.getClass(), "score", 0);
        setIntField(term57267, term57267.getClass(), "rank", 0);
        setIntField(term57267, term57267.getClass(), "maxCombo", 0);
        setIntField(term57267, term57267.getClass(), "maxChain", 0);
        setIntField(term57267, term57267.getClass(), "rateTap", 0);
        setIntField(term57267, term57267.getClass(), "rateHold", 0);
        setIntField(term57267, term57267.getClass(), "rateSlide", 0);
        setIntField(term57267, term57267.getClass(), "rateAir", 0);
        setIntField(term57267, term57267.getClass(), "rateFlick", 0);
        setIntField(term57267, term57267.getClass(), "judgeGuilty", 0);
        setIntField(term57267, term57267.getClass(), "judgeAttack", 0);
        setIntField(term57267, term57267.getClass(), "judgeJustice", 0);
        setIntField(term57267, term57267.getClass(), "judgeCritical", 0);
        setIntField(term57267, term57267.getClass(), "playerRating", 0);
        setBooleanField(term57267, term57267.getClass(), "isNewRecord", false);
        setBooleanField(term57267, term57267.getClass(), "isFullCombo", false);
        setIntField(term57267, term57267.getClass(), "fullChainKind", 0);
        setBooleanField(term57267, term57267.getClass(), "isAllJustice", false);
        setIntField(term57267, term57267.getClass(), "characterId", 0);
        setIntField(term57267, term57267.getClass(), "skillId", 0);
        setIntField(term57267, term57267.getClass(), "playKind", 0);
        setBooleanField(term57267, term57267.getClass(), "isClear", false);
        setIntField(term57267, term57267.getClass(), "skillLevel", 0);
        setIntField(term57267, term57267.getClass(), "skillEffect", 0);
        term57299 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57299;
        callMethod(klass, "setSkillLevel", argTypes, term57267, args);
    }

};



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

public class RecentResp_setSkillId_1224396746133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57165;
     Object term57197;

    public RecentResp_setSkillId_1224396746133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57165 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57165, term57165.getClass(), "playDate", null);
        setField(term57165, term57165.getClass(), "userPlayDate", null);
        setIntField(term57165, term57165.getClass(), "musicId", 0);
        setIntField(term57165, term57165.getClass(), "level", 0);
        setIntField(term57165, term57165.getClass(), "customId", 0);
        setIntField(term57165, term57165.getClass(), "playedCustom1", 0);
        setIntField(term57165, term57165.getClass(), "playedCustom2", 0);
        setIntField(term57165, term57165.getClass(), "playedCustom3", 0);
        setIntField(term57165, term57165.getClass(), "track", 0);
        setIntField(term57165, term57165.getClass(), "score", 0);
        setIntField(term57165, term57165.getClass(), "rank", 0);
        setIntField(term57165, term57165.getClass(), "maxCombo", 0);
        setIntField(term57165, term57165.getClass(), "maxChain", 0);
        setIntField(term57165, term57165.getClass(), "rateTap", 0);
        setIntField(term57165, term57165.getClass(), "rateHold", 0);
        setIntField(term57165, term57165.getClass(), "rateSlide", 0);
        setIntField(term57165, term57165.getClass(), "rateAir", 0);
        setIntField(term57165, term57165.getClass(), "rateFlick", 0);
        setIntField(term57165, term57165.getClass(), "judgeGuilty", 0);
        setIntField(term57165, term57165.getClass(), "judgeAttack", 0);
        setIntField(term57165, term57165.getClass(), "judgeJustice", 0);
        setIntField(term57165, term57165.getClass(), "judgeCritical", 0);
        setIntField(term57165, term57165.getClass(), "playerRating", 0);
        setBooleanField(term57165, term57165.getClass(), "isNewRecord", false);
        setBooleanField(term57165, term57165.getClass(), "isFullCombo", false);
        setIntField(term57165, term57165.getClass(), "fullChainKind", 0);
        setBooleanField(term57165, term57165.getClass(), "isAllJustice", false);
        setIntField(term57165, term57165.getClass(), "characterId", 0);
        setIntField(term57165, term57165.getClass(), "skillId", 0);
        setIntField(term57165, term57165.getClass(), "playKind", 0);
        setBooleanField(term57165, term57165.getClass(), "isClear", false);
        setIntField(term57165, term57165.getClass(), "skillLevel", 0);
        setIntField(term57165, term57165.getClass(), "skillEffect", 0);
        term57197 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57197;
        callMethod(klass, "setSkillId", argTypes, term57165, args);
    }

};



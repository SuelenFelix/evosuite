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

public class RecentResp_setFullChainKind_1213701212130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57063;
     Object term57095;

    public RecentResp_setFullChainKind_1213701212130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57063 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57063, term57063.getClass(), "playDate", null);
        setField(term57063, term57063.getClass(), "userPlayDate", null);
        setIntField(term57063, term57063.getClass(), "musicId", 0);
        setIntField(term57063, term57063.getClass(), "level", 0);
        setIntField(term57063, term57063.getClass(), "customId", 0);
        setIntField(term57063, term57063.getClass(), "playedCustom1", 0);
        setIntField(term57063, term57063.getClass(), "playedCustom2", 0);
        setIntField(term57063, term57063.getClass(), "playedCustom3", 0);
        setIntField(term57063, term57063.getClass(), "track", 0);
        setIntField(term57063, term57063.getClass(), "score", 0);
        setIntField(term57063, term57063.getClass(), "rank", 0);
        setIntField(term57063, term57063.getClass(), "maxCombo", 0);
        setIntField(term57063, term57063.getClass(), "maxChain", 0);
        setIntField(term57063, term57063.getClass(), "rateTap", 0);
        setIntField(term57063, term57063.getClass(), "rateHold", 0);
        setIntField(term57063, term57063.getClass(), "rateSlide", 0);
        setIntField(term57063, term57063.getClass(), "rateAir", 0);
        setIntField(term57063, term57063.getClass(), "rateFlick", 0);
        setIntField(term57063, term57063.getClass(), "judgeGuilty", 0);
        setIntField(term57063, term57063.getClass(), "judgeAttack", 0);
        setIntField(term57063, term57063.getClass(), "judgeJustice", 0);
        setIntField(term57063, term57063.getClass(), "judgeCritical", 0);
        setIntField(term57063, term57063.getClass(), "playerRating", 0);
        setBooleanField(term57063, term57063.getClass(), "isNewRecord", false);
        setBooleanField(term57063, term57063.getClass(), "isFullCombo", false);
        setIntField(term57063, term57063.getClass(), "fullChainKind", 0);
        setBooleanField(term57063, term57063.getClass(), "isAllJustice", false);
        setIntField(term57063, term57063.getClass(), "characterId", 0);
        setIntField(term57063, term57063.getClass(), "skillId", 0);
        setIntField(term57063, term57063.getClass(), "playKind", 0);
        setBooleanField(term57063, term57063.getClass(), "isClear", false);
        setIntField(term57063, term57063.getClass(), "skillLevel", 0);
        setIntField(term57063, term57063.getClass(), "skillEffect", 0);
        term57095 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57095;
        callMethod(klass, "setFullChainKind", argTypes, term57063, args);
    }

};



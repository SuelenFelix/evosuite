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

public class RecentResp_setClear_1524603435135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57233;
     Object term57265;

    public RecentResp_setClear_1524603435135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57233 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57233, term57233.getClass(), "playDate", null);
        setField(term57233, term57233.getClass(), "userPlayDate", null);
        setIntField(term57233, term57233.getClass(), "musicId", 0);
        setIntField(term57233, term57233.getClass(), "level", 0);
        setIntField(term57233, term57233.getClass(), "customId", 0);
        setIntField(term57233, term57233.getClass(), "playedCustom1", 0);
        setIntField(term57233, term57233.getClass(), "playedCustom2", 0);
        setIntField(term57233, term57233.getClass(), "playedCustom3", 0);
        setIntField(term57233, term57233.getClass(), "track", 0);
        setIntField(term57233, term57233.getClass(), "score", 0);
        setIntField(term57233, term57233.getClass(), "rank", 0);
        setIntField(term57233, term57233.getClass(), "maxCombo", 0);
        setIntField(term57233, term57233.getClass(), "maxChain", 0);
        setIntField(term57233, term57233.getClass(), "rateTap", 0);
        setIntField(term57233, term57233.getClass(), "rateHold", 0);
        setIntField(term57233, term57233.getClass(), "rateSlide", 0);
        setIntField(term57233, term57233.getClass(), "rateAir", 0);
        setIntField(term57233, term57233.getClass(), "rateFlick", 0);
        setIntField(term57233, term57233.getClass(), "judgeGuilty", 0);
        setIntField(term57233, term57233.getClass(), "judgeAttack", 0);
        setIntField(term57233, term57233.getClass(), "judgeJustice", 0);
        setIntField(term57233, term57233.getClass(), "judgeCritical", 0);
        setIntField(term57233, term57233.getClass(), "playerRating", 0);
        setBooleanField(term57233, term57233.getClass(), "isNewRecord", false);
        setBooleanField(term57233, term57233.getClass(), "isFullCombo", false);
        setIntField(term57233, term57233.getClass(), "fullChainKind", 0);
        setBooleanField(term57233, term57233.getClass(), "isAllJustice", false);
        setIntField(term57233, term57233.getClass(), "characterId", 0);
        setIntField(term57233, term57233.getClass(), "skillId", 0);
        setIntField(term57233, term57233.getClass(), "playKind", 0);
        setBooleanField(term57233, term57233.getClass(), "isClear", false);
        setIntField(term57233, term57233.getClass(), "skillLevel", 0);
        setIntField(term57233, term57233.getClass(), "skillEffect", 0);
        term57265 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term57265;
        callMethod(klass, "setClear", argTypes, term57233, args);
    }

};



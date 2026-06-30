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

public class RecentResp_canEqual_854037315139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57367;

    public RecentResp_canEqual_854037315139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57367 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57367, term57367.getClass(), "playDate", null);
        setField(term57367, term57367.getClass(), "userPlayDate", null);
        setIntField(term57367, term57367.getClass(), "musicId", 0);
        setIntField(term57367, term57367.getClass(), "level", 0);
        setIntField(term57367, term57367.getClass(), "customId", 0);
        setIntField(term57367, term57367.getClass(), "playedCustom1", 0);
        setIntField(term57367, term57367.getClass(), "playedCustom2", 0);
        setIntField(term57367, term57367.getClass(), "playedCustom3", 0);
        setIntField(term57367, term57367.getClass(), "track", 0);
        setIntField(term57367, term57367.getClass(), "score", 0);
        setIntField(term57367, term57367.getClass(), "rank", 0);
        setIntField(term57367, term57367.getClass(), "maxCombo", 0);
        setIntField(term57367, term57367.getClass(), "maxChain", 0);
        setIntField(term57367, term57367.getClass(), "rateTap", 0);
        setIntField(term57367, term57367.getClass(), "rateHold", 0);
        setIntField(term57367, term57367.getClass(), "rateSlide", 0);
        setIntField(term57367, term57367.getClass(), "rateAir", 0);
        setIntField(term57367, term57367.getClass(), "rateFlick", 0);
        setIntField(term57367, term57367.getClass(), "judgeGuilty", 0);
        setIntField(term57367, term57367.getClass(), "judgeAttack", 0);
        setIntField(term57367, term57367.getClass(), "judgeJustice", 0);
        setIntField(term57367, term57367.getClass(), "judgeCritical", 0);
        setIntField(term57367, term57367.getClass(), "playerRating", 0);
        setBooleanField(term57367, term57367.getClass(), "isNewRecord", false);
        setBooleanField(term57367, term57367.getClass(), "isFullCombo", false);
        setIntField(term57367, term57367.getClass(), "fullChainKind", 0);
        setBooleanField(term57367, term57367.getClass(), "isAllJustice", false);
        setIntField(term57367, term57367.getClass(), "characterId", 0);
        setIntField(term57367, term57367.getClass(), "skillId", 0);
        setIntField(term57367, term57367.getClass(), "playKind", 0);
        setBooleanField(term57367, term57367.getClass(), "isClear", false);
        setIntField(term57367, term57367.getClass(), "skillLevel", 0);
        setIntField(term57367, term57367.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term57367, args);
    }

};



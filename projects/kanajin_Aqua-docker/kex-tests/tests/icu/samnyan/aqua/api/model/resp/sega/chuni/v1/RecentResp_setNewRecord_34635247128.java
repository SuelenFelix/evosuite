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

public class RecentResp_setNewRecord_34635247128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56995;
     Object term57027;

    public RecentResp_setNewRecord_34635247128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56995 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56995, term56995.getClass(), "playDate", null);
        setField(term56995, term56995.getClass(), "userPlayDate", null);
        setIntField(term56995, term56995.getClass(), "musicId", 0);
        setIntField(term56995, term56995.getClass(), "level", 0);
        setIntField(term56995, term56995.getClass(), "customId", 0);
        setIntField(term56995, term56995.getClass(), "playedCustom1", 0);
        setIntField(term56995, term56995.getClass(), "playedCustom2", 0);
        setIntField(term56995, term56995.getClass(), "playedCustom3", 0);
        setIntField(term56995, term56995.getClass(), "track", 0);
        setIntField(term56995, term56995.getClass(), "score", 0);
        setIntField(term56995, term56995.getClass(), "rank", 0);
        setIntField(term56995, term56995.getClass(), "maxCombo", 0);
        setIntField(term56995, term56995.getClass(), "maxChain", 0);
        setIntField(term56995, term56995.getClass(), "rateTap", 0);
        setIntField(term56995, term56995.getClass(), "rateHold", 0);
        setIntField(term56995, term56995.getClass(), "rateSlide", 0);
        setIntField(term56995, term56995.getClass(), "rateAir", 0);
        setIntField(term56995, term56995.getClass(), "rateFlick", 0);
        setIntField(term56995, term56995.getClass(), "judgeGuilty", 0);
        setIntField(term56995, term56995.getClass(), "judgeAttack", 0);
        setIntField(term56995, term56995.getClass(), "judgeJustice", 0);
        setIntField(term56995, term56995.getClass(), "judgeCritical", 0);
        setIntField(term56995, term56995.getClass(), "playerRating", 0);
        setBooleanField(term56995, term56995.getClass(), "isNewRecord", false);
        setBooleanField(term56995, term56995.getClass(), "isFullCombo", false);
        setIntField(term56995, term56995.getClass(), "fullChainKind", 0);
        setBooleanField(term56995, term56995.getClass(), "isAllJustice", false);
        setIntField(term56995, term56995.getClass(), "characterId", 0);
        setIntField(term56995, term56995.getClass(), "skillId", 0);
        setIntField(term56995, term56995.getClass(), "playKind", 0);
        setBooleanField(term56995, term56995.getClass(), "isClear", false);
        setIntField(term56995, term56995.getClass(), "skillLevel", 0);
        setIntField(term56995, term56995.getClass(), "skillEffect", 0);
        term57027 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term57027;
        callMethod(klass, "setNewRecord", argTypes, term56995, args);
    }

};



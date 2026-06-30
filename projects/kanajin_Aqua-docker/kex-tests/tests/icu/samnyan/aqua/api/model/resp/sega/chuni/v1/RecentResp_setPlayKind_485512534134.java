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

public class RecentResp_setPlayKind_485512534134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57199;
     Object term57231;

    public RecentResp_setPlayKind_485512534134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57199 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57199, term57199.getClass(), "playDate", null);
        setField(term57199, term57199.getClass(), "userPlayDate", null);
        setIntField(term57199, term57199.getClass(), "musicId", 0);
        setIntField(term57199, term57199.getClass(), "level", 0);
        setIntField(term57199, term57199.getClass(), "customId", 0);
        setIntField(term57199, term57199.getClass(), "playedCustom1", 0);
        setIntField(term57199, term57199.getClass(), "playedCustom2", 0);
        setIntField(term57199, term57199.getClass(), "playedCustom3", 0);
        setIntField(term57199, term57199.getClass(), "track", 0);
        setIntField(term57199, term57199.getClass(), "score", 0);
        setIntField(term57199, term57199.getClass(), "rank", 0);
        setIntField(term57199, term57199.getClass(), "maxCombo", 0);
        setIntField(term57199, term57199.getClass(), "maxChain", 0);
        setIntField(term57199, term57199.getClass(), "rateTap", 0);
        setIntField(term57199, term57199.getClass(), "rateHold", 0);
        setIntField(term57199, term57199.getClass(), "rateSlide", 0);
        setIntField(term57199, term57199.getClass(), "rateAir", 0);
        setIntField(term57199, term57199.getClass(), "rateFlick", 0);
        setIntField(term57199, term57199.getClass(), "judgeGuilty", 0);
        setIntField(term57199, term57199.getClass(), "judgeAttack", 0);
        setIntField(term57199, term57199.getClass(), "judgeJustice", 0);
        setIntField(term57199, term57199.getClass(), "judgeCritical", 0);
        setIntField(term57199, term57199.getClass(), "playerRating", 0);
        setBooleanField(term57199, term57199.getClass(), "isNewRecord", false);
        setBooleanField(term57199, term57199.getClass(), "isFullCombo", false);
        setIntField(term57199, term57199.getClass(), "fullChainKind", 0);
        setBooleanField(term57199, term57199.getClass(), "isAllJustice", false);
        setIntField(term57199, term57199.getClass(), "characterId", 0);
        setIntField(term57199, term57199.getClass(), "skillId", 0);
        setIntField(term57199, term57199.getClass(), "playKind", 0);
        setBooleanField(term57199, term57199.getClass(), "isClear", false);
        setIntField(term57199, term57199.getClass(), "skillLevel", 0);
        setIntField(term57199, term57199.getClass(), "skillEffect", 0);
        term57231 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57231;
        callMethod(klass, "setPlayKind", argTypes, term57199, args);
    }

};



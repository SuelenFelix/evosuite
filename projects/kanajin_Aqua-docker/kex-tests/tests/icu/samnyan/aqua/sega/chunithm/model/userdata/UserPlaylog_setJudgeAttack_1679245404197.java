package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserPlaylog_setJudgeAttack_1679245404197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277215;
     Object term277261;

    public UserPlaylog_setJudgeAttack_1679245404197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277215 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277215, term277215.getClass(), "id", 0L);
        setField(term277215, term277215.getClass(), "user", null);
        setIntField(term277215, term277215.getClass(), "orderId", 0);
        setIntField(term277215, term277215.getClass(), "sortNumber", 0);
        setIntField(term277215, term277215.getClass(), "placeId", 0);
        setField(term277215, term277215.getClass(), "playDate", null);
        setField(term277215, term277215.getClass(), "userPlayDate", null);
        setIntField(term277215, term277215.getClass(), "musicId", 0);
        setIntField(term277215, term277215.getClass(), "level", 0);
        setIntField(term277215, term277215.getClass(), "customId", 0);
        setIntField(term277215, term277215.getClass(), "playedUserId1", 0);
        setIntField(term277215, term277215.getClass(), "playedUserId2", 0);
        setIntField(term277215, term277215.getClass(), "playedUserId3", 0);
        setField(term277215, term277215.getClass(), "playedUserName1", null);
        setField(term277215, term277215.getClass(), "playedUserName2", null);
        setField(term277215, term277215.getClass(), "playedUserName3", null);
        setIntField(term277215, term277215.getClass(), "playedMusicLevel1", 0);
        setIntField(term277215, term277215.getClass(), "playedMusicLevel2", 0);
        setIntField(term277215, term277215.getClass(), "playedMusicLevel3", 0);
        setIntField(term277215, term277215.getClass(), "playedCustom1", 0);
        setIntField(term277215, term277215.getClass(), "playedCustom2", 0);
        setIntField(term277215, term277215.getClass(), "playedCustom3", 0);
        setIntField(term277215, term277215.getClass(), "track", 0);
        setIntField(term277215, term277215.getClass(), "score", 0);
        setIntField(term277215, term277215.getClass(), "rank", 0);
        setIntField(term277215, term277215.getClass(), "maxCombo", 0);
        setIntField(term277215, term277215.getClass(), "maxChain", 0);
        setIntField(term277215, term277215.getClass(), "rateTap", 0);
        setIntField(term277215, term277215.getClass(), "rateHold", 0);
        setIntField(term277215, term277215.getClass(), "rateSlide", 0);
        setIntField(term277215, term277215.getClass(), "rateAir", 0);
        setIntField(term277215, term277215.getClass(), "rateFlick", 0);
        setIntField(term277215, term277215.getClass(), "judgeGuilty", 0);
        setIntField(term277215, term277215.getClass(), "judgeAttack", 0);
        setIntField(term277215, term277215.getClass(), "judgeJustice", 0);
        setIntField(term277215, term277215.getClass(), "judgeCritical", 0);
        setIntField(term277215, term277215.getClass(), "eventId", 0);
        setIntField(term277215, term277215.getClass(), "playerRating", 0);
        setBooleanField(term277215, term277215.getClass(), "isNewRecord", false);
        setBooleanField(term277215, term277215.getClass(), "isFullCombo", false);
        setIntField(term277215, term277215.getClass(), "fullChainKind", 0);
        setBooleanField(term277215, term277215.getClass(), "isAllJustice", false);
        setBooleanField(term277215, term277215.getClass(), "isContinue", false);
        setBooleanField(term277215, term277215.getClass(), "isFreeToPlay", false);
        setIntField(term277215, term277215.getClass(), "characterId", 0);
        setIntField(term277215, term277215.getClass(), "skillId", 0);
        setIntField(term277215, term277215.getClass(), "playKind", 0);
        setBooleanField(term277215, term277215.getClass(), "isClear", false);
        setIntField(term277215, term277215.getClass(), "skillLevel", 0);
        setIntField(term277215, term277215.getClass(), "skillEffect", 0);
        setField(term277215, term277215.getClass(), "placeName", null);
        setBooleanField(term277215, term277215.getClass(), "isMaimai", false);
        term277261 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277261;
        callMethod(klass, "setJudgeAttack", argTypes, term277215, args);
    }

};



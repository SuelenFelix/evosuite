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

public class UserPlaylog_setPlayedUserId1_609672885174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276117;
     Object term276163;

    public UserPlaylog_setPlayedUserId1_609672885174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276117 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276117, term276117.getClass(), "id", 0L);
        setField(term276117, term276117.getClass(), "user", null);
        setIntField(term276117, term276117.getClass(), "orderId", 0);
        setIntField(term276117, term276117.getClass(), "sortNumber", 0);
        setIntField(term276117, term276117.getClass(), "placeId", 0);
        setField(term276117, term276117.getClass(), "playDate", null);
        setField(term276117, term276117.getClass(), "userPlayDate", null);
        setIntField(term276117, term276117.getClass(), "musicId", 0);
        setIntField(term276117, term276117.getClass(), "level", 0);
        setIntField(term276117, term276117.getClass(), "customId", 0);
        setIntField(term276117, term276117.getClass(), "playedUserId1", 0);
        setIntField(term276117, term276117.getClass(), "playedUserId2", 0);
        setIntField(term276117, term276117.getClass(), "playedUserId3", 0);
        setField(term276117, term276117.getClass(), "playedUserName1", null);
        setField(term276117, term276117.getClass(), "playedUserName2", null);
        setField(term276117, term276117.getClass(), "playedUserName3", null);
        setIntField(term276117, term276117.getClass(), "playedMusicLevel1", 0);
        setIntField(term276117, term276117.getClass(), "playedMusicLevel2", 0);
        setIntField(term276117, term276117.getClass(), "playedMusicLevel3", 0);
        setIntField(term276117, term276117.getClass(), "playedCustom1", 0);
        setIntField(term276117, term276117.getClass(), "playedCustom2", 0);
        setIntField(term276117, term276117.getClass(), "playedCustom3", 0);
        setIntField(term276117, term276117.getClass(), "track", 0);
        setIntField(term276117, term276117.getClass(), "score", 0);
        setIntField(term276117, term276117.getClass(), "rank", 0);
        setIntField(term276117, term276117.getClass(), "maxCombo", 0);
        setIntField(term276117, term276117.getClass(), "maxChain", 0);
        setIntField(term276117, term276117.getClass(), "rateTap", 0);
        setIntField(term276117, term276117.getClass(), "rateHold", 0);
        setIntField(term276117, term276117.getClass(), "rateSlide", 0);
        setIntField(term276117, term276117.getClass(), "rateAir", 0);
        setIntField(term276117, term276117.getClass(), "rateFlick", 0);
        setIntField(term276117, term276117.getClass(), "judgeGuilty", 0);
        setIntField(term276117, term276117.getClass(), "judgeAttack", 0);
        setIntField(term276117, term276117.getClass(), "judgeJustice", 0);
        setIntField(term276117, term276117.getClass(), "judgeCritical", 0);
        setIntField(term276117, term276117.getClass(), "eventId", 0);
        setIntField(term276117, term276117.getClass(), "playerRating", 0);
        setBooleanField(term276117, term276117.getClass(), "isNewRecord", false);
        setBooleanField(term276117, term276117.getClass(), "isFullCombo", false);
        setIntField(term276117, term276117.getClass(), "fullChainKind", 0);
        setBooleanField(term276117, term276117.getClass(), "isAllJustice", false);
        setBooleanField(term276117, term276117.getClass(), "isContinue", false);
        setBooleanField(term276117, term276117.getClass(), "isFreeToPlay", false);
        setIntField(term276117, term276117.getClass(), "characterId", 0);
        setIntField(term276117, term276117.getClass(), "skillId", 0);
        setIntField(term276117, term276117.getClass(), "playKind", 0);
        setBooleanField(term276117, term276117.getClass(), "isClear", false);
        setIntField(term276117, term276117.getClass(), "skillLevel", 0);
        setIntField(term276117, term276117.getClass(), "skillEffect", 0);
        setField(term276117, term276117.getClass(), "placeName", null);
        setBooleanField(term276117, term276117.getClass(), "isMaimai", false);
        term276163 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276163;
        callMethod(klass, "setPlayedUserId1", argTypes, term276117, args);
    }

};



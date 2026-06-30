package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserPlaylog_setContinue_1314038058217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463126;
     Object term463174;

    public UserPlaylog_setContinue_1314038058217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463126 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term463126, term463126.getClass(), "id", 0L);
        setField(term463126, term463126.getClass(), "user", null);
        setField(term463126, term463126.getClass(), "romVersion", null);
        setIntField(term463126, term463126.getClass(), "orderId", 0);
        setIntField(term463126, term463126.getClass(), "sortNumber", 0);
        setIntField(term463126, term463126.getClass(), "placeId", 0);
        setField(term463126, term463126.getClass(), "playDate", null);
        setField(term463126, term463126.getClass(), "userPlayDate", null);
        setIntField(term463126, term463126.getClass(), "musicId", 0);
        setIntField(term463126, term463126.getClass(), "level", 0);
        setIntField(term463126, term463126.getClass(), "customId", 0);
        setIntField(term463126, term463126.getClass(), "playedUserId1", 0);
        setIntField(term463126, term463126.getClass(), "playedUserId2", 0);
        setIntField(term463126, term463126.getClass(), "playedUserId3", 0);
        setField(term463126, term463126.getClass(), "playedUserName1", null);
        setField(term463126, term463126.getClass(), "playedUserName2", null);
        setField(term463126, term463126.getClass(), "playedUserName3", null);
        setIntField(term463126, term463126.getClass(), "playedMusicLevel1", 0);
        setIntField(term463126, term463126.getClass(), "playedMusicLevel2", 0);
        setIntField(term463126, term463126.getClass(), "playedMusicLevel3", 0);
        setIntField(term463126, term463126.getClass(), "playedCustom1", 0);
        setIntField(term463126, term463126.getClass(), "playedCustom2", 0);
        setIntField(term463126, term463126.getClass(), "playedCustom3", 0);
        setIntField(term463126, term463126.getClass(), "track", 0);
        setIntField(term463126, term463126.getClass(), "score", 0);
        setIntField(term463126, term463126.getClass(), "rank", 0);
        setIntField(term463126, term463126.getClass(), "maxCombo", 0);
        setIntField(term463126, term463126.getClass(), "maxChain", 0);
        setIntField(term463126, term463126.getClass(), "rateTap", 0);
        setIntField(term463126, term463126.getClass(), "rateHold", 0);
        setIntField(term463126, term463126.getClass(), "rateSlide", 0);
        setIntField(term463126, term463126.getClass(), "rateAir", 0);
        setIntField(term463126, term463126.getClass(), "rateFlick", 0);
        setIntField(term463126, term463126.getClass(), "judgeGuilty", 0);
        setIntField(term463126, term463126.getClass(), "judgeAttack", 0);
        setIntField(term463126, term463126.getClass(), "judgeJustice", 0);
        setIntField(term463126, term463126.getClass(), "judgeCritical", 0);
        setIntField(term463126, term463126.getClass(), "judgeHeaven", 0);
        setIntField(term463126, term463126.getClass(), "eventId", 0);
        setIntField(term463126, term463126.getClass(), "playerRating", 0);
        setBooleanField(term463126, term463126.getClass(), "isNewRecord", false);
        setBooleanField(term463126, term463126.getClass(), "isFullCombo", false);
        setIntField(term463126, term463126.getClass(), "fullChainKind", 0);
        setBooleanField(term463126, term463126.getClass(), "isAllJustice", false);
        setBooleanField(term463126, term463126.getClass(), "isContinue", false);
        setBooleanField(term463126, term463126.getClass(), "isFreeToPlay", false);
        setIntField(term463126, term463126.getClass(), "characterId", 0);
        setIntField(term463126, term463126.getClass(), "charaIllustId", 0);
        setIntField(term463126, term463126.getClass(), "skillId", 0);
        setIntField(term463126, term463126.getClass(), "playKind", 0);
        setBooleanField(term463126, term463126.getClass(), "isClear", false);
        setIntField(term463126, term463126.getClass(), "skillLevel", 0);
        setIntField(term463126, term463126.getClass(), "skillEffect", 0);
        setField(term463126, term463126.getClass(), "placeName", null);
        setIntField(term463126, term463126.getClass(), "commonId", 0);
        term463174 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term463174;
        callMethod(klass, "setContinue", argTypes, term463126, args);
    }

};



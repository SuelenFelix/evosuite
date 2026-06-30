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
import java.lang.Integer;

public class UserPlaylog_setCharaIllustId_256575790220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463276;
     Object term463324;

    public UserPlaylog_setCharaIllustId_256575790220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463276 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term463276, term463276.getClass(), "id", 0L);
        setField(term463276, term463276.getClass(), "user", null);
        setField(term463276, term463276.getClass(), "romVersion", null);
        setIntField(term463276, term463276.getClass(), "orderId", 0);
        setIntField(term463276, term463276.getClass(), "sortNumber", 0);
        setIntField(term463276, term463276.getClass(), "placeId", 0);
        setField(term463276, term463276.getClass(), "playDate", null);
        setField(term463276, term463276.getClass(), "userPlayDate", null);
        setIntField(term463276, term463276.getClass(), "musicId", 0);
        setIntField(term463276, term463276.getClass(), "level", 0);
        setIntField(term463276, term463276.getClass(), "customId", 0);
        setIntField(term463276, term463276.getClass(), "playedUserId1", 0);
        setIntField(term463276, term463276.getClass(), "playedUserId2", 0);
        setIntField(term463276, term463276.getClass(), "playedUserId3", 0);
        setField(term463276, term463276.getClass(), "playedUserName1", null);
        setField(term463276, term463276.getClass(), "playedUserName2", null);
        setField(term463276, term463276.getClass(), "playedUserName3", null);
        setIntField(term463276, term463276.getClass(), "playedMusicLevel1", 0);
        setIntField(term463276, term463276.getClass(), "playedMusicLevel2", 0);
        setIntField(term463276, term463276.getClass(), "playedMusicLevel3", 0);
        setIntField(term463276, term463276.getClass(), "playedCustom1", 0);
        setIntField(term463276, term463276.getClass(), "playedCustom2", 0);
        setIntField(term463276, term463276.getClass(), "playedCustom3", 0);
        setIntField(term463276, term463276.getClass(), "track", 0);
        setIntField(term463276, term463276.getClass(), "score", 0);
        setIntField(term463276, term463276.getClass(), "rank", 0);
        setIntField(term463276, term463276.getClass(), "maxCombo", 0);
        setIntField(term463276, term463276.getClass(), "maxChain", 0);
        setIntField(term463276, term463276.getClass(), "rateTap", 0);
        setIntField(term463276, term463276.getClass(), "rateHold", 0);
        setIntField(term463276, term463276.getClass(), "rateSlide", 0);
        setIntField(term463276, term463276.getClass(), "rateAir", 0);
        setIntField(term463276, term463276.getClass(), "rateFlick", 0);
        setIntField(term463276, term463276.getClass(), "judgeGuilty", 0);
        setIntField(term463276, term463276.getClass(), "judgeAttack", 0);
        setIntField(term463276, term463276.getClass(), "judgeJustice", 0);
        setIntField(term463276, term463276.getClass(), "judgeCritical", 0);
        setIntField(term463276, term463276.getClass(), "judgeHeaven", 0);
        setIntField(term463276, term463276.getClass(), "eventId", 0);
        setIntField(term463276, term463276.getClass(), "playerRating", 0);
        setBooleanField(term463276, term463276.getClass(), "isNewRecord", false);
        setBooleanField(term463276, term463276.getClass(), "isFullCombo", false);
        setIntField(term463276, term463276.getClass(), "fullChainKind", 0);
        setBooleanField(term463276, term463276.getClass(), "isAllJustice", false);
        setBooleanField(term463276, term463276.getClass(), "isContinue", false);
        setBooleanField(term463276, term463276.getClass(), "isFreeToPlay", false);
        setIntField(term463276, term463276.getClass(), "characterId", 0);
        setIntField(term463276, term463276.getClass(), "charaIllustId", 0);
        setIntField(term463276, term463276.getClass(), "skillId", 0);
        setIntField(term463276, term463276.getClass(), "playKind", 0);
        setBooleanField(term463276, term463276.getClass(), "isClear", false);
        setIntField(term463276, term463276.getClass(), "skillLevel", 0);
        setIntField(term463276, term463276.getClass(), "skillEffect", 0);
        setField(term463276, term463276.getClass(), "placeName", null);
        setIntField(term463276, term463276.getClass(), "commonId", 0);
        term463324 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term463324;
        callMethod(klass, "setCharaIllustId", argTypes, term463276, args);
    }

};



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

public class UserPlaylog_setUser_730242792174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460990;

    public UserPlaylog_setUser_730242792174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460990 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term460990, term460990.getClass(), "id", 0L);
        setField(term460990, term460990.getClass(), "user", null);
        setField(term460990, term460990.getClass(), "romVersion", null);
        setIntField(term460990, term460990.getClass(), "orderId", 0);
        setIntField(term460990, term460990.getClass(), "sortNumber", 0);
        setIntField(term460990, term460990.getClass(), "placeId", 0);
        setField(term460990, term460990.getClass(), "playDate", null);
        setField(term460990, term460990.getClass(), "userPlayDate", null);
        setIntField(term460990, term460990.getClass(), "musicId", 0);
        setIntField(term460990, term460990.getClass(), "level", 0);
        setIntField(term460990, term460990.getClass(), "customId", 0);
        setIntField(term460990, term460990.getClass(), "playedUserId1", 0);
        setIntField(term460990, term460990.getClass(), "playedUserId2", 0);
        setIntField(term460990, term460990.getClass(), "playedUserId3", 0);
        setField(term460990, term460990.getClass(), "playedUserName1", null);
        setField(term460990, term460990.getClass(), "playedUserName2", null);
        setField(term460990, term460990.getClass(), "playedUserName3", null);
        setIntField(term460990, term460990.getClass(), "playedMusicLevel1", 0);
        setIntField(term460990, term460990.getClass(), "playedMusicLevel2", 0);
        setIntField(term460990, term460990.getClass(), "playedMusicLevel3", 0);
        setIntField(term460990, term460990.getClass(), "playedCustom1", 0);
        setIntField(term460990, term460990.getClass(), "playedCustom2", 0);
        setIntField(term460990, term460990.getClass(), "playedCustom3", 0);
        setIntField(term460990, term460990.getClass(), "track", 0);
        setIntField(term460990, term460990.getClass(), "score", 0);
        setIntField(term460990, term460990.getClass(), "rank", 0);
        setIntField(term460990, term460990.getClass(), "maxCombo", 0);
        setIntField(term460990, term460990.getClass(), "maxChain", 0);
        setIntField(term460990, term460990.getClass(), "rateTap", 0);
        setIntField(term460990, term460990.getClass(), "rateHold", 0);
        setIntField(term460990, term460990.getClass(), "rateSlide", 0);
        setIntField(term460990, term460990.getClass(), "rateAir", 0);
        setIntField(term460990, term460990.getClass(), "rateFlick", 0);
        setIntField(term460990, term460990.getClass(), "judgeGuilty", 0);
        setIntField(term460990, term460990.getClass(), "judgeAttack", 0);
        setIntField(term460990, term460990.getClass(), "judgeJustice", 0);
        setIntField(term460990, term460990.getClass(), "judgeCritical", 0);
        setIntField(term460990, term460990.getClass(), "judgeHeaven", 0);
        setIntField(term460990, term460990.getClass(), "eventId", 0);
        setIntField(term460990, term460990.getClass(), "playerRating", 0);
        setBooleanField(term460990, term460990.getClass(), "isNewRecord", false);
        setBooleanField(term460990, term460990.getClass(), "isFullCombo", false);
        setIntField(term460990, term460990.getClass(), "fullChainKind", 0);
        setBooleanField(term460990, term460990.getClass(), "isAllJustice", false);
        setBooleanField(term460990, term460990.getClass(), "isContinue", false);
        setBooleanField(term460990, term460990.getClass(), "isFreeToPlay", false);
        setIntField(term460990, term460990.getClass(), "characterId", 0);
        setIntField(term460990, term460990.getClass(), "charaIllustId", 0);
        setIntField(term460990, term460990.getClass(), "skillId", 0);
        setIntField(term460990, term460990.getClass(), "playKind", 0);
        setBooleanField(term460990, term460990.getClass(), "isClear", false);
        setIntField(term460990, term460990.getClass(), "skillLevel", 0);
        setIntField(term460990, term460990.getClass(), "skillEffect", 0);
        setField(term460990, term460990.getClass(), "placeName", null);
        setIntField(term460990, term460990.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term460990, args);
    }

};


